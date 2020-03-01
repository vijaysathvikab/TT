package vijay;
//TableTennis Scoreboard program,by Vijaya Sathvika B,28/3/2020-1/3/2020 

import java.util.Scanner;
public class tableTennis {
	public static void main(String []args) {
	Scanner input=new Scanner(System.in);
	int numberOfServes;
	//To find out weather it's a singles game or a doubles game 
	System.out.println("Enter the number of serves per side:");
	numberOfServes=input.nextInt();
	switch(numberOfServes)
	{
	case 2:
		//Initially takes in the names of players
		System.out.println("Singles game");
		String nameOfPlayer1;
		String nameOfPlayer2;
		System.out.println("Enter the name of player 1(Serving player):");
		nameOfPlayer1=input.next();
		System.out.println("Enter the name of player 2:");
		nameOfPlayer2=input.next();
		long start1=System.nanoTime();//To count time taken to complete the set
		System.out.println("\t\t\t\t\tBEGIN\tTHE\tGAME");
		int onePlayerPoints=0;
		int twoPlayerPoints=0;
		//loops until game ends
		for(int i=0;i<=100;i++)
		{
			//Counts the points until the game ends or until we reach deuce.
			if(onePlayerPoints!=21 || twoPlayerPoints!=21) {
				//For service changes after every 2 serves
				if((i/2)%2==1)
				{
					System.out.println(nameOfPlayer2+"'s service");
				}
				else {
					System.out.println(nameOfPlayer1+"'s service");
				}
				//To take Input of who won the point
				System.out.println("Point won by:\n1->"+nameOfPlayer1+"\n2->"+nameOfPlayer2);
				int pointFor=input.nextInt();
				switch(pointFor)//Calculates to whom the point goes for
				{
				case 1:
					onePlayerPoints++;
					System.out.println(nameOfPlayer1+"SCORES!!!");
					break;
				case 2:
					twoPlayerPoints++;
					System.out.println(nameOfPlayer2+"SCORES!!!");
					break;
				default:
					System.out.println("Hello,please enter 1 or 2!!");
					System.exit(0);
				}
				//To show the result of the game
				if((onePlayerPoints>=21) && (onePlayerPoints-twoPlayerPoints)>=2) {
					System.out.println(nameOfPlayer1+" wins");
					System.exit(0);;
				}
				else if(twoPlayerPoints>=21 && (twoPlayerPoints-onePlayerPoints)>=2) {
					System.out.println(nameOfPlayer2+" wins");
					System.exit(0);
				}
				
				//prints the points
				System.out.println("SCORE:1)"+onePlayerPoints+" 2)"+twoPlayerPoints);
				
			}
			//Checks the condition for going to deuce
			if((onePlayerPoints==21 || twoPlayerPoints==21) && ((onePlayerPoints-twoPlayerPoints)==1 || (twoPlayerPoints-onePlayerPoints)==1 || (onePlayerPoints==twoPlayerPoints)))
			{
				System.out.println("\t\t\t\tDEUCE ROUND STARTS\n");
				//loops until set ends
				while((onePlayerPoints-twoPlayerPoints!=2)|| (twoPlayerPoints-onePlayerPoints!=2))
				{
					//for service changes for every point
					if(onePlayerPoints>twoPlayerPoints)
					{
						System.out.println(nameOfPlayer2+"'s service");
						System.out.println("Point won by:\n1->"+nameOfPlayer1+"\n2->"+nameOfPlayer2);
						int pointFor=input.nextInt();
						//takes input of who won the point
						switch(pointFor)
						{
						case 1:
							onePlayerPoints++;
							System.out.println(nameOfPlayer1+"SCORES!!!");
							break;
						case 2:
							twoPlayerPoints++;
							System.out.println(nameOfPlayer2+"SCORES!!!");
							break;
						default:
							System.out.println("Hello,please enter 1 or 2!!");
							System.exit(0);
						}
						//prints the score
						System.out.println("SCORE:1)"+onePlayerPoints+" 2)"+twoPlayerPoints);
					}
					else {
						System.out.println(nameOfPlayer1+"'s service");
						System.out.println("Point won by:\n1->"+nameOfPlayer1+"\n2->"+nameOfPlayer2);
						int pointFor=input.nextInt();
						switch(pointFor)
						{
						case 1:
							onePlayerPoints++;
							System.out.println(nameOfPlayer1+"SCORES!!!");
							break;
						case 2:
							twoPlayerPoints++;
							System.out.println(nameOfPlayer2+"SCORES!!!");
							break;
						default:
							System.out.println("Hello,please enter 1 or 2!!");
							System.exit(0);
						}
						System.out.println("SCORE:1)"+onePlayerPoints+" 2)"+twoPlayerPoints);
					}
					//To declare the winner
					if((onePlayerPoints>=21) && (onePlayerPoints-twoPlayerPoints)>=2) {
						System.out.println(nameOfPlayer1+" wins");
						System.exit(0);;
					}
					else if(twoPlayerPoints>=21 && (twoPlayerPoints-onePlayerPoints)>=2) {
						System.out.println(nameOfPlayer2+" wins");
						System.exit(0);
					}
				}	
			}
		}
		long end1=System.nanoTime();
		//Finding the time taken to complete the set
		long setTime1=((end1-start1)/1000000000);
		System.out.println("Set duration:"+setTime1+"seconds");
		break;
		
		
		
	case 5:
		//Takes the name of teams and players
		System.out.println("Doubles game");
		String nameOfPlayer1a;
		String nameOfPlayer1b;
		String nameOfPlayer2a;
		String nameOfPlayer2b;
		System.out.println("Enter the team 1 name:");
		String team1Name=input.next();
		System.out.println("Enter the team 2 name:");
		String team2Name=input.next();
		System.out.println("Enter the name of player 1(1st team,Serving player):");
		nameOfPlayer1a=input.next();
		System.out.println("Enter the name of player(1st team) 2:");
		nameOfPlayer1b=input.next();
		System.out.println("Enter the name of player(2nd team) 3:");
		nameOfPlayer2a=input.next();
		System.out.println("Enter the name of player(2nd team) 4:");
		nameOfPlayer2b=input.next();
		long start2=System.nanoTime();//To count the set duration
		System.out.println("\t\t\t\t\tBEGIN\tTHE\tGAME");
		int oneTeamPoints=0;
		int twoTeamPoints=0;
		//loops until game ends
		for(int i=0;i<100;i++)
		{
			//Counts the points until the game ends or until we reach deuce.
			if(oneTeamPoints!=21 || twoTeamPoints!=21) {
				//For service changes every 5 points
				if((i/5)%4==0)
				{
					System.out.println(nameOfPlayer1a+"'s service");
				}
				else if((i/5)%4==1) {
					System.out.println(nameOfPlayer2a+"'s service");
				}
				else if((i/5)%4==2) {
					System.out.println(nameOfPlayer1b+"'s service");
				}
				else {
					System.out.println(nameOfPlayer2b+"'s service");
				}
				//To find whi won the point
				System.out.println("Point won by:\n1->"+team1Name+"\n2->"+team2Name);
				int pointsFor=input.nextInt();
				switch(pointsFor)
				{
				case 1:
					oneTeamPoints++;
					System.out.println(team1Name+"SCORES!!!");
					break;
				case 2:
					twoTeamPoints++;
					System.out.println(team2Name+"SCORES!!!");
					break;
				default:
					System.out.println("Well,I told you to enter enter 1 or 2!! Now Byeeeee..");
					System.exit(0);
				}
				//To print the results
				if(oneTeamPoints>=21 && (oneTeamPoints-twoTeamPoints)>=2) {
					System.out.println(team1Name+" wins");
					System.exit(0);
				}
				else if(twoTeamPoints>=21 && (twoTeamPoints-oneTeamPoints)>=2) {
					System.out.println(team2Name+" wins");
					System.exit(0);
				}
				//to print the score
				System.out.println("SCORE:1)"+oneTeamPoints+" 2)"+twoTeamPoints);
				
			}
			//Checks the condition for deuce
			if((oneTeamPoints==21 || twoTeamPoints==21) && ((oneTeamPoints-twoTeamPoints)==1 || (twoTeamPoints-oneTeamPoints)==1 || (oneTeamPoints==twoTeamPoints)))
			{
				System.out.println("\t\t\t\tDEUCE ROUNDS BEGINS\n");
				//loops until the set ends
				while((oneTeamPoints-twoTeamPoints!=2)|| (twoTeamPoints-oneTeamPoints!=2))
				{	
					//For service changes for every point
					if(oneTeamPoints>twoTeamPoints)
					{
						System.out.println(team2Name+"'s service");
						System.out.println("Point won by:\n1->"+team1Name+"\n2->"+team2Name);
						//To find who won the point and further increment the score 
						int pointFor=input.nextInt();
						switch(pointFor)
						{
						case 1:
							oneTeamPoints++;
							System.out.println(team1Name+"SCORES!!!");
							break;
						case 2:
							twoTeamPoints++;
							System.out.println(team2Name+"SCORES!!!");
							break;
						default:
							System.out.println("Hello,please enter 1 or 2!!");
							System.exit(0);
						}
						//Prints the points
						System.out.println("SCORE:1)"+oneTeamPoints+" 2)"+twoTeamPoints);
					}
					else {
						System.out.println(team1Name+"'s service");
						System.out.println("Point won by:\n1->"+team1Name+"\n2->"+team2Name);
						int pointFor=input.nextInt();
						switch(pointFor)
						{
						case 1:
							oneTeamPoints++;
							System.out.println(team1Name+"SCORES!!!");
							break;
						case 2:
							twoTeamPoints++;
							System.out.println(team2Name+"SCORES!!!");
							break;
						default:
							System.out.println("Hello,please enter 1 or 2!!");
							System.exit(0);
						}
						System.out.println("SCORE:1)"+oneTeamPoints+" 2)"+twoTeamPoints);
					}
					//to print the results 
					if(oneTeamPoints>=21 && (oneTeamPoints-twoTeamPoints)>=2) {
						System.out.println(team1Name+" wins");
						System.exit(0);
					}
					else if(twoTeamPoints>=21 && (twoTeamPoints-oneTeamPoints)>=2) {
						System.out.println(team2Name+" wins");
						System.exit(0);
					}	
				}	
			}
		}
		//to print the time taken to complete the set
		long end2=System.nanoTime();
		long setTime2=((end2-start2)/1000000000);
		System.out.println("Set duration:"+setTime2+"seconds");
		break;
	//For any other inputs	
	default:
		System.out.println("Come on...Choose 2 or 5!!!");
		System.exit(0);
	}
	}
}
