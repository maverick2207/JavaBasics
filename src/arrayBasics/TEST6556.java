package arrayBasics;


class a {


    static int v;
    static{
        System.out.println("s block");
        v = 30;
    }

    static void smethod(){
        System.out.println( "smethod");
        System.out.println(v);

    }
}

enum Directions{e,w,s,n}
public class TEST6556 {

//    static {
//        System.out.println("p1");
//
//    }
//
    public static void main(String[] args) {
//        a.v=50;
//        a.smethod();

        int [] x = new int[3];
        x[1] = 50;

        Object obj = x;
        int y [] = (int []) obj;
        y[1]=100;
        System.out.println(x[1]);
        ((int[])obj)[1]= 500;
        System.out.println(x[1]);

//        Directions dir = r;
//        System.out.println(Directions.e);

        try {

            Integer I = new Integer("ABC");
            System.out.println("b");
        }
        catch (Exception e){
            System.out.println("a");
        }

    }



}
