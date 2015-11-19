class Xelse {
    public static void main(String[] args) {
        final double x = Double.parseDouble(args[0]);
        double a;
            
        if (x >= 0)
            a = x;
        else
            a = -x;
        System.out.println(a);
    }
}