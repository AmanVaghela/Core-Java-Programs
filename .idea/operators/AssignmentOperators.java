package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        // = += -= *= /= %= &= ^= |= <<= >>= >>>=

        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)

        System.out.println(a);
        System.out.println(b);
        System.out.println();

        a=10;
        a*=2;//20
        System.out.println(a);
        a/=4;//5
        System.out.println(a);
        a%=2;//1
        System.out.println(a);
    }
}
