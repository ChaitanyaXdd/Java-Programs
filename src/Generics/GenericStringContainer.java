public class GenericStringContainer implements GenericContainer<String>{

    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}
