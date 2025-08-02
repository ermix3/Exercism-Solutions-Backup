class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String[] numbers = String.valueOf(numberToCheck).split("");
        if (numbers.length > 1) {
            int sum = 0;
            for (String number : numbers) {
                sum += (int) Math.pow(Integer.parseInt(number), numbers.length);
            }
            return sum == numberToCheck;
        }
        return true;
    }

}
