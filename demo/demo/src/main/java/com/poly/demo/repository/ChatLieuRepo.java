package com.poly.demo.repository;

import com.poly.demo.entity.ChatLieu;
import com.poly.demo.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatLieuRepo extends JpaRepository<ChatLieu, Integer> {
}
