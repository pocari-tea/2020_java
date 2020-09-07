package gsm;

import gsm.poly.A;
import gsm.poly.B;

public class Gsm23 
{

    public static void main(String[] args) {
        //A, B 클래스를 배열에 저장하고 ptr()메서드를 동작하시오.
        //Object[]
        Object[] obj = new Object[2];
        
        obj[0] = new A();
        obj[1] = new B();
        
        display(obj);
    }
    
    public static void display(Object[] obj) {
        for(int i=0; i < obj.length; i++) {
            if(obj[i] instanceof A) {
                ((A)obj[i]).ptr();
            }else {
                ((B)obj[i]).ptr();
            }
        }
    }

}
