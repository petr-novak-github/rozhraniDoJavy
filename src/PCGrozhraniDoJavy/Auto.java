package PCGrozhraniDoJavy;

class Auto implements ISoundable
{
    String name;
    int speed;
    public Auto(String name) { this.name = name; }
    public String sound() { return "tu-tů"; }
    public String getName() { return name; }                 //

    public String GetName()
    { return name; }                                    //2
    public void SetName(String value)
    { name = value; }                                   //2
}
