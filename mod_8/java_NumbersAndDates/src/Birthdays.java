import java.time.LocalDateTime;
import java.time.LocalDate;

public class Birthdays {
    /**Реализуйте метод:
     public static String collectBirthdays(int year, int month, int day),
     который вернёт строки, содержащие все ваши прошедшие дни рождения
     от момента рождения до текущей даты в требуемом формате.
     Дата рождения передаётся в метод тремя числами.
     * */
/**
 * Советы и рекомендации
 * <p>
 * Создайте в начале метода две переменные класса LocalDate: birthday и today.
 * После этого напишите цикл, в котором добавляйте один год к birthday и
 * сравнивайте получившуюся дату с сегодняшней, используя метод isAfter или isBefore.
 * Таким образом у вас будет проверяться не только год, но и день, что позволит
 * точно выводить данные о прошедших днях рождениях.
 * Для переноса текста на новую строку используйте символ переноса строки,
 * который возвращается методом System.lineSeparator():   String text = text + "Строка с датой" +
 * <p>
 * Этот метод возвращает системный перенос строки — тот, который используется в вашей операционной системе по умолчанию. В Windows это \r\n, в MacOS и Linux — \n.
 */


public static void collectBirthdays(int year, int month, int day){
    LocalDate birthday = LocalDate.of(year,month,day);
    LocalDate today = LocalDate.now();
for (int i = 0; i <30; i++) {

    System.out.println(birthday.plusYears(1));
}
/*
 while (today.isAfter(birthday.plusYears(1))) {
           System.out.println(birthday.plusYears(1));

       }
*/


}

}
