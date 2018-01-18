import java.util.ArrayList;
public class ArrayListPractice
	{

		static ArrayList <Double> temp = new ArrayList <Double>();
		public static void main(String[] args)
			{
				FillArray();
				printTemps();

			}

		private static void FillArray()
			{
				temp.add(97.9);
				temp.add(98.1);
				temp.add(98.2);
				temp.add(98.4);
				temp.add(98.6);
				temp.add(98.9);
				temp.add(99.5);
				temp.add(101.3);
				temp.add(103.1);
				temp.add(104.5);
			}

		private static void printTemps()
			{
				for(double s : temp)
					{
						System.out.println(s);
					}
				
				for(int i = 0; i < temp.size() + 1; i++)
					{
						
					}
				
			}

	}
