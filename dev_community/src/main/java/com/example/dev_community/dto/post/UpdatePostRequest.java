package com.example.dev_community.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdatePostRequest {
    private String title;
    private String content;
}
