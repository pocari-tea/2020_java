package gsm.util;

public class IntArray {
	private int[] arr;
    private int cnt;
    
    // �迭�� ���� ����� ������ ������ ���ϴ� ����
    public int size() {
        return cnt;
    }
    
    public IntArray() {
        // 10���� ũ��� ����� �ش�
//        arr = new int[10];
        this(10);
    }
    
    public IntArray(int initial) {
        arr = new int[initial];
    }
    
    // �迭�� �����͸� �����ϴ� ����(Add)
    public void add(int data) {
        arr[cnt++]=data;
    }
    
    // ���ϴ� index�� �����͸� �������� ����(get)
    public int get(int index) {
        return arr[index];
    }
}
