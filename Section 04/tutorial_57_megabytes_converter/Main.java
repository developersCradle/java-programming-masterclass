package tutorial_57_megabytes_converter;

/*
 * * printMegaBytesAndKiloBytes(2500);  should print the following text: "2500 KB = 2 MB and 452 KB"

* printMegaBytesAndKiloBytes(-1024);  should print the following text: "Invalid Value" because parameter is less than 0.

* printMegaBytesAndKiloBytes(5000);  should print the following text: "5000 KB = 4 MB and 904 KB"

 */
public class Main {

    public static void main(String[] args) {
    	MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
    	MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
    	MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }

}
