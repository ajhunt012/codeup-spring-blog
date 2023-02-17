package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


record Message(String message){}

@Controller
class HelloController {

//    // Method will listen for a GET request at /hello
//    @GetMapping("/hello")
//
//    // this will be the response that will be given whenever the above-mentioned is called.
//    @ResponseBody
//    public String hello() {
//        return "Hello from Spring!";
//    }
//
//    @GetMapping(path = "/json", produces = "application/json")
//    @ResponseBody
//    public Message returnMessage(){
//        return new Message("Hello from Spring2!");
//    }


 @RequestMapping(path = "/color", method = RequestMethod.GET)
    @ResponseBody
    public String color(){
        return "Royal Blue!";
 }

//    @GetMapping("/hello/{firstName}")
//    @ResponseBody
//    public String sayHello(@PathVariable String firstName) {
//        return "Hello " + firstName + "!";
//    }

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String sayHello(@PathVariable String firstName, @PathVariable String lastName) {
        return "Hello " + firstName + lastName + "!";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }
    @PostMapping("/join")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }

    @GetMapping("/dogpark")
    public String dogpark(Model model) {
        List<String> dogs = new ArrayList<>();
        dogs.add("Bubbles");
        dogs.add("Spot");
        dogs.add("Ezekial");
        dogs.add("Zeus");

        model.addAttribute("dogs", dogs);
        return "dogpark";
    }


}

