public class Vector {
    public double x, y, z;

    public Vector(double x, double y, double z){ //конструктор
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }

    public double getZ(){
        return z;
    }
    public void setZ(double z){
        this.z = z;
    }

    public double scalarProduct(Vector v1, Vector v2){ //скалярное произведение векторов
        double scalar;
        double xMul = v1.getX() * v2.getX();
        double yMul = v1.getY() * v2.getY();
        double zMul = v1.getZ() * v2.getZ();
        scalar = xMul + yMul + zMul;
        return scalar;
    }

    public double vectorLen(){ // вычисление длины вектора
        double vectorLen;
        vectorLen = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
        return vectorLen;
    }

    public String vectorMul(Vector v1, Vector v2){ // векторное произведение
        double x = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
        double y = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
        double z = v1.getX() * v2.getY() - v1.getY() * v2.getX();
        Vector newVector = new Vector(x, y, z);
        return ("("+ newVector.getX() + "," + newVector.getY() + "," + newVector.getZ() + ")");
        //return new Vector(x, y, z);
    }

    public static Vector[] newVectorArr (int n){ // создание массива размерностью n новых векторов
        Vector[] nVector = new Vector[n];
        for (int i = 0; i < n; i++){
            nVector[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return nVector;
    }

    public double cosVec (Vector v1, Vector v2){
       double cosVec = scalarProduct(v1, v2) / v1.vectorLen() * v2.vectorLen();
       return  cosVec;
    }
}
