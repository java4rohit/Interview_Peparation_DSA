package Java21Feature;

public class Example {
    int add(int a, int b) {
        return a + b;
    }

    public void main(String[] args) {
        Example example = new Example();
        int result = example.add(5, 3);
        System.out.println("Result: " + result);
    }
}
