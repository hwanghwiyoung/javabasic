package ch05;

public class Verify {

	public static void main(String[] args) {
		/*
		 * quiz01
		 * �ִ밪 ���ϱ�
		 */
		int max = 0;
		int[] array1 = {1,5,3,9,2};
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.println("�ִ밪 : "+ max);
	}

}
