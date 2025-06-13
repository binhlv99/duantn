package com.poly.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phieu_giam_gia_tai_khoan")
@Data
@Builder
public class PhieuGiamGiaTaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_tai_khoan")
    private Integer idTaiKhoan;

    @Column(name = "id_phieu_giam_gia")
    private Integer idPhieuGiamGia;


    @Column(name = "nguoi_tao")
    private String nguoiTao;

    @Column(name = "nguoi_sua")
    private String nguoiSua;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai",nullable = false)
    private PhieuGiamGiaTaiKhoan.Status status = PhieuGiamGiaTaiKhoan.Status.ACTIVE;


    @CreatedDate
    @Column(name = "ngay_tao", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "ngay_sua", nullable = false)
    private LocalDateTime updatedAt;


    public enum Status {
        ACTIVE,
        INACTIVE
    }
}
