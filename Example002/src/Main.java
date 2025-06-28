//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int j=3;
        increment(j);
        System.out.println("j = " + j);

        MyInteger j2 = new MyInteger(8);
        increment(j2);
        System.out.println("j2 = " + j2.intValue());
    }

    public static void increment(int i)
    {
        i++;
    }

    public static void increment(MyInteger i)
    {
        i.setValue(i.intValue()+1);
    }

}

