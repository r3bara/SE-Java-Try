public class Jahre {

	public static void main(String[] args) {
		
        int jahr = Integer.parseInt(args[0]);
		int zähler = 0;
		int jahr1 = 0;
		int jahr2 = 0;
		int jahrakt1 = 0;
		int jahrakt2 = 0;
	
		while (zähler != 2){
			int j = jahr / 1000;
			int i = (jahr / 100) % 10;
			int z = (jahr / 10) % 10;
			int e = (jahr / 1) % 10;
			
			if (j != i && j != z && j != e && i != z && i != e && z != e){
				if (zähler == 0){
					zähler++;
					jahr1 = (j * 1000) + (i * 100) + (z * 10) + e;
				} else if (zähler == 1) {
					jahr2 = (j * 1000) + (i * 100) + (z * 10) + e;
					zähler = 0;
					jahr--;
				}				
			}	
			
			if (jahr2-jahr1 > jahrakt2 - jahrakt1){
				jahrakt1 = jahr1;
				jahrakt2 = jahr2;
				
				
			}
			
			if (jahr <= 2015){
				jahr++;
			} else {
				zähler = 2;
			}
		}
		int abstand = jahrakt2 - 1 - jahrakt1 ;
		
        System.out.println(jahrakt1 + "-" + jahrakt2 + "=>" + abstand);
	}

}