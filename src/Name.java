// Here is where all the name arrays will be created.
public class Name {
	// Variable declarations here.
	public String[] firstSyllable = new String[20];
	public String[] secondSyllable = new String[12];
	public String[] thirdSyllable = new String[12];
	public String[] fourthSyllable = new String[12];
	
	// Integer values for array number randomization.
	int arrayMin = 0;
	int arrayMax = 11;
	int firstArrayMax = 19;
	int arrayRandom1, arrayRandom2, arrayRandom3, arrayRandom4 = 0;
	
	// Integer values for name syllable randomization.
	int syllablesMin = 1;
	int syllablesMax = 3;
	
	// Integer values for randomization between 0 and 1.
	int coinFlipMin = 0;
	int coinFlipMax = 1;

	// Calculation to generate random numbers based upon the integers provided for the array and syllable ranges.
	// IMPORTANT: Condense these into some other method that allows you to do this map without typing this math out THREE TIMES.
	int coinFlip = (int)(Math.random() * ((coinFlipMax - coinFlipMin) + 1)) + coinFlipMin;
	
	// This populates the first syllable array.
	public void populateFirstSyllable() {
		firstSyllable[0] = "Ger";
		firstSyllable[1] = "Dro";
		firstSyllable[2] = "Mil";
		firstSyllable[3] = "Tha";
		firstSyllable[4] = "Jin";
		firstSyllable[5] = "Gam";
		firstSyllable[6] = "Sur";
		firstSyllable[7] = "Lur";
		firstSyllable[8] = "Gal";
		firstSyllable[9] = "Var";
		firstSyllable[10] = "Sel";
		firstSyllable[11] = "Lar";
		firstSyllable[12] = "Sol";
		firstSyllable[13] = "Quor";
		firstSyllable[14] = "Kir";
		firstSyllable[15] = "Ash";
		firstSyllable[16] = "Ez";
		firstSyllable[17] = "Or";
		firstSyllable[18] = "Il";
		firstSyllable[19] = "Ur";
	}
	
	// This populates the second syllable array.
	public void populateSecondSyllable() {
		secondSyllable[0] = "zol";
		secondSyllable[1] = "'"; // Obligatory fantasy apostrophe.
		secondSyllable[2] = "mar";
		secondSyllable[3] = "gaz";
		secondSyllable[4] = "win";
		secondSyllable[5] = "r";
		secondSyllable[6] = "z";
		secondSyllable[7] = "del";
		secondSyllable[8] = "il";
		secondSyllable[9] = "-"; // Obligatory fantasy hyphen.
		secondSyllable[10] = "ara";
		secondSyllable[11] = "ala";
	}

	// This populates the third syllable array.
	public void populateThirdSyllable() {
		thirdSyllable[0] = "y";
		thirdSyllable[1] = "a";
		thirdSyllable[2] = "e";
		thirdSyllable[3] = "g";
		thirdSyllable[4] = "s";
		thirdSyllable[5] = "u";
		thirdSyllable[6] = "a";
		thirdSyllable[7] = "i";
		thirdSyllable[8] = "e";
		thirdSyllable[9] = "a";
		thirdSyllable[10] = "t";
		thirdSyllable[11] = "k";
	}
	
	// This populates the fourth syllable array.
	public void populateFourthSyllable() {
		fourthSyllable[0] = "od";
		fourthSyllable[1] = "el";
		fourthSyllable[2] = "us";
		fourthSyllable[3] = "en";
		fourthSyllable[4] = "an";
		fourthSyllable[5] = "ar";
		fourthSyllable[6] = "is";
		fourthSyllable[7] = "yn";
		fourthSyllable[8] = "dir";
		fourthSyllable[9] = "ai";
		fourthSyllable[10] = "dwyr";
		fourthSyllable[11] = "ys";
	}
	
	// This method calls the four array-populating methods, allowing every value to be populated together.
	public void populateAllSyllables() {
		populateFirstSyllable();
		populateSecondSyllable();
		populateThirdSyllable();
		populateFourthSyllable();
	}
	
	// This method determines how many syllables will be in the randomly generated name.
	public int numOfSyllables() {
		int numOfSyllables = (int)(Math.random() * ((syllablesMax - syllablesMin) + 1)) + syllablesMin;
		return numOfSyllables;
	}
	
	// This method returns a two-syllable name.
	public String twoSyllables() {
		int arrayRandom1 = (int)(Math.random() * ((firstArrayMax - arrayMin) + 1)) + arrayMin;
		int arrayRandom2 = (int)(Math.random() * ((arrayMax - arrayMin) + 1)) + arrayMin;
		return firstSyllable[arrayRandom1] + fourthSyllable[arrayRandom2];
	}
	
	// This method returns a three-syllable name.
	public String threeSyllables() {
		String threeSyllableName = "";
		arrayRandom1 = (int)(Math.random() * ((firstArrayMax - arrayMin) + 1)) + arrayMin;
		arrayRandom2 = (int)(Math.random() * ((arrayMax - arrayMin) + 1)) + arrayMin;
		arrayRandom3 = (int)(Math.random() * ((arrayMax - arrayMin) + 1)) + arrayMin;
		if (coinFlip == 0) {
			 threeSyllableName = firstSyllable[arrayRandom1] + secondSyllable[arrayRandom2] + fourthSyllable[arrayRandom4];
		}
		
		else if (coinFlip == 1) {
			threeSyllableName = firstSyllable[arrayRandom1] + thirdSyllable[arrayRandom3] + fourthSyllable[arrayRandom4];
		}
		
		return threeSyllableName;
	}
	
	// This method returns a four-syllable name.
	public String fourSyllables() {
		arrayRandom1 = (int)(Math.random() * ((firstArrayMax - arrayMin) + 1)) + arrayMin;
		arrayRandom2 = (int)(Math.random() * ((arrayMax - arrayMin) + 1)) + arrayMin;
		arrayRandom3 = (int)(Math.random() * ((arrayMax - arrayMin) + 1)) + arrayMin;
		arrayRandom4 = (int)(Math.random() * ((arrayMax - arrayMin) + 1)) + arrayMin;
		return firstSyllable[arrayRandom1] + secondSyllable[arrayRandom2] + thirdSyllable[arrayRandom3] + fourthSyllable[arrayRandom4];
	}

	// This actually generates a random name based upon the parameters above.
	public void generateName() {
		int syllables = numOfSyllables();
		
		if (syllables == 2) {
			System.out.println(twoSyllables());
		}
		
		else if (syllables == 3) {
			System.out.println(threeSyllables());
		}
		
		else {
			System.out.println(fourSyllables());
		}
	}
	
	public void generateTenNames() {
		generateName();
		generateName();
		generateName();
		generateName();
		generateName();
		generateName();
		generateName();
		generateName();
		generateName();
		generateName();
	}


}
