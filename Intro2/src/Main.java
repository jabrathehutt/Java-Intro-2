import java.util.Arrays;

public class Main {


    static void hallo(){
        System.out.println("Hallo");
    }

    static String begrüßung(String name){
        return "Hallo mein Name ist " + name;
    }

    static int anzahlTageDesMonats(int monat){
        int tage=-1;
        // switch Statements sind eine Alternative zu langen if else Ketten
        switch(monat){
            case 1,3,5,7,8,10,12:
                tage = 31;
                break;
            case 2:
                tage = 28;
                break;
            case 4,6,9,11:
                tage = 30;
                break;

            default:
                tage = -1;



        }
        return tage;
    }


    public static void main(String[] args) {
        int x=0;
/*
        // while Schleife (erst wird die Bedingung überprüft und wenn die Bedingung sich zu true auswertet
        // wird der Schleifenkörper betreten)
        while (x<10){
            System.out.println(x);
            x++;

        }


        // Aufgabe 1: Schreibe ein Programm das eine Zahl mit sich selbst multipliziert ohne Multiplikation zu benutzen


        int counter = 0;
        int square=0;
        int z=-10;

        if(z<0){
            z*=-1;
        }
        while(counter<z){
            square+=z;
            counter++;
        }
        System.out.println(square);




        x=0;
        while(x < 10){
            if(x % 2 == 0){
                System.out.println(x+" ist gerade");
            }

            else{
                System.out.println(x + " ist ungerade");
            }
x++;
        }*/

    /*  x=2;
        // Eine do While Schleife betritt zuerst den Schleifenkörper und überprüft danach ob die Bedingung zutrifft
        do {
            System.out.println(x);
            x++;
        } while(x > 0 && x < 10);*/

        //for Schleife
    /*
       for (int i = 10;i > 0;i--){
            System.out.println(i);
        }*/

        //Arrays

        // Arraydeklaration (Arrays dürfen nur einen Datentypen beinhalten. Die Länge eines Arrays wird bei der Deklaration
        // festgelegt und kann nicht mehr geändert werden)
        int[] numArray=new int[10];

        // Arrayinitialisierung

        for (int i = 0;i < 10;i++){
            numArray[i]=i;
        }

 /*       // Arrays sind komplexe Datenstrukturen und können daher nicht ihne weiteres geprintet werden
        System.out.println(numArray);

        // Benutze die toString Funktion/Methode um Arrays auszugeben
        System.out.println(Arrays.toString(numArray));
*/
       // Ändere den Wert eines Elementes in einem Array
        numArray[9]=1000;

        String arraytoString = "[";

        for(int i = 0;i< numArray.length;i++){
            if(i== (numArray.length-1)){
                arraytoString += numArray[i]+"]";
            }
            else {
                arraytoString += numArray[i] + ", ";
            }

        }
       System.out.println(arraytoString);

        //Aufgabe 2: Schreibe ein Programm, dass das Array numArray in einen String konvertiert.
        // Tipp: Benutze String Konkatenation


        // Start des Programms
        String arr="";


        // Ende des Programms

        // Funktionen


        // Funktionsaufruf
        hallo();
        begrüßung("Viktor");


        // Aufgabe 3: Implementiere das Programm aus Aufgabe 1 in einer Funktion "square"

        String vorname="Viktor";
        // Es gibt speziell für Strings zur Verfügung gestellte Funktionen
        System.out.println(vorname.length());
        System.out.println(vorname.charAt(0));
        System.out.println(vorname.compareTo("viktor"));
        System.out.println(vorname.toLowerCase().compareTo("viktor"));

        // Funktionen mit Rückgabewert können in Variablen mit passenden Datentypen gespeichert werden
        int tageDesMonats = anzahlTageDesMonats(8);
        System.out.println(tageDesMonats);




    }
}