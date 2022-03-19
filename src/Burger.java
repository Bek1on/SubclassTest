public class Burger extends Sandwich{
    private boolean hasSeasame;

    public Burger(String m, String v, String b, boolean h)
    {
        super(m,v,b);
        hasSeasame = h;
    }

    public void putSeasame()
    {
        if(hasSeasame)
        {
            System.out.println("This ting already got seasame on it!");
        }
        else
        {
            hasSeasame = true;
            System.out.println("Seasame added!");
        }
    }
}
