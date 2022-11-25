package tests;

public class DataTypes {
    public static void main(String[] args) {
        double myDouble = 0.502;
        int myInt = 2;
        byte myByte = 127;
        float myFloat = 125.456f;
        short myShort = -32768;
        double multiplication = myDouble * myInt;
        float multiplication2 = myFloat * myInt;
        //     Переполнение

        System.out.println(myByte + 100);
        System.out.println(myShort - 1);

        //     Вычисления с разными типами данных

        if (multiplication >= multiplication2) {
            System.out.println("multiplication больше");
        } else if (multiplication2 >= multiplication) {
            System.out.println("multiplication2 больше");

        }
    }
}

