package MD2_bai5_baitap1;

public class Circle {
    private double radius;
    private String color;
    //Ham tao
    public Circle(){
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    //Phuong thuc

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}
