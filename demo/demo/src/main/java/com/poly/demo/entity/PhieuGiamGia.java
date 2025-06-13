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
@Table(name = "phieu_giam_gia")
@Data
@Builder
public class PhieuGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "phieu_giam_gia")
    private String phieuGiamGia;

    @Column(name = "loai_phieu_giam_gia")
    private String loaiPhieuGiamGia;

    @Column(name = "gia_thi_giam")
    private String giaTriGiam;

    @Column(name = "nguoi_cap_nhat")
    private String nguoiCapNhat;

    @Column(name = "gia_tri_toi_thieu")
    private Integer giaTriToiThieu;

    @Column(name = "muc_giam_toi_da")
    private Integer mucGiamToiDa;

    @Column(name = "loai_giam_gia")
    private String loaiGiamGia;

    @Column(name = "kieu_gia_tri_giam")
    private String kieuGiaTriGiam;

    @Column(name = "ngay_het_han")
    private Date ngayHetHan;

    @Column(name = "so_luong")
    private Integer soLuong;


    @Column(name = "ngay_bat_dau")
    private Date ngayBatDau;

    @Column(name = "ten_giam_gia")
    private Integer tenGiamGia;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai",nullable = false)
    private PhieuGiamGia.Status status = PhieuGiamGia.Status.ACTIVE;


    public enum Status {
        ACTIVE,
        INACTIVE
    }
}
