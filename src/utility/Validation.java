package utility;

public class Validation {
	
	public static boolean containsOnlyAlphabets(String param){
		for(int locali = 0; locali <= param.length(); locali++){
			if(Character.isAlphabetic(param.charAt(locali))){
				return true;
			}
		}
		
		return false;
	} 
	
	public static boolean containsOnlyNumeric(String param){
		for(int locali = 0; locali <= param.length(); locali++){
			if(Character.isDigit(param.charAt(locali))){
				return true;
			}
		}
		
		return false;
	} 

}
