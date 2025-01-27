public class GenericBox<T> {
    private T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);

    }
}
