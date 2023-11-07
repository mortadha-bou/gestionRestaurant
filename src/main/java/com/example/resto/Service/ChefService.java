package com.example.resto.Service;

import com.example.resto.Entity.Chef;

import java.util.List;

public interface ChefService {
     List<Chef> getAllChefs();
     Chef getChefById(Integer id) ;
     Chef addChef(Chef c);
     Chef updateChef(Chef c) ;
    void deleteChefById (Integer id);


}
