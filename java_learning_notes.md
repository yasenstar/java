# Key Methods

## Some "Scanner" Methods

| To Read This... | ...Make This Method Call|
|:----------------|:------------------------|
|A number with no decimal point in it|nextInt()|
|A number with a decimal point in it|nextDouble()|
|A word (ending in a blank space, for example)|next()|
|A line (or what remains of a aline after you've already read some data from the line|nextLine()|
|A single character (such as a letter, digit, or punctuation character)|findWithinHorizon(".",0).charAt(0)|

A java program that displays a second line that copies whatever your typed:

```java
import java.util.Scanner;
class EchoLine {
  public static voic main(String[], args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println(keyboart.nextLine());
    keyboard.close():
  }
}
```

