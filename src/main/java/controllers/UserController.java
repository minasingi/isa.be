package controllers;

import models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("get-first-name")
    public String getFirstName(){
        return "Mina";
    }

    @GetMapping("get-first-name-list")
    public List<String> getFirstNameList(){
        return List.of("Mina", "Djordje");
    }

    @PostMapping("create-user")
    public boolean createUser(String firstName, String lastName){
        return true;
    }

    @PostMapping("create-user-body")
    public UserModel createUserBody(@RequestBody UserModel userModel){
        return userModel;
    }
}
