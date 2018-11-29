package calculator;

public class Calculator {

	public static void main(String[] args) {
		
		input(2,4,8,16);

	}
	
	public static String input(int num1, int num2, int num3) {
		int[] array3= {num1,num2,num3};
		return inputNumbers(array3);
	}
	
	public static String input(int num1, int num2, int num3,int num4) {
		int[] array4= {num1,num2,num3,num4};
		return inputNumbers(array4);
	}
	
	public static String inputNumbers(int[] array) {
		
		int length=array.length;
		String Output = "";
		
		for(int i=0; i<length; i++) {
			
			if(array[0]+array[1]==array[2]) 
			{
				Output=Output+(array[0]+"+"+array[1]+"="+array[2]+" ");
			}
			if(array[0]-array[1]==array[2]) 
			{
				Output=Output+(array[0]+"-"+array[1]+"="+array[2]+" ");
			}
			if(array[0]*array[1]==array[2]) 
			{
				Output=Output+(array[0]+"*"+array[1]+"="+array[2]+" ");
			}
			if(array[0]/array[1]==array[2]) 
			{
				Output=Output+(array[0]+"/"+array[1]+"="+array[2]+" ");
			}
			if(array[2]+array[1]==array[0]) 
			{
				Output=Output+(array[2]+"+"+array[1]+"="+array[0]+" ");
			}
			if(array[2]-array[1]==array[0]) 
			{
				Output=Output+(array[2]+"-"+array[1]+"="+array[0]+" ");
			}
			if(array[2]*array[1]==array[0]) 
			{
				Output=Output+(array[2]+"*"+array[1]+"="+array[0]+" ");
			}
			if(array[2]/array[1]==array[0]) 
			{
				Output=Output+(array[2]+"/"+array[1]+"="+array[0]+" ");
			}
			
			if(array.length==3) {
			int placeholder=array[2];
			array[2]=array[1];
			array[1]=array[0];
			array[0]=placeholder;
			}
			
			if(array.length==4) {
			int placeholder=array[3];
			array[3]=array[2];
			array[2]=array[1];
			array[1]=array[0];
			array[0]=placeholder;
			}
			
		}
		
		System.out.println(Output);
		return Output;
		
	}

}
