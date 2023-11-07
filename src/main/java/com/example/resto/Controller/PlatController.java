package com.example.resto.Controller;

import com.example.resto.Entity.Chef;
import com.example.resto.Entity.Plat;
import com.example.resto.Service.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping(path = "/plats")
public class PlatController {
    @Autowired
    public PlatService platService;
    // Save patient
    @PostMapping("")
    ResponseEntity<Plat> ajouterPlat(@RequestBody Plat plat) {
        Plat p=platService.addPlat(plat);
        return new ResponseEntity<>(p,
                HttpStatus.OK);
    }

    //Read patient
    @GetMapping("")
    public ResponseEntity<List<Plat>> getPlats()
    {
        List<Plat> platList= platService.getAllPlats();
        return new ResponseEntity<>(platList,
                HttpStatus.OK);
    }
    //Read patient
    @GetMapping("/{id}")
    public ResponseEntity<Plat> getPlatById(@PathVariable("id") Integer id)
    {
        Plat plat= platService.getPlatById(id);
        return new ResponseEntity<>(plat,
                HttpStatus.OK);
    }

    // Update patient
    @PostMapping("/{id}")
    public ResponseEntity<Plat> updatePlat(@RequestBody Plat plat)
    {
        Plat p= platService.updatePlat(plat);
        return new ResponseEntity<>(p,
                HttpStatus.OK);
    }
    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlatById(@PathVariable("id") Integer Id)
    {
        platService.deletePlatById(Id);
        return new ResponseEntity<>("Deleted Successfully",
                HttpStatus.OK);

    }




}
