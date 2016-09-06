package factoryImplementation;

public class DogFactory {
	
	public Dog getDog(String dogType){
		if(dogType==null){
			return null;
		}
		
		if(dogType.equalsIgnoreCase("HutchKukka")){
			return new HutchKukka();
		}
		
		if(dogType.equalsIgnoreCase("Labredor")){
			return new Labredor();
		}
		
		if(dogType.equalsIgnoreCase("Pomerion")){
			return new Pomerion();
		}
		
		return null;
	}

}
