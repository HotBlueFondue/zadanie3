
public class zadanie2021e {
	
		  void wypiszDługość(String s) {
		    System.out.println(s.length());
		  }
		  
		  public static void main(String[] args) throws Exception {
		    try {
		    	zadanie2021e z = new zadanie2021e();
		      z.wypiszDługość(null);
		    } catch (NullPointerException w) {
		      w.printStackTrace(System.out);
		      throw new Exception();
		    }
		  }
		
}

//java.lang.NullPointerException
//Exception in thread "main" java.lang.Exception
//at zadanie2021e.main(zadanie2021e.java:14)
//at zadanie2021e.wypiszDługość(zadanie2021e.java:5)
//at zadanie2021e.main(zadanie2021e.java:11)
