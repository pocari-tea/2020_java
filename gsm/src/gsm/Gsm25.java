package gsm;

import gsm.poly.*;

public class Gsm25 {
	 public static void main(String[] args) {
		 // RemoCon���� TV�� Radio�� ���۽�Ű�ÿ�.
		 
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
