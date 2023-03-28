package Abstraction.Ex1;

abstract class Compartment {
   abstract void notice();
}
class FirstClas extends Compartment {
    @Override
    void notice() {
        System.out.println("first class");
    }
}
class Ladies extends Compartment {
    @Override
    void notice() {
        System.out.println("Ladies");
    }
}
class General extends Compartment {
    @Override
    void notice() {
        System.out.println("General");
    }
}
class Luggage extends Compartment {
    @Override
    void notice() {
        System.out.println("Luggage");
    }
}

