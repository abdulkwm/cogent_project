package exception_handling;

public class Number {
    int a;
    int b;
    double result;

    public Number(int x, int y) {
        this.a = x;
        this.b = y;
    }
    public void add(){
        result = this.a + this.b;
    }
    public void sub(){
        this.result = this.a - this.b;
    }
    public void mul(){
        this.result = this.a * this.b;
    }
    public void div() throws ArithmeticException{
        if (this.b == 0){
            throw new ArithmeticException("division by zero is undefined");
        }
        this.result = this.a / this.b;
    }
    public void display(){
        System.out.println("First number: " + this.a);
        System.out.println("Second number: " + this.b);
        System.out.println("Result: " + this.result);
    }
}
