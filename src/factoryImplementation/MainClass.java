package factoryImplementation;

public class MainClass {
	
	public static void main(String[] args){
	DogFactory df=new DogFactory();
	
	Dog d1=df.getDog("HutchKukka");
	d1.type();
	
	
	Dog d2=df.getDog("Labredor");
	d2.type();
	
	Dog d3=df.getDog("Pomerion");
	d3.type();
	}
}
