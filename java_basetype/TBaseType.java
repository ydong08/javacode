

public class TBaseType {

    static class Variable {
        static int allClicks = 9;
        String str = "castles";
        public void print(){
            int i = 7;
        }
    }

    static class Age {
        public void getAge() {
            int age = 0;
            age += 7;
            System.out.println("dog`s age: " + age);
        }
    }

    public static void main(String[] args) {
        //boolean
       // System.out.println("base type, boolean binary: " + Boolean.SIZE);
        System.out.println("class java.lang.Boolean");
        System.out.println("min value: " + Boolean.FALSE);
        System.out.println("max value: " + Boolean.TRUE);
        System.out.println();

        //byte
        System.out.println("base type, byte binary: " + Byte.SIZE);
        System.out.println("class java.lang.Byte");
        System.out.println("min value: " + Byte.MIN_VALUE);
        System.out.println("max value: " + Byte.MAX_VALUE);        
        System.out.println();

        //char
        System.out.println("base type, char binary: " + Character.SIZE);
        System.out.println("class java.lang.Character");
        System.out.println("min value: " + (int)Character.MIN_VALUE);
        System.out.println("max value: " + (int)Character.MAX_VALUE);
        System.out.println();
        
        //short
        System.out.println("base type, short binary: " + Short.SIZE);
        System.out.println("class java.lang.Short");
        System.out.println("min value: " + Short.MIN_VALUE);
        System.out.println("max value: " + Short.MAX_VALUE);
        System.out.println();

        //int
        System.out.println("base type, int binary: " + Integer.SIZE);        
        System.out.println("class java.lang.Integer");        
        System.out.println("min value: " + Integer.MIN_VALUE);        
        System.out.println("max value: " + Integer.MAX_VALUE);        
        System.out.println();
        
        //float
        System.out.println("base type, float binary: " + Float.SIZE);
        System.out.println("class java.lang.Float");
        System.out.println("min value: " + Float.MIN_VALUE);
        System.out.println("max value: " + Float.MAX_VALUE);
        System.out.println();
        
        //long
        System.out.println("base type, long binary: " + Long.SIZE);
        System.out.println("class java.lang.Long");
        System.out.println("min value: " + Long.MIN_VALUE);
        System.out.println("max value: " + Long.MAX_VALUE);
        System.out.println();
        
        //double
        System.out.println("base type, double binary: " + Double.SIZE);
        System.out.println("class java.lang.Double");
        System.out.println("min value: " + Double.MIN_VALUE);
        System.out.println("max value: " + Double.MAX_VALUE);
        System.out.println();

        // constant
        final double PI = 3.1415926;
        System.out.println(PI);

        //dec  oct hex
        int decimal = 100;
        int octal = 0144;
        int hexa = 0x64;
        System.out.println(decimal + " " + octal + " " + hexa );

        //auto transfer
        char ch = 'A';
        int i = ch;
        System.out.println("after transfer: " + i);
        int i2 = ch + 3;
        System.out.println("after transfer: " + i2);

        //force transfer
        int i3 = 1234;
        byte b3 = (byte)i3;
        System.out.println(i3 + " " + b3);

        //variable type
        int a, b, c;
        int e = 0, f = 1, g = 2;
        byte z = 22;
        String s = "castles";
        double pi = 3.1415926;
        char x = 'x';

        Age age = new Age();
        age.getAge();
    }
}

