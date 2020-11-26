
public class Cat {

    public static final int EYES_AMOUNT = 2;
    public static final double MIN_WEIGT = 1000.00;
    public static final double MAX_WEIGT = 9000.00;
    public double getMass;
    public String color;

    public void setColor (String number)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;


        boolean isAlive;

    public static int count;
    // создаю переменную count которая увеличивается на 1 при создании новой кошки

    private double originWeight;
    private double weight;
    private double feedamount;
    private double minWeight;
    private double maxWeight;

    private String mass;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }

    public Cat(double newWeight)

    {
        this();
        this.weight = newWeight ;
    }

    public double getCount()
    {
        return count;
    }

    public void meow()
    {
        weight = weight - 5000;
        System.out.println("Meow");
    }

    public void pee(int amount)
    {
        weight = weight - 7;
        System.out.println("Smile");
    }

    public void feed(Double amount)
    {
        {
            weight = weight + amount;
        }
    }

    public double getFeedamount()
    {
        weight = getWeight() - originWeight;
        return feedamount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void getKitten()
    {
        System.out.println("ТИХОН " + this.weight);
    }
}