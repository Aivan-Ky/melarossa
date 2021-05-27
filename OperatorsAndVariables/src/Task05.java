public class Task05 {
    public static void main(String[] args) {
        final double radius = 10;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("площадь круга с радиусом " + radius + " равна " + area);
        System.out.println("длина окружности радиусом " + radius + " равна " + circumference);
    }
}
