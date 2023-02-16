package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


record Message(String message){}

@Controller
class HelloController {

    // Method will listen for a GET request at /hello
    @GetMapping("/hello")

    // this will be the response that will be given whenever the above-mentioned is called.
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

    @GetMapping(path = "/json", produces = "application/json")
    @ResponseBody
    public Message returnMessage(){
        return new Message("Hello from Spring2!");
    }


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

}

