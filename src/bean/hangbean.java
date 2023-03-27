package bean;

public class hangbean {
	private String mahang;
	private String tenhang;
	private String nhacungcap;
	private Long gia;
	private Long soluong;
	private String anh;
	@Override
	public String toString() {
		return "hangbean [mahang=" + mahang + ", tenhang=" + tenhang + ", nhacungcap=" + nhacungcap + ", gia=" + gia
				+ ", soluong=" + soluong + ", anh=" + anh + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public hangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hangbean(String mahang, String tenhang, String nhacungcap, Long gia, Long soluong, String anh) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.nhacungcap = nhacungcap;
		this.gia = gia;
		this.soluong = soluong;
		this.anh = anh;
	}
	public String getMahang() {
		return mahang;
	}
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public String getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
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
	public Object getMaloai() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
