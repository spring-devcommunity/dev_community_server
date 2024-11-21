package com.example.dev_community.service.post;

import com.example.dev_community.dto.post.AddPostRequest;
import com.example.dev_community.dto.post.PostResponse;
import com.example.dev_community.dto.post.UpdatePostRequest;
import com.example.dev_community.entity.post.Post;
import com.example.dev_community.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {

    private final PostRepository postRepository;

    public Post save(AddPostRequest request) {
        return postRepository.save(request.toEntity());
    }

    public List<PostResponse> findAllPosts() {
        return postRepository.findAll().stream().map(PostResponse::new).toList();
    }

    public PostResponse findPostById(Long id) {
        Post post = postRepository.findById(id).orElse(null);
        return post != null ? new PostResponse(post) : null;
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

    public Post update(Long id, UpdatePostRequest request) {
        Post post = postRepository.findById(id).orElse(null);
        if (post !=null) {
            post.update(request.getTitle(), request.getContent());
        }
        return post;
    }
}
