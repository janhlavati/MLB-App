package com.mlb_app.MLB_App.Repo;

import com.mlb_app.MLB_App.Player.Pitcher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PitcherRepository extends JpaRepository<Pitcher, String> {
    void deleteByName(String pitcherName);
    Optional<Pitcher> findByName(String pitcherName);
}
