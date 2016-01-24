class BmiV {
    public static void main(String[] args) {
        final int a = Integer.parseInt(args[2]); // Groeße int
        final int b = Integer.parseInt(args[1]); // Gewicht int
        final int c = a / 100; // Groeße in Meter ohne cm
        final int d = a - 100; // Groeße - 1m
        final double e = Double.parseDouble(args[2]); // Groeße double
        final double f = e / 100.00; // Groeße in Meter
        final double g = Double.parseDouble(args[1]); // Gewicht double
        final double h = f * f; // Groeße in Meter hoch 2
        final double i = g / h;	// BMI Masse/Größe hoch 2
        final int j = b * 10000;
        final int k = a * a;
        final int l = j / k;
        System.out.printf("Hallo " + args[0] + ",\n"); // Begrueßungszeile mit Namen
        System.out.printf("bei einer Groesse von " + (c) + " m " + (d) + 
        		" cm und einem Gewicht von " + (b) + " kg\n");
        System.out.printf("betraegt dein BMI " + (l) + 
        		". Der exakte Wert ist " +(i) + ".");
    }
}