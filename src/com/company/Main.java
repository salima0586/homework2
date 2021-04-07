package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Mersedes").print();
        createObject("BMB").print();
        createObject("TOYOTA").print();

    }

    public static Printable createObject(String classname) {
        Printable printable = null;
        switch (classname) {
            case "Mersedes":
                printable = new Mersedes("Mersedes X5", "black");
                System.out.println("-------------------------");
                break;

            case "BMB":
                printable = new BMB("R35", "5,5");
                System.out.println("-----------");
                break;



            case "TOYOTA":
                printable = new TOYOTA("BIG", 4 );
                System.out.println("---------------------");
                break;
        }
        return printable;
    }
}


