
public class zadanie2021b {
	void wypiszDługość(String s) {
	    System.out.println(s.length());
	  }
	  
	  public static void main(String[] args) {
	    try {
	    	zadanie2021b z = new zadanie2021b();
	      z.wypiszDługość(null);
	    } catch (NullPointerException w) {
	      w.printStackTrace(System.out);
	    }
	  }
}
//java.lang.NullPointerException
//at zadanie2021b.wypiszDługość(zadanie2021b.java:4)
//at zadanie2021b.main(zadanie2021b.java:10)
