package supportFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SupportFun {

        public static void main(String[] args) {




        }

    public static String deteteVerbFromString(String stringOriginal) {
        System.out.println("Метод deteteVerbFromString() Получил на вход значение: " + stringOriginal);
        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList(stringOriginal.split(" ")));
        list.removeIf(itVar -> itVar.endsWith("ать,")
                || itVar.endsWith("ять,")
                || itVar.endsWith("ить,")
                || itVar.endsWith("еть,")
                || itVar.endsWith("уть,")
                || itVar.endsWith("оть,")

                || itVar.endsWith("ать")
                || itVar.endsWith("ять")
                || itVar.endsWith("ить")
                || itVar.endsWith("еть")
                || itVar.endsWith("уть")
                || itVar.endsWith("оть")

                || itVar.endsWith("ать ")
                || itVar.endsWith("ять ")
                || itVar.endsWith("ить ")
                || itVar.endsWith("еть ")
                || itVar.endsWith("уть ")
                || itVar.endsWith("оть ")

                || itVar.endsWith("аться")
                || itVar.endsWith("яться")
                || itVar.endsWith("иться")
                || itVar.endsWith("еться")
                || itVar.endsWith("уться")
                || itVar.endsWith("оться")

                || itVar.endsWith("аться,")
                || itVar.endsWith("яться,")
                || itVar.endsWith("иться,")
                || itVar.endsWith("еться,")
                || itVar.endsWith("уться,")
                || itVar.endsWith("оться,")

                || itVar.endsWith("атся")
                || itVar.endsWith("ятся")
                || itVar.endsWith("ится")
                || itVar.endsWith("ется")
                || itVar.endsWith("утся")
                || itVar.endsWith("отся")

                || itVar.endsWith("атся,")
                || itVar.endsWith("ятся,")
                || itVar.endsWith("ится,")
                || itVar.endsWith("ется,")
                || itVar.endsWith("утся,")
                || itVar.endsWith("отся,"));
        String stringEdited = String.join(" ", list);
        System.out.println("Метод deteteVerbFromString() отдал на выход значение: " + stringEdited);
        System.out.println();
        return stringEdited;
    }


}
