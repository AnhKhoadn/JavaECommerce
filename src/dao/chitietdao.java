package dao;

import java.sql.PreparedStatement;


public class chitietdao {

	public int Them(String macd, long soluongmua, long mahd) {
		try {
			ketnoidao kn= new ketnoidao();
			kn.KetNoi();
			String sql="insert into ChiTietHoaDon(Macd,SoluongMua, MaHoaDon,damua) values(?,?,?,?)";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setString(1, macd);
			cmd.setLong(2, soluongmua);
			cmd.setLong(3, mahd);
			cmd.setBoolean(4, false);
			 int kq= cmd.executeUpdate();
			 kn.cn.close();
			return kq;
		} catch (Exception e) {
			e.printStackTrace();return 0;
		}
	}
	
		

}

