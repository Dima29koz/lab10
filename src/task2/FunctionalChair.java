package task2;

public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a+b;
    }
    @Override
    public void sit() {
        System.out.println("Sitting on Functional chair...");
    }

    @Override
    public void setChair(Chair chair) {

    }
}
