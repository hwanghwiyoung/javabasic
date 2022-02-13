package CordingTest;

public class test1 {

	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		Solution s = new Solution();
		int answer = s.solution(numbers);
		
		System.out.println(answer);
	}
}
//없는 숫자 더하기
class Solution {
    public int solution(int[] numbers) {
    	int answer = 0;
    	boolean exist = false;
    	
    	for (int i = 0; i < 10; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(i == numbers[j]) {
					exist = true;
					break;
				}
			}
			
			
			if(exist == false) {
				answer += i;
			}
			
			exist = false;
			
		}
    	
    	return answer;
        
        }
}
