package com.example.resto.Service;

import com.example.resto.Entity.Plat;

import java.util.List;

public interface PlatService {
    List<Plat> getAllPlats();
    Plat getPlatById(Integer id);
    Plat addPlat(Plat p);
    Plat updatePlat(Plat plat);
    void deletePlatById(Integer id);


}
