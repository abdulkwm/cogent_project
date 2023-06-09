package GreeterTest;

import gl.itp.hyd65.cs65.abdu.Advisor;
import gl.itp.hyd65.cs65.abdu.Greeter;

public class GreeterTest {
    public static void main(String[] args) {
        Greeter [] greeters = new Greeter[args.length];
        Advisor advisor = new Advisor();
        for (int i = 0; i < args.length; i++){
            greeters[i] = new Greeter(args[i]);
            System.out.println(greeters[i].sayHello());
        }
        System.out.println(advisor.getAdvice());
        for (int i = args.length - 1; i >= 0; i--){
            System.out.println(greeters[i].sayGoodBye());
        }
    }
}
