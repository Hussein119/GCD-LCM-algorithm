 public class Algorithm {
	 
	 
		  	 public static int gcd(int a, int b) {
				if(b==0)
					return a;
				return gcd(b, a%b);
			} // end gcd method 
			 public static int LCM(int a, int b,int gcd) {
					return (a*b/gcd);
			} // end lcm method 
			 
	

} // end class 
