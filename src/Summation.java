public class Summation {

    public void foo(int s, int k) {
        int c;
        if (s > k) {
            c = s + k;
            System.out.println(c);
        } else if (s < k) {
            c = s - k;
            System.out.println(c);
        } else {
            c = s * k;
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        Summation v= new Summation();
        v. foo(6,4);


    }
}