package com.example.resto.Controller;

import com.example.resto.Entity.Chef;
import com.example.resto.Service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping(path = "/chefs")
public class ChefController {
    @Autowired
    public ChefService chefService;
    // Save patient
    @PostMapping("")
    ResponseEntity<Chef> ajouterChef(@RequestBody Chef chef) {
        Chef c=chefService.addChef(chef);
        return new ResponseEntity<>(c,
                HttpStatus.OK);
    }
    //Read patient
    @GetMapping("")
    public ResponseEntity<List<Chef>> getChefs()
    {
        List<Chef> chefList= chefService.getAllChefs();
        return new ResponseEntity<>(chefList,
                HttpStatus.OK);
    }
    //Read patient
    @GetMapping("/{id}")
    public ResponseEntity<Chef> getChefById(@PathVariable("id") Integer id)
    {
        Chef chef= chefService.getChefById( id);
        return new ResponseEntity<>(chef,
                HttpStatus.OK);
    }

    // Update patient
    @PostMapping("/{id}")
    public ResponseEntity<Chef> updateChef(@RequestBody Chef chef)
    {
        Chef c= chefService.updateChef(chef);
        return new ResponseEntity<>(c,
                HttpStatus.OK);
    }
    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChefById(@PathVariable("id") Integer id)
    {
        chefService.deleteChefById(id);
        return new ResponseEntity<>("Deleted Successfully",
                HttpStatus.OK);

    }



}
