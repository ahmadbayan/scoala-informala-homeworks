import java.util.Scanner;

public class NrOfDays
{
	public static void main(String[] args)
	{
		int bisect = 0;

 		Scanner scanner = new Scanner(System.in);

            	

		System.out.println("Introduceti numarul lunii din an : ");
		int m = scanner.nextInt(); //numarul lunii din an de la 1 la 12
		System.out.println("Introduceti anul : ");
		int y = scanner.nextInt(); //numarul anului, pentru a determina daca este an bisect

		//verificare daca anul este bisect
		if(y%4 == 0 && y%100 == 0)
			{
				if(y%400 == 0)
					bisect = 1;
			}
		else
		if(y%4 == 0 && y%100 != 0)
			bisect = 1;
		
		
	
		int n; //numarul de zile
		
		switch (m) 
	{
            case 1:  n = 31;
                     break;
            case 2:  {	
			if(bisect==0)
				n=28;
			else
				n=29;			
                     break;
		     }
            case 3:  n = 31;
                     break;
            case 4:  n = 30;
                     break;
            case 5:  n = 31;
                     break;
            case 6:  n = 30;
                     break;
            case 7:  n = 31;
                     break;
            case 8:  n = 31;
                     break;
            case 9:  n = 30;
                     break;
            case 10: n = 31;
                     break;
            case 11: n = 30;
                     break;
            case 12: n = 31;
                     break;
            default: n = 0;
                     break;

	}

	if(bisect == 0)
		System.out.println("Anul "+y+" nu este bisect.");
	else
		System.out.println("Anul "+y+" este bisect.");
	
	System.out.println("Luna introdusa are "+n+" de zile.");
		
	}
}
