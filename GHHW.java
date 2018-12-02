import java.util.ArrayList;

public class GHHW{

     public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		int num = (int) (Math.random()*9998)+1;

		list = convertArrayList(num);
		System.out.println(list);
     }

     public static ArrayList<Integer> convertArrayList(int num){
		ArrayList<Integer> list = new ArrayList<>();
		int number = 0;

		while(num > 0){
			number = num % 10;
			list.add(number);
			num = num / 10;
		}

		return list;
	}
}
