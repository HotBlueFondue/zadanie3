
public class zadanie2021f {
	  void wypiszDługość(String s) {
		    System.out.println(s.length());
		  }
		  
		  public static void main(String[] args) throws Exception {
		    try {
		    	zadanie2021f z = new zadanie2021f();
		      z.wypiszDługość(null);
		    } catch (NullPointerException w) {
		       throw new Exception(w);
		    }
		  }
}

//Exception in thread "main" java.lang.Exception: java.lang.NullPointerException
//at zadanie2021f.main(zadanie2021f.java:12)
//Caused by: java.lang.NullPointerException
//at zadanie2021f.wypiszDługość(zadanie2021f.java:4)
//at zadanie2021f.main(zadanie2021f.java:10)
