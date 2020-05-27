//creating a chatbot to answer java questions


import java.util.Scanner;

public class Main{

public static final String METHOD = "JAVA METHOD";
public static final String INHERITANCE = "JAVA INHERITANCE";
public static final String POLYMORPHISM = "JAVA POLYMORPHISM";
static String yes = "y";

static void javaMethod(){
System.out.println("A method is a block of code which executes only when it is called.");
System.out.println("Syntax: \n to create a method: \n static void myMethod(){ \n \\\\block of code \n} \n to call a method:\n myMethod();");
}

static void javaInheritance(){
System.out.println("Inheritance means creating new class(sub class) from an existing class(super class). The subclass will have all the capabilities of the superclass and it can add features of it\'s own");
System.out.println("Syntax: \n class Subclass extends Superclass{ \n \\\\block of code \n }");
}

static void javaPolymorphism(){
System.out.println("Polymorphism means many forms and it occurs when a group of classes are related to each other by inheritance.");
System.out.println("Inheritance means inheriting attributes and methods from another class. Polymorphism takes those methods to perform different actions. Use of this is that we can perform single task in different ways.");
}

public static void main(String [] args){
System.out.println("Hii, i am your first chatbot!");
Scanner obj = new Scanner(System.in);
System.out.println("My name is: ");
String name = obj.nextLine();
System.out.println("Hi " +name+ ", how are you today? ");
String greeting = obj.nextLine();
System.out.println("Good to know that you are " +greeting);

System.out.println("Are you looking for a solution to your java problems? \n [y/n]?");
String response = obj.nextLine();

if(response.equals(Main.yes)){
System.out.println("Please choose one of the following: ");
System.out.println("1. Java Method");
System.out.println("2. Java Inheritance");
System.out.println("3. Java Polymorphism");
System.out.println("Please Explain: ");
String input = obj.nextLine();
String choice = input.toUpperCase(); //eliminates case sensitivity

if(choice.equals(Main.METHOD)){
javaMethod();
}else if(choice.equals(Main.INHERITANCE)){
javaInheritance();
}else if(choice.equals(Main.POLYMORPHISM)){
javaPolymorphism();
}else{
System.out.println("I am not fully operational. Please reach out to our online help on this email chatbot@gmail.com");
}
System.out.println("\n It was nice talking to you " +name+ "! Have a great day ahead :)");
}else{
System.out.println("No problem! I am here to solve your java related problems...if you come across one, just message me back! :)");
}
}
}
