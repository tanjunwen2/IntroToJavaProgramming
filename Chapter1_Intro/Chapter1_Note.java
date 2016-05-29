/*  What is programming/computer science?
 * 
 * 	Programming is about providing instructions to a computer in order
 * 	to perform a task or solve a problem. Programs are developed using 
 * 	programming languages such as Java.
 */

/* 	Computers
 * 
 * 	Computers are electronic devices that store and process data. Each
 * 	has these following components: CPU, memory, storage device, input/output
 * 	device, communication(internet) device. The components are connected by 
 * 	the bus. The bus is like a system of roads among the components; data and
 * 	power is transmitted along the bus.
 */

/* 	CPU clock speed
 * 
 * 	Every computer has an internal clock, which emits electronic pulses
 * 	at a constant rate. These pulses are used to control and synchronize the 
 * 	pace of operations. A higher clock speed enables more instructions to be 
 * 	executed in a given period of time.
 */

/*
 * 	bits = binary digits 
 * 	byte = 8 bits (basic unit of storage)
 * 
 * 	data of various kinds are stored in bytes using encoding schemes
 * 	that determine how they are represented in bytes.
 */

// The following section is a simple Java program that displays a message.
public class Chapter1_Note {	// defines a class
	// Every program must have at least 1 class.
	// By convention, class names start with an uppercase letter.

	public static void main(String[] args) { // defines a method
		/* A class may contain several methods. However, The program is 
		 executed from the main method. If a class does not have a main
		 method, it will cause an error. */

		// Display message Welcome to Java! on the console
		System.out.println("Welcome to Java!");
		// ; is the statement terminator; every statement ends in ;		
	} // braces enclose a block of statements.
}

// Java programs are case-sensitive; main and Main are two different identifiers.

/*	Creating, compiling, and executing Java programs
 * 
 * 	Any text editor can be used to create the source file. Source files for Java
 *	must end in .java extension. Each source file must contain a public class, and
 * 	the name of the public class and the file name must be the same.
 * 
 * 	A Java compiler translates a Java source file into a Java bytecode file.
 *  The following command compiles Chapter1Note.java:
 * 	javac Chapter1Note.java
 * 	If compilation is successful, a .class bytecode file will be created. The
 * 	bytecode is a low-level language close to machine language but is architecture 
 * 	neutral and can run on any platform that has a Java Virtual Machine (JVM).
 * 	This is a main advantage for Java since its bytecode can be run on any system
 * 	that has a JVM.
 * 
 * 	The JVM is an interpreter for the bytecode. It executes your code along with
 * 	codes in the library; it performs the "linking" operation.
 * 	The following command runs the bytecode in Chapter1Note.class
 * 	java Chapter1Note
 * 	Do not use the .class extension when executing. JVM executes the main method
 * 	in the class passed in as argument. If no class is found, a error will occur.
 */

/*	Programming Style and Documentation
 * 	
 * 	Programms should be written so that they are easy to read. Documentation is 
 * 	the body of explanatory remarks and comments pertaining to a program.
 * 
 * 	Include a summary at the beginning of the program that explains what the 
 * 	program does, its key features, and any unique techniques it uses. In a long
 * 	program, you should also include comments that introduce each major step and
 * 	explain anything that is difficult to read. It is important to make comments
 * 	concise so that they do not crowd the program or make it difficult to read.
 * 
 * 	Javadoc comments with /** instead of /* can be used to comment on an entire
 * 	class or an entire method. These comments must precede the class or the 
 *  method header.
 *  
 *  Indentation is used to illustrate the structural relationships between a 
 *  program’s components or statements. Indent each subcomponent or statement 
 *  at least two spaces more than the construct within which it is nested.
 *  
 *  A single space should be added on both sides of a binary operator,
 *  such as (1 + 2) * 3 == 1;
 *  
 *  Block styles should be consistent. 
 *  public class A {
 *  }
 *  or
 *  public class B
 *  {
 *  }
 *  are both acceptable styles. Java API source code uses the end-of-line style.
 */
