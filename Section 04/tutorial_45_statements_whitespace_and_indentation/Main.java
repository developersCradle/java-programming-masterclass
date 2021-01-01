package tutorial_45_statements_whitespace_and_indentation;


public class Main {

    public static void main(String[] args) {

        int myVariable = 50;//statement

        if (myVariable == 50) {
            System.out.println("Printed");
        }


        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;myVariable--; //we can put many things to same line
        
        System.out.println("This is another one");
    }
}
