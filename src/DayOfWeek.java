/**
 * Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
 * С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
 *
 *  Возвращает кол-во оставшихся рабочих часов до конца
 *  недели по заданному текущему дню. Считается, что
 *  текущий день ещё не начался, и рабочие часы за него
 *  должны учитываться.
 *
 * public class DayOfWeekMain {
 *
 *  public static void main(final String[] args) {
 *  System.out.println(getWorkingHours(DayOfWeek.MONDAY));
 *  }
 */
public enum DayOfWeek {
    //дни недели
   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FIRDAY, SATURDAY, SUNDAY;

   String WorkingHours;

   public String getWorkingHours(DayOfWeek _d) {
        String s = _d.toString();

        switch (s) {
            case ("MONDAY"): WorkingHours = "40"; break;
            case ("TUESDAY"): WorkingHours = "32";break;
            case ("WEDNESDAY"): WorkingHours = "24";break;
            case ("THURSDAY"):  WorkingHours = "16";break;
            case ("FIRDAY"):  WorkingHours = "8";break;
            case ("SATURDAY"): WorkingHours = "0 часов. Выходной";break;
            case ("SUNDAY"): WorkingHours = "0 часов. Выходной";break;
        }

        return WorkingHours;
    }

}

class DayOfWeekMain {
    public static void main(String[] args) {
        DayOfWeek d = DayOfWeek.MONDAY;
       System.out.println(d.getWorkingHours(DayOfWeek.MONDAY));

    }
}