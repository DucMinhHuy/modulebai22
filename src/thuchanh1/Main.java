package thuchanh1;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mcp=new MathCalculatorProxy();
        double result =mcp.add(1,2);
        System.out.println("1+2="+result);
        result=mcp.add(2,Double.MAX_VALUE);
        System.out.println("2+ddouble.MAX_VALUE="+result);
    }
}
