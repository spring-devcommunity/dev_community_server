package com.example.dev_community.dto.post;

import com.example.dev_community.entity.post.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AddPostRequest {
    private String title;
    private String content;

    public Post toEntity() {
        return Post.builder().
                title(title).
                content(content).
                build();
    }
}
