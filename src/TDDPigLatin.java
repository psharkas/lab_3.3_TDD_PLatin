import java.util.ArrayList;

public class TDDPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "paper";
		System.out.println(translate(input1));
	}
	
	public static String translate(String input) {
		ArrayList<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
				
		input = lowercase(input);
		String consonantFirstLetter = "";
		String firstLetter = Character.toString(input.charAt(0));
		
		if (vowels.contains(firstLetter)) {
			return (input + "way");
		}
		else {
			for (int i = 0; i < input.length(); i++) {
				if (vowels.contains(Character.toString(input.charAt(i)))) {
					break;
				}
				consonantFirstLetter += input.charAt(i);
			}
			input = input.replaceFirst(consonantFirstLetter, "");
			input = input.concat(consonantFirstLetter + "ay");
			return input;
		}
	}
	
	public static String lowercase(String input) {
		input = input.toLowerCase();
		return input;
	}

}
