package tutorial_124_interfaces_part_2;

public class Main {

	public static void main(String[] args) {
		ITelephone timsPhone;//I is good way to mark Interface
		timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();

		timsPhone = new MobilePhone(24565);
		timsPhone.powerOn();
		timsPhone.callPhone(24565);
		timsPhone.answer();
	}

}
