
public class Cat
{
    private double originWeight;
    private double weight;
    private double feedamount;
    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

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
        weight = weight + feedamount;
        {
            return;
        }
    }

    public double getFeedamount(Double amount)
    {
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
}