package com.example.resto.Controller;

import com.example.resto.Entity.Chef;
import com.example.resto.Entity.Reservation;
import com.example.resto.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping(path = "/reservations")

public class ReservationController {
    @Autowired
    public ReservationService reservationService;
    // Save patient
    @PostMapping("")
    ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
        Reservation r=reservationService.addReservation(reservation);
        return new ResponseEntity<>(r,
                HttpStatus.OK);
    }
    //Read patient
    @GetMapping("")
    public ResponseEntity<List<Reservation>> getReservations()
    {
        List<Reservation> reservationList= reservationService.getAllReservation();
        return new ResponseEntity<>(reservationList,
                HttpStatus.OK);
    }
    //Read patient
    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getAllReservationById(@PathVariable("id") Integer id)
    {
        Reservation reservation = reservationService.getReservationById(id);
        return new ResponseEntity<>(reservation,
                HttpStatus.OK);
    }

    // Update patient
    @PostMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(@RequestBody Reservation reservation)
    {
        Reservation r= reservationService.updateReservation(reservation);
        return new ResponseEntity<>(r,
                HttpStatus.OK);
    }
    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReservationById(@PathVariable("id") Integer id)
    {
        reservationService.deleteReservationById(id);
        return new ResponseEntity<>("Deleted Successfully",
                HttpStatus.OK);

    }



}


