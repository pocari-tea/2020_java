package gsm.poly;

public class Radio implements RemoCon{
    public void volUP() {
        System.out.println("Radio �Ҹ��� �ö󰣴�.");
    }
    
    public void volDOWN() {
        System.out.println("Radio �Ҹ��� ��������");
    }
    
    public void internet() {
        System.out.println("Radio������ ������ ���� �ʴ´�.");
    }
}