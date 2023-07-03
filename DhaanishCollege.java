package hellopack;

public class DhaanishCollege {
	//instance variable
	public void buildCollege() {
		TrainingRoom crystal=new TrainingRoom();
		TrainingRoom emrald=new TrainingRoom();
		TrainingRoom diamond=new TrainingRoom();
		System.out.println(crystal.sanyo);
		System.out.println(emrald.sanyo);
		System.out.println(diamond.sanyo);
		System.out.println(crystal.sulab);
		System.out.println(emrald.sulab);
		System.out.println(diamond.sulab);
		crystal.admission();
		crystal.admission();
		diamond.admission();
		emrald.admission();
		emrald.admission();
	}
	public static void main(String[] args) {
		DhaanishCollege mycollege=new DhaanishCollege();
		mycollege.buildCollege();
		System.out.println("Dhaanish started...");
	}
}
class Human{
	
}