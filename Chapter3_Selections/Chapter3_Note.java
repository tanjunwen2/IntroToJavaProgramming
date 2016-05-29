
public class Chapter3_Note {

	public static void main(String[] args) {

		/* 	Selection statements: statements that let you choose 
		 * 	actions with alternative courses, based on some conditions.
		 * 	Selection statements use conditions that are Boolean expressions.
		 * 	A Boolean expression is an expression that evaluates to a 
		 * 	Boolean value: true or false, and it involves relational operators */

		/* 	Relational operators */
		System.out.println(5 > 6);
		System.out.println(5 >= 6);
		System.out.println(5 < 6);
		System.out.println(5 <= 6);
		System.out.println(5 == 6); //double equal sign is the equivalence operator
		//single equal sign is the assignment operator
		System.out.println(5 != 6);
		//all of these are expressions, and they evaluate to true or false.


		/* If statements are the most common form of selection/branching construct */
		if (5 > 6) {
			System.out.println("Statements in this block will not execute.");
		} else {
			System.out.println("Statements in this block will execute.");
		}

		/* 	You can have 0 or 1 else block in an if statement. 
		 * 	You can include any statements in an if block, including another 
		 *  if statement. When an if statement is within another if block, 
		 *  they are called nested */
		if (5 > 4) {
			if (4 > 3) {
				System.out.println("Statements in this block will execute.");
			}
			System.out.println("Statements in this block will also execute.");
		}
		/* 	You can include if statements(with or without else) in else block 
		 * 	as well */
		if (100 > 90) {
			System.out.print("A");
		} else if (100 > 80) {
			System.out.print("B");
		} else if (100 > 70) {
			System.out.print("C");
		} else {
			System.out.print("F");
		}
		/* 	Note that when the else block only contains an if statement, the usual
		 * 	braces are omitted. It's preferred since it use less space and 
		 * 	it is easier to read.
		 */

		/* 	Common Error: Equality Test of Two Floating-Point Values 
		 * 	Even if you expect them to be equal, they are not always equal
		 * 	because of floating-point arithmetic */

		/* 	For all programs, you should write a small amount of code and test 
		 * 	it before moving on to add more code. This is called incremental 
		 * 	development and testing. This approach makes testing easier, because 
		 * 	the errors are likely in the new code you just added. */

		/* 	Logical operators used to compound boolean expressions */
		System.out.println(true && true);// and
		System.out.println(true || true);// or
		System.out.println(true ^ true);// exclusive or (or, but not both)
		System.out.println(!true);// logical negation

		/* 	&& and || are known as the short-circuit or lazy operators, because
		 * 	if evaluating the first expression guarantees the truth value, Java
		 * 	will return true or false. If not, it will evaluate the second 
		 * 	expression and return it. */
		System.out.println("true || !true returns: " + (true || !true));
		/* Java also provides the unconditional AND (&) and OR (|) operators (bitwise)*/
		System.out.println(10 & 9);

		/* 	Switch statements
		 * 	It is another branching statement, however the branch to execute is
		 * 	not determined by a boolean expression, rather it is controlled by
		 * 	the value or a variable or expression (String, char, int).
		 * 	Often used in non-binary situations, or situations where
		 * 	a number of cases are possible. */
		int status = 0;
		switch (status) {
		case 0:  System.out.println("do task 0");
		break;
		case 1:  System.out.println("do task 1");
		break;
		case 2:  System.out.println("do task 2");
		break;
		case 3:  System.out.println("do task 3");
		break;
		default: System.out.println("Error: invalid status"); //optional
		}
		
		/* 	When the value in a case statement matches the value of the 
		 * 	switch-expression, the statements starting from this case are 
		 * 	executed until either a break statement or the end of the switch 
		 * 	statement is reached. If there are no break statements in the 
		 * 	cases, statements starting from the matched case all th way 
		 * 	through the final case will be executed (fall-through behavior). */
		
		/* 	Conditional Expressions 
		 * 	They evaluate an expression if a condition is true */
		int x;
		if (status > 0) {
			x = 1;
		} else {
			x = -1;
		}
		// is equivalent to
		x = (status > 0) ? 1 : -1;// conditional expression
		/* 	The ? : is the conditional operator and it is a ternary operator
		 * 	It is the only ternary operator in Java */
		
		/* Operator order of precedence */
		System.out.println("Operator precedence");
		System.out.println("status++");
		System.out.println("-status, ++status");
		System.out.println("(double)status");
		System.out.println("!isRound");
		System.out.println("* , / , %");
		System.out.println("+ , -");
		System.out.println("< , >");
		System.out.println(" == , != ");
		System.out.println("^");// exclusive or
		System.out.println("&&");
		System.out.println("||");
		System.out.println("assignment operators");
	}

}
