package com.poly.demo.repository;

import com.poly.demo.entity.HoaDon;
import com.poly.demo.entity.KieuDang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KieuDangRepo extends JpaRepository<KieuDang, Integer> {
}
