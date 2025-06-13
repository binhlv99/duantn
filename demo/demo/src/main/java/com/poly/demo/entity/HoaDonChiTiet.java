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
@Table(name = "hoa_don_chi_tiet")
@Data
@Builder
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_hoa_don")
    private Integer idHoaDon;

    @Column(name = "id_san_pham_chi_tiet")
    private Integer idSanPhamChiTiet;

    @Column(name = "ma")
    private String ma;

    @Column(name = "gia")
    private Float gia;

    @Column(name = "thanh_tien")
    private Float thanhTien;

    @Column(name = "so_luong")
    private Integer soLuong;

    @CreatedDate
    @Column(name = "ngay_tao", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "ngay_sua", nullable = false)
    private LocalDateTime updatedAt;


}
