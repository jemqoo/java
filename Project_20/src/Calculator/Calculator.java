package Calculator;

public class Calculator {
    public static <T extends Number, V extends Number> Double sum(T a, V b ){//Параметры - 2 переменные типа T, V
        return a.doubleValue() + b.doubleValue();//Возврат суммы типа double
    }
    public static <T extends Number, V extends Number> Double multiply(T a, V b){//Параметры - 2 переменные типа T, V
        return a.doubleValue() * b.doubleValue();//Возврат умножения типа double
    }
    public static <T extends Number, V extends Number> Double divide(T a, V b){//Параметры - 2 переменные типа T, V
        return a.doubleValue() / b.doubleValue();//Возврат деления типа double
    }
    public static <T extends Number, V extends Number> Double subtraction(T a, V b){//Параметры - 2 переменные типа T, V
        return a.doubleValue() - b.doubleValue();//Возврат разности типа double
    }
}
