package coding_exercises_3;

/*
 *
* shouldWakeUp (true, 1);  should return true

* shouldWakeUp (false, 2);  should return false since the dog is not barking.

* shouldWakeUp (true, 8);  should return false, since it's not before 8.

* shouldWakeUp (true, -1); should return false since the hourOfDay parameter needs to be in a range 0-23.

 */
public class Main {

    public static void main(String[] args) {
    	
    	System.out.println(BarkingDog.shouldWakeUp(true, 1));
    	System.out.println(BarkingDog.shouldWakeUp(false, 2));
    	System.out.println(BarkingDog.shouldWakeUp(true, 8));
    	System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }

}
