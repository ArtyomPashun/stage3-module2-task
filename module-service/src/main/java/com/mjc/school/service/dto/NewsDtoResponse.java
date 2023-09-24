package com.mjc.school.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsDtoResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
    private Long authorId;
}