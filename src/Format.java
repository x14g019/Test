public class Format {

	public static void main(String[] args) {
		int a = 10;
		float b = 100.5f;
		double c = 1000.15;
		char d = 'M';
		String e = "ふぉ";

		String s = String.format
				("整数:%d\n小数:%f\n小数:%f\n文字:%c\n文字列:%s\n"
				, a, b, c , d, e);
		System.out.println(s);
		
		String mozi = "AbCdE";
		// 小文字！
		System.out.println(mozi.toLowerCase());
		// 大文字！
		System.out.println(mozi.toUpperCase());
	}

}
