package com.choongang.frombirth.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAlertDTO {
    private Integer notificationId;
    private String userId;
    private String message;
    private Boolean isRead;
    private LocalDateTime createdAt;
}
