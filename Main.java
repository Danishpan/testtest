package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // int number;
    //
    // number = 0;
    //
    // if (number < 0) {
    //   System.out.println("Negative number");
    // } else if (number > 0) {
    //   System.out.println("Positive number");
    // } else {
    //   System.out.println("It's zero!");
    // }
    //
    // int sum;
    //
    // int number1 = 1;
    // int number2 = 2;
    //
    // sum = number1 + number2;

    // int number1;
    // int number2;
    //
    // number1 = 3;
    // number2 = 4;
    //
    // //System.out.println(number1 + number2);
    //
    // int sum = number1 + number2;
    //
    // System.out.println(sum);

    //
    // int number1;
    // int number2;
    //
    // number1 = 12;
    // number2 = -4;
    //
    // //System.out.println(number1 + number2);
    //
    // int product = number1 * number2;
    //
    // System.out.println(product);

    // int x, y, z;
    //
    // x = 5;
    // y = -5;
    // z = 10;
    //
    //
    // int result;
    //
    // result = (x * x) + y - (z / 2);
    //
    // System.out.println(result);

    // int number = 18;
    //
    // if ((number % 2 == 0) && ((number > 10) || (number != 18))) {
    //   System.out.println("true!");
    // }

    // int number1 = 60;
    // int number2 = 12;
    //
    // if (number1 > number2) {
    //   if (number1 % number2 == 0) {
    //     System.out.println("yes");
    //   } else {
    //     System.out.println("no");
    //   }
    // }
    //
    // int number1 = 12;
    // int number2 = -4;
    //
    // if (number1 > number2) {
    //   System.out.println(">");
    // } else if (number1 < number2) {
    //   System.out.println("<");
    // } else {
    //   System.out.println("=");
    // }

    // int dayNumber = 7;
    //
    // if (dayNumber == 1) {
    //   System.out.println("Понедельник!");
    // } else if (dayNumber == 2) {
    //   System.out.println("Вторник!");
    // } else if (dayNumber == 3) {
    //   System.out.println("Среда!");
    // } else if (dayNumber == 4) {
    //   System.out.println("Четверг!");
    // } else if (dayNumber == 5) {
    //   System.out.println("Пятница!");
    // } else if ((dayNumber == 6) || (dayNumber == 7)) {
    //   System.out.println("Выходной! Ура!");
    // }

    // int age = 30;
    //
    // System.out.println("Прошел год!");

    // age = age + 1;

    // age += 1; // age = age + 1;

    // int number = 6;

    //number = number * 5;

    // int result1 = 2;
    // result1 = result1 + 5;
    //
    // int result2 = 2;
    // result2 += 5;
    //
    // if (result1 == result2) {
    //   System.out.println("Работает!");
    // }
    //
    // int number = 26;
    //
    // // number = number + 1;
    //
    // // number += 1;
    // //
    // number++;
    //
    // System.out.println("Номер равен = " + number + " and " + number);
    //
    // double a,b,c;
    //
    // a = 1.0;
    // b = 5.0;
    // c = 1.0;
    //
    // double x1;
    // double x2;
    //
    // double d = (b * b) - (4 * a * c);
    //
    // x1 = (-b + Math.sqrt(d))/(2*a);
    // x2 = (-b - Math.sqrt(d))/(2*a);
    //
    // System.out.println("The roots are " + x1 + " and " + x2);

    //
    // int a,b,c;
    //
    // a = 25;
    // b = 25;
    // c = 25;
    //
    // if ((a > b) && (a > c)) {
    //   System.out.println("The greatest: " + a);
    // } else if ((b > a) && (b > c)) {
    //   System.out.println("The greatest: " + b);
    // } else if ((c > b) && (c > a)) {
    //   System.out.println("The greatest: " + c);
    // } else {
    //   System.out.println("There is no greatest number");
    // }

    // int monthNumber = 2;
    // int year = 2016;
    //
    // if ((monthNumber == 1) && (monthNumber == 3) && (monthNumber == 5) && (monthNumber == 7) && (monthNumber == 8) && (monthNumber == 10) && (monthNumber == 12)) {
    //   System.out.println("This month has " + 31 + " days");
    // } else if (monthNumber == 2) {
    //   if ((year % 4 == 0) && (year % 100 != 0)) {
    //     System.out.println("This month has " + 29 + " days");
    //   } else {
    //     System.out.println("This month has " + 28 + " days");
    //   }
    // } else {
    //   System.out.println("This month has " + 30 + " days");
    // }

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.print("Введите ваш возраст - ");
    //
    // // String name = sc.nextLine();
    //
    // int age = sc.nextInt();
    //
    // System.out.println("Ваш возраст - " + age);

    // int number = 10;
    //
    // while(number == 10) {
    //   System.out.println("Все чики пуки!");
    // }

    //int number = 1;
    //
    // while(number <= 20) {
    //   System.out.println(number);
    //   number++;
    // }

    // Scanner scanner = new Scanner(System.in);
    // int number = 0;
    //
    // while(number < 10) {
    //   System.out.println("Zhumys Isteimiz!");
    //   number += scanner.nextInt();
    // }

    // for (int i = 0; i < 10; i++) {
    //   System.out.println("i = " + i);
    //   //System.out.println("Sapsan Alga!");
    // }
    //
    // int number = 0;
    // for (int i = 0; i < 10; i++) {
    //   number += i;
    //   System.out.println(number);
    // }
    // System.out.println(number);
    // int number = 6;
    //
    // for (int i = 2; i < 10; i+=2) { // i = i + 2;
    //   System.out.println(i);
    // }

    // Scanner scanner = new Scanner(System.in);
    // int number = scanner.nextInt();
    //
    // for (int i = 0; i<=number; i++) {
    //   System.out.println(i);
    // }

    // int number = 1;
    //
    // while(number <= 5) {
    //   System.out.print(number + " ");
    //   number++;
    // }
    //
    // int number = 5;
    //
    // while(number >= 1) {
    //   System.out.print(number + " ");
    //   number--;
    // }

    // for (int i = 1; i <= 5; i++) {
    //   System.out.print(i + " ");
    // }

    // for (int i = 5; i >= 1; i--) {
    //   System.out.print(i + " ");
    // }

    // System.out.print("Please enter your number for while loop sum: ");
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // int i = 1;
    // int sum = 0;
    // while( i <= num){
    //   sum += i;
    //   i++;
    // }
    // System.out.println("Sum (while loop) of number from 1 to " + num + " is: " + sum);
    // System.out.print("Please enter your number for for-loop sum: ");
    // int number = sc.nextInt();
    // int summa = 0;
    // for(int j = 1; j <= number; j++){
    //   summa += j;
    // }
    // System.out.println("Sum (for loop) of number from 1 to " + num + " is: " + summa);

    // System.out.print("Hey, you. Enter a number and I will find its' dividers ");Scanner sc = new Scanner(System.in);int num = sc.nextInt();int i = 1;int count = 0;
    // while (i <= num){
    //   if(num % i == 0){
    //     count++;    }
    //   i++;
    // }
    //
    // if(count == 0){
    //   System.out.print("\nThere are no dividers of the number " + num);} else if (count == 1) {
    //   System.out.print("\nThere is only one divider of the number " + num + " which is: ");}else {
    //   System.out.print("\nThere are " + count + " dividers of the number " + num + " which are: ");}
    //
    // i = 1;
    //
    // while (i <= num){
    //   if(num % i == 0){
    //     System.out.print(i + " ");    }
    //   i++;}

    // int number = 9;

    // int[] sapsanNumbers = new int[25];
    // System.out.println(sapsanNumbers.length);
    //
    // sapsanNumbers[0] = 1;
    // sapsanNumbers[1] = 1;
    // sapsanNumbers[2] = 1;
    // sapsanNumbers[3] = 1;

    // int[] sapsanNumbers = {1,2,3,4};
    //
    // System.out.println(sapsanNumbers[2]);
    //
    // sapsanNumbers[2] = 33;
    //
    // System.out.println(sapsanNumbers[2]);

    // int[] sapsanNumbers = new int[5];
    //
    // Scanner sc = new Scanner(System.in);
    //
    // for (int i = 0; i < sapsanNumbers.length; i++) {
    //   sapsanNumbers[i] = sc.nextInt();
    // }
    //
    // for (int i = 0; i < sapsanNumbers.length; i++) {
    //   if (i == sapsanNumbers.length - 1) {
    //     System.out.print(sapsanNumbers[i]);
    //   } else System.out.print(sapsanNumbers[i] + ", ");
    // }
    //
    // System.out.println();
    // System.out.println();
    // System.out.println();
    //
    // for (int i = sapsanNumbers.length - 1; i >= 0; i--) {
    //   if (i == 0) {
    //     System.out.print(sapsanNumbers[i]);
    //   } else System.out.print(sapsanNumbers[i] + ", ");
    // }

    //
    // int[] sapsanNumbers = new int[25];
    //
    // for (int i = 0; i<sapsanNumbers.length; i++) {
    //   sapsanNumbers[i] = i;
    // }
    //
    // for (int i = 0; i<sapsanNumbers.length; i++) {
    //   System.out.println("Element with index: " + i + " is " + sapsanNumbers[i]);
    // }

    // int[] oddNumbers = new int[50];
    //
    // int oddNumber = 1;
    //
    // for (int i = 0; i < 50; i++) {
    //   oddNumbers[i] = oddNumber;
    //   oddNumber += 2;
    // }
    //
    // for (int i = 0; i < oddNumbers.length; i++) {
    //   System.out.println(oddNumbers[i]);
    // }

    // int[] evenNumbers = new int[10];
    //
    // int evenNumber = 2;
    //
    // for (int i = 0; i < evenNumbers.length; i++) {
    //   evenNumbers[i] = evenNumber;
    //   evenNumber += 2;
    // }
    //
    // int sum = 0;
    //
    // for (int i = 0; i < evenNumbers.length; i++) {
    //   sum += evenNumbers[i];
    // }
    //
    // System.out.println("Sum of all elements is " + sum);

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.print("Введите длину массива - ");
    //
    // int size = sc.nextInt();
    //
    // System.out.println();
    //
    // int[] array = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.print("Введите значение для элемента под индексом " + i + " - ");
    //   array[i] = sc.nextInt();
    //   System.out.println();
    // }
    //
    // double avg = 0.0;
    // double sum = 0;
    //
    // for (int i = 0; i < size; i++) {
    //   sum += array[i];
    // }
    //
    // avg = sum / size;
    //
    // System.out.println("Среднее значение всех элементов массива - " + avg);

    // int[] array = {1, 5, 7, 9, 12, 18};
    //
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите искомое значение: ");
    //
    // int specificNumber = sc.nextInt();
    //
    // boolean numberIsFound = false;
    //
    // for (int i = 0; i < array.length; i++) {
    //   if (array[i] == specificNumber) {
    //     numberIsFound = true;
    //   }
    // }
    //
    // if (numberIsFound) { // numberIsFound == true
    //   System.out.println("Значение нашлось в массиве!");
    // } else {
    //   System.out.println("Значение не нашлось!");
    // }

    // int[] array = {1, 5, 7, 9, 12, 18};
    //
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите искомое значение: ");
    //
    // int specificNumber = sc.nextInt();
    //
    // boolean numberIsFound = false;
    //
    // int indexOfFoundNumber = 0;
    //
    // for (int i = 0; i < array.length; i++) {
    //   if (array[i] == specificNumber) {
    //     indexOfFoundNumber = i;
    //     numberIsFound = true;
    //   }
    // }
    //
    // if (numberIsFound) { // numberIsFound == true
    //   System.out.println("Значение нашлось в массиве! Индекс элемента - " + indexOfFoundNumber);
    // } else {
    //   System.out.println("Значение не нашлось!");
    // }

    //  int[] array = {1, 5, 7, 9, 12, 18};
    //
    //  int[] newArray = new int[array.length - 1];
    //
    //  Scanner sc = new Scanner(System.in);
    //
    //  System.out.println("Введите искомое значение: ");
    //
    //  int specificNumber = sc.nextInt();
    //
    //  int j = 0;
    //
    //  for (int i = 0; i < newArray.length; i++) {
    //    if (array[i] != specificNumber) {
    //      newArray[i] = array[j];
    //      j++;
    //    } else {
    //      newArray[i] = array[j+1];
    //      j+=2;
    //    }
    //  }
    //
    // for (int i = 0; i < newArray.length; i++) {
    //   System.out.println(newArray[i]);
    // }

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер массива - ");
    //
    // int size = sc.nextInt();
    //
    // int[] oldArray = new int[size];
    //
    // for (int i = 0; i < oldArray.length; i++) {
    //   System.out.print("Введите значение под индексом " + i + " - ");
    //   oldArray[i] = sc.nextInt();
    // }
    //
    //   System.out.println();
    //
    // int[] newArray = oldArray;
    //
    //   for (int i = 0; i < oldArray.length; i++) {
    //     //newArray[i] = oldArray[i];
    //     System.out.println("Элемент нового массива под индексом " + i + " - " + newArray[i]);
    //   }

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер массива - ");
    //
    // int size = sc.nextInt();
    //
    // int[] oldArray = new int[size];
    //
    // for (int i = 0; i < oldArray.length; i++) {
    //   System.out.print("Введите значение под индексом " + i + " - ");
    //   oldArray[i] = sc.nextInt();
    // }
    //
    // System.out.println();
    //
    // int max = oldArray[0];
    // int min = oldArray[0];
    //
    // for (int i = 0; i < oldArray.length; i++) {
    //   if (oldArray[i] > max) {
    //     max = oldArray[i];
    //   }
    //   if (oldArray[i] < min) {
    //     min = oldArray[i];
    //   }
    // }
    //
    // System.out.println("Наибольшее значение в массиве - " + max + ", наименьшее значение в массиве - " + min);

    //
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер массива - ");
    //
    // int size = sc.nextInt();
    //
    // int[] oldArray = new int[size];
    //
    // for (int i = 0; i < oldArray.length; i++) {
    //   System.out.print("Введите значение под индексом " + i + " - ");
    //   oldArray[i] = sc.nextInt();
    // }
    //
    // System.out.println();
    //
    // int evenCount = 0;
    // int oddCount = 0;
    //
    // for (int i = 0; i < oldArray.length; i++) {
    //   if ((oldArray[i] % 2 == 0) && oldArray[i] != 0) {
    //     evenCount++;
    //   } else if (oldArray[i] % 2 == 1) {
    //     oddCount++;
    //   }
    // }
    //
    // System.out.println("Количество четных чисел в массиве - " + evenCount + ", количество нечетных - " + oddCount);

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество посещенных городов - ");
    // int size = sc.nextInt();
    //
    // String[] cities = new String[size];
    //
    // for (int i = 0; i < cities.length; i++) {
    //   System.out.println("Осталось ввести " + (cities.length - i) + " городов. Введите город, который Вы посетили - ");
    //   cities[i] = sc.next();
    // }
    //
    // for (int i = 0; i < cities.length; i++) {
    //   System.out.println(cities[i]);
    // }

    // Minimum in the table

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество столбцов - ");
    // int N = sc.nextInt();
    // System.out.println("Введите количество строк - ");
    // int M = sc.nextInt();
    //
    // int[][] numbers = new int[M][N];
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.println("Введите значение элемента, который будет хранится под индексами " + i + ", " + j + " ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    // int min = numbers[0][0];
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println(" ");
    // }
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     if (numbers[i][j] < min) {
    //       min = numbers[i][j];
    //     }
    //   }
    // }

    // System.out.println("Минимальное значение в вашем двумерном массиве - " + min);

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество строк и столбцов - ");
    // int N = sc.nextInt();
    //
    // int[][] numbers = new int[N][N];
    //
    // for (int i = 0; i < N; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.println("Введите значение элемента, который будет хранится под индексами " + i + ", " + j + " ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    // for (int i = 0; i < N; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println(" ");
    // }
    //
    // int mainSum = 0;
    // int secondarySum = 0;
    //
    // for (int i = 0; i < N; i++) {
    //   for (int j = 0; j < N; j++) {
    //     if (i == j) {
    //       mainSum += numbers[i][j];
    //     }
    //     if ((i + j) == N - 1) {
    //       secondarySum += numbers[i][j];
    //     }
    //   }
    // }
    //
    // System.out.println("Сумма элементов основной диагонали - " + mainSum + ", сумма элементов второстепенной диагонали - " + secondarySum);

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество столбцов - ");
    // int N = sc.nextInt();
    // System.out.println("Введите количество строк - ");
    // int M = sc.nextInt();
    //
    // int[][] numbers = new int[M][N];
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.println("Введите значение элемента, который будет хранится под индексами " + i + ", " + j + " ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println(" ");
    // }
    //
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     if (numbers[i][j] == 0) {
    //       System.out.println("Ноль находится под индексами - " + i + " и " + j);
    //     }
    //   }
    // }

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество столбцов - ");
    // int N = sc.nextInt();
    // System.out.println("Введите количество строк - ");
    // int M = sc.nextInt();
    //
    // int[][] numbers = new int[M][N];
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.println("Введите значение элемента, который будет хранится под индексами " + i + ", " + j + " ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println(" ");
    // }
    //
    // int rowIndex = -1;
    // int columnIndex = -1;
    //
    // for (int i = 0; i < M; i++) {
    //   for (int j = 0; j < N; j++) {
    //     if (numbers[i][j] == -1) {
    //       rowIndex = i;
    //       columnIndex = j;
    //     }
    //   }
    // }
    //
    // System.out.println(rowIndex + " " + columnIndex);

// 01.12.2022 Functions

    // int num1 = 5;
    // int num2 = 6;
    //
    //
    // System.out.println("Sum of two numbers = " + sumOfTwoNumbers(num1, num2));

    // System.out.println("Как Вас зовут?");
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();

    // String name1 = "Болат";
    // String name2 = "Айбек";
    //
    // greetingUser(name1);
    //
    // greetingUser(name2);

    // int[] numbers = {12, 3, 41, 123, 123, 1223, 4, 1, 1};
    //
    //
    // System.out.println("Сумма всех элементов массива - " + sumOfArrayElements(numbers));

    // int[] numbers = {12, 3, 41, 123, 123, 1223, 4, 1, 1};
    //
    //
    // System.out.println(sumOfDoubledArrayElements(numbers));

    // 1. Write a Java method to find the smallest number among three numbers

    // int minValue = findSmallestValue(25, 37, 29);
    //
    // System.out.println("Минимальное число из трех - " + minValue);

    // 2. Write a Java method to compute the average of three numbers

    // double avg = findAverage(25, 45, 65);
    //
    // System.out.println("The average value is " + avg);

    // 3. Write a Java method to display the middle character of a string.

    // String testString = "findMiddleCharacters";
    //
    // System.out.println("Middle character(s) - " + findMiddleCharacters(testString));


    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter number of ToDo's you want to enter: ");
    int numberOfToDos = sc.nextInt();

    String[] toDos = fillToDoList(numberOfToDos);

    boolean isRunnable = true;

    while(isRunnable) {

      System.out.println("Here is your to-do list: ");

      printToDoList(toDos);

      System.out.println("Choose the index of task, which you want to mark as (completed)/(not completed) or you can enter '99' to end the program: ");
      int index = sc.nextInt() - 1;

      if(index == 98) {
        System.out.println("Thanks for using our app! Bye-bye!");
        isRunnable = false;
      } else {
        changeToDoList(index, toDos);
      }

      isRunnable = !checkIfAllTasksAreCompleted(toDos);
    }
  }

  private static boolean checkIfAllTasksAreCompleted(String[] toDos) {
    for (int i = 0; i < toDos.length; i++) {
      if (!toDos[i].contains("Done")) {
        return false;
      }
    }

    printToDoList(toDos);
    System.out.println("You are excellent! Glad to know, that you completed all tasks for today! Thanks for using our app! Bye-bye!");
    return true;
  }

  private static void changeToDoList(int index, String[] toDos) {
    if (toDos[index] != null) {
      if (toDos[index].contains("Done")) {
        toDos[index] = toDos[index].substring(10);
      } else {
        toDos[index] = "(Done!) | " + toDos[index];
      }
    } else {
      System.out.println("There is no To-Do with such index!");
    }
  }

  private static void printToDoList(String[] toDos) {
    for (int i = 0; i < toDos.length; i++) {
      System.out.println((i + 1) + ". " + toDos[i]);
    }
  }

  public static String[] fillToDoList(int numberOfToDos) {
    String[] toDoList = new String[numberOfToDos];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < numberOfToDos; i++) {
      System.out.println("You still have " + (numberOfToDos - i) + " to-do's to enter.");
      System.out.println("Please enter your to-do: ");

      toDoList[i] = sc.nextLine();
    }

    return toDoList;
  }



  // public static String findMiddleCharacters(String string) {
  //   if (string.length() % 2 == 0) {
  //     return string.substring(string.length() / 2 - 1, string.length() / 2 - 1 + 2);
  //   } else {
  //     return string.substring(string.length() / 2, string.length() / 2 + 1);
  //   }
  // }


  // public static double findAverage(int firstNumber, int secondNumber, int thirdNumber) {
  //
  //   double avg = (firstNumber + secondNumber + thirdNumber) / 3.0;
  //
  //   return avg;
  // }


  // public static int findSmallestValue(int firstNumber, int secondNumber, int thirdNumber) {
  //
  //   if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
  //     return firstNumber;
  //   }
  //
  //   if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
  //     return secondNumber;
  //   }
  //
  //   if ((thirdNumber < secondNumber) && (thirdNumber < firstNumber)) {
  //     return thirdNumber;
  //   }
  //
  //   return 0;
  // }


  // public static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
  //   int sum = firstNumber + secondNumber;
  //   return sum;
  // }
  //
  // public static void greetingUser(String name) {
  //   System.out.println("Приветствую, " + name + "!");
  //   System.out.println("Как Ваши дела?");
  //   System.out.println("Рады Вас видеть!");
  // }

  // static int sumOfArrayElements(int[] numbers) {
  //   int sum = 0;
  //   for (int i = 0; i < numbers.length; i++) {
  //     sum += numbers[i];
  //   }
  //   return sum;
  // }

  // static int sumOfDoubledArrayElements(int[] numbers) {
  //   int sum = 0;
  //   for (int i = 0; i < numbers.length; i++) {
  //     sum += multiplyNumberByTwo(numbers[i]);
  //   }
  //   return sum;
  // }
  //
  // static int multiplyNumberByTwo(int number) {
  //   return number * 2;
  // }

}