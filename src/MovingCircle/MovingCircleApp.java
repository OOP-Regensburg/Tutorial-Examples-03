package MovingCircle;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;

/**
 * In dieser GraphicsApp-Anwendung wird ein roter Kreis aus der linken, oberen Ecke
 * des Bildschirms, diagonal nach unten Rechts bewegt.
 */

public class MovingCircleApp extends GraphicsApp {


    /**
     * In der beim Programmstart einmalig aufgerufenen initalize-Methode wird die Größe
     * der Zeichenfläche auf 500 Pixel Breite und 500 Pixel Höhe eingestellt.
     */
    @Override
    public void initialize() {
        setCanvasSize(500,500);
    }


    @Override
    public void draw() {
    }
}
