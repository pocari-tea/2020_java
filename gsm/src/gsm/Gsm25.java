package gsm;

import gsm.poly.*;

public class Gsm25 {
	 public static void main(String[] args) {
		 // RemoCon으로 TV와 Radio를 동작시키시오.
		 
		 RemoCon Remo = new TV();
		 Remo.volUP();
		 Remo.volDOWN();
		 Remo.internet();	 
		 
		 Remo = new Radio();
		 Remo.volUP();
		 Remo.volDOWN();
		 Remo.internet();	
	 }
}
