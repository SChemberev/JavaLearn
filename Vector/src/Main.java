import java.util.Arrays;

/*Создайте класс, который описывает вектор (в трёхмерном пространстве).

У него должны быть:

конструктор с параметрами в виде списка координат x, y, z *done*
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt(): *done*
$\sqrt{x^2 + y^2 + z^2}$

метод, вычисляющий скалярное произведение:*done*
$x_1x_2 + y_1y_2 + z_1z_2$

метод, вычисляющий векторное произведение с другим вектором: *done*
$(y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)$

метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению
векторов, деленному на произведение модулей (длин) векторов: *done*
$\frac{(a,b)}{|a| \cdot |b|}$

методы для суммы и разности:
$(x_1 + x_2, y_1 + y_2, z_1 + z_2)$

$(x_1 - x_2, y_1 - y_2, z_1 - z_2)$


статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N. *done*

Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать
 шаблон "Неизменяемый объект"
*/
//schemberev 29042024
public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(2.43, 3.13, -33.1);
        Vector v2 = new Vector(3.51, -4.15, 3.51);
        Vector[] vectors = Vector.newVectorArr(2);
        System.out.println(vectors[0]);
        System.out.println("Длина вектора v1 равна " + vectors[0].vectorLen());
        System.out.println("Скалярное произведение векторов v1 и v2 равно " + vectors[0].scalarProduct(vectors[0], vectors[1]));
        System.out.println("Векторное произведение: " + (v1.vectorMul(v1, v2)));
        System.out.println("Косинус угла между векторами: " + v1.cosVec(v1, v2));

    }
}
