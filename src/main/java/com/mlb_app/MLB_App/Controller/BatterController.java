package com.mlb_app.MLB_App.Controller;

import com.mlb_app.MLB_App.Service.BatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5050")
@RequestMapping(path = "api/v1/batter")
public class BatterController {
    private final BatterService batterService;

    @Autowired
    public BatterController(BatterService batterService) {
        this.batterService = batterService;
    }
}
