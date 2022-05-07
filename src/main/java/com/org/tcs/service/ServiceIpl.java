package com.org.tcs.service;

import com.org.tcs.modal.Player;
import com.org.tcs.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceIpl implements Services{
    @Autowired
PlayerRepo playerRepo;
    @Override
    public void createPlayer(Player player) {
        playerRepo.save(player);
    }
    @Override
    public Optional<Player> getById(Integer id) {
       Optional<Player> sss=playerRepo.findById(id);
        return sss;
    }
    @Override
    public String deleteById(Integer id) {
        playerRepo.deleteById(id);
        return "success";
    }

    @Override
    public void updatePlayer(Player player) {
        playerRepo.save(player);
    }

    @Override
    public void updatePerticularRecord(Integer id, String address) {
        Optional<Player> playerValueOptional = playerRepo.findById(id);
        Player playerValue=playerValueOptional.get();
        playerValue.setAddress(address);
        playerRepo.save(playerValue);
    }

    @Override
    public List<Player> getAll() {
        List<Player> aa=playerRepo.findAll();
        return aa;
    }

}
