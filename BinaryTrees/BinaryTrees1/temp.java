public class temp{
    int a = 1;
    static int b = 1;
    public static void main(String args[]){
        temp t1 = new temp();
        t1.a = t1.a +1;
        t1.b = t1.b +1;
        System.out.println(t1.a);
        System.out.println(t1.b);

        temp t2 = new temp();

        System.out.println(t2.a);
        System.out.println(t2.b);
        temp t1 = new temp();
        System.out.println(t1.a);
    }
}