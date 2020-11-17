package HelloGraphicsApp;


import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;


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
        setCanvasSize(500, 500);
    }

    @Override
    public void draw() {
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
