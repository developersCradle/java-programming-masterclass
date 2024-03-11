# Section 24: Debugging and Unit Testing

Debugging and Unit Testing

# What I Learned

### Introduction to Debugging 

- If we wan't to see what inside **.Class** or **Method()** we **need** **source code** for class or method.
    - **No problem** when debugging our own written class
    - **Problem** when we need access **3rd party source code** from example library. Debugging comes lot harder
        - These cases best way to debug, is to watch whats being **inputted** into to the method and whats being **outputted** from method



### More on Debugging

- To use debugger with a class, **compiled class files** needs to include **debug information** -> 3rd party class files usually don't include debugging information
    - Some libraries offer **two** version of their product. One **with** debugging information and other **whiteout** debugging information

- When using debugger application will run slower, since extra processing take place in the bugger
    - This can affect when debugging applications with network activities.  
        - Debugging **thread application** will be challenging. Timing and application is not the same when running in debug mode
        - Timeouts/Disconnects can happen etc.

- We set breakpoints to stop program flow

<img src="debuggingStatck.JPG" alt="alt text" width="450"/>

- We can see at this breakpoint what have been called.
1. Java runtime calls **main()**
2. Our **main()** calls our **addChar()**

<img src="bugHere.JPG" alt="alt text" width="400"/>

1. Bug here: there is two instances of `sBuilder`

<img src="intelliJShorcut.JPG" alt="alt text" width="500"/>

1. Here in **IntelliJ** you can see jump to current line which is being debugged.

- **Force into** can step into JDK methods. Ide assumes that we aren't interested in debugging external libraries. 

<img src="jumpToFramIntelliJ.JPG" alt="alt text" width="500"/>

1. **Rewind Frame** will travel previous frame. In this example it would jump to the **main** method.
2. This frame would reminded

- **Remember** Everything won't be rewinded
    - Static/instances variables
    - Network traffic
    - Db Changes

- This is not so popular tool!

### Field Watch Points

- Watcher are watching values when debugging. **Don't** confuse them with **Field watch points**
- Field **watch point** when variable was changed!(in intelliJ)
    - When field updates program will suspend.
    - We can config watch point for braking options
        - We could use this if we are debugging complex class, to watch where it would change.
- **Most popular** debugging tools are **breakpoint** and **watch points**. 

### Advanced Debugging

- Smart stepping into is also feature of **IntelliJ**. We can debug
    - `String result = utils.upperAndPrerix(utils.addSuffic(str));` Example here if we wan't to jump into to the last method call, we can call **Smart Stepping**.

- Here we are experimenting about, 3rd party providing sources, so we can debug this. [JTransforms](https://github.com/wendykierp/JTransforms/tree/master?tab=readme-ov-file)
    
<img src="addingExternalLibraryesWithSource.JPG" alt="alt text" width="600"/>

1. Adding external Jar in Eclipse
2. Adding Source into this Additional Jar

- Even thought JTransforms **does not** have **debug information** included, but this how it should be added to project!.

- Usually IDE debugger can show method names, since it can figure out method names by on its own.


###  Introduction to Unit Testing with JUnit

- One type of testing Unit testing
    - When working with Java, Unit in this context refers to **method**.

- End of application development cycle test suite is usually ran. If it will ran 100% everything is fine, if not some changes have broke the code! 

<img src="bankAccountTest.JPG" alt="alt text" width="400"/>

1. Test usually have *test postfix for indication what is being testing

<img src="unitTestingThisIsBanned.JPG" alt="alt text" width="500"/>

1. This is banned, there is **no logic to be tested** and still its green

- There test failures, when unit test fails


- We are making assertions that test are passed
    - We need to be careful, we are only covering logic which we are testing against

- Testing some example

```
	@Test
	public void dummyTest() {
	assertEquals(20, 21);
	}

```

- We are testing double with **delta** parameter 3rd parameter
    - It can give some leeway for testing doubles
```
	@Test
	public void deposit() {
		BankAccount account = new BankAccount("Tim", "Buchlka", 1000.0);
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance, 0);
	}
```

- Best practice is to make one test per test case


```
    @Test
	    public void isChecking_true() {
	        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
	        assertTrue("The account is NOT a checking account", account.isChecking());

	    }
```

- When testing something being true, its advised to use **assertTrue** or **assertFalse**

### More Asserts and Exception Handling

<img src="assert.JPG" alt="alt text" width="600"/>

<img src="assert2.JPG" alt="alt text" width="600"/>

<img src="assert3.JPG" alt="alt text" width="600"/>

- `@Before` is ran before our tests

- Testing throwing exceptions, newer one!

```
   @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        double balance = account.withdraw(600.00, false);
        assertEquals(400.00, balance, 0);
    }
```

### Parameterized Testing

- In the old days, this was the how you would test throwing exceptions
```
    @Test// (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
    	try {
    		account.withdraw(600.00, false);
    		fail("Should have thrown an IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		}
    	
    }
```

- Newer JUnit 4 version

```
  @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
    		account.withdraw(600.00, false);
    		fail("Should have thrown an IllegalArgumentException");
    	
    }
```

- We can write many different class tests, but in the other we can write one **parameterized test**


- If we are writing parameterized class file we need 

```

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

```

- Making Parametrized test. Testing 1 method 


```
package tutorial_415_parameterized_testing;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;



@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });
    }

    @Test
    public void deposit() throws Exception {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }

}

```

###  JUnit Challenge #1 and #2
 
<img src="Challange1.JPG" alt="alt text" width="600"/>


## My solution for Challenge 01

- Test every method in **Utilities** class

```
package challange_416_junit_challenge_1_and_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilitiesTest {

	@Test
	public void testEveryNthChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemovePairs() {
		fail("Not yet implemented");
	}

	@Test
	public void testConverter() {
		fail("Not yet implemented");
	}

	@Test
	public void testNullIfOddLength() {
		fail("Not yet implemented");
	}

}

```
<img src="Challange2.JPG" alt="alt text" width="600"/>

<img src="Challange22.JPG" alt="alt text" width="600"/>

- One bug masking other bug is common in development process!
    - Get use to it

## My solution for Challenge 02

```
	@Test
	public void testRemovePairs() {
		
		//Given - Start
		Utilities util = new Utilities();		
		//Given - End
		
		//When - Start
		String result = util.removePairs("ABCBDEEF");
		//When - End
		
		//Then - Start
		assertEquals("ABCBDEF", result); //Pairs next to each other should be removed
		//Then - End
	}
	
public void testRemovePairsWithNotNextToEachOther() {
		
		//Given - Start
		Utilities util = new Utilities();		
		//Given - End
		
		//When - Start
		String result = util.removePairs("ABBCDEEF");
		//When - End
		
		//Then - Start
		assertEquals("ABCDEF", result); //Pairs next to each other should be removed
		//Then - End
		
	}
```

<img src="Challange3.JPG" alt="alt text" width="600"/>

- When adding tests, you end up adding more functionality! 

# JUnit Challenges #3 to #7

## My solution for Challenge 03

```
@Test
	public void testRemovePairsWithNull() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs(null);
		// When - End

		// Then - Start
		assertNull("Did not get null returned when argument passed was null", result); // Pairs next to each other should be removed
		// Then - End

	}

	
	
	@Test
	public void testRemovePairsWithLessThan2() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs("A");
		// When - End

		// Then - Start
		assertEquals("A", result); // Pairs next to each other should be removed
		// Then - End

	}

	
	@Test
	public void testRemovePairsWithEmptyString() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs("");
		// When - End

		// Then - Start
		assertEquals("", result); // Pairs next to each other should be removed
		// Then - End

	}

```

<img src="Challange4.JPG" alt="alt text" width="600"/>

## My solution for Challenge 04

<!-- todo do always captions -->