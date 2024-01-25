public class Punkt {
    private int x;
    private int y;

    //procedura
    void wyswietlWspolrzedne() {
        System.out.println("x to: " + x + " A y to: " + y);
    }

    // funkcja
    int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
