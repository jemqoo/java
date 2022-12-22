public class Tests {
    public static void main(String[] args){
        Planet p = new Planet("Earth");
        System.out.println(p.getName());
        Car c = new Car("Lada");
        System.out.println(c.getName());
        Default d = new Default();
        System.out.println(d.getName());
    }
}
