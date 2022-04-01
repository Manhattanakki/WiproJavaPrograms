import java.util.Scanner;

class Anagram
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String str1= sc.nextLine();
        if(str==str1)
        {
            System.out.println("Given phrases are anagrams");
        }
        else
        {
            System.out.println("Given phrases are not anagrams");
        }

    }
}