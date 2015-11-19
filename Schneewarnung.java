class Schneewarnung {
    public static void main(String[] args) {
        final int temperature = Integer.parseInt(args[0]);
            
        if (temperature < 0)
            System.out.println("snow");
        if (temperature > 0)
            System.out.println("no snow");
    }
}