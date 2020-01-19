# Key Methods

## Scanner

### Some "Scanner" Methods

| To Read This... | ...Make This Method Call|
|:----------------|:------------------------|
|A number with no decimal point in it|nextInt()|
|A number with a decimal point in it|nextDouble()|
|A word (ending in a blank space, for example)|next()|
|A line (or what remains of a aline after you've already read some data from the line|nextLine()|
|A single character (such as a letter, digit, or punctuation character)|findWithinHorizon(".",0).charAt(0)|

### Simple Scanner as starting

A java program that displays a second line that copies whatever your typed:

```java
import java.util.Scanner;

class EchoLine {

  public static voic main(String[], args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println(keyboart.nextLine());
    keyboard.close();
    
  }
}
```
### Scanner and output in different lines

Another program to read words then line:

```java
import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(keyboard.next());
		System.out.println(keyboard.next());
		System.out.println(keyboard.nextLine());
		
		keyboard.close();

	}
	
}
```
### Further optimized of using Scanner

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EchoLine_New {

	public static void main(String[] args) throws IOException {
		System.out.println("Write down anything, I'll repeat:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		System.out.println(input);
	}

}
```
