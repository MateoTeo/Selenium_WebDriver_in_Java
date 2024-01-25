public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int i=0;i<10;i++){
            tablica[i] = i;
            System.out.println(tablica[i]);
        }

        String[] dni = new String[7];
        dni[0] = "Poniedziałek";
        dni[1] = "Wtorek";
        dni[2] = "Środa";
        dni[3] = "Czwartek";
        dni[4] = "Piątek";
        dni[5] = "Sobota";
        dni[6] = "Niedziela";
        for (int i=0;i<7;i++){
            System.out.println(dni[i]);
        }

        Punkt p1 = new Punkt();
        /**    System.out.println(p1.x);
        p1.x = 5;

        p1.wyswietlWspolrzedne();

        int poleXDlaObiektu = p1.getX();
        System.out.println(poleXDlaObiektu);*/


        Punkt punkt = new Punkt();
        punkt.setX(4);
        System.out.println(punkt.getX());
    }
}
