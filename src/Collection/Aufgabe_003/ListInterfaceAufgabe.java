package Collection.Aufgabe_003;

import java.util.*;

public class ListInterfaceAufgabe {
    // Elemente in Liste einf�gen
    static void fillList(List<String> list) {
        // Zahlen von 0 bis 20 als Zeichenketten (Strings) einfügen
        for (int a = 0; a <= 20; a++)
            list.add("" + a);

        // Element an der Position 3 entfernen
        list.remove(3);

        // Erstes Element in der Liste entfernen, das gleich "6" ist
        list.remove("6");
    }

    // Liste vom Anfang bis zum Ende mit einer
    // foreach-Schleife iterieren und Elemente ausgeben
    static void printList(List<String> list) {
        for (String item : list) {
            System.out.print(item + " ");
        }
    }

    // Alle Elemente aus der Liste entfernen, die durch 5 teilbar sind
    static void remove5List(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String itemAsString = list.get(i);
            int itemAsInt = Integer.parseInt(itemAsString);
            if (itemAsInt % 5 == 0) {
                list.remove(itemAsString);
            }
        }
    }

    public static void main(String[] args) {
        // Erzeugen der LinkedList
        LinkedList<String> list1 = new LinkedList<String>();
        fillList(list1);
        System.out.println("\nAusgabe der ersten Liste(list1)");
        printList(list1);

        remove5List(list1);
        System.out.println("\nlist1 nach dem Entfernen der durch 5 teilbaren Zahlen");
        printList(list1);

        // Erzeugen der ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        fillList(list2);

        System.out.println("\nAusgabe der zweiten Liste(list2)");
        printList(list2);

        System.out.println("\nAusgabe der teil Liste(list3)");
        List<String> list3 = list2.subList(5, 12);
        printList(list3);
        list3.remove("11");
        System.out.println("\nAusgabe Liste(list3) nach dem Entfernen von 11");
        printList(list3);

        System.out.println("\nAusgabe der zweiten Liste(list2)");
        printList(list2);

    }
}