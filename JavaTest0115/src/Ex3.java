
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("나의 선택은?(1. 가위 2. 바위 3. 보)");
		Scanner sc=new Scanner(System.in);
		int myNum=sc.nextInt();
		int comNum=(          (int)Math.random()*3+1           );
		String dice[]= {"가위","바위","보"};
		System.out.println("나의 선택 = " + dice[myNum-1]);
		System.out.println(              "컴퓨터 선택 = " + dice[comNum-1]              );
		if(                          (myNum==1&&comNum==2) ||(myNum==2&&comNum==1) || (myNum==3&&comNum==0)                               ) {
			System.out.println("결과 => 축하합니다. 당신이 이겼습니다. ");
		} else if(          (myNum==1&&comNum==1) ||(myNum==2&&comNum==2) || (myNum==3&&comNum==3)           ) {
			System.out.println("결과 => 컴퓨터와 비겼습니다. ");
		} else {
			System.out.println("결과 => 컴퓨터에 졌습니다. 다시 도전하세요 ");
		}
	}
	

}
