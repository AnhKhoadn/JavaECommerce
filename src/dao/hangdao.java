package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.hangbean;




public class hangdao {
	public ArrayList<hangbean> gethang() {
		{
			try {
				ArrayList<hangbean> ds = new ArrayList<hangbean>();
				ketnoidao kn = new ketnoidao();
				kn.KetNoi();
				String sql = "select * from Hang";

				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				ResultSet rs = cmd.executeQuery();
				while (rs.next()) {
					String Mahang = rs.getString("Mahang");
					String tenhang = rs.getString("tenhang");
					String nhacungcap = rs.getString("nhacungcap");
					Long gia = rs.getLong("gia");
					Long soluong = rs.getLong("soluong");
					String anh = rs.getString("anh");
					
					ds.add(new hangbean(Mahang, tenhang, nhacungcap, gia, soluong, anh));

				}
				rs.close();
				kn.cn.close();
				return ds;

			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

	}
}
	
	//Test show
	