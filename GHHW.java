import java.util.ArrayList;

public class GHHW{

     public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		int num = 8950;//(int) (Math.random()*9998)+1;

		list = convertArrayList(num);
		System.out.println(list);

		System.out.println(reconstructArrayList(list));
     }

     public static ArrayList<Integer> convertArrayList(int num){
		ArrayList<Integer> list = new ArrayList<>();
		int num1 = num;
		int number = 0;
		int temp = 0;

		while(num > 0){
			number = num % 10;
			list.add(number);
			num = num / 10;
		}

		temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		if(num1 > 1000){
			temp = list.get(1);
			list.set(1, list.get(list.size() - 2));
			list.set(list.size() - 2, temp);
		}


		return list;
	}

	public static int reconstructArrayList(ArrayList<Integer> list){
		int num = 0;
		num = list.get(0) * 1000;
		num += list.get(1) * 100;
		num += list.get(2) * 10;
		num += list.get(3);

		return num;
	}
}
