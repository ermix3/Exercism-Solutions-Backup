import 'dart:math';

class ArmstrongNumbers {
  // Put your code here
  bool isArmstrongNumber(String numbers) {
    List<String> numbersList = numbers.split('');
    int sum = 0;
    int numberLength = numbersList.length;
    numbersList.forEach((element) {
      int number = int.parse(element);

      num numberPowered = pow(number, numberLength);
      sum += numberPowered as int;
    });
    return sum == int.parse(numbers);
  }
}
