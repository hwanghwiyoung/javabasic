package ch05;

public class Ex04 {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] students = {{95, 80},
							{92, 96, 80}};
		//System.out.println(students.length);
		//값출력
		for (int i = 0; i < students.length; i++) {
		
			for (int j = 0; j < students[i].length; j++) {
				System.out.println(students[i][j]);
				
			}
		}
		}

	}


