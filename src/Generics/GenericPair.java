public class GenericPair <K,V>{
    private V value;
    private K key;

    public GenericPair(K key,V value) {
        this.value = value;
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public static void main(String[] args) {
        GenericPair<String,Integer> pair = new GenericPair<>("Age",18);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
