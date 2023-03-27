package bean;

public class xacnhanbean {
	private long MaChiTietHD;
	private long  MaHoaDon;
	private String hoten;
	private long gia;
	private long ThanhTien;
	private long SoLuongMua;
	private boolean damua;
	public xacnhanbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public xacnhanbean(long maChiTietHD, long maHoaDon, String hoten, long gia, long thanhTien, long soLuongMua,
			boolean damua) {
		super();
		MaChiTietHD = maChiTietHD;
		MaHoaDon = maHoaDon;
		this.hoten = hoten;
		this.gia = gia;
		ThanhTien = thanhTien;
		SoLuongMua = soLuongMua;
		this.damua = damua;
	}
	public long getMaChiTietHD() {
		return MaChiTietHD;
	}
	public void setMaChiTietHD(long maChiTietHD) {
		MaChiTietHD = maChiTietHD;
	}
	public long getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(long maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(long thanhTien) {
		ThanhTien = thanhTien;
	}
	public long getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(long soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public boolean isDamua() {
		return damua;
	}
	public void setDamua(boolean damua) {
		this.damua = damua;
	}
	
	
	
		

}
