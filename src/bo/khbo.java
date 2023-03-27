package bo;

import bean.khachhangbean;

import dao.khdao;

public class khbo {
   khdao khdao= new khdao();
   public khachhangbean ktdn(String tendn, String pass) {
	   return khdao.ktdn(tendn, pass);
   }
}

