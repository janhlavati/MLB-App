package com.mlb_app.MLB_App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mlb_app.MLB_App.Player.Pitcher;
import com.mlb_app.MLB_App.Service.PitcherService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/pitchers")
public class PitcherController {
    private final PitcherService pitcherService;

    @Autowired
    public PitcherController(PitcherService pitcherService) {
        this.pitcherService = pitcherService;
    }

    @GetMapping("/{name}")
    public List<Pitcher> getPitchers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name) {
                if(team != null && name != null) {
                    return pitcherService.getPitchersByTeamAndName(team, name);
                }else if(team != null) {
                    return pitcherService.getPitchersByTeam(team);
                }else if(name != null){
                    return pitcherService.getPitchersByName(name);
                }else {
                    return pitcherService.getPitchers();
                }
            }

    @PostMapping
    public ResponseEntity<Pitcher> addPitcher(@RequestBody Pitcher pitcher) {
        Pitcher createdPitcher = pitcherService.addPitcher(pitcher);
        return new ResponseEntity<>(createdPitcher, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Pitcher> updatePitcher(@RequestBody Pitcher pitcher) {
        Pitcher resultPitcher = pitcherService.updatePitcher(pitcher);

        if(resultPitcher != null) {
            return new ResponseEntity<>(resultPitcher, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{pitcherName}")
    public ResponseEntity<String> deletePitcher(@RequestBody Pitcher pitcher) {
        pitcherService.deletePitcher(pitcher);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }
}
