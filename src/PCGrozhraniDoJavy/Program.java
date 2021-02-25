package PCGrozhraniDoJavy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ISoundable[] zv = new ISoundable[10];
        zv[0] = new Dog("Azor"); zv[1] = new Dog("Rex");
        zv[2] = new Cat("Mici"); zv[3] = new Cat("Mourek");
        zv[4] = new Auto("Mercedes");
        for (int i = 0; i <= 4; i++)
        {
            System.out.print(zv[i].getClass().getName().substring(18) + " se jmenuje ");
            System.out.print(zv[i].getName());                       //
            System.out.println(zv[i].GetName());                        //2
            System.out.println(" a vydává sound"+ zv[i].sound());
            
        }

	}

}
