package Komplexität;

import Algorithmen.Beispiele.Fakultät;

public class Praktikum_005 {

    public static void main(String[] args) {
        int n = 1000;
        Zeitmessung zeitmessung = new Zeitmessung();
        StopUhr stopUhr = new StopUhr();

        stopUhr.start();
        zeitmessung.func1(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun1 (Linear) hat " + (stopUhr.getDuration() / 1000)  + " ms gedauert.");

        stopUhr.start();
        zeitmessung.func2(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun2 (Quadratisch) hat " + (stopUhr.getDuration() / 1000)  + " ms gedauert.");


        stopUhr.start();
        zeitmessung.func6(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun6 (Log2(n))) hat " + (stopUhr.getDuration() / 1000)  + " ms gedauert.");

        stopUhr.start();
        zeitmessung.func0(n);
        stopUhr.stop();
        System.out.println("Für n = " + n + " Fun0 (O(1))) hat " + (stopUhr.getDuration() / 1000)  + " ms gedauert.");

    }





}
