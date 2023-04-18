package model;

import java.io.Serializable;
import java.util.Date;

public class HangHoa implements Serializable{
	private int maSP, tonKho;
	private String tenSP, phanLoai;
	private double giaNhap, giaBan;
	private Date ngayKT;
	
	public HangHoa(){
		
	}
	
	public HangHoa(int maSP, String tenSP, int tonKho, String phanLoai, double giaNhap, double giaBan, Date ngayKT){
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.tonKho = tonKho;
		this.phanLoai = phanLoai;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.ngayKT = ngayKT;
	}

	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public int getTonKho() {
		return tonKho;
	}

	public void setTonKho(int tonKho) {
		this.tonKho = tonKho;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getPhanLoai() {
		return phanLoai;
	}

	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}

	public Date getNgayKT() {
		return ngayKT;
	}

	public void setNgayKT(Date ngayKT) {
		this.ngayKT = ngayKT; 
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	@Override
	public String toString() {
		return "HangHoa [maSP=" + maSP + ", tonKho=" + tonKho + ", tenSP=" + tenSP + ", phanLoai=" + phanLoai
				+ ", ngayKT=" + ngayKT + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + "]";
	}
	
	
	
	
}
