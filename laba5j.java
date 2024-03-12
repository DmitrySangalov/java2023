import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты (x, y, z) первой точки");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        Point3d point1 = new Point3d(x1, y1, z1);

        System.out.println("Введите координаты (x, y, z) второй точки");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();
        Point3d point2 = new Point3d(x2, y2, z2);

        System.out.println("Введите координаты (x, y, z) третей точки");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double z3 = scanner.nextDouble();
        Point3d point3 = new Point3d(x3, y3, z3);

        //проверка на одинаковость точек
        if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
            System.out.println("Какие-то 2 точки одинаковы");
        } else {
            double area = computeArea(point1, point2, point3);
            System.out.println("Площадь треугольника: " + area);
        }
    }
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point1.distanceTo(point3);
        //поиск полупериметра
        double p = (a + b + c) / 2.0;
        //формула Герона
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
    }
