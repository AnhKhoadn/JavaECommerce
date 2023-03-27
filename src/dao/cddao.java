package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.loaibean;
import bean.cdbean;

public class cddao {
	public ArrayList<cdbean> getcd() {
		{
			try {
				ArrayList<cdbean> ds = new ArrayList<cdbean>();
				ketnoidao kn = new ketnoidao();
				kn.KetNoi();
				String sql = "select * from cd";

				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				ResultSet rs = cmd.executeQuery();
				while (rs.next()) {
					String macd = rs.getString("macd");
					String tencd = rs.getString("tencd");
					String tacgia = rs.getString("tacgia");
					Long gia = rs.getLong("gia");
					Long soluong = rs.getLong("soluong");
					String anh = rs.getString("anh");
					String maloai = rs.getString("maloai");
					ds.add(new cdbean(macd, tencd, tacgia, gia, soluong, anh, maloai));

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
	
	//Test show
	public ArrayList<cdbean> getListPage(ArrayList<cdbean> arr, int start, int end)
	{
		ArrayList<cdbean> list = new ArrayList<>();
		for(int i=start;i<=end;i++)
		{
			list.add(arr.get(i));
		}
		return list;
		
	}
	public int xoacd(String macd) {
		String query = "delete from cd where macd = ?";
		try {
			ketnoidao kn = new ketnoidao();
			kn.KetNoi();
			System.out.println("Daketnoi");
			PreparedStatement cmd = kn.cn.prepareStatement(query);
			cmd.setString(1, macd);
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	//Test show
	public int themcd(cdbean s) {
		String add_cd = "INSERT INTO cd(macd,tencd,soluong,gia,maloai,anh,tacgia)VALUES(?,?,?,?,?,?,?)";
//		String add_cd = "INSERT INTO cd(macd,tencd,soluong,gia,maloai,anh,congty)VALUES('?','?',?,?,'?','?','?');";
		int result = 0;
		try {
			ketnoidao kn = new ketnoidao();
			kn.KetNoi();
			PreparedStatement ps = kn.cn.prepareStatement(add_cd);
			ps.setString(1, s.getMacd());
			ps.setString(2, s.getTencd());
			ps.setLong(3, s.getSoluong());
			ps.setLong(4, s.getGia());
			ps.setString(5, s.getMaloai());
			ps.setString(6, s.getAnh());
			ps.setString(7, s.getTacgia());
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			printSQLException(e);
		}
		return result;
	}

	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}

	public int getCount() {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
	    ArrayList<cdbean> list = new ArrayList();
	    String sql = "SELECT count(*) FROM cd";
	    int count = 0;
	    try {
	        PreparedStatement stmt = kn.cn.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();
	        while (rs.next()) {
	            count = rs.getInt(1);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}

}