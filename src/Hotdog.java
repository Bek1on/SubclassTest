public class Hotdog extends Sandwich{
    private boolean hasRelish; //you do not put relish on a burger :)

    public Hotdog(String m, String v, String b, boolean r)
    {
        super(m,v,b);
        hasRelish = r;
    }

    public void putRelish()
    {
        if(hasRelish)
        {
            System.out.println("THATS TOO MUCH RELISH!");
        }
        else
        {
            hasRelish = true;
            System.out.println("Relish added!");
        }
    }
}
