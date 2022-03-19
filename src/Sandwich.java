public class Sandwich {
    private String meat;
    private String veggie;
    private String bun;

    public Sandwich(String m, String v, String b)
    {
        meat = m;
        veggie = v;
        bun = b;
    }

    public void eat()
    {
        System.out.println("Wow, this " + meat + " and " + veggie + " sandwich tastes good!");
    }
}
