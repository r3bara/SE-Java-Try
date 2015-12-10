class NameJahrf {
    public static void main(String[] args) {
        final int alter = Integer.parseInt(args[2]); // Alter in Jahren
        final int tage = alter * 365; // Alter in Tagen
        
        System.out.printf("Hallo %s %s,\n"
                          + "Bei einem Alter von %s Jahren,\n"
                          + "bist du %s Tage alt.\n", args[0], args[1], args[2], tage);
    }
}