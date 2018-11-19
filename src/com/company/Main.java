package com.company;

import static com.company.Task1.*;
import static com.company.Task2.*;


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

}
