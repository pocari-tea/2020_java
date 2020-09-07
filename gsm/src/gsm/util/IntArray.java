package gsm.util;

public class IntArray {
	private int[] arr;
    private int cnt;
    
    // 배열에 실제 저장된 원소의 개수를 구하는 동작
    public int size() {
        return cnt;
    }
    
    public IntArray() {
        // 10개의 크기로 만들어 준다
//        arr = new int[10];
        this(10);
    }
    
    public IntArray(int initial) {
        arr = new int[initial];
    }
    
    // 배열에 데이터를 저장하는 동작(Add)
    public void add(int data) {
        arr[cnt++]=data;
    }
    
    // 원하는 index의 데이터를 가져오는 동작(get)
    public int get(int index) {
        return arr[index];
    }
}
