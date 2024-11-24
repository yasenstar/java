public class amc_test1 {
    public static void main(String[] args) {
        int f,l,y,b,u,g,max;
        max = 1;
        for (f=1;f<=9;f++) {
            for (l=1;l<=9;l++) {
                for (y=1;y<=9;y++) {
                    for (b=1;b<=9;b++) {
                        for (u=1;u<=9;u++) {
                            for (g=1;g<=9;g++) {
                                if (8 * (f*100000+l*10000+y*1000+f*100+l*10+y) == (b*100100+u*10010+g*1001)) {
                                    if (max < (f*100+l*10+y)) { max = f*100+l*10+y; }
                                    System.out.println(max);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
