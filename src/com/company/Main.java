package com.company;

public class Main {

    public static void main(String[] args) {

        tablePrint();
        System.out.println();
        System.out.println("Transformation Byte type to different types, 78 value:");
        System.out.printf("The value of short is %d\n", transformationByteToShort((byte) 78));
        System.out.printf("The value of char is %s\n", transformationByteToChar((byte) 78));
        System.out.printf("The value of integer is %d\n", transformationByteToInt((byte) 78));
        System.out.printf("The value of long is %d\n", transformationByteToLong((byte) 78));
        System.out.printf("The value of float is %f\n", transformationByteToFloat((byte) 78));
        System.out.printf("The value of double is %f\n", transformationByteToDouble((byte) 78));

        System.out.println();
        System.out.println("Transformation Short type to different types, 70 value:");
        System.out.printf("The value of byte is %d\n", transformationShortToByte((short) 70));
        System.out.printf("The value of char is %s\n", transformationShortToChar((short) 70));
        System.out.printf("The value of integer is %d\n", transformationShortToInt((short) 70));
        System.out.printf("The value of long is %d\n", transformationShortToLong((short) 70));
        System.out.printf("The value of float is %f\n", transformationShortToFloat((short) 70));
        System.out.printf("The value of double is %f\n", transformationShortToDouble((short) 70));

        System.out.println();
        System.out.println("Transformation Char type to different types, 'a' value:");
        System.out.printf("The value of byte is %d\n", transformationCharToByte('a'));
        System.out.printf("The value of short is %d\n", transformationCharToShort('a'));
        System.out.printf("The value of integer is %d\n", transformationCharToInt('a'));
        System.out.printf("The value of long is %d\n", transformationCharToLong('a'));
        System.out.printf("The value of float is %f\n", transformationCharToFloat('a'));
        System.out.printf("The value of double is %f\n", transformationCharToDouble('a'));

        System.out.println();
        System.out.println("Transformation Integer type to different types, 80 value:");
        System.out.printf("The value of byte is %d\n", transformationIntToByte(80));
        System.out.printf("The value of short is %d\n", transformationIntToShort(80));
        System.out.printf("The value of char is %s\n", transformationIntToChar(80));
        System.out.printf("The value of long is %d\n", transformationIntToLong(80));
        System.out.printf("The value of float is %f\n", transformationIntToFloat(80));
        System.out.printf("The value of double is %f\n", transformationIntToDouble(80));

        System.out.println();
        System.out.println("Transformation Long type to different types, 85 value:");
        System.out.printf("The value of byte is %d\n", transformationLongToByte((long) 85));
        System.out.printf("The value of short is %d\n", transformationLongToShort((long) 85));
        System.out.printf("The value of char is %s\n", transformationLongToChar((long) 85));
        System.out.printf("The value of integer is %d\n", transformationLongToInt((long) 85));
        System.out.printf("The value of float is %f\n", transformationLongToFloat((long) 85));
        System.out.printf("The value of double is %f\n", transformationLongToDouble((long) 85));

        System.out.println();
        System.out.println("Transformation Float type to different types, 90.8 value:");
        System.out.printf("The value of byte is %d\n", transformationFloatToByte( 90.8f));
        System.out.printf("The value of short is %d\n", transformationFloatToShort(90.8f));
        System.out.printf("The value of char is %s\n", transformationFloatToChar(90.8f));
        System.out.printf("The value of integer is %d\n", transformationFloatToInt(90.8f));
        System.out.printf("The value of long is %d\n", transformationFloatToLong(90.8f));
        System.out.printf("The value of double is %f\n", transformationFloatToDouble(90.8f));

        System.out.println();
        System.out.println("Transformation Double type to different types, 75.5 value:");
        System.out.printf("The value of byte is %d\n", transformationDoubleToByte( 75.5));
        System.out.printf("The value of short is %d\n", transformationDoubleToShort(75.5));
        System.out.printf("The value of char is %s\n", transformationDoubleToChar(75.5));
        System.out.printf("The value of integer is %d\n", transformationDoubleToInt(75.5));
        System.out.printf("The value of long is %d\n", transformationDoubleToLong(75.5));
        System.out.printf("The value of float is %f\n", transformationDoubleToFloat(75.5));




    }

    private static void tablePrint() {

        System.out.println("\nType transformation table\n");
        System.out.println("       |   byte   |   short   |   char   |   int   |   long   |   float   |   double   |   boolean");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("byte   |    т     |     я     |     я    |    я    |    я     |     я     |     я      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("short  |    ня    |     т     |     я    |    я    |    я     |     я     |     я      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("char   |    я     |     я     |     т    |    я    |    я     |     я     |     я      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("int    |    ня    |     ня    |     ня   |    т    |    я     |     я     |     я      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("long   |    ня    |     ня    |     ня   |    ня   |    т     |     я     |     я      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("float  |    ня    |     ня    |     ня   |    ня   |    ня    |     т     |     я      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("double |    ня    |     ня    |     ня   |    ня   |    ня    |     ня    |     т      |     х     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
        System.out.println("boolean|    х     |     х     |     х    |    х    |    х     |     х     |     х      |     т     ");
        System.out.println("_______|__________|___________|__________|_________|__________|___________|____________|___________");
    }


    // -------------------------------------- START: Transformation from byte ----------------------------------------------
    private static short transformationByteToShort(byte x) {
        short rez = x;
        return rez;
    }

    private static char transformationByteToChar(byte x) {
        char rez = (char) x;
        return rez;
    }

    private static int transformationByteToInt(byte x) {
        int rez =  x;
        return rez;
    }

    private static long transformationByteToLong(byte x) {
        long rez =  x;
        return rez;
    }

    private static float transformationByteToFloat(byte x) {
        float rez =  x;
        return rez;
    }

    private static double transformationByteToDouble(byte x) {
        double rez =  x;
        return rez;
    }
// --------------------------------------- END: Transformation from byte -----------------------------------------------

// ------------------------------------- START: Transformation from short ----------------------------------------------
    private static byte transformationShortToByte(short x) {
        byte rez = (byte) x;
        return rez;
    }

    private static char transformationShortToChar(short x) {
        char rez = (char) x;
        return rez;
    }

    private static int transformationShortToInt(short x) {
        int rez = x;
        return rez;
    }

    private static long transformationShortToLong(short x) {
        long rez = x;
        return rez;
    }

    private static float transformationShortToFloat(short x) {
        float rez = x;
        return rez;
    }

    private static double transformationShortToDouble(short x) {
        double rez = x;
        return rez;
    }
// -------------------------------------- END: Transformation from short -----------------------------------------------

// -------------------------------------- START: Transformation from char ----------------------------------------------
    private static byte transformationCharToByte(char x) {
        byte rez = (byte) x;
        return rez;
    }

    private static short transformationCharToShort(char x) {
        short rez = (short) x;
        return rez;
    }

    private static int transformationCharToInt(char x) {
        int rez = x;
        return rez;
    }

    private static long transformationCharToLong(char x) {
        long rez = x;
        return rez;
    }

    private static float transformationCharToFloat(char x) {
        float rez = x;
        return rez;
    }

    private static double transformationCharToDouble(char x) {
        double rez = x;
        return rez;
    }
// --------------------------------------- END: Transformation from char -----------------------------------------------

// --------------------------------------- START: Transformation from int ----------------------------------------------
    private static byte transformationIntToByte(int x) {
        byte rez = (byte) x;
        return rez;
    }

    private static short transformationIntToShort(int x) {
        short rez = (short) x;
        return rez;
    }

    private static char transformationIntToChar(int x) {
        char rez = (char) x;
        return rez;
    }

    private static long transformationIntToLong(int x) {
        long rez = x;
        return rez;
    }

    private static float transformationIntToFloat(int x) {
        float rez = x;
        return rez;
    }

    private static double transformationIntToDouble(int x) {
        double rez = x;
        return rez;
    }
// ---------------------------------------- END: Transformation from int -----------------------------------------------

// -------------------------------------- START: Transformation from long ----------------------------------------------
    private static byte transformationLongToByte(long x) {
        byte rez = (byte) x;
        return rez;
    }

    private static short transformationLongToShort(long x) {
        short rez = (short) x;
        return rez;
    }

    private static char transformationLongToChar(long x) {
        char rez = (char) x;
        return rez;
    }

    private static int transformationLongToInt(long x) {
        int rez = (int) x;
        return rez;
    }

    private static float transformationLongToFloat(long x) {
        float rez = x;
        return rez;
    }

    private static double transformationLongToDouble(long x) {
        double rez = x;
        return rez;
    }
// --------------------------------------- END: Transformation from long -----------------------------------------------

// -------------------------------------- START: Transformation from float ---------------------------------------------
    private static byte transformationFloatToByte(float x) {
        byte rez = (byte) x;
        return rez;
    }

    private static short transformationFloatToShort(float x) {
        short rez = (short) x;
        return rez;
    }

    private static char transformationFloatToChar(float x) {
        char rez = (char) x;
        return rez;
    }

    private static int transformationFloatToInt(float x) {
        int rez = (int) x;
        return rez;
    }

    private static long transformationFloatToLong(float x) {
        long rez = (long) x;
        return rez;
    }

    private static double transformationFloatToDouble(float x) {
        double rez = x;
        return rez;
    }
// --------------------------------------- END: Transformation from float ----------------------------------------------

// ------------------------------------- START: Transformation from double ---------------------------------------------
    private static byte transformationDoubleToByte(double x) {
        byte rez = (byte) x;
        return rez;
    }

    private static short transformationDoubleToShort(double x) {
        short rez = (short) x;
        return rez;
    }

    private static char transformationDoubleToChar(double x) {
        char rez = (char) x;
        return rez;
    }

    private static int transformationDoubleToInt(double x) {
        int rez = (int) x;
        return rez;
    }

    private static long transformationDoubleToLong(double x) {
        long rez = (long) x;
        return rez;
    }

    private static float transformationDoubleToFloat(double x) {
        float rez = (float) x;
        return rez;
    }
// -------------------------------------- END: Transformation from double ----------------------------------------------


}
