package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
//	@Before("@sanity or @functional")
//	public void preCondition()
//	{
//		System.out.println("Hook for @sanity");
//	}
//	
//	@After("@regression")
//	public void postCondition()
//	{
//		System.out.println("Hook for @regression");
//	}
	
	
	
	
	@Before(order = -10000)
	public void beforeHook1()
	{
		System.out.println("Before hook1");
	}
	

	@Before(order = 2)
	public void beforeHook2()
	{
		System.out.println("Before hook2");
	}
	
	
	@After(order = -10000)
	public void afterHook1()
	{
		System.out.println("After hook1");
	}
	
	
	@After(order = 0)
	public void afterHook2()
	{
		System.out.println("After hook2");
	}
	
}
