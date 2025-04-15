package OOPS.enumWali;

public class test {
    public static void main(String[] args) {
        Day mon = Day.MONDAY;
        Day tue = Day.TUESDAY;
        int ordinal = mon.ordinal();
        System.out.println(ordinal);//Index
        System.out.println(mon.name());
        System.out.println(mon.compareTo(tue));
        Day[] values = Day.values();
        for(Day i : values){
            System.out.println(i);
        }
    }
}
