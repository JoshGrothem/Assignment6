
public class LOC {
	private String file;

	public LOC(String str) {
		file = str;
	}

	public String output() {
		// for, while, if, method names, LOC
		String answer = "";

		int c1 = file.split("\\bfor\\b").length - 1;

		int c2 = file.split("\\bif\\b").length - 1;

		int c3 = file.split("\\bwhile\\b").length - 1;

		answer += "For loops: " + c1 + " if statements: " + c2 + " while loops: " + c3;

		return answer;
	}

}
