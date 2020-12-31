package tutorial_123_interfaces_part_2;

public interface ITelephone {
	public void powerOn();

	public void dial(int phoneNumber);

	public void answer();

	public boolean callPhone(int phoneNumber);

	//Public tai private on hy�dyt�n, sill� jos mietit, niin joudut interfacen halutussa luokassa m��rittelem��n acces modifierin uusiksi
	public boolean isRinging();
}
