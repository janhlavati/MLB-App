package com.mlb_app.MLB_App.Controller;

import com.mlb_app.MLB_App.Player.Pitcher;
import com.mlb_app.MLB_App.Service.PitcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5050")
@RequestMapping(path = "api/v1/pitcher")
public class PitcherController {
    private final PitcherService pitcherService;

    @Autowired
    public PitcherController(PitcherService pitcherService) {
        this.pitcherService = pitcherService;
    }

    @GetMapping
    public List<Pitcher> getPitchers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position) {
                if(team != null && position != null) {
                    return pitcherService.getPitchersByTeamAndPosition(team, position);
                }else if(team != null) {
                    return pitcherService.getPitchersByTeam(team);
                }else if(name != null){
                    return pitcherService.getPitchersByName(name);
                }else if(position != null) {
                    return pitcherService.getPitchersByPosition(position);
                }else {
                    return pitcherService.getPitchers();
                }
            }

    @PostMapping
    public ResponseEntity<Pitcher> addPitcher(@RequestBody Pitcher pitcher) {
        Pitcher createdPitcher = pitcherService.addPitcher(pitcher);
        return new ResponseEntity<>(createdPitcher, HttpStatus.CREATED);
    }

    @DeleteMapping("/{pitcherName}")
    public ResponseEntity<String> deletePitcher(@RequestBody Pitcher pitcher) {
        pitcherService.deletePitcher(pitcher);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }
}
