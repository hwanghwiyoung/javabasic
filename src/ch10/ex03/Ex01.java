package ch10.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// ��������
		String str = "";
		String str1 = "";
		String str2 = "";
		boolean result;
				
				
		// startWith: ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ�, ������ true�� ��ȯ �ƴϸ� false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		str = "apple";
		result = str.startsWith("a");
		System.out.println("startsWith: " + result);

		// endWith:���ڿ� �������� ������ ���ڰ� �ִ����� �Ǵ��� ������ true, ������ false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		str = "test";
		result = str.endsWith("t");
		System.out.println("endsWith: " + result);

		// equals:�ΰ��� String�� ������ ���ؼ� ������ true, �ٸ��� false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		str1 = "java";
		str2 = "java";
		result = str1.equals(str2);
		System.out.println("equals: " + result);

		// indexOf:������ ���ڰ� ���ڿ��� ���°�� �ִ����� ��ȯ�Ѵ�.
		str = "abcdef";
		int indexOf = str.indexOf("b");
		System.out.println("indexOf: " + indexOf);

		// lastindexOf:���ڿ��� ������ ���ڰ� ���������°�� �ִ� int�� ��ȯ�Ѵ�.
		str = "AdnroidApp";
		int lastIndexOf = str.lastIndexOf("r");
		System.out.println("lastIndexOf:" + lastIndexOf);

		// length:���ڿ��� ���̸� ��ȯ�Ѵ�.
		str = "abcdef";
		int length = str.length();
		System.out.println("length: " + length);

		// replace:���ڿ��� ������ ����" "�� ������ ���� ������ ����" "�� �ٲ㼭 ����Ѵ�.
		str = "A*B*C*D";
		String replace = str.replace('*', '_');
		System.out.println("replace: " + replace);

		// replaceAll:����ǥ������ ������ ���ڷ� �ٲ㼭 ����Ѵ�.
		str = "AB CD";
		String replaceAll = str.replaceAll("\\p{Space}", "*");
		System.out.println("replaceAll: " + replaceAll);

		// split:������ ���ڷ� ���ڿ��� ������ �ִ�.(�迭�� ��ȯ)
		str = "A:B:C:D:abcd";
		String[] split = str.split(":");
		System.out.println("split: " + split[1]);

		// substring:���ڿ��� ������ ������ ���ϴ� ���ڿ��� ��ȯ�Ѵ�.(���۹����� ���� �����ϰ�, ������ ������ ���� ���������ʴ´�.)
		str = "ABCDEF";
		String substring = str.substring(0, 2);
		System.out.println("substring: " + substring);

		// toLowerCase: ���ڿ��� �빮�ڸ� �ҹ��ڷ� ��ȯ�Ѵ�.
		str = "abcDEF";
		String toLowerCase = str.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);

		// toUpperCase:���ڿ��� �ҹ��ڸ� �빮�ڷ� ��ȯ�Ѵ�.
		str = "abcDEF";
		String toUppercase = str.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);

		// toString:���ڿ��� �״�� ��ȯ���ش�.
		str = "1234";
		String toString = str.toString();
		System.out.println("toString: " + toString);

		// trim:���ڿ��� ������ �����ش�.
		String s = "     java java java     ";
		String v;
		v = s.trim();
		System.out.println("trim:" + v);

		// valueOf:������ ��ü�� ���� ���� ��ȯ
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));

		// compareTo:�ΰ��� String�� �տ������� ���������� ���ϴٰ� Ʋ���κ��� ������ ���ϴ� String�� ĳ���Ͱ��� ��ȯ�Ѵ�.(��ҹ��ڸ� ����)
		str1 = "A";
		str2 = "B";
		int compareTo = str1.compareTo(str2);
		if(compareTo > 0){
		       System.out.println(str1 + " > " +str2);
		} else if (compareTo == 0){
		     System.out.println(str1 + " = " +str2);
		} else{
		     System.out.println(str1 + " < " +str2);
				}

		// contains:�ΰ��� String�� ���ؼ� �񱳴�� String�� �����ϰ� ������true, �ٸ��� false�� ��ȯ�Ѵ�.
		str1 = "abcd";
		str2 = "c";
		boolean contains = str1.contains(str2);
		System.out.println("contains: " + contains);

		// charAt:������ index��°�� ���ڸ� ��ȯ�Ѵ�.
		str = "charAt";
		char charAt = str.charAt(2);
		System.out.println("charAt: " + charAt);

		// concat:���ڿ� ���ڸ� �������ش�.
		str1 = "Han";
		str2 = "SeeJin";
		String concat = str1.concat(str2);
		System.out.println("concat: " + concat);

		// format:���Ĺ��ڿ��� �̿��ؼ� ����ȭ�� ���ڿ��� ��ȯ�Ѵ�.
		i = 123456789;
		str = String.format("%,d", i);
		System.out.println("format: " + str);

		// matches:������ ���� ǥ���� ��ġ �Ҷ� true�� ��ȯ�Ѵ�.
		i = 123456;
		str1 = String.format("%,d", i);
		str2 = "123456";
		boolean matches = str1.matches(str2);
		System.out.println("matches: " + matches);

		// replaceFirst:���ڿ��� ������ ����" "�� ������ ù��°�� ���������� ����" "�� �ٲ㼭 ����Ѵ�.
		str = "Aman";
		String replaceFirst = str.replaceFirst("A", "super");
		System.out.println("replaceFirst: " + replaceFirst);
	}

}
