class MultiplicationTable {
public static void main(String[] args) {
    int x = 1;
    int y;
    while (x <= 10) { // äußere Schleife
        y = 1;
        while (y <= 10) { // innere Schleife
            System.out.printf("%4d", x*y);
            y = y + 1;
        }
        x = x + 1;
        System.out.println();
        }
    }
}