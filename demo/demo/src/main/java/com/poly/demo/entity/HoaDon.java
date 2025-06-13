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
@Table(name = "hoa_don")
@Data
@Builder
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_phieu_giam_gia")
    private Integer idPhieuGiamGia;

    @Column(name = "id_tai_khoan")
    private Integer idTaiKhoan;

    @Column(name = "ma_hoa_don")
    private String maHoaDon;

    @Column(name = "nguoi_sua")
    private String nguoiSua;

    @Column(name = "nguoi_tao")
    private String nguoiTao;




    @Column(name = "thoi_gian_nhan_hang")
    private Date thoiGianNhanHang;

    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;

    @Column(name = "loai_hoa_don")
    private String loaiHoaDon;

    @Column(name = "ship")
    private String ship;

    @Column(name = "email_nguoi_nhan")
    private String emailNguoiNhan;

    @Column(name = "so_dien_thoai_nguoi_nhan")
    private Integer soDienThoaiNguoiNhan;

    @Column(name = "di_chi")
    private Integer diaChi;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai",nullable = false)
    private HoaDon.Status status = HoaDon.Status.ACTIVE;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "tong_tien")
    private Float tongTien;

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
