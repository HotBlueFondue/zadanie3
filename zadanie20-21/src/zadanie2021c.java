
public class zadanie2021c {
	void wypiszD³ugoœæ(String s) {
	    System.out.println(s.length());
	  }
	  
	  public static void main(String[] args) {
	    try {
	    	zadanie2021c z = new zadanie2021c();
	      z.wypiszD³ugoœæ(null);
	    } catch (NullPointerException w) {
	      w.printStackTrace(System.out);
	      throw w;
	    }
	  }
}

//java.lang.NullPointerException
//at zadanie2021c.wypiszD³ugoœæ(zadanie2021c.java:4)
//at zadanie2021c.main(zadanie2021c.java:10)
//Exception in thread "main" java.lang.NullPointerException
//at zadanie2021c.wypiszD³ugoœæ(zadanie2021c.java:4)
//at zadanie2021c.main(zadanie2021c.java:10)

// pkt 4 odpowiedŸ - tak