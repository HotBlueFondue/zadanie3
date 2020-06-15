
public class zadanie2021 {

	void wypiszD³ugoœæ(String s) {
	    System.out.println(s.length());
	  }
	  
	  public static void main(String[] args) {
		  zadanie2021 z = new zadanie2021();
	    z.wypiszD³ugoœæ(null);
	  }
	}
// Exception in thread "main" java.lang.NullPointerException
//at zadanie2021.wypiszD³ugoœæ(zadanie2021.java:5)
//at zadanie2021.main(zadanie2021.java:10)


