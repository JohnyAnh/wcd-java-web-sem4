package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class JavaWebLearn_liststudent implements Serializable {
    private int id;

    private String maSinhVien;

    private String ten;

    private int namSinh;

    private String dienThoai;

    //băt buộc contructor rỗng
    public JavaWebLearn_liststudent() {

    }

    public JavaWebLearn_liststudent(int id, String maSinhVien, String ten, int namSinh, String dienThoai) {
        this.id = id;
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.namSinh = namSinh;
        this.dienThoai = dienThoai;
    }
    @Id //khóa chính
    @GeneratedValue //auto number
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
}




