package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation {
@Before
public void preCondition() 
{
	System.out.print("test");
}

@After
public void postCondition() 
{
	System.out.print("test");
}
}
