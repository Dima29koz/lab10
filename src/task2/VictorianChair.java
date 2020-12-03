package task2;

public class VictorianChair implements Chair {
    int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on Victorian chair...");
    }

    @Override
    public void setChair(Chair chair) {

    }
}
