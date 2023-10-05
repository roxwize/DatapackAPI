package dev.caveatemptor.DatapackAPI.Vector;


/**
 * A 3D vector, useful for storing locations and other 3D values.
 */
public class Vector3 implements Vector {
    private int x;
    private int y;
    private int z;


    /**
     *
     * @param x The X component of the vector.
     * @param y The Y component of the vector.
     * @param z The Z component of the vector.
     */
    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * @param x The value to set the X component to.
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
     * @param y The value to set the Y component to.
     * @return True if success, false if failure.
     */
    public boolean setY(int y) {
        this.y = y;
        return true;
    }


    /**
     *
     * @return The Z component of the vector.
     */
    public int getZ() {
        return z;
    }

    /**
     *
     * @param z The value to set the Z component to.
     * @return True if success, false if failure.
     */
    public boolean setZ(int z) {
        this.z = z;
        return true;
    }


    /**
     * Converts the vector into a String usable in mcfunctions
     * @return The X, Y, and Z components of the vector separated by spaces.
     */
    public String generate() {
        return x + " " + y + " " + z;
    }
}
