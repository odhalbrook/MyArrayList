import java.util.ArrayList;
public class ArrayListPractice
	{

		static ArrayList <Double> temp = new ArrayList <Double>();
		public static void main(String[] args)
			{
				FillArray();
				printTemps();
				convertTemps();
				removeAndHighLow();
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
						System.out.println(s + " degrees Fahrenheit");
					}
				
				for(int i = 0; i < temp.size(); i++)
					{
						if (temp.get(i) > 98.6)
							{
								System.out.println("You have a fever of " + temp.get(i));
							}
					}
				
			}
		private static void convertTemps()
			{
				for(int i = 0; i < temp.size(); i++)
					{
						temp.set(i, temp.get(i) - 32);
						temp.set(i, temp.get(i) / 2);
						System.out.println(temp.get(i) + " degrees Celcius");
					}
				
			}
		private static void removeAndHighLow()
			{
				for(int i = 0; i < temp.size(); i++)
					{
						if(temp.get(i) > 33.4)
							{
								temp.remove(i);
							}
						else
							{
							System.out.println(temp.get(i) + ", you are healthy");
							}
					}
				
				System.out.println(temp.get(0) + ", you have the lowest temprature");
				System.out.println(temp.get(temp.size() - 1) + " you almost have a fever");
				
			}

	}
