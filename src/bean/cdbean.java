package bean;

public class cdbean {
	private String macd;
	private String tencd;
	private String tacgia;
	private Long gia;
	private Long soluong;
	private String anh;
	private String maloai;
	
	public cdbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cdbean(String macd, String tencd, String tacgia, Long gia, Long soluong, String anh, String maloai) {
		super();
		this.macd = macd;
		this.tencd = tencd;
		this.tacgia = tacgia;
		this.gia = gia;
		this.soluong = soluong;
		this.anh = anh;
		this.maloai = maloai;
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
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public Long getSoluong() {
		return soluong;
	}
	public void setSoluong(Long soluong) {
		this.soluong = soluong;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	
	
}