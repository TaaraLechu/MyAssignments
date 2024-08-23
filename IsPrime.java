package HomeAssignments;

public class IsPrime {

	public static void main(String[] args) {
		 int n=7;
	       boolean prime = true;
	       for (int i=2; i<=n-1; i++) {
	    	   if(n % i == 0) {
	    		prime= false;
	    		 break;
	    	   }
	       }
	       if(prime == true) {
	    	   System.out.println(n + " is a Prime Number");
	       }
	       else {
	    	   System.out.println(n + " is Not a Prime Number");
	       }
	   }

	}
