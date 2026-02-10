package com.mlb_app.MLB_App.Repo;

import com.mlb_app.MLB_App.Player.Batter;
import com.mlb_app.MLB_App.Player.Pitcher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BatterRepository extends JpaRepository<Batter, String> {
    void deleteByName(String batterName);
    Optional<Batter> findByName(String name);
    List<Batter> findByNameContainingIgnoreCaseAndTeamContainingIgnoreCase(String name, String team);}
