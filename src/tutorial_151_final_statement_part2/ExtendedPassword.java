package tutorial_151_final_statement_part2;


public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
