package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.lichsubean;
import bean.cdbean;

public class lichsudao {
	 public ArrayList<lichsubean> getlichsu(long makh){
    	 ArrayList<lichsubean> ds= new ArrayList<lichsubean>();
    	try {
    		//b1 Ket noi vao csdl
 		   ketnoidao kn= new ketnoidao();
 		   kn.KetNoi();
 		   //B2: Lay du lieu ve
 			   //b2.1: Thiet lap cau lenh sql
 			   String sql="select * from VLichsu where makh=?";
 			   //b2.2 Thuc hien cau lenh
 			   PreparedStatement cmd=kn.cn.prepareStatement(sql);
 			   cmd.setLong(1, makh);
 			   ResultSet rs=cmd.executeQuery();
 		   //B3: Duyet qua tap du lieu trong rs va luu vao mang ds
 			   while(rs.next()) {
 				    String tencd=rs.getString("tencd");
 				    long SoLuongMua=rs.getLong("SoLuongMua");
 				    long ThanhTien=rs.getLong("ThanhTien");;
 				    boolean damua=rs.getBoolean("damua");
 				    String anh=rs.getString("anh");
 				    ds.add(new lichsubean(makh, tencd, SoLuongMua, ThanhTien, damua, anh));
 			   }
 		  //b4: dong ket noi
 			   rs.close(); kn.cn.close(); 	return ds;
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
     }
}


