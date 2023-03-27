package bo;

import java.util.ArrayList;

import bean.loaibean;
import bean.cdbean;
import dao.loaidao;
import dao.cddao;

public class cdbo {
	cddao sdao= new cddao();
	ArrayList < cdbean > ds;
	public ArrayList<cdbean> getcd()
	{
		ds=sdao.getcd();
		return ds;
	}
	
	public ArrayList<cdbean> timcd(String maloai) {
		ArrayList<cdbean> tam = new ArrayList<cdbean>();
		
		for (cdbean s : ds)
			if (s.getMaloai().equals(maloai))
				tam.add(s);
		return tam;
	}
	public ArrayList<cdbean> Tim(String key) {
		ArrayList<cdbean> tam = new ArrayList<cdbean>();
		
		for (cdbean s : ds)
			if (s.getTencd().toLowerCase().trim().contains(key.toLowerCase().trim())
					|| s.getTacgia().toLowerCase().trim().contains(key.toLowerCase().trim())
					|| s.getMaloai().toLowerCase().trim().contains(key.toLowerCase().trim()))
				tam.add(s);
		return tam;
	}
	public int luucd(cdbean cdbean) {	
		return sdao.themcd(cdbean);
	}

	public void xoa(String macddexoa) {
		sdao.xoacd(macddexoa);
	}
	
	
}
