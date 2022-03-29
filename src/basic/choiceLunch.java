package basic;

public class choiceLunch {
	public void whatLunchEat() {
	int lunch = (int)(Math.random()*6)+1;
	
	switch(lunch) {
	case 1 :
		System.out.println("김밥");
		break;
	case 2 :
		System.out.println("돈까스");
		break; 
	case 3 : 
		System.out.println("라면");
		break;
	case 4:
		System.out.println("제육볶음");
		break;
	case 5:
		System.out.println("햄버거");
		break;
	case 6:
		System.out.println("토스트");
		break;
		} 
	}
}
