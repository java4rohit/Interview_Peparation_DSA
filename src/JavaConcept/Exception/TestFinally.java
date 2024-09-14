package JavaConcept.Exception;

public class TestFinally {

    public static void main(String[] args) {

        System.out.println(test());
    }



    public static int test(){

        try {
         return 1;
        }

        finally {
            return 2;
        }

    }



}
