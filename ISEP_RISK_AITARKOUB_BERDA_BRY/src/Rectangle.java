import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdOut;

import java.awt.*;
import java.net.SocketOption;

public class Rectangle {

    private int x;
    private int y;
    private int halfWidth;
    private int halfHeight;
    private Territory territory;
    private Color color;

    public Rectangle(int x, int y, int halfWidth, int halfHeight, Territory territory) {
        this.x = x;
        this.y = y;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        this.territory = territory;
        this.color = this.territory.getOwner().getPlayerColor();

    }

    //Dessiner rectangle

    public void DrawRectangle() {
        System.out.println("COLOOOOOR : " + this.color);
        StdDraw.setPenColor(this.color);
        StdDraw.filledRectangle(this.x, this.y, this.halfWidth, this.halfHeight);

    }


    // GETTERS SETTERS

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHalfWidth() {
        return halfWidth;
    }

    public void setHalfWidth(int halfWidth) {
        this.halfWidth = halfWidth;
    }

    public int getHalfHeight() {
        return halfHeight;
    }

    public void setHalfHeight(int halfHeight) {
        this.halfHeight = halfHeight;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }
}
