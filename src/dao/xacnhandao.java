package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.lichsubean;
import bean.xacnhanbean;

public class xacnhandao {
	 public ArrayList<xacnhanbean> getxacnhan(){
    	 ArrayList<xacnhanbean> ds= new ArrayList<xacnhanbean>();
    	try {
    		//b1 Ket noi vao csdl
 		   ketnoidao kn= new ketnoidao();
 		   kn.KetNoi();
 		   //B2: Lay du lieu ve
 			   //b2.1: Thiet lap cau lenh sql
 			   String sql="select * from VXacNhan";
 			   //b2.2 Thuc hien cau lenh
 			   PreparedStatement cmd=kn.cn.prepareStatement(sql);
 			   ResultSet rs=cmd.executeQuery();
 		   //B3: Duyet qua tap du lieu trong rs va luu vao mang ds
 			   while(rs.next()) {
 				   long MaChiTietHD=rs.getLong("MaChiTietHD");
 				   long MaHoaDon=rs.getLong("MaHoaDon");
 				   String hoten=rs.getString("hoten");
 				   long SoLuongMua=rs.getLong("SoLuongMua");
 				   long gia=rs.getLong("gia");
 				   long thanhtien=rs.getLong("thanhtien");
 				   boolean damua=rs.getBoolean("damua");
 				   ds.add(new xacnhanbean(MaChiTietHD, MaHoaDon, hoten, SoLuongMua, gia, thanhtien, damua));
 			   }
 		  //b4: dong ket noi
 			   rs.close(); kn.cn.close(); 	return ds;
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
     }
}

