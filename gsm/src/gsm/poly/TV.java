package gsm.poly;

public class TV implements RemoCon{
    public void volUP() {
        System.out.println("TV 소리가 올라간다.");
    }
    
    public void volDOWN() {
        System.out.println("TV 소리가 내려간다");
    }
    
    public void internet() {
        System.out.println("TV가 인터넷이 된다.");
    }
}