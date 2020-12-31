package tutorial_151_final_statement_part2;


public class SIBTest {
    public static final String owner;

    static { //static initialing block, executed when loaded to project
        owner = "tim";//static final needs to be initialized before all static initializing block are terminated
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
