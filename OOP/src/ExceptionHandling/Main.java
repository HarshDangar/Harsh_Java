package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;

        try {
//            divide(a,b);

            String name = "Harsh";
            if (name.equals("Harsh")){
                throw new MyException("Name is Harsh");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Normal Exception");
        } finally {
            System.out.println("It will be always executed");
        }

        divide(a,b);
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("number cant be divide by 0");
        }

        return a / b;
    }
}
