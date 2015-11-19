class HalloName {
    public static void main (String[] args){
      final int alter = Integer.parseInt(args[1]);
        final int a = alter * 365;
        System.out.printf("Hallo %s,\n"
                          +"bei einem Alter von %s Jahren, bist du mind. %s Tage alt",args[0], alter, a);
    }
}