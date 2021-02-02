package tutorial_152_final_part2_static_initializer;

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
