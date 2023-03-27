package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	   public ArrayList<giohangbean> ds=
			   new ArrayList<giohangbean>();
	public void Them(String macd, String tencd, long gia, long soluong)	{	   
	for(giohangbean s: ds)
		if(s.getMacd().equals(macd)) {
			s.setSoluong(s.getSoluong()+soluong);
			return;
		}
	ds.add(new giohangbean(macd, tencd, soluong, gia));
	}
	public long Tongtien ()
	{
		long ss=0;
		for ( giohangbean s:ds)
			ss=ss+s.getThanhtien();
		return ss;
			
		
	}
	 public ArrayList<giohangbean> Xoa(String ms) throws Exception{
		  	int n=ds.size();//lấy số phần tử trong mang
				for(int i=0;i<n;i++)
		  		if(ds.get(i).getMacd().equalsIgnoreCase(ms))
		  			{
		  				ds.remove(i);break;	
		  			}
		  	return ds;
		  	
		}
	 public ArrayList<giohangbean> Xoa1(String ms) {
			int n = ds.size();// lấy số phần tử trong mang
			for (int i = 0; i < n; i++)
				if (ds.get(i).getMacd().equalsIgnoreCase(ms)) {
					ds.remove(i);
					break;
				}
			return ds;
		}

	 public void Xoaa(String macd)
	 {
		 for(giohangbean g:ds)
			 if(g.getMacd().equals(macd))
		 {
			 ds.remove(g);
			 break;
			 }
	 }
	 public void xoa(String macd) {
			for(giohangbean g:ds)
				if(g.getMacd().equals(macd)) {
					ds.remove(g);
					break;
				}
		}
		public void XoaAll() {
			ds.removeAll(ds);}


		 public void Up(String macd, long soluong) {
			 if (macd != null) {
				 for (giohangbean h: ds) {
					 if(h.getMacd().equals(macd)) {
						  h.setSoluong(soluong);
						  return;
					  }
				 }
			 }
		 }
	}

