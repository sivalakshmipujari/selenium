package Testng;

	import org.testng.IHookCallBack;
	import org.testng.IHookable;
	import org.testng.ITestResult;
	import org.testng.annotations.Test;
	public class hookable1 {

	  public void run(IHookCallBack callBack, ITestResult testResult) {
	    System.err.println("run() before-invocation before running " + testResult.getMethod().getMethodName() + "()");
	    callBack.runTestMethod(testResult);
	    System.err.println("run() after-invocation before running " + testResult.getMethod().getMethodName() + "()");
	  }

	  @Test
	  public void a() {}

	  @Test
	  public void b() {}
	}


