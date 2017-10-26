public class FindMinMaxStrings {
	public static void main(String...args) {
		int max = 0;
		int min = 0;
		for(int i = 0; i < args.length;i++) {
			if(args[i].length() <= args[min].length()) {
				min = i;
				continue;
			}
			if(args[i].length() >= args[max].length())
				max = i;
		}
		System.out.println("The smallest string is " + args[min]);
		System.out.println("The biggest string is " + args[max]);
	}
}