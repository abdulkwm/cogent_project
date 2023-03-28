package gl.itp.hyd65.cs65.abdu;

import java.util.Random;

public class Advisor {
    String [] message;
    public Advisor() {
    message = new String[5];
      message[0] = "Stay strong";
      message[1] = "Be safe";
      message[2] = "Think Smart";
      message[3] = "Learn more";
      message[4] = "Be Confident";
    }
    public String getAdvice() {
        Random random = new Random();
        int option = random.nextInt(5)+1;
        String advice ="";
        switch (option){
            case 1:
                advice = message[0];
                break;
            case 2:
                advice = message[1];
                break;
            case 3:
                advice = message[2];
                break;
            case 4:
                advice = message[3];
                break;
            case 5:
                advice = message[4];
                break;
        }
        return advice;
    }
}
