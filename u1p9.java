import java.lang.Math.*;
class u1p9
{
    int n,amt;
    float r;
    double ci, netamt;
    u1p9(){r=6.5f;n=5;amt=5000;}

    public void comp_int()
    {
        ci=amt*Math.pow((1+r/100),n); netamt=amt+ci; 

    }
    public void display()
    {
        System.out.println("rate:"+r); 
        System.out.println("amt:"+amt);
        System.out.println("year:"+n);
        System.out.println("netamt:"+netamt);
        System.out.println("ci:"+ci);

    }
    public static void main(String[] args)
    {
        u1p9 x=new u1p9();
        x.comp_int();
        x.display();
    }
}