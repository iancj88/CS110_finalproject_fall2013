import java.util.Random;
public class ListTester
{

	public static void main(String [] args)
	{
	   long time1,time2;
      ListInterface list1 = new ListReferenceBased();
  System.out.println("LISTTESTER List Created" + "\n");
      list1.add(1, new Integer(5));
  System.out.println("LISTTESTER added1 (1,5)" + "\n");
      list1.add(1, new Integer(7));
  System.out.println("LISTTESTER added2 (1,7)" + "\n");
//      list1.add(3, new Integer(2));
//  System.out.println("LISTTESTER added3 (3,2)" + "\n");
//     list1.add(2, new Integer(9));
//  System.out.println("LISTTESTER added4 (2,9)" + "\n");
	  displayList(list1);
//debugging:
//System.out.println("Size: " + list1.size());
      
      


	}
   // Traverse list displaying data in teach item
	public static void displayList(ListInterface list)
	{
		for (int i = 1; i<=list.size();i++)
			System.out.println(list.get(i));

	}
}