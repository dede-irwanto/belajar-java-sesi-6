package generic.application;

import generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Dede"));
        print(new MyData<MultipleBoundedTypeParameter.Manager>(new MultipleBoundedTypeParameter.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
