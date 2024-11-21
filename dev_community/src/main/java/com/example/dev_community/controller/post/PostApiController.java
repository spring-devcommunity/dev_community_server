package com.example.dev_community.controller.post;

import com.example.dev_community.dto.post.AddPostRequest;
import com.example.dev_community.dto.post.PostResponse;
import com.example.dev_community.dto.post.UpdatePostRequest;
import com.example.dev_community.entity.post.Post;
import com.example.dev_community.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostApiController {

    private final PostService postService;

    @PostMapping("")
    public ResponseEntity<Post> createPost(@RequestBody AddPostRequest request) {
        Post post = postService.save(request);
        return ResponseEntity.status(201).body(post);
    }

    @GetMapping("")
    public ResponseEntity<List<PostResponse>> getAllPosts() {
        return ResponseEntity.ok().body(postService.findAllPosts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponse> getPostById(@PathVariable Long id) {
        PostResponse post = postService.findPostById(id);
        return ResponseEntity.ok().body(post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePostById(@PathVariable Long id) {
        postService.deletePostById(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Post> updatePostById(@PathVariable Long id, @RequestBody UpdatePostRequest request) {
        Post post = postService.update(id, request);
        return ResponseEntity.ok().body(post);
    }
}
