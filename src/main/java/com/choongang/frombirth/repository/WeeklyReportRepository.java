package com.choongang.frombirth.repository;

import com.choongang.frombirth.entity.WeeklyReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeeklyReportRepository extends JpaRepository<WeeklyReport, Integer> {
    List<WeeklyReport> findByChildId(Integer childId); // 특정 자녀의 주간 보고서 목록 가져오기
}
