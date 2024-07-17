package CS401MPPSolutions.TFProb3;
//Class : : Static method
public class Utility{
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        String originalString = "hello";
        String upperCaseString = Utility.toUpperCase(originalString);
        System.out.println("Uppercase : " + upperCaseString);

        int sum=Utility.add(5,10);
        System.out.println("Sum : " + sum);
    }
}