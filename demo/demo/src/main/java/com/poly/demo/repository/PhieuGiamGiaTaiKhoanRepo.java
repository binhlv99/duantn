package com.poly.demo.repository;

import com.poly.demo.entity.HoaDon;
import com.poly.demo.entity.PhieuGiamGiaTaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuGiamGiaTaiKhoanRepo extends JpaRepository<PhieuGiamGiaTaiKhoan, Integer> {
}
