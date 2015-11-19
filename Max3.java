class Max3 {
    public static void main(String[] args) {
        final int a = Integer.parseInt(args[0]);
        final int b = Integer.parseInt(args[1]);
        final int c = Integer.parseInt(args[2]);
        
        int max = a;
        
        if (b > max)
            max = b;
            
        if (c > max)
            max = c;
        System.out.println(max);
        
    }
}