
public class Loooooops {
	public static void main(String[] args) {
		//Complete the exercises.
		
		//1. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 1 (inclusive).
		/*
		int x = 5;
        while (x > 0)
        {
            System.out.println(x);
            x = x - 1;
        }
        */
        for (int i = 5; i > 0; i--) {
        		System.out.print(i + " ");
        }
		System.out.println();
        
//      2. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 1 to 10 (inclusive).
//      for (int x = 1; x <= 10; x++){
//        System.out.println(x);
//      }
        int x = 1; 
        while (x <= 10) {
        		System.out.print(x + " ");
        		x++; 
        }
		System.out.println();
        
//      3. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 15 (inclusive).
//      int x = 5;
//      while (x <= 15)
//      {
//          System.out.println(x);
//          x = x + 1;
//      }
        for (int i = 5; i <= 15; i++) {
    			System.out.print(i + " ");
        }
		System.out.println();
        
//      4. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 10 to 100 by 10’s (inclusive).
//      for (int x = 10; x <= 100; x=x+10){
//       System.out.println(x);
//      }
        int a = 10; 
        while (a <= 100) {
        		System.out.print(a + " ");
        		a += 10; 
        }
		System.out.println();
		
//      5. The following code should print the values from 1 to 10 (inclusive) but has errors. 
//         Fix the errors so that the code works as intended. 
        int b = 1;
        while (b <= 10)
        {
            System.out.print(b + " ");
            b++;
        }
		System.out.println();
        
//      6. The following code should print the values from 10 to 5, but it has errors. Fix the errors so that the code works as intended.
        for (int c = 10; c >= 5; c--)
        {
           System.out.print(c + " ");
        }
		System.out.println();
        
//      7. The following code should print the values from 10 to 1, but it has errors. Fix the errors so that the code works as intended.
        int d = 10;
        while (d > 0)
        {
        		System.out.print(d + " ");   
        		d--;
        }
		System.out.println();
        
      //8. Write code to print a countdown from 100 to 0 by 10’s.
        int e = 100; 
        while (e >= 10) {
        		System.out.print(e + " ");
        		e -= 10; 
        }
		System.out.println();
		
		wordIterate("bacon"); 
       
		xevenxodd(5);
        
		xTimes10(4);
		
		System.out.println(removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX"));
        
		
        
        //13. Finish the superDecrement method so that it prints x to zero x number of times.
        //    example: superDecrement(6);
        //    666666 55555 4444 333 22 1
        
        //14. Finish the starBox method so it prints a box of *'s the size of the specified dimensions
        //    example: starBox(3, 5);
        //    ***
        //    ***
        //    ***
        //    ***
        //    ***
        
        //15. Finish the count vowels method so it returns the number of vowels in a String
        //    example: int v = countVowels("Climbing Mount Everest");
        //    System.out.println(v);
        //    7
	}
	
    //9. Finish the wordIterate method so that it prints the String parameter minus 
    //   the last character each time through the loop until there are no more characters in the string.
    //   example: wordIterate("bacon");
    //   bacon
    //   baco
    //   bac
    //   ba
    //   b 
	public static void wordIterate(String word){
		if (word.length() == 0)  {
			System.out.print(""); 
		} else {
			System.out.println(word);
			wordIterate(word.substring(0, word.length()-1));
		}
	}

    //10. Finish the xevenxodd method so that it prints all numbers from x to 0 and also prints 'even' or 'odd' next to the appropriate numner
    //    example: xevenxodd(5);
    //    5 odd
    //    4 even
    //    3 odd
    //    2 even
    //    1 odd
    //    0
    //    assume x > 0 and 0 is neither even or odd
	public static void xevenxodd(int x){
		for (int i = x; i > 0; i--) {
			System.out.print(i); 
			if (i % 2 == 0) {
				System.out.print(" even\n"); 
			} else {
				System.out.print(" odd\n"); 
			}
		}
		System.out.print(0 + "\n");	
	}
	
    //11. Finish the xTimes10 method so that it prints x * 10 from 0 to x.
    //    example: xTimes10(4);
    //    0
    //    10
    //    20
    //    30
    //    40
    //    assume x > 0
	public static void xTimes10(int x){
		for(int i = 0; i <= x; i++) {
			System.out.print(i*10 + " ");
		}
		System.out.println();
	}
	
    //12. Finish the removeXs method so that it removes all x's from strings.
    //    example: String s = removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX");
    //    System.out.println(s);
    //    stuff
	public static String removeXs(String wrd){
		String newWrd = ""; 
		for(int i = 0; i < wrd.length(); i++) {
			if (wrd.charAt(i) != 'x' && wrd.charAt(i) != 'X') {
				newWrd += wrd.charAt(i);
			}
		}
		return newWrd;
	}
	
	public static void superDecrement(int x){
		
	}
	
	public static void starBox(int w, int h){
		
	}
}
