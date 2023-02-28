package com.codeup.codeupspringblog;


import jakarta.servlet.http.HttpSession;
import models.User;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import repositories.PostRepository;
import repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IconSpringBlogApplication.class)
@AutoConfigurationMockMvc


public class PostIntegrationTests {

    private User testUser;
    private HttpSession httpSession;

    @Autowired
    private MockMvc mvc;

    Autowired
    private UserRepository userDao;

    @Autowired
    private PostRepository postsDao;

    @Before
    public void setup() throws Exception{


    }





}
