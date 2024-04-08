interface Saludo1{
    public String say(String nombre);
}
public class Main1 {
    public static void main(String[] args) {
        Saludo1 holaSpain = (nombre)-> {
            return "Hola " + nombre;
        };
        Saludo1 holaPortugal = (nombre)->{ return "Ola " + nombre;};
        Saludo1 holaIngles = (nombre)->{ return "Hello " + nombre;};
        System.out.println(holaSpain.say("Maria"));
        System.out.println(holaPortugal.say("Joao"));
        System.out.println(holaIngles.say("Mary"));
    }

}
