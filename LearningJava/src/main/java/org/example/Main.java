package org.example;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                HashMap<String, String> users = new HashMap<>();
                users.put("admin", "root");
                users.put("user", "qwerty");
                users.put("test", "password");

                Scanner scanner = new Scanner(in);
                out.print("Enter your login: ");
                String login = scanner.nextLine();

                if (users.containsKey(login)) {
                    out.print("Enter your password: ");
                    String password = scan.nextLine();

                    while (true) {
                        if (password.equals("")) {
                            out.println("Wrong password");
                            break;
                        }

                        if (users.get(login).equals(password)) {
                            out.println("Success! Welcome!");
                            break;
                        }

                        out.println("Wrong password! Enter password again: ");
                        password = scanner.nextLine();
                    }
                } else {
                    out.println("Sorry, this user doesn't exist");
                }

            }
        }



