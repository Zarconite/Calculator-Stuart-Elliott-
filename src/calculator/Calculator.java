package calculator;

public class Calculator {

	public static void main(String[] args) {
		
		inputNumbers(5,3,15);

	}
	
	public static String inputNumbers(int num1, int num2, int num3) {
		
		int[] array= {num1,num2,num3};
		int length=array.length;
		String Output = "";
		
		for(int i=0; i<(length); i++) {
			
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
			
			int placeholder=array[2];
			array[2]=array[1];
			array[1]=array[0];
			array[0]=placeholder;
			
		}
		
		System.out.println(Output);
		return Output;
		
	}

}
