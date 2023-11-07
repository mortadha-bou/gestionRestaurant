package com.example.resto.Service.ServiceImpl;

import com.example.resto.Entity.Plat;
import com.example.resto.Entity.Reservation;
import com.example.resto.Repository.PlatRepository;
import com.example.resto.Repository.ReservationRepository;
import com.example.resto.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public List<Reservation> getAllReservation() {
        // TODO Auto-generated method stub
        return reservationRepository.findAll();
    }

    @Override
    public  Reservation getReservationById(Integer id) {
        // TODO Auto-generated method stub
        Optional<Reservation> r = reservationRepository.findById(id);
        return r.isPresent() ? r.get() : null;
    }

    @Override
    public Reservation  addReservation(Reservation r) {
        // TODO Auto-generated method stub
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        // TODO Auto-generated method stub
        return reservationRepository.save(r) ;
    }

    @Override
    public void deleteReservationById(Integer id) {
        // TODO Auto-generated method stub
        reservationRepository.deleteById(id);
    }

}
