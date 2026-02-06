package com.mlb_app.MLB_App.Service;

import com.mlb_app.MLB_App.Player.Pitcher;
import com.mlb_app.MLB_App.Repo.PitcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
}
