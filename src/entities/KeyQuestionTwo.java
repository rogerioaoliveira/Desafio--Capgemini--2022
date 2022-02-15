package entities;

public class KeyQuestionTwo {

	private String key;

	public KeyQuestionTwo(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public boolean hasAUpperCase() {
		for (int i = 65; i <= 90; i++) {
			if (key.contains(String.format("%c", i))) {
				return true;
			}
		}
		System.out.println("You need being at least one Upper Case");
		return false;
	}

	public boolean hasALowerCase() {
		for (int i = 97; i <= 122; i++) {
			if (key.contains(String.format("%c", i))) {
				return true;
			}
		}
		System.out.println("You need being at least one Lower Case");
		return false;
	}

	public boolean hasANumber() {
		for (int i = 48; i <= 57; i++) {
			if (key.contains(String.format("%c", i))) {
				return true;
			}
		}
		System.out.println("You need being at least one Number");
		return false;
	}

	public boolean hasACharacterSpecial() {
		for (int i = 33; i <= 47; i++) {
			if (key.contains(String.format("%c", i))) {
				return true;
			}
		}
		for (int j = 58; j <= 64; j++) {
			if (key.contains(String.format("%c", j))) {
				return true;
			}
		}
		for (int k = 91; k <= 96; k++) {
			if (key.contains(String.format("%c", k))) {
				return true;
			}
		}
		for (int l = 123; l <= 256; l++) {
			if (key.contains(String.format("%c", l))) {
				return true;
			}
		}
		System.out.println("You need being at least one Character Special");
		return false;
	}

	public String strongKey() {
		if (key.length() < 6 || hasAUpperCase() == false || hasALowerCase() == false || hasANumber() == false
				|| hasACharacterSpecial() == false) {
			return "Missing " + (6 - key.length()) + " characters to make a strong Key.";
		}
		return "Congratulation!";
	}
}
