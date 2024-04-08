// Interface con un sólo método abstarcto
interface Saludo{
    public String say();
}

public class Main {
    public static void main(String[] args) {

        Saludo holaSpain= new Saludo(){
            @Override
            public String say() {
                return "hola";
            }
        };

        System.out.println(holaSpain.say());

    // Mediante Lambdas
        Saludo holaPortugues=() -> {return "ola";};
        System.out.println(holaPortugues.say());

        Saludo holaIngles=() -> {return "Hello";};
        System.out.println(holaIngles.say());
    }

}