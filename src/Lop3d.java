public class Lop3d extends Lop2d{
    private  float z = 0;
    public Lop3d(float z ){
        this.z = z;
    }
    public  Lop3d(float x , float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z ){
        this.z = z;
    }
    public  float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),z};

    }

    @Override
    public String toString() {
        return "(" +
                "x=" + getX() + ',' +
                "y=" + getY() + ',' +
                "z=" + getZ() + ',' +
                '}';
    }
}
