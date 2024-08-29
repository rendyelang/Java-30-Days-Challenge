// Problem: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Phone Book Application");

        PhoneBook phoneBook = new PhoneBook();

        System.out.println("How many contact do you want to add?");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name: ");
            String name = scan.next();

            try {
                System.out.println("Enter phone number: ");
                int number = scan.nextInt();

                phoneBook.addContact(name, number);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Please enter a valid phone number");
                return;
            }
        }

        phoneBook.printContact();

        System.out.println("How many times you want to search a contact? ");
        int q = scan.nextInt();

        for (int i = 1; i <= q; i++) {
            System.out.println("Enter the name you want to search: ");
            String name = scan.next();
    
            phoneBook.getContact(name);
        }

        scan.close();
    }

    static class PhoneBook {
        int loop = 1;
        
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        public void addContact(String name, int number) {
            phoneBook.put(name, number);
        }

        public void printContact() {
            for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }

        public void getContact(String name) {
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
