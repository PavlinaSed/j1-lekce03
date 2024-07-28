package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        nakresliObdelnik(200, 100);
        nakresliTrojuhelnik(100, 60);
    }

    public void nakresliObdelnik(int delsiStrana, int kratsiStrana) {
        for (int i = 0; i < 2; i++) {
            zofka.move(delsiStrana);
            zofka.turnRight(90);
            zofka.move(kratsiStrana);
            zofka.turnRight(90);
        }
    }

    public void nakresliTrojuhelnik (int delkaStrany, int velikostUhlu) {
        zofka.turnRight(30);
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(180 - velikostUhlu);
        }
        zofka.turnLeft(30);
    }

}
