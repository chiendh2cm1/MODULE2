package com.codegym;

public class Poin3D extends Poin2D  {
    private float z;

    public Poin3D() {
    }

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        super.setXY(x,y);
        this.z = z;
    }
    public  float[] getXYZ(){
        float[]xyz = new float[3];
        xyz[0] = super.getX();
        xyz[1] = super.getY();
        xyz[2] = this.z;
        return xyz;
    }
    @Override
    public String toString() {
        return super.toString() + " and z = " + getZ();
    }
}
