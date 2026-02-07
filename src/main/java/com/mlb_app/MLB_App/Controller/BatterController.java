package com.mlb_app.MLB_App.Controller;

import com.mlb_app.MLB_App.Player.Batter;
import com.mlb_app.MLB_App.Service.BatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5050")
@RequestMapping(path = "api/v1/batter")
public class BatterController {
    private final BatterService batterService;

    @Autowired
    public BatterController(BatterService batterService) {
        this.batterService = batterService;
    }

    public List<Batter> getBatters(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name) {
        if (team != null & name != null) {
            return batterService.getBattersByTeamAndName(team, name);
        } else if (team != null) {
            return batterService.getBattersByTeam(team);
        } else if (name != null) {
            return batterService.getBattersByName(name);
        } else {
            return batterService.getBatters();
        }
    }
}
