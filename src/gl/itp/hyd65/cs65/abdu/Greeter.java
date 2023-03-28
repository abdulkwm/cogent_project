package gl.itp.hyd65.cs65.abdu;
public class Greeter {
    String name;

    public Greeter(String aName) {
        this.name = aName;
    }
    public String sayHello() {
        return("Hello, " + this.name);
    }
    public String sayGoodBye(){
        return ("Good bye, " + this.name);
    }
}
