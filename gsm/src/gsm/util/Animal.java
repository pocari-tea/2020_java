package gsm.util;

// 동물 -> 이름, 나이, 종, 몸무게 ....
public class Animal {
    // 1. 정보 은닉
    private String name;
    private int age;
    public Animal() {
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public Animal(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
    
}