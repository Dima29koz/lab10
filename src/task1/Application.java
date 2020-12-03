package task1;

public class Application {
    public static void main(String[] args) {
        CoplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.CreateComplex(5,10);
        Complex complex2 = factory.createComplex();
        complex1.PrintComplex();
        complex2.PrintComplex();

    }
}
