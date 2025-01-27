public class LambdaExpression1 {
    public static void main(String[] args) {

        printThings(() -> {
            System.out.println("Print Things 1.");
        });

        printThings(() -> System.out.println("Print Things 2."));

        LambdaPrintable lambdaPrintable = () -> System.out.println("Print Things 3");
        printThings(lambdaPrintable);

    }
    public static void printThings(LambdaPrintable thing){
        thing.print();
    }
}
