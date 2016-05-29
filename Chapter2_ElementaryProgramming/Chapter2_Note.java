//	Algorithms and Pseudocode can be very helpful in designing a program.
//	It's a good idea to outline your program (or its underlying problem) 
//	in the form of an algorithm before you begin coding.

public class Chapter2_Note {

	public static void main(String[] args) {
		/*	A variable represents a value stored in the computer’s memory. */
		int radius = 5; //declaring the radius variable
		/*	int is a data type. Each variable stores a specific type of data. */
		
		/*	Some other primitive data types are: */
		double radius1 = 1.0;
		long radius2 = 5;
		float radius3 = (float) 1.0;
		short radius4 = 5;
		byte radius5 = 5;
		boolean isRound = true;
		char letter = 'a'; //characters are enclosed in single quotes, String are
		//	enclosed by double quotes.
		
		/*	String is also a data type, but it's not a primitive date type */
		String letters = "abcd";
		
		/*	Some common mathmatical operators: */
		radius = 5 + 5; radius1 = 5.0 + 5.0;
		radius = 5 - 1; radius1 = 5.0 - 1.0;
		radius = 5 * 1; radius1 = 5.0 * 1.0;
		radius = 5 / 5; radius1 = 5.0 / 5.0; //	int division returns a truncated int
		radius = 5 % 3; radius1 = 5.0 % 3.0; // remainder operator
		radius = -5;    radius1 = -5.0; // unary negation operator
		
		/*	Java does not have a built-in exponentiation operator. Instead, use */
		radius1 = Math.pow(2 , 3); 
		//Math is in java.lang package which is implicitly imported
		
		letters = letters + letters;//	+ here performs concatenation
		/*	A string cannot cross lines in the source code. If there is a long
		 * 	string, break it into smaller ones and concatenate them.
		 */
		
		/*	Basic input from console 
		 * 	Java by itself does not have the tools for basic input.
		 * 	We use the Scanner class to read input from console. 
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		//if we imported java.util.*, we can just use Scanner class.
		
		/*	The syntax new Scanner(System.in) creates an object of the Scanner
		 *  type. The syntax Scanner input declares that input is a variable 
		 *  whose type is Scanner. 
		 *  The whole line Scanner  input  =  new  Scanner(System.in) creates a 
		 *  Scanner object and assigns its reference to the variable input.
		 *  For now we use System.in to read from the default input (console).
		 *  
		 *  The Scanner class provides methods that read different data types.
		 *  Some are:
		 */
		
		radius = input.nextInt();
		radius1 = input.nextDouble();
		letters = input.nextLine();
		letters = input.next();
		isRound = input.hasNext();
		input.close();
		
		/* When asking user for input, always prompt the user */
		
		/*	Identifiers are the names that identify the elements such as classes,
		 *  methods, and variables in a program.
		 *  
		 *  An identifier is a sequence of characters that consists of letters,
		 *  digits, underscores(_), and dollar signs ($). However it cannot
		 *  start with a digit. And do not name identifiers with the $ character.
		 *  By convention, the $ character should be used only in mechanically
		 *  generated source code.
		 *  
		 *  An identifier cannot be a Java reserved word. (like public, double)
		 *  
		 *  An identifier can be of any length.
		 *  
		 *  Since Java is case-sensitive, area, Area, and AREA are all different.
		 * 
		 *  Avoid using abbreviations for identifiers. Using complete words
		 *  is more descriptive. 
		 *  
		 *  A variable must be declared before it can be assigned a value. 
		 *  A variable declared in a method must be assigned a value before
		 *  it can be used.
		 */
		
		/*	You can assign a value to it by using an assignment statement. In 
		 * 	Java, the equal sign (=) is used as the assignment operator.
		 */
		radius = 5 * (3 / 2);
		
		/*	You can use a variable in an expression. A variable can also be used
		 *  in both sides of the = operator. */
		radius = radius + 1;// the value of radius + 1 is assigned back to radius
		
		/*	In Java, an assignment statement is essentially an expression that 
		 * 	evaluates to the value to be assigned to the variable on the left 
		 * 	side of the assignment operator. For this reason, an assignment 
		 * 	statement is also known as an assignment expression. 
		 * 	For example, the following statement is correct: */
		int x;
		System.out.println(x = 1);
		/* this is equivalent to */
		x = 1;
		System.out.println(x);
		
		/*	If a value is assigned to multiple variables, you can use this syntax:
		 * 	i = j = k = 1;
		 * 	which is equivalent to: 
		 * 	k = 1;
		 * 	j = k;
		 * 	i = j; 
		 */
		
		/* Constants can be considered as special variables that cannot change: */
		final double PI = 3.14159;
		/* 	A constant must be declared and initialized in the same statement.
		 * 	The word final is a Java keyword for declaring a constant. 
		 * 	There are three benefits of using constants:
		 *	(1) you don’t have to repeatedly type the same value if it is used
		 *	multiple times.
		 *	(2) if you have to change the constant value, you need to change it 
		 *	only in a single location in the source code.
		 *	(3) a descriptive name for a constant makes the program easy to read 
		 */
		
		/*	Naming Conventions
		 * 	
		 * 	method and variable: Use lowercase. If a name consists of several 
		 * 	words, concatenate them into one, making the first word lowercase 
		 * 	and capitalizing the first letter of each subsequent word.
		 * 
		 * 	classes: Capitalize the first letter of each word, concatenated.
		 * 	(also known as Camel case)
		 * 
		 * 	constants: Capitalize every letter in a constant, and use underscores 
		 * 	between words
		 * 
		 * 	Do not choose class names that are already used in the Java library.
		 *  For example, since the System class is defined in Java, you should not 
		 *  name your class System.
		 */
		
		/* 	Integer literals
		 * 	An integer literal is assumed to be of the int type.
		 * 	To denote an integer literal of the long type, append the letter 
		 * 	L or l to it.
		 * 
		 * 	By default, an integer literal is a decimal integer number. 
		 * 	To denote a binary integer literal, use a leading 0b or 0B, 
		 * 	to denote an octal integer literal, use a leading 0, 
		 * 	and to denote a hexadecimal integer literal, use a leading 0x or 0X
		 * 
		 * 	Floating-point literals
		 * 	By default, a floating-point literal is treated as a double type.
		 * 	You can make a number a float by appending the letter f or F.
		 * 	The double type values are more accurate than the float type values.
		 * 
		 * 	To improve readability, Java allows you to use underscores between 
		 * 	two digits in a number literal. However, 45_ or _45 is incorrect. 
		 * 	The underscore must be placed between two digits.
		 */ 
		
		/*	Augmented assignment operators */
		radius += 1; //radius = radius + 1;
		radius -= 1;
		radius *= 1;
		radius /= 1;
		radius %= 1;
		/*	The augmented assignment operator is performed last after 
		 *	all the other operators in the expression are evaluated.
		 * 	There are no spaces in the augmented assignment operators. 
		 * 	Like the assignment operator, the operators (+=, -=, *=, /=, %=) 
		 * 	can be used to form an assignment statement as well as an expression.
		 */
		
		/* Increment and Decrement Operators (by 1)*/
		radius++; //radius += 1;
		radius--;
		
		++radius;
		--radius;
		/* 	Both postfix or prefix increment are valid, but they have different
		 * 	order of precedence. When prefix is used, the increment is carried 
		 * 	out first, then the new value is returned. When postfix is used,
		 * 	the original value is returned first, then increment.
		 * 	For this reason, avoid using these operators in expressions that 
		 * 	modify multiple variables or the same variable multiple times.
		 * 	Keep them simple.
		 */
		
		/* 	Type casting 
		 * 	Casting is an operation that converts a value of one data type 
		 * 	into a value of another data type.
		 * 	Casting does not change the variable being cast, just returns value.
		 * 	Java will automatically widen a type, but you must narrow a type 
		 * 	explicitly, like casting double to an int.
		 */
		radius1 = 5; radius = (int)5.0; 
		
		//In Java, an augmented expression of the form x1  op=  x2 is 
		//implemented as x1  = (T)(x1 op x2), where T is the type for x1.
		radius += 5.0;// is thus valid.
	}
}
