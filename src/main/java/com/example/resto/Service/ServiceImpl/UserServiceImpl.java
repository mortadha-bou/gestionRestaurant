package com.example.resto.Service.ServiceImpl;

import com.example.resto.Entity.Reservation;
import com.example.resto.Entity.User;
import com.example.resto.Repository.UserRepository;
import com.example.resto.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    //ajouter User
    @Override
    public User addUser(User user) {

        User user1 = userRepository.save(user);
        return user1;
    }
    //get User
    @Override
    public List<User> getAllUser() {
        return (List<User>)
                userRepository.findAll();
    }
    @Override
    public User getUserById(int id) {
        User user = userRepository.findById(id).get();
        return user;
    }
    @Override
    public User getUserByLoginPassword(String email, String password ) {
        User user = userRepository.findByEmailAndAndPassword(email,password);
        return user;
    }

    // Update User
    @Override
    public User updateUser(User r) {
        // TODO Auto-generated method stub
        return userRepository.save(r) ;
    }


    // Delete User
    @Override
    public void deleteUserById(Integer Id) {
        userRepository.deleteById(Id);
    }



}
