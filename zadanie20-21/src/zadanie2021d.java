
public class zadanie2021d {
	void wypiszD�ugo��(String s) {
	    System.out.println(s.length());
	  }
	  
	  public static void main(String[] args) {
	    try {
	    	zadanie2021d z = new zadanie2021d();
	      z.wypiszD�ugo��(null);
	    } catch (NullPointerException w) {
	      w.printStackTrace(System.out);
	      w.fillInStackTrace();
	      throw w;
	    }
	  }
}
//java.lang.NullPointerException
//Exception in thread "main" java.lang.NullPointerException
//	at zadanie2021d.main(zadanie2021d.java:13)
//	at zadanie2021d.wypiszD�ugo��(zadanie2021d.java:4)
//	at zadanie2021d.main(zadanie2021d.java:10)
