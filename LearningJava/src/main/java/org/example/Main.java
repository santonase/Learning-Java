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
                    String lastName = scan.nextLine();
                    if (lastName.equalsIgnoreCase("stop") || lastName.isEmpty())  break;

                    else if (students.containsKey(city)){
                        students.get(city).add(lastName);
                    }
                    else {
                        ArrayList<String> lastNames = new ArrayList<>();
                        lastNames.add(lastName);
                        students.put(city, lastNames);
                        out.println("LastNames: "+lastNames);
                        out.println("Students__: "+students);
                    }
                }
                out.println("Students: "+students);
            }
        }



