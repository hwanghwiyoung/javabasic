package ch10.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 변수선언
		String str = "";
		String str1 = "";
		String str2 = "";
		boolean result;
				
				
		// startWith: 문자열이 지정한 문자로 시작하는지 판단, 같으면 true를 반환 아니면 false를 반환한다.(대소문자구별)
		str = "apple";
		result = str.startsWith("a");
		System.out.println("startsWith: " + result);

		// endWith:문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
		str = "test";
		result = str.endsWith("t");
		System.out.println("endsWith: " + result);

		// equals:두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소문자구별)
		str1 = "java";
		str2 = "java";
		result = str1.equals(str2);
		System.out.println("equals: " + result);

		// indexOf:지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
		str = "abcdef";
		int indexOf = str.indexOf("b");
		System.out.println("indexOf: " + indexOf);

		// lastindexOf:문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
		str = "AdnroidApp";
		int lastIndexOf = str.lastIndexOf("r");
		System.out.println("lastIndexOf:" + lastIndexOf);

		// length:문자열의 길이를 반환한다.
		str = "abcdef";
		int length = str.length();
		System.out.println("length: " + length);

		// replace:문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
		str = "A*B*C*D";
		String replace = str.replace('*', '_');
		System.out.println("replace: " + replace);

		// replaceAll:정규표현식을 지정한 문자로 바꿔서 출력한다.
		str = "AB CD";
		String replaceAll = str.replaceAll("\\p{Space}", "*");
		System.out.println("replaceAll: " + replaceAll);

		// split:지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
		str = "A:B:C:D:abcd";
		String[] split = str.split(":");
		System.out.println("split: " + split[1]);

		// substring:문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
		str = "ABCDEF";
		String substring = str.substring(0, 2);
		System.out.println("substring: " + substring);

		// toLowerCase: 문자열에 대문자를 소문자로 변환한다.
		str = "abcDEF";
		String toLowerCase = str.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);

		// toUpperCase:문자열에 소문자를 대문자로 변환한다.
		str = "abcDEF";
		String toUppercase = str.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);

		// toString:문자열을 그대로 반환해준다.
		str = "1234";
		String toString = str.toString();
		System.out.println("toString: " + toString);

		// trim:문자열에 공백을 없에준다.
		String s = "     java java java     ";
		String v;
		v = s.trim();
		System.out.println("trim:" + v);

		// valueOf:지정한 개체의 원시 값을 반환
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));

		// compareTo:두개의 String를 앞에서부터 순사적으로 비교하다가 틀린부분이 있으면 비교하는 String에 캐릭터값을 반환한다.(대소문자를 구별)
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

		// contains:두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
		str1 = "abcd";
		str2 = "c";
		boolean contains = str1.contains(str2);
		System.out.println("contains: " + contains);

		// charAt:지정한 index번째에 문자를 반환한다.
		str = "charAt";
		char charAt = str.charAt(2);
		System.out.println("charAt: " + charAt);

		// concat:문자와 문자를 결합해준다.
		str1 = "Han";
		str2 = "SeeJin";
		String concat = str1.concat(str2);
		System.out.println("concat: " + concat);

		// format:서식문자열을 이용해서 서식화된 문자열을 반환한다.
		i = 123456789;
		str = String.format("%,d", i);
		System.out.println("format: " + str);

		// matches:지정한 정규 표현과 일치 할때 true를 반환한다.
		i = 123456;
		str1 = String.format("%,d", i);
		str2 = "123456";
		boolean matches = str1.matches(str2);
		System.out.println("matches: " + matches);

		// replaceFirst:문자열에 지정한 문자" "가 있으면 첫번째만 새로지정한 문자" "로 바꿔서 출력한다.
		str = "Aman";
		String replaceFirst = str.replaceFirst("A", "super");
		System.out.println("replaceFirst: " + replaceFirst);
	}

}
