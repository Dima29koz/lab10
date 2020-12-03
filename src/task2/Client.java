package task2;

public class Client {
    /*Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public void sit(){
        chair.sit();
    }*/

    public static void main(String[] args) {
        /*
        Client client = new Client();
        client.setChair(new VictorianChair(6));
        client.sit();*/


        AbstractChairFactory factory = new ChairFactory();
        VictorianChair victorianChair = factory.createVictorianChair(152);
        MagicChair magicChair = factory.createMagicChair();
        FunctionalChair functionalChair = factory.createFunctionalChair();

        victorianChair.sit();
        System.out.println("Victorian`s chair age: "+victorianChair.getAge());

        magicChair.sit();
        magicChair.doMagic();

        functionalChair.sit();
        System.out.println("Summ is: " + functionalChair.sum(5, 6));
    }
}
