
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("���� ������?(1. ���� 2. ���� 3. ��)");
		Scanner sc=new Scanner(System.in);
		int myNum=sc.nextInt();
		int comNum=(          (int)Math.random()*3+1           );
		String dice[]= {"����","����","��"};
		System.out.println("���� ���� = " + dice[myNum-1]);
		System.out.println(              "��ǻ�� ���� = " + dice[comNum-1]              );
		if(                          (myNum==1&&comNum==2) ||(myNum==2&&comNum==1) || (myNum==3&&comNum==0)                               ) {
			System.out.println("��� => �����մϴ�. ����� �̰���ϴ�. ");
		} else if(          (myNum==1&&comNum==1) ||(myNum==2&&comNum==2) || (myNum==3&&comNum==3)           ) {
			System.out.println("��� => ��ǻ�Ϳ� �����ϴ�. ");
		} else {
			System.out.println("��� => ��ǻ�Ϳ� �����ϴ�. �ٽ� �����ϼ��� ");
		}
	}
	

}
