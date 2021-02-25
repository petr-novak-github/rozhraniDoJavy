package PCGrozhraniDoJavy;

class Cat extends Animal implements ISoundable
{
    Boolean isPedigree;
    public Cat(String name)
      
    {
    	super(name);
    }
    public String sound() { return "mňau"; }
    public String getName() { return name; }                 //

    public String GetName()
    { return name; }                                    //2
    public void SetName(String value)
    { name = value; }                                   //2
}
