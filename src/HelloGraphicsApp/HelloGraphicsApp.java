package HelloGraphicsApp;


import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.graphics.Line;
import de.ur.mi.oop.graphics.Rectangle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;


/**
 * In dieser GraphicsApp-Anwendung werden unterschiedliche graphische Objekte erstellt und
 * auf dem Bildschirm dargestellt.
 */

public class HelloGraphicsApp extends GraphicsApp {

    /**
     * In der beim Programmstart einmalig aufgerufenen initalize-Methode wird die Größe
     * der Zeichenfläche auf 150 Pixel Breite und 150 Pixel Höhe eingestellt.
     */
    @Override
    public void initialize() {
        setCanvasSize(150, 150);
    }

    /**
     * In der - während das Programm läuft - alle 16ms aufgerufenen Methode draw wird:
     * - der Hintergrund in der Methode fillBackgroundWithColor eingefärbt
     * - ein Rechteck gezeichnet (drawRectangle)
     * - ein Kreis gezeichnet (drawCircle)
     * - zwei Linien über die gezeichneten Elemente gezogen (drawCross)
     */
    @Override
    public void draw() {
        fillBackgroundWithColor();
        drawRectangle();
        drawCircle();
        drawCross();
    }

    /**
     * Die Methode füllt die komplette Zeichenfläche in der Farbe
     * der SLK-Fakultät (Heidenelkenrot) aus.
     */
    public void fillBackgroundWithColor() {
        Color myColor;
        /**
         * Die Farbe wird mit den Werten 156 (rot) , 0 (grün) und 75 (blau) im
         * RGB-Farbraum [https://de.wikipedia.org/wiki/RGB-Farbraum] erzeugt.
         */
        myColor = new Color(156, 0, 75);
        drawBackground(myColor);
    }

    /**
     * Die Methode zeichnet ein weißes Rechteck der Größe 100x100 Pixel
     * an die Position x=50,y=50
     */
    public void drawRectangle() {
        Rectangle myRectangle;
        myRectangle = new Rectangle(50, 50, 100, 100, Colors.WHITE);
        myRectangle.draw();
    }

    /**
     * Die Methode zeichnet einen schwarzen Kreis der Größe 100x100 Pixel (Radius 50 Pixel)
     * an die Position x=50,y=50 (Mittelpunkt des Kreises)
     */
    public void drawCircle() {
        Circle myCircle;
        myCircle = new Circle(50, 50, 50, Colors.BLACK);
        myCircle.draw();
    }

    /**
     * Die Methode zeichnet ein rotes Kreuz, bestehend aus zwei diagonalen Linien, über
     * die gesamte Zeichenfläche.
     */
    public void drawCross() {
        // Erstellen & Zeichnen der Linie von der linken, oberen Ecke zur rechten, unteren Ecke
        Line leftLine = new Line(0, 0, 150, 150, Colors.RED);
        leftLine.draw();
        // Erstellen & Zeichnen der Linie von der rechten, oberen Ecke zur linken, unteren Ecke
        Line rightLine = new Line(150, 0, 0, 150, Colors.RED);
        rightLine.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
