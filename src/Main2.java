interface Operar{
    int opera(int a ,int b);
}
public class Main2 {
    public static void main(String[] args) {
        Operar suma=(a,b)->{return (a+b);};
        System.out.println(suma.opera(5,3));

        Operar producto=(a,b)->(a*b);
        Operar resta=(a,b)->(a-b);
        Operar divide=(a,b)->(a/b);
        System.out.println(producto.opera(5,suma.opera(2,4)));

    }

}
