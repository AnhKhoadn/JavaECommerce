package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class taikhoan {

	public int getTaiKhoan(String tendn, String mk){
		try {
			// B1: kết nối csdl
			ketnoidao cs = new ketnoidao();
			cs.KetNoi();
			String sql = "select count(*) from DangNhap where TenDangNhap = ? and MatKhau = ?";
			PreparedStatement cmd = cs.cn.prepareStatement(sql);
			cmd.setString(1, tendn);
			cmd.setString(2, mk);
			ResultSet rs = cmd.executeQuery();
			// B3: Duyệt qua tập dữ liệu lấy về
			while (rs.next()) {
				return rs.getInt(1);
			}

			// B4: Đóng rs và cn
			rs.close();
			cs.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}