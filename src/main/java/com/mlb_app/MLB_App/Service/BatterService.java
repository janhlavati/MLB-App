package com.mlb_app.MLB_App.Service;

import com.mlb_app.MLB_App.Player.Batter;
import com.mlb_app.MLB_App.Repo.BatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BatterService {

    private final BatterRepository batterRepository;

    @Autowired
    public BatterService(BatterRepository batterRepository) {
        this.batterRepository = batterRepository;
    }

    public List<Batter> getBatters() {
        return batterRepository.findAll();
    }

    public List<Batter> getBattersByName(String name) {
        return batterRepository.findAll().stream().filter(batter -> batter.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Batter> getBattersByTeam(String teamName) {
        return batterRepository.findAll().stream().filter(batter -> batter.getTeam().toLowerCase().contains(teamName.toLowerCase())).collect(Collectors.toList());
    }

    public List<Batter> getBattersByTeamAndName(String teamName, String batterName) {
        return batterRepository.findAll().stream().filter(batter ->
                batter.getTeam().toLowerCase().contains(teamName.toLowerCase()) &&
                batter.getName().toLowerCase().contains(batterName.toLowerCase())).collect(Collectors.toList());
    }


}
