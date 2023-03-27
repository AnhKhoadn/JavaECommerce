package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaibean;
import bean.cdbean;

public class loaidao {
	public ArrayList<loaibean> getloai() {
		{
			try {
				ArrayList<loaibean> ds = new ArrayList<loaibean>();
				ketnoidao kn= new ketnoidao();
				kn.KetNoi();
				String sql="select * from loai";
				PreparedStatement cmd=kn.cn.prepareStatement(sql);
				ResultSet rs=cmd.executeQuery();
				while (rs.next()) {
					String maloai=rs.getString("maloai");
					String tenloai=rs.getString("tenloai");
					
					ds.add(new loaibean(maloai, tenloai ));
					
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
