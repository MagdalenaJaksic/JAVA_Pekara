package com.asss.Pekara.controller;

import com.asss.Pekara.entity.Pekara;
import com.asss.Pekara.service.PekaraService;
import com.asss.Pekara.entity.Pekara;
import com.asss.Pekara.service.PekaraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PekaraREST {
    @Autowired
    private PekaraService pekaraService;
    @GetMapping("/pekara")
    public List<Pekara> findAll(){
        return pekaraService.findAll();
    }
    @GetMapping("/pekara/{id}")
    public Pekara findById(@PathVariable int id) {
        return pekaraService.findById(id);
    }



    @GetMapping("/pekara/cena")
    public List<Pekara> findAllPekarasByCenaDescending() {
        return pekaraService.findAllPekarasByCenaDescending();
    }

    @PostMapping("/pekara")
    public Pekara save(@RequestBody Pekara pekara) {
        return pekaraService.save(pekara);
    }

    @PutMapping("/pekara/{id}")
    public String updateByID(@PathVariable int id, @RequestBody Pekara pekara) {
        return pekaraService.updateByID(id, pekara);
    }

    @DeleteMapping("/pekara/{id}")
    public String deleteById(@PathVariable int id) {
        return pekaraService.deleteById(id);
    }

}

