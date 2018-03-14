public class NameGenerator {
	public static void main(String args[]) {
		
		// This creates a new instance of Name.
		Name names = new Name();
		
		// This populates all the syllable arrays. Why not?
		names.populateAllSyllables();
		
		// This prints ten names.
		names.generateTenNames();
	}
}
