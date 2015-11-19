public class DreiZahlenSortieren {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]); 
        int t;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("sortieren...");
        
        if (a > b) {
            t = b;
            b = a;
            a = t;
        }
        if (a > c) {
            t = c;
            c = a;
            a = t;
        }
        if (b > c) {
            t = c;
            c = b;
            b = t;
        }
        
        System.out.println("1 = " + a);
        System.out.println("2 = " + b);
        System.out.println("3 = " + c);
    }
}