
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hoadondao {

	public long maxhd() {
		try {
			ketnoidao kn= new ketnoidao();
			kn.KetNoi();
			String sql="select max(MaHoaDon) as maxhd from hoadon";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			ResultSet rs= cmd.executeQuery();
			long max=0;
			if(rs.next())
				max=rs.getLong("maxhd");
			return max;
			
		} catch (Exception e) {
			e.printStackTrace();return 0;
		}
	}
	public int Them(long makh) {
		try {
			ketnoidao kn= new ketnoidao();
			kn.KetNoi();
			String sql="insert into hoadon(makh,NgayMua,damua) values(?,?,?)";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setLong(1, makh);
			Date n= new Date();
			SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd");
			String st=dd.format(n);
			Date ngaymua=dd.parse(st);
			cmd.setDate(2,new java.sql.Date(ngaymua.getTime()));
			cmd.setBoolean(3, false);
			 int kq= cmd.executeUpdate();
			 kn.cn.close();
			return kq;
		} catch (Exception e) {
			e.printStackTrace();return 0;
		}
	}
	
}


