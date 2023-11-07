package com.example.resto.Service.ServiceImpl;

import com.example.resto.Entity.Chef;
import com.example.resto.Entity.Plat;
import com.example.resto.Repository.ChefRepository;
import com.example.resto.Repository.PlatRepository;
import com.example.resto.Service.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class PlatServiceImpl implements PlatService {
    @Autowired
    private PlatRepository platRepository;
    @Override
    public List<Plat> getAllPlats() {
        // TODO Auto-generated method stub
        return platRepository.findAll();
    }

    @Override
    public  Plat getPlatById(Integer id) {
        // TODO Auto-generated method stub
        Optional<Plat> p = platRepository.findById(id);
        return p.isPresent() ? p.get() : null;
    }

    @Override
    public Plat addPlat(Plat p) {
        // TODO Auto-generated method stub
        return platRepository.save(p);
    }

    @Override
    public Plat updatePlat(Plat p) {
        // TODO Auto-generated method stub
        return platRepository.save(p) ;
    }

    @Override
    public void deletePlatById(Integer id) {
        // TODO Auto-generated method stub
        platRepository.deleteById(id);
    }

}
