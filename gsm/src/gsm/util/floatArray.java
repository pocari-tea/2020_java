package gsm.util;

public class floatArray {
    private float[] arr;
    private int cnt;
    
    // �迭�� ���� ����� ������ ������ ���ϴ� ����
    public int size() {
        return cnt;
    }
    
    public floatArray() {
        // 10���� ũ��� ����� �ش�
//        arr = new int[10];
        this(10);
    }
    
    public floatArray(int initial) {
        arr = new float[initial];
    }
    
    // �迭�� �����͸� �����ϴ� ����(Add)
    public void add(float data) {
        arr[cnt++]=data;
    }
    
    // ���ϴ� index�� �����͸� �������� ����(get)
    public float get(int index) {
        return arr[index];
    }
}