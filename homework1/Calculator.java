import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int option = 0;
        while(option != 5)
        {
            System.out.println("\n1.Adunare\n2.Scadere\n3.Inmultire\n4.Impartire\n5.Oprire calculator\n");
            System.out.println("Alegeti o optiune : ");
            Scanner scanner = new Scanner(System.in);

            option = scanner.nextInt();

            switch(option)
            {
                case 1:{System.out.println("Introduceti 2 numere : ");
                    float a = scanner.nextFloat();
                    float b = scanner.nextFloat();
                    System.out.println("\nSuma celor 2 numere este "+(a+b));
                    break;
                }
                case 2:{System.out.println("Introduceti 2 numere : ");
                    float a = scanner.nextFloat();
                    float b = scanner.nextFloat();
                    System.out.println("\nDiferenta celor 2 numere este "+(a-b));
                    break;
                }
                case 3:{System.out.println("Introduceti 2 numere : ");
                    float a = scanner.nextFloat();
                    float b = scanner.nextFloat();
                    System.out.println("\nProdusul celor 2 numere este "+(a*b));
                    break;
                }
                case 4:{System.out.println("Introduceti 2 numere : ");
                    float a = scanner.nextFloat();
                    float b = scanner.nextFloat();
                    if(b != 0)
                        System.out.println("\nCatul celor 2 numere este "+(a/b));
                    else
                        System.out.println("\nNu exista impartire la 0, reincercati.");
                    break;
                }
                case 5:System.out.println("\nCalculator oprit.");
                    break;
                default: System.out.println("\nOptiunea introdusa nu exista, reincercati");
                    break;
            }
        }

    }
}