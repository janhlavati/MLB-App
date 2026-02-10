package com.mlb_app.MLB_App.Controller;

import com.mlb_app.MLB_App.Player.Batter;
import com.mlb_app.MLB_App.Service.BatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/batters")
public class BatterController {
    private final BatterService batterService;

    @Autowired
    public BatterController(BatterService batterService) {
        this.batterService = batterService;
    }


    @GetMapping("/{name}")
    public List<Batter> getBatters(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name) {
        if (team != null && name != null) {
            return batterService.getBattersByTeamAndName(team, name);
        } else if (team != null) {
            return batterService.getBattersByTeam(team);
        } else if (name != null) {
            return batterService.getBattersByName(name);
        } else {
            return batterService.getBatters();
        }
    }

    @PostMapping
    public ResponseEntity<Batter> addBatter(@RequestBody Batter batter) {
        Batter createdBatter = batterService.addBatter(batter);
        return new ResponseEntity<>(createdBatter, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Batter> updateBatter(@RequestBody Batter batter) {
        Batter resultBatter = batterService.updateBatter(batter);

        if(resultBatter != null) {
            return new ResponseEntity<>(resultBatter, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{batterName}")
    public ResponseEntity<String> deleteBatter(@RequestBody Batter batter) {
        batterService.deleteBatter(batter);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }
}
