package generic.application;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Dede");
        // doIt(stringMyData); // error
        // MyData<Object> objectMyData = stringMyData; // error

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; // error

        // doItInteger(objectMyData); // error

    }
    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }
    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
