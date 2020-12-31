package tutorial_122_interfaces;

public interface ITelephone {
	public void powerOn();

	public void dial(int phoneNumber);

	public void answer();

	public boolean callPhone(int phoneNumber);

	//Public tai private on hyödytön, sillä jos mietit, niin joudut interfacen halutussa luokassa määrittelemään acces modifierin uusiksi
	public boolean isRinging();
}
