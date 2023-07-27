package generic.application;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1000);
        NumberData<Long> longNumberData = new NumberData<>(1000L);

        // NumberData<String> stringNumberData = new NumberData<String>("Dede"); // error
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
