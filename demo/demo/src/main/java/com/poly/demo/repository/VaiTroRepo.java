package com.poly.demo.repository;

import com.poly.demo.entity.HoaDon;
import com.poly.demo.entity.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaiTroRepo extends JpaRepository<VaiTro, Integer> {
}
