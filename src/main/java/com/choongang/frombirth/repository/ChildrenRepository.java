package com.choongang.frombirth.repository;

import com.choongang.frombirth.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChildrenRepository extends JpaRepository<Children, Integer> {
    List<Children> findByUserId(String userId); // 특정 사용자의 자녀 목록 가져오기
}
