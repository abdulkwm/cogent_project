package garbage_collection;

public class WrapperDemo {
    public static void main(String[] args) {
//       write program in java to convert all primitive types to object and vice-versa?
//        primitive to object
//        Boxing
        int a = 100;
        Integer oO = Integer.valueOf(a);
        byte b = 20;
        Byte bO = Byte.valueOf(b);
        long l = 300L;
        Long lO = Long.valueOf(l);
        float f = 400f;
        Float fO = Float.valueOf(f);
        short s = 34;
        Short sO = Short.valueOf(s);
        double d = 345;
        Double dO = Double.valueOf(d);
        char c = 'd';
        Character cO = Character.valueOf(c);
        boolean bo = true;
        Boolean boO = Boolean.valueOf(bo);


//        converting to primitive data type
//        Un-Boxing
        int pI = oO.intValue();
        byte pB = bO.byteValue();
        long pL = lO.longValue();
        float pF = fO.floatValue();
        short pS = sO.shortValue();
        double pD = dO.doubleValue();
        char pC = cO.charValue();
        boolean pBo = boO.booleanValue();

    }
}
