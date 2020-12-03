package task2;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("emits magical sound...");
    }
    @Override
    public void sit() {
        System.out.println("Sitting on Magical chair...");
    }

    @Override
    public void setChair(Chair chair) {

    }
}
