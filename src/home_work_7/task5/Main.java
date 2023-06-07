package home_work_7.task5;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити class home_work_pidruchnyk.Main, у ньому створити список, додати вчителів,
 * яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
 */
public class Main {
    public static void main(String[] args) {

        Teachers teachers = new Teachers();
        teachers.add("Олег");
        teachers.add("Людмила");
        teachers.add("Олексій");
        teachers.add("Світлана");
        System.out.println(teachers.getTeachers());

        int bestTeacher = teachers.getIndex("Олег");
        int worstTeacher = teachers.getIndex("Світлана");
        System.out.println(bestTeacher);
        System.out.println(worstTeacher);
    }
}