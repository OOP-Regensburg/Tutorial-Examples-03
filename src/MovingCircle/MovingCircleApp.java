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
     * Klassenweit verwendbare Variablen für die aktuelle Position des Kreises innerhalb
     * des Koordinatensystems.
     */
    int xPosition = 0;
    int yPosition = 0;

    /**
     * In der beim Programmstart einmalig aufgerufenen initalize-Methode wird die Größe
     * der Zeichenfläche auf 500 Pixel Breite und 500 Pixel Höhe eingestellt.
     */
    @Override
    public void initialize() {
        setCanvasSize(500,500);
    }

    /**
     * In der - während das Programm läuft - alle 16ms aufgerufenen Methode draw wird:
     *  - der Hintergrund der Zeichenfläche weiß eingefärbt
     *  - die Werte in den Positionsvariablen um 1 Pixel erhöht
     *  - ein neuer Kreis auf Basis der aktuellen Positionswerte erzeugt und gezeichnet
     */
    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
        xPosition = xPosition + 1; // Alternativ: xPosition++
        yPosition = yPosition + 1; // Alternativ: yPosition++
        /**
         * Während Radius und Farbe mit "festen" Werten initalisiert werden, werden für
         * die Position die Werte aus den, auf Klassenebene erstellten, Variablen verwendet.
         * Achtung: Variablen auf Methodenebene funktionieren hier nicht, da diese bei jedem
         * Start der Methode neu erstellt werden und ihren Wert nach dem Methodendurchlauf
         * verlieren!
         */
        Circle myCircle = new Circle(xPosition, yPosition, 100, Colors.RED);
        myCircle.draw();
    }
}
