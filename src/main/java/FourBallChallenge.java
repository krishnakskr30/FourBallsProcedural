import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 480;
    int movementAlongX1 = 0, movementAlongX2 = 0, movementAlongX3 = 0, movementAlongX4 = 0;
    int circleDiameter = 10;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(movementAlongX1, (float) HEIGHT / 5, circleDiameter, circleDiameter);
        ellipse(movementAlongX2, (float) HEIGHT * 2 / 5, circleDiameter, circleDiameter);
        ellipse(movementAlongX3, (float) HEIGHT * 3 / 5, circleDiameter, circleDiameter);
        ellipse(movementAlongX4, (float) HEIGHT * 4 / 5, circleDiameter, circleDiameter);
        movementAlongX1++;
        movementAlongX2 += 2;
        movementAlongX3 += 3;
        movementAlongX4 += 4;
    }

}