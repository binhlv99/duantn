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
@Table(name = "thanh_toan")
@Data
@Builder
public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_hoa_don")
    private Integer idHoaDon;

    @Column(name = "phuong_thuc_thanh_toan")
    private String phuongThucThanhToan;

    @Column(name = "so_tien_thanh_toan")
    private Float soTienThanhToan;


    @Column(name = "ngay_thanh_toan")
    private Date ngayThanhToan;

    @Column(name = "mo_ta")
    private String moTa;


    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai",nullable = false)
    private ThanhToan.Status status = ThanhToan.Status.ACTIVE;

    public enum Status {
        ACTIVE,
        INACTIVE
    }
}
