public class Dishes
{
    public String Name;
    public long price;
    private String type;

    public Dishes(String name, long price, String type) {
        Name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString()
    {
        return Name+"-"+price+"/-";
    }


    public String getName() {

        return Name;
    }

}


