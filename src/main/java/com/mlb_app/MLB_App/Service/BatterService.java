package com.mlb_app.MLB_App.Service;

import com.mlb_app.MLB_App.Player.Batter;
import com.mlb_app.MLB_App.Repo.BatterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
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

    public List<Batter> getBattersByName(@PathVariable String name) {
        return batterRepository.findAll().stream().filter(batter -> batter.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Batter> getBattersByTeam(String teamName) {
        return batterRepository.findAll().stream().filter(batter -> batter.getTeam().toLowerCase().contains(teamName.toLowerCase())).collect(Collectors.toList());
    }

    public List<Batter> getBattersByTeamAndName(String teamName, String batterName) {
        return batterRepository.findAll().stream().filter(batter ->
                teamName.equals(batter.getTeam()) &&
                batter.getName().toLowerCase().contains(batterName.toLowerCase())).collect(Collectors.toList());
    }

    public Batter addBatter(Batter batter) {
        batterRepository.save(batter);
        return batter;
    }

    public Batter updateBatter(Batter batter) {
        Optional<Batter> existingBatter = batterRepository.findByName(batter.getName());

        if(existingBatter.isPresent()){
            Batter batterToUpdate = existingBatter.get();
            batterToUpdate.setName(batter.getName());
            batterToUpdate.setTeam(batter.getTeam());

            batterRepository.save(batterToUpdate);
            return  batter;
        }
        return null;
    }

    @Transactional
    public void deleteBatter(Batter batter) {
        batterRepository.delete(batter);
    }
}
