package polymorphism.Excersise2;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int type = random.nextInt(3) + 1;
            switch (type) {
                case 1:
                    medicines[i] = new Tablet("Tablet " + i, "Company " + i);
                    break;
                case 2:
                    medicines[i] = new Syrup("Syrup " + i, "Company " + i);
                    break;
                case 3:
                    medicines[i] = new Ointment("Ointment " + i, "Company " + i);
                    break;
            }
        }
        for (int i = 0; i < medicines.length; i++) {
            medicines[i].displayLabel();

        }
    }
}
