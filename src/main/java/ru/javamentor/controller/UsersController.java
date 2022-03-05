package ru.javamentor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.javamentor.model.User;
import ru.javamentor.service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class UsersController {

    UserServiceImpl userService;

    UsersController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String printUsers(ModelMap model) {
        model.addAttribute("users", userService.getListUsers());
        return "users";
    }

//    @GetMapping("/{id}")
//    public String printUser(@PathVariable("id") int id, ModelMap model) {
//        model.addAttribute("user", userService.getUser(id));
//        return "user";
//    }

    @GetMapping("/new")
    public String addUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping("/new")
    public String createUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("user", userService.getUser(id));
        return "editUser";
    }

    @PatchMapping("/{id}/edit")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}