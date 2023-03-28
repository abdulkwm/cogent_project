package Abstraction.Ex1;

import java.util.Random;

public class CompartmentDemo {
    public static void main(String[] args) {
        Compartment [] com = new Compartment[10];
        Random ran = new Random();
        for (int i = 0; i < com.length; i++){
            int x = ran.nextInt(4) + 1;
            if (x==1){
                com[i] = new FirstClas();
            } else if (x==2) {
                com[i] = new Ladies();
            } else if (x==3) {
                com[i] = new General();
            } else if (x==4) {
                com[i] = new Luggage();
            }
            com[i].notice();
        }
    }
}
