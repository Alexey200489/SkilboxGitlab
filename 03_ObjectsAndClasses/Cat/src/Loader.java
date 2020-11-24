
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

        System.out.println("Vasya weigt: " + vasya.getWeight());

        vasya.feed(150.00);
        vasya.feed(100.00);
        System.out.println("Vasya weigt: " + vasya.getWeight());

        vasya.getFeedamount();
        System.out.println("Food eaten: " + vasya.getWeight());

        System.out.println(vasya.getStatus());

        Cat barsik = new Cat();
        System.out.println("Barsik weigt: " + barsik.getWeight());

        barsik.pee(1);
        System.out.println("Barsik weigt: " + barsik.getWeight());

        System.out.println(barsik.getStatus());

        Cat sharik = new Cat();
        System.out.println("Sharik weigt: " + sharik.getWeight());

        sharik.getCount();
        System.out.println("Cat count: " + sharik.getCount());

        System.out.println(sharik.getStatus());

        Cat tuzik = new Cat();
        System.out.println("Tuzik weigt: " + tuzik.getWeight());

        tuzik.getCount();
        System.out.println("Cat count: " + sharik.getCount());

        System.out.println(tuzik.getStatus());

        Cat Kitten = new Cat();
        System.out.println(Kitten.getMass);
        Kitten.getMass();

    }
    private static void getKitten()
    {
        return;
    }
      Cat tihon = new Cat();

}