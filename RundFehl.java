class RundFehl {
    public static void main(String[] args) {
        
        double s, x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6;
        
        x1 = 1e20;
        x2 = 1223;
        x3 = 1e18;
        x4 = 1e15;
        x5 = 3;
        x6 = -1e12;
        y1 = 1e20;
        y2 = 2;
        y3 = -1e22;
        y4 = 1e13;
        y5 = 2111;
        y6 = 1e16;
        
        s = x1*y1 + x2*y2 + x3*y3 + x4*y4 + x5*y5 + x6*y6;
        
        System.out.println("Das Ergebnis ist" + s);
        
        double z, x, y, xh2, yh2;
        
        x = 192119201;
        y = 35675640;
        xh2 = x * x;
        yh2 = y * y;
        
        z = (1682*x*yh2*yh2 + 3*x*xh2 + 29*x*yh2 -2*x*xh2*xh2 + 832) / 107751;
        
        System.out.println("Das zweiter Ergebnis ist" + z);
        
    }
}