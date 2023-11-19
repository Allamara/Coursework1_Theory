// Билет № 2. Теоретическая часть
// Палиндром - число или слово, которое одинаково читается в обоих направлениях.
// Например, число 101,20202, слова «топот», «радар», «мадам»,
class Main {
    public static void main(String[] args) {

        String str = "20202", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println("Строка " + str + " является палиндромом");
        } else {
            System.out.println("Строка " + str + " НЕ является палиндромом");
        }
    }
}
