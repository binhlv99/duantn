package com.poly.demo.controller;

import com.poly.demo.repository.DanhMucRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DanhMucController {
    @Autowired
    private DanhMucRepo danhMucRepo;

    @GetMapping("/list-danh-muc")
    public String getHoaDon(Model model) {
/*
        // Tao tai khoan admin ban dau
        var accountCreate = TaiKhoan.builder()
                .email("binhlv44842@fpt.edu.vn")
                .cccd("022099002948")
                .ma("44842")
                .hoTen("Le Van Binh")
                .soDienThoai(829296511)
                .tenDangNhap("admin")
                .matKhau("123456")
                .idVaiTro(1)
                .ngaySinh(LocalDateTime.now())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        taiKhoanRepo.save(accountCreate);*/
        model.addAttribute("ListDanhMuc", danhMucRepo.findAll());
        return "TAIKHOAN/hien-thi";
    }


}
