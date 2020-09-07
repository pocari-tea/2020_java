package gsm;

import gsm.util.MyUtil;
// 1. 문제
public class Gsm09 {
   public static void main(String[] args) {
        // MyUtil의 static 메서드를 호출하는 방법
      int v= MyUtil.hap(10, 20);
      java.lang.System.out.println(v);      
      MyUtil my=new MyUtil();
      float f=my.hap(45.6f, 67.8f);
      System.out.println(f);      
      java.lang.String su="100";
      int s=Integer.parseInt(su);
      System.out.println(s);      
       String a="100";
       String b="200";
       int c = Integer.parseInt(a) + Integer.parseInt(b);
       // 코드추가?
       System.out.println(a+b); // 코드는 그대로->300
   }
}