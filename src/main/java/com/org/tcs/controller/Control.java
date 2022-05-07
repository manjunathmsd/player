package com.org.tcs.controller;

import com.org.tcs.modal.Player;
import com.org.tcs.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Control {
    @Autowired
    Services services;
    @PostMapping("/create")
    public void createPlayer(@RequestBody Player player){
        services.createPlayer(player);
    }
    @GetMapping("/getById/{id}")
    public Optional<Player> getById(@PathVariable Integer id){
        Optional<Player> rrr =services.getById(id);
           return rrr;}
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
    String aaa = services.deleteById(id);
        return aaa;}
        @PutMapping("/update")
   public void updatePlayer(@RequestBody Player player){services.updatePlayer(player);}
    @PatchMapping("/updatePerticularRecord/{id}/{address}")
    public void updatePerticularRecord(@PathVariable Integer id,@PathVariable String address){
        services.updatePerticularRecord(id, address);}
    @GetMapping("/getAll")
    public List<Player> getAll(){
        List<Player> mmm=services.getAll();
    return mmm;
    }
}



