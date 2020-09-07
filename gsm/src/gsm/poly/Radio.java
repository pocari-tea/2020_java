package gsm.poly;

public class Radio implements RemoCon{
    public void volUP() {
        System.out.println("Radio 소리가 올라간다.");
    }
    
    public void volDOWN() {
        System.out.println("Radio 소리가 내려간다");
    }
    
    public void internet() {
        System.out.println("Radio에서는 지원이 되지 않는다.");
    }
}