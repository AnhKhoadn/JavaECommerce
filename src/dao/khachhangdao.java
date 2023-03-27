package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLDataException;

import bean.khachhangbean;
import bean.loaibean;

public class khachhangdao {
	
	public static int dangkykhachhang (khachhangbean kh) throws ClassNotFoundException{
		
				try
				{
				String sql= "INSERT INTO KhachHang" + "(hoten,diachi,sodt,email,tendn,pass)  VALUES "+ "(?,?,?,?,?,?);" ;
				int result=0;
				ketnoidao kn= new ketnoidao();
				kn.KetNoi();
				
				PreparedStatement cmd=kn.cn.prepareStatement(sql);
	
				cmd.setString(1,kh.getHoten());
				cmd.setString(2,kh.getDiachi());
				cmd.setString(3,kh.getSodt());
				cmd.setString(4,kh.getEmail());
				cmd.setString(5,kh.getTendn());
				cmd.setString(6,kh.getPass());
				
				
						result=cmd.executeUpdate();
					

					

		
			} catch (Exception e) {
			e.printStackTrace();
			}
			

				int result = 0;
				return result;
				

}

}
