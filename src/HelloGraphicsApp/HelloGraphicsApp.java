package HelloGraphicsApp;


import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.graphics.Line;
import de.ur.mi.oop.graphics.Rectangle;


/**
 * In dieser GraphicsApp-Anwendung werden unterschiedliche graphische Objekte erstellt und
 * auf dem Bildschirm dargestellt.
 */

public class HelloGraphicsApp extends GraphicsApp {

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
