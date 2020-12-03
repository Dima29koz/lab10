package task1;

public class Complex {
    int real;
    int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public Complex(){
        this.real = 0;
        this.image = 0;
    }
    public void PrintComplex(){
        System.out.printf("%d%+di\n", real, image);
    }
}
