import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int big;
        if(f==s || f==t){
            if(s==t){
                System.out.println(10000+(f*1000));
            }else {
                System.out.println(1000+(f*100));
            }
        } else if (s==t) {
            System.out.println(1000+(s*100));
        }else {
            big = f;
            if(s<t && f<t) big = t;
            if(t<s && f<s) big = s;
            System.out.println(big*100);
        }
    }
}