package bo;

import java.util.ArrayList;
import java.util.Collection;

import bean.hangbean;
import bean.loaibean;
import bean.cdbean;
import dao.hangdao;
import dao.loaidao;
import dao.cddao;

public class hangbo {
	hangdao sdao= new hangdao();
	ArrayList < hangbean > dss;
	public ArrayList<hangbean> gethang()
	{
		dss=sdao.gethang();
		return dss;
	}
	
	public ArrayList<hangbean> timcd(String macd) {
		ArrayList<hangbean> tam = new ArrayList<hangbean>();
		
		for (hangbean s : dss)
			if (s.getMaloai().equals(macd))
				tam.add(s);
		return tam;
	}
	public ArrayList<hangbean> Tim(	String key) {
		ArrayList<hangbean> tam = new ArrayList<hangbean>();
		
		
		for (hangbean s : dss)
			
			if 
			(
					
			     	 
					s.getTenhang().toLowerCase().trim().contains(key.toLowerCase().trim())
					
			        || s.getMahang().toLowerCase().trim().contains(key.toLowerCase().trim())
			     	
			      	||( Long.toString(s.getGia()) .toLowerCase().trim().contains(key.toLowerCase().trim()))
					/* || (s.getGia()>=Long.parseLong(key)) */
			     	
			     	)

			
					 
				tam.add(s);
		return tam;
	
			
			  
			
		
	 		   
	}
	public ArrayList<hangbean> Timgia(	String key) {
		ArrayList<hangbean> tam = new ArrayList<hangbean>();
		
		
		for (hangbean s : dss)
			
			if 
			(
					
			     	 
					s.getTenhang().toLowerCase().trim().contains(key.toLowerCase().trim())
					
			        || s.getMahang().toLowerCase().trim().contains(key.toLowerCase().trim())
			     	
			      	||( Long.toString(s.getGia()) .toLowerCase().trim().contains(key.toLowerCase().trim()))
				 || (s.getGia()>=Long.parseLong(key)) 
			     	
			     	)

			
					 
				tam.add(s);
		return tam;
	
			
			  
			
		
	 		   
	}
	public String  muc(long a, long b) {
		
	
		ArrayList<hangbean> tam = new ArrayList<hangbean>();

		String muc = null;
		for (hangbean s : dss)
			if( a*b >= 1000000)
			{
				muc = "Cao";
			}
			else
				muc="Trung Bình";
		return muc;
		
		
			


}
}


