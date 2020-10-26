
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Murka weigt: " + murka.getWeight());

        murka.meow();
        System.out.println("Murka weigt: " + murka.getWeight());

        System.out.println(murka.getStatus());

        Cat vasya = new Cat();
        vasya.feed(23.6);
        System.out.println("Vasya weigt: " + vasya.getWeight());

        System.out.println(vasya.getStatus());

        Cat barsik = new Cat();
        barsik.feed(544.74);
        System.out.println("Barsik weigt: " + barsik.getWeight());

        System.out.println(barsik.getStatus());

        Cat sharik = new Cat();
        System.out.println("Sharik weigt: " + sharik.getWeight());

        System.out.println(sharik.getStatus());

        Cat tuzik = new Cat();
        System.out.println("Tuzik weigt: " + tuzik.getWeight());

        System.out.println(tuzik.getStatus());
    }
}