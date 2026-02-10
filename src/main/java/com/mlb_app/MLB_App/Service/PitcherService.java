package com.mlb_app.MLB_App.Service;

import com.mlb_app.MLB_App.Player.Pitcher;
import com.mlb_app.MLB_App.Repo.PitcherRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PitcherService {
    private final PitcherRepository pitcherRepository;

    @Autowired
    public PitcherService(PitcherRepository pitcherRepository) {
        this.pitcherRepository = pitcherRepository;
    }

    public List<Pitcher> getPitchers() {
        return pitcherRepository.findAll();
    }

    public List<Pitcher> getPitchersByName(String name) {
        return pitcherRepository.findAll().stream().filter(pitcher -> pitcher.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Pitcher> getPitchersByTeamAndName(String teamName, String pitcherName) {
        return pitcherRepository.findAll().stream().filter(pitcher ->
                teamName.equals(pitcher.getTeam()) &&
                pitcher.getName().toLowerCase().contains(pitcherName.toLowerCase())).collect(Collectors.toList());
    }

    public List<Pitcher> getPitchersByTeam(String teamName) {
        return pitcherRepository.findAll().stream().filter(pitcher -> teamName.toLowerCase().equals(pitcher.getTeam())).collect(Collectors.toList());
    }

    public Pitcher addPitcher(Pitcher pitcher) {
        pitcherRepository.save(pitcher);
        return pitcher;
    }

    public Pitcher updatePitcher(Pitcher pitcher) {
        Optional<Pitcher> existingPitcher = pitcherRepository.findByName(pitcher.getName());

        if(existingPitcher.isPresent()) {
            Pitcher pitcherToUpdate = existingPitcher.get();
            pitcherToUpdate.setName(pitcher.getName());
            pitcherToUpdate.setTeam(pitcher.getTeam());

            pitcherRepository.save(pitcherToUpdate);
            return pitcherToUpdate;
        }
        return null;
    }

    @Transactional
    public void deletePitcher(Pitcher pitcher) {
        pitcherRepository.delete(pitcher);
    }
}
