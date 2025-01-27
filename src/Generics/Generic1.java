
class MyGeneric<T1>{
    int val;
    private T1 t1;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class Generic1 {
    public static void main(String[] args) {
        MyGeneric<String> g1 = new MyGeneric<>(23,"My String");
        String a = g1.getT1();
        System.out.println(a);
    }

}
