package PCGrozhraniDoJavy;

class Dog extends Animal implements ISoundable
{
    Boolean isPedigree;
    public Dog(String name)
     
    {
    	 super(name);
    }
    public String sound() { return "haf"; }
    public String getName() { return name; }                 //

    public String GetName()
    { return name; }                                    //2
    public void SetName(String value)
    { name = value; }                                   //2
}
