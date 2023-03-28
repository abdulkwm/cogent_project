package polymorphism;

public class Main {
    public static void main(String[] args) {
        Parent par = new Parent();
        par.getName();
        System.out.println(par.getName());
        par.behaviour();
        Children chil = new Children();
        chil.behaviour();
        Colleagues coll = new Colleagues();
        coll.behaviour();
    }
}
