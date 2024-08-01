package dividir.demo;

public class DivisionRequest {
    private double num1;
    private double num2;

    // Constructor vacío
    public DivisionRequest() {}

    // Constructor con parámetros
    public DivisionRequest(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters y setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
