package com.example.resto.Service.ServiceImpl;

import com.example.resto.Entity.Chef;
import com.example.resto.Repository.ChefRepository;
import com.example.resto.Service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ChefServiceImpl implements ChefService {
    @Autowired
    private ChefRepository chefRepository;
    @Override
    public List<Chef> getAllChefs() {
        // TODO Auto-generated method stub
        return chefRepository.findAll();
    }

    @Override
    public  Chef getChefById(Integer id) {
        // TODO Auto-generated method stub
        Optional<Chef> c = chefRepository.findById(id);
        return c.isPresent() ? c.get() : null;
    }

    @Override
    public Chef addChef(Chef c) {
        // TODO Auto-generated method stub
        return chefRepository.save(c);
    }

    @Override
    public Chef updateChef(Chef c) {
        // TODO Auto-generated method stub
        return chefRepository.save(c) ;
    }

    @Override
    public void deleteChefById(Integer id) {
        // TODO Auto-generated method stub
        chefRepository.deleteById(id);
    }
}
