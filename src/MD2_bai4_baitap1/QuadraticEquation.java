package MD2_bai4_baitap1;
public class QuadraticEquation {
 private double a;
 private double b;
 private double c;

 public QuadraticEquation(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
 }

 public double getA() {
  return a;
 }

 public double getB() {
  return b;
 }

 public double getC() {
  return c;
 }
 public double getdelta(){
  return (Math.pow(b,2)-4*a*c);
 }
 public double getRoot1(){
  return (-b-Math.sqrt(getdelta()))/(2*a);
 }
 public  double getRoot2(){
  return (-b-Math.sqrt(getRoot2())/(2*a));
 }
 public double Motnghiem(){
  return -b/(2*a);
 }
}


