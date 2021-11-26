package treesettest;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.util.ElementScanner6;

public class TreeSetTest {
     public static void main(String[] args) {
        Set<String> treeSetStrings=new TreeSet<>();
        treeSetStrings.add("AAA");
        treeSetStrings.add("BBB");
        treeSetStrings.add("CCC");
        Scanner scan=new Scanner(System.in);
        char ch='N';
        do{
            System.out.println("\nTree Set Operations");
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.contains");
            System.out.println("4.count");
            System.out.println("5.clear");
            System.out.println("6.Exit");
            int choice =scan.nextInt();
        
            switch(choice){
                case 1:
                System.out.println("Enter elemnts to insert");
                treeSetStrings.add(scan.next());
                break;
                case 2:
                System.out.println("Enter elemnts to delete");
                treeSetStrings.remove(scan.next());
                break;
                case 3:
                String s1=scan.next();
                if(treeSetStrings.contains(s1))
                System.out.println("tree Contains :"+s1);
                else 
                System.out.println("tree does not contain :"+s1);
                break;
                case 4:
                System.out.println("tree size :"+treeSetStrings.size());
                break;
                case 5:
                System.out.println("tree Elements :"+treeSetStrings);
                treeSetStrings.removeAll(treeSetStrings);
                System.out.println("tree Elements Cleard.");
                System.out.println("tree size:"+treeSetStrings.size());
                break;
                case 6:
                ch='Y';
                break;
                default:
                System.out.println("Wrong Entry \n");
                break;
            }
        }while(ch!='Y');

            }

        }
