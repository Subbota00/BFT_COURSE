public class MyClass {

    public int Var1;
    public int Var2;
    public static int StaticVar = 1;

    public MyClass(int Var1, int Var2) {
        this.Var1 = Var1;
        this.Var2 = Var2;
    }

    public int useStaticVar() {
        return this.Var1 + this.Var2 + MyClass.StaticVar;
    }

    public static void main(String[] args) {
        MyClass Sum = new MyClass(10, 15);
        Sum.Var1 = 25;
        Sum.Var2 = 30;
        MyClass.StaticVar = 40;
        int result = Sum.useStaticVar();
        System.out.println(result);
    }
}