package bo;

import dao.chitietdao;

public class chitietbo {
    chitietdao ctdao= new chitietdao();
    public int Them(String macd, long soluongmua, long mahd) {
    	return ctdao.Them(macd, soluongmua, mahd);
    }
}

