package com.org.tcs.service;

import com.org.tcs.modal.Player;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface Services {


    public void createPlayer( Player player);
    public Optional<Player> getById(Integer id);
    public String deleteById( Integer id);
    public void updatePlayer( Player player);
    public void updatePerticularRecord( Integer id,@PathVariable String address);
    public List<Player> getAll();
}
