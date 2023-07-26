package org.example;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                HashMap<String,List<String>> students = new HashMap<>();

                while(true){
                    System.out.println("Enter City ");
                    String city = scan.nextLine();
                    if ( city.equalsIgnoreCase("stop") || city.isEmpty())  break;

                    System.out.println("Enter PIB ");
                    String pib = scan.nextLine();
                    if (pib.equalsIgnoreCase("stop") || pib.isEmpty())  break;

                    else if (students.containsKey(city)){
                        students.get(city).add(pib);
                    }
                    else {
                        ArrayList<String> pibs = new ArrayList<>();
                        pibs.add(pib);
                        students.put(city, pibs);
                    }
                }
                out.println(students);
            }
        }



