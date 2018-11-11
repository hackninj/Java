package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player p1 = new Player("Doron", "", 198, 111, 1, 2, 3, "");
//        Player p2 = new Player("Dave", "", 156, 111, 1, 2, 3, "");
//
//        p1.print();
//
//        ArrayList<Player> team1 = new ArrayList<>();
//        team1.add(p1);
//        team1.add(p2);
//
//
//       // team1.add(new Player());
//
//
//        System.out.println(team1);

//        Guard g = new Guard("Doron", "", 198, 111, 1, 2, 3, "", 3);
//        g.print();


        ArrayList<Player> team = new ArrayList<>();


        int choice = -1; //Sentinel
        while (choice!=4){

            choice = IO.nextInt("Enter Your Choice:\n" +
                    "1)Add Player\n" +
                    "2)print All\n" +
                    "3)Team Shot\n" +
                    "4)Exit"
            );

            switch (choice){
                case 1:
                    team.add(new Player());
                    break;
                case 2:
                    for (Player p : team) {
                        p.print();
                    }
                    break;
                case 3:
                    for (Player p1 : team) {
                        System.out.println(p1);
                        System.out.println(p1.throwFromThree());
                    }
                    break;
                case 4:
                    System.out.println("Bye Bye!");
                    System.out.println("Have A Nice Practice!");
                    break;
            }
        }
    }
}
