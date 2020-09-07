package gsm.util;

public class floatArray {
    private float[] arr;
    private int cnt;
    
    // 배열에 실제 저장된 원소의 개수를 구하는 동작
    public int size() {
        return cnt;
    }
    
    public floatArray() {
        // 10개의 크기로 만들어 준다
//        arr = new int[10];
        this(10);
    }
    
    public floatArray(int initial) {
        arr = new float[initial];
    }
    
    // 배열에 데이터를 저장하는 동작(Add)
    public void add(float data) {
        arr[cnt++]=data;
    }
    
    // 원하는 index의 데이터를 가져오는 동작(get)
    public float get(int index) {
        return arr[index];
    }
}