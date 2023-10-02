package dev.caveatemptor.DatapackAPI.Vector;


/**
 * A 2D vector, useful for storing rotation and other 2D values.
 */
public class Vector2 {
    private int x, y;


    /**
     *
     * @param x The X component of the vector.
     * @param y The Y component of the vector.
     */
    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /**
     *
     * @return The X component of the vector.
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x The X component of the vector.
     * @return True if success, false if failure.
     */
    public boolean setX(int x) {
        this.x = x;
        return true;
    }


    /**
     *
     * @return The Y component of the vector.
     */
    public int getY() {
        return y;
    }


    /**
     *
     * @param y The Y component of the vector.
     * @return True if success, false if failure.
     */
    public boolean setY(int y) {
        this.y = y;
        return true;
    }


    public String toString() {
        return x + " " + y;
    }
}
