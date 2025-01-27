@FunctionalInterface
interface Lambda1{
    void show(int i);
}

@FunctionalInterface
interface Lambda2{
    void show(int i,int j);
}

@FunctionalInterface
interface Lambda3{
    void show(int i);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        Lambda1 lambda1 = (int i) -> {
            System.out.println("In Show " + i);
        };
        lambda1.show(5);

        Lambda2 lambda2 = (int i, int j) -> System.out.println("In Show of Lambda 2");
        lambda2.show(2,3);

        Lambda3 lambda3 = (i) -> System.out.println(i);
        lambda3.show(4);
    }
}
