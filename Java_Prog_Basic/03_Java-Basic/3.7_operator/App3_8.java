public class App3_8 {
    // Operator Demo
    /* 
     * this is a multiline comment
     * dfdafsaf
     * fdfee
     */
    /**
     * this is a doc comment
     * @param https://www.bing.com
     * @author  Yasen Zhao
     * @author  Friends
     * @version %I%, %G%
     * @since   1.0
     * @return  <code>true</code>
     */
    public static void main(String[] args) {
        int a=25, b=7;
        boolean x = (a < b) ;
        System.out.println("a = " + a + ", b = " + b + ", a<b = " + x);
        
        int e= 3;
        boolean y = (a/e>5);
        System.out.println("x^y=" + (x^y));
        if (b<0 & e!=0)
            System.out.println("b/0=" + b/0);
        else
            System.out.println("a%e = " + (a%e));
        
        int f=0;
        if (f!=0 && a/f>5)
            System.out.println("a/f= " + a/f);
        else
            System.out.println("f= " + f);
        
        int max;
        max = a>f ? a : f;
    }
}