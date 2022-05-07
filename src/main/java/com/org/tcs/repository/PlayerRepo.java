package com.org.tcs.repository;

import com.org.tcs.modal.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PlayerRepo extends JpaRepository<Player,Integer> {
}
