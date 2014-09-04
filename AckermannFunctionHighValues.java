// public class AckermannFunctionHighValues {
//     static int function(int m,int n) {
//         while(m!=0) {    
//             if(m>0 && n==0) {
//                 m=m-1;
//                 n=1;
//             }
//         	else if(m>0 && n>0) {
//                 m=m-1;
//                 n=function(m+1,n-1);
//             }
//         }
//         return n+1;
// 	}
//     public static void main(String[] args) {
//         try {
//             System.out.println(function(4,5)%1000);
//         }
//         catch(Error e) {
//             System.out.println(e);
//         }
//     }
// }

public class AckermannFunctionHighValues {
    static int function(int m,int n) {
            if(m==0) return n+1;
            if(m>0 && n==0) return function(m-1,1)%1000;
            if(m>0 && n>0) return function(m-1,function(m,n-1))%1000;
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(function(4,5)%1000);
    }
}