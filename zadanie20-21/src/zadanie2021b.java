
public class zadanie2021b {
	void wypiszD�ugo��(String s) {
	    System.out.println(s.length());
	  }
	  
	  public static void main(String[] args) {
	    try {
	    	zadanie2021b z = new zadanie2021b();
	      z.wypiszD�ugo��(null);
	    } catch (NullPointerException w) {
	      w.printStackTrace(System.out);
	    }
	  }
}
//java.lang.NullPointerException
//at zadanie2021b.wypiszD�ugo��(zadanie2021b.java:4)
//at zadanie2021b.main(zadanie2021b.java:10)
