public class ArrayDemo {
 public static void main(String[] args) {
 int[] numbers = {100,200,223,111,555};
 int sum = 0;
 // Loop (control statement)
 for (int i = 0; i < numbers.length; i++) {
 sum = sum + numbers[i]; // Arithmetic operator
 }
 System.out.println("Array Elements:");
 for (int num : numbers) {
 System.out.print(num + " ");
 }
 System.out.println("\nSum = " + sum);
 // Decision making
 if (sum > 100) {
 System.out.println("Sum is greater than 100");
 } else {
 System.out.println("Sum is less than or equal to 100");
 }
 }
}

