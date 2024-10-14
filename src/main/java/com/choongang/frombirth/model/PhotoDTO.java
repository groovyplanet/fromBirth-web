package com.choongang.frombirth.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoDTO {
    private Integer photoId;
    private Integer recordId;
    private String url;
    private LocalDateTime createdAt;
}
