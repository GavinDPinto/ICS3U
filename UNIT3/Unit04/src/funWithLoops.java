
public class funWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loop Fun");
		//loop types = while, for, do while
		
		int cnt = 0;
		while (cnt<5) {
			cnt++;
			System.out.println(cnt);
		}
		System.out.println();
		while (cnt>0) {
			System.out.println(cnt);
			cnt--;
		}
		System.out.println();
		do {
			cnt++;
			System.out.println(cnt);
		}while (cnt<5);
		System.out.println();
		do {
			System.out.println(cnt);
			cnt--;
		}while (cnt>0);
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.println(i+1);
		}
		System.out.println();
		int cnt1 = 5;
		while (cnt1 <= 40) {
			System.out.println(cnt1);
			cnt1+=5;
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 3; i <= 30; i+=3) {
			System.out.println();
		}
		System.out.println();
		for (int i = 4; i <= 104; i+=10) {
			System.out.println(i);
		}
		System.out.println();
		cnt1 = 4;
		while (cnt1<=104) {
			System.out.print(cnt1 + " ");
			cnt1+=10;
		}
		int last = 0;
		for (int i = 1; i <= 6; i++) {
			last += i;
			System.out.println(last);
		}
	}

}
