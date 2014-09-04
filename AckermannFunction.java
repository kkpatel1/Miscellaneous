public class AckermannFunction {
    static int function(int m,int n) {
            if(m==0) return n+1;
  	        if(m>0 && n==0) return function(m-1,1);
        	if(m>0 && n>0) return function(m-1,function(m,n-1));
            return 0;
	}
    public static void main(String[] args) {
        System.out.println(function(3,6));
    }
}