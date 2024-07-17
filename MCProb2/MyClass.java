package CS401MPPSolutions.MCProb2;

import java.util.Arrays;

public class MyClass <T>{
    T[] arr;
    int y;

    public MyClass(){
      //  arr = new T[2]; // T cannot be instantiated directly.
        arr = (T[]) new Object[2];
        y=0;
    }

    public void set(int index,T value){
        arr[index] = value;
    }

    public T get(int index){
        return (T) arr[index];
    }

    public static void main(String[] args) {
        MyClass<String> m = new MyClass<>();
        m.set(0,"A");
        m.set(1,"B");
      System.out.println(m.get(0));

    }
}
