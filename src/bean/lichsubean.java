package bean;

public class lichsubean {
   private long makh;
   private String tencd;
   private long SoLuongMua;
   private long ThanhTien;
   private boolean damua;
   private String anh;
public lichsubean() {
	super();
	// TODO Auto-generated constructor stub
}
public lichsubean(long makh, String tencd, long soLuongMua, long thanhTien, boolean damua, String anh) {
	super();
	this.makh = makh;
	this.tencd = tencd;
	SoLuongMua = soLuongMua;
	ThanhTien = thanhTien;
	this.damua = damua;
	this.anh = anh;
}
public long getMakh() {
	return makh;
}
public void setMakh(long makh) {
	this.makh = makh;
}
public String getTencd() {
	return tencd;
}
public void setTencd(String tencd) {
	this.tencd = tencd;
}
public long getSoLuongMua() {
	return SoLuongMua;
}
public void setSoLuongMua(long soLuongMua) {
	SoLuongMua = soLuongMua;
}
public long getThanhTien() {
	return ThanhTien;
}
public void setThanhTien(long thanhTien) {
	ThanhTien = thanhTien;
}
public boolean isDamua() {
	return damua;
}
public void setDamua(boolean damua) {
	this.damua = damua;
}
public String getAnh() {
	return anh;
}
public void setAnh(String anh) {
	this.anh = anh;
}
   
}


