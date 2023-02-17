package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex() {
        return "This is the posts index page.";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost(@PathVariable long id) {
        return "This is post number " + id + ".";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPostForm() {
        return "This is the form for creating a new post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "A new post has been created.";
    }

//    @RequestMapping(value = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String postCreateSubmit() {
//        return "A new post has been created.";
//    }
}

