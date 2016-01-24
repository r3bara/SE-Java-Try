public class JavaMenu {
	public static void main(String[] args) {
		System.out.println("Hallo, bitte gebe deinen Namen ein: ");

		String name = System.console().readLine();

		System.out.println("Bitte waehle dein Geschlecht:");
		System.out.println("1 fuer weiblich");
		System.out.println("2 fuer maennlich");
		System.out.println("3 fuer anderes");

		int var = Integer.parseInt(System.console().readLine());

		switch (var) {
		case 1:
			System.out.println("Hallo Frau " + name);
			break;
		case 2:
			System.out.println("Hallo Herr " + name);
			break;
		case 3:
			System.out.println("Hallo " + name);
			break;
		default:
			System.out.println("Keine gueltige Auswahl (1, 2, 3) getroffen. Trotzdem hallo " + name);
		}
	}
}