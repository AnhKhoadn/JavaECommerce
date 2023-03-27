package bean;

public class giohangbean {

	private String macd;
	private String tencd;
	private long soluong;
	private long gia;
	private long thanhtien;
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giohangbean(String macd, String tencd, long soluong, long gia) {
		super();
		this.macd = macd;
		this.tencd = tencd;
		this.soluong = soluong;
		this.gia = gia;
		this.thanhtien=soluong*gia;
	}
	public String getMacd() {
		return macd;
	}
	public void setMacd(String macd) {
		this.macd = macd;
	}
	public String getTencd() {
		return tencd;
	}
	public void setTencd(String tencd) {
		this.tencd = tencd;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getThanhtien() {
		return soluong*gia;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
}

