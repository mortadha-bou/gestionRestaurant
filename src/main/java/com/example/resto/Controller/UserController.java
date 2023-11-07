package com.example.resto.Controller;

import com.example.resto.Dto.AuthentificationDTO;
import com.example.resto.Entity.User;
import com.example.resto.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping(path="/users")
public class UserController {
    @Autowired
    public UserService userService;
    //ajouter user
    @PostMapping("")
    ResponseEntity<User> addUser(@RequestBody User user){
        User U=userService.addUser(user);
        return new ResponseEntity<>(U, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>> getUsers()
    {
        List<User> userList= userService.getAllUser();
        return new ResponseEntity<>(userList,
                HttpStatus.OK);
    }
    //get user by id
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id)
    {
        User user= userService.getUserById(id);
        return new ResponseEntity<>(user,
                HttpStatus.OK);
    }
    @GetMapping ("")
    public ResponseEntity<User> getUserByLoginPassword(@RequestBody String email,String password)
    {
        User user= userService.getUserByLoginPassword(email,password);
        return new ResponseEntity<>(user,
                HttpStatus.OK);
    }
    // Update User
    //get user by id

    // Update User
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user)
    {
        User U= userService.updateUser(user);
        return new ResponseEntity<>(U,
                HttpStatus.OK);
    }
    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") Integer Id)
    {
        userService.deleteUserById(Id);
        return new ResponseEntity<>("Deleted Successfully",
                HttpStatus.OK);

    }


    //get User

}
