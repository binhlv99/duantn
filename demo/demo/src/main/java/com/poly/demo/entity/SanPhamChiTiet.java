package com.poly.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "san_pham_chi_tiet")
@Data
@Builder
public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_san_pham")
    private Integer idSanPham;

    @Column(name = "id_mau_sac")
    private Integer idMauSac;

    @Column(name = "id_kich_thuoc")
    private Integer idKichThuoc;

    @Column(name = "id_kieu_dang")
    private Integer idKieuDang;

    @Column(name = "id_danh_muc")
    private Integer idDanhMuc;

    @Column(name = "id_loai_giay")
    private Integer idLoaiGiay;

    @Column(name = "id_mui_giay")
    private Integer idMuiGiay;

    @Column(name = "id_co_giay")
    private Integer idCoGiay;

    @Column(name = "id_de_giay")
    private Integer idDeGiay;

    @Column(name = "id_chat_lieu")
    private Integer idChatLieu;


    @Column(name = "ten_san_pham_chi_tiet")
    private String tenSanPhamChiTiet;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "gia")
    private Float gia;

    @Column(name = "nguoi_tao")
    private String nguoiTao;

    @Column(name = "nguoi_sua")
    private String nguoiSua;


    @CreatedDate
    @Column(name = "ngay_tao", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "ngay_sua", nullable = false)
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai",nullable = false)
    private SanPhamChiTiet.Status status = SanPhamChiTiet.Status.ACTIVE;


    public enum Status {
        ACTIVE,
        INACTIVE
    }
}
