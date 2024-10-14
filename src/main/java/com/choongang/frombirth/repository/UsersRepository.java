package com.choongang.frombirth.repository;

import com.choongang.frombirth.entity.Users; // Users 엔티티 임포트
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, String> {
    Optional<Users> findByUsername(String username); // 사용자 이름으로 사용자 찾기
}
