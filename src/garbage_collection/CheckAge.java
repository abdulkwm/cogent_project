package garbage_collection;

public class CheckAge {
    public void validateAge(int age) throws InvalidAgeException{
        if (age <= 100 && age > 0){
            System.out.println("Valid age");
        }else {
//            throw new InvalidAgeException()
        }
    }
}
