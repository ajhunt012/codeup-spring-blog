package services;

import models.Post;
import models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import repositories.PostRepository;
import repositories.UserRepository;

import java.util.List;

@Service
public class PostDaoService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostDaoService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    // CREATE
    public void savePost(Post post) {
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        post.setUser(loggedInUser);
        postRepository.save(post);
    }

    // READ
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(long id) {
        if (postRepository.findById(id).isPresent()) {
            return postRepository.findById(id).get();
        } else {
            throw new RuntimeException("Post was not found.");
        }
    }

    // DELETE
    public void deletePostById(long id) {
        postRepository.deleteById(id);
    }



}