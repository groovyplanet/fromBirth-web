package com.choongang.frombirth.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeeklyReportDTO {
    private Integer reportId;
    private Integer childId;
    private Integer riskLevel;
    private String feedback;
    private LocalDateTime createdAt;
}

