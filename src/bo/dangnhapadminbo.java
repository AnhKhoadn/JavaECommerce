package bo;

import bean.dangnhapadminbean;

import dao.dangnhapadmindao;

public class dangnhapadminbo {
   dangnhapadmindao dangnhapadmindao= new dangnhapadmindao();
   public dangnhapadminbean ktdn(String tendn, String pass) {
	   return dangnhapadmindao.ktdn(tendn, pass);
   }
}

