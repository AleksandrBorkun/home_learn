
public class Demo {

	public static void main(String [] args){
	
	int num1 = 10;
	double numb2  = 1.5;
	char ch = 'a';	
	String letter = "Hello World" + "!!!";
	//String letter  = new String("Hello world");
	
	for(int i = 0; i<10 ; i++){
		
		if(i%2 == 0){
		System.out.println(i);
		}
	
	}
	
	do{
		System.out.println(letter);
		System.out.println("befor ++ " + num1);
		num1++;
		System.out.println("after ++ " + num1);
	}
	while(num1 < 12);
	
	
	}

	
}

