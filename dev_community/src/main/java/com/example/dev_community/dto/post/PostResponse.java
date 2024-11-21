package com.example.dev_community.dto.post;

import com.example.dev_community.entity.post.Post;
import lombok.Getter;

@Getter
public class PostResponse {

    private Long postId;
    private String title;
    private String content;

    public PostResponse(Post post) {
        this.postId = post.getPostId();
        this.title = post.getTitle();
        this.content = post.getContent();
    }
}
