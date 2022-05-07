package com.org.tcs.service;

import com.org.tcs.modal.Player;
import com.org.tcs.repository.PlayerRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ServiceIplTest {
@InjectMocks
private ServiceIpl serviceIpl;
@Mock
private PlayerRepo playerRepo;
    @Test
    void createPlayer() {
        Player player=new Player();
        player.setId(2);
        player.setName("msd");
        player.setAddress("blr");
        Mockito.when(playerRepo.save(player)).thenReturn(player);
        ServiceIpl.createPlayer(player);
    }

    @Test
    void getById() {

    }

    @Test
    void deleteById() {
    }

    @Test
    void updatePlayer() {
    }

    @Test
    void updatePerticularRecord() {
    }

    @Test
    void getAll() {
    }
}