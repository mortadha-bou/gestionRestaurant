package com.example.resto.Service;

import com.example.resto.Entity.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservation();
    Reservation getReservationById(Integer id);
    Reservation  addReservation (Reservation r);
    Reservation updateReservation(Reservation r);
    void deleteReservationById(Integer id);

}
