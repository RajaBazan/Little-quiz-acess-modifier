package hello.com;
class circle1{
    private double radius;
    private double pi;
    public double perimeter(){
        return 2*pi*radius;
    }
    public double area(){
        return pi*(radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

}
public class Little_quiz_access_modifier {
    public static void main(String[] args) {
        circle1 cir = new circle1();
        cir.getRadius();
        cir.setRadius(2);
        cir.getPi();
        cir.setPi(3.14);
        cir.area();
        cir.perimeter();
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
    }
}
