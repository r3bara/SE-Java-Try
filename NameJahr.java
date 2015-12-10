class NameJahr {
    public static void main(String[] args) {
        final int alter = Integer.parseInt(args[2]); // Alter in Jahren
        final int tage = alter * 365; // Alter in Tagen
        
        System.out.println("Hallo " + args[0] + " " + args[1] + ".");
        System.out.println("Bei einem Alter von " + args[2] + " Jahren,");
        System.out.println("bist du " + (tage) + " Tage alt.");
    }
}