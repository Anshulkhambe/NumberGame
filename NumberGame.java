import java.util.Random;
import java.util.Scanner;

public class NumberGame {
Random r=new Random();
	
	Scanner sc=new Scanner(System.in);
	int randomNumber=r.nextInt(100)+1;
	
	int trycount=0;
	int score=100;
	int attempts=10;
	
	public int calculatescore(int attempts) {
		if(attempts>=1 && attempts<=3) {
			return 100;
		}
		else if(attempts>=4 && attempts<=7) {
			return 60;
		}
		else if(attempts>=8 && attempts==10){
		return 40;	
		}
		else {
			return 30;
		}
	 
	 }
	
public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public int getTrycount() {
		return trycount;
	}

	public void setTrycount(int trycount) {
		this.trycount = trycount;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
  public void updateAttempts() {
	  this.attempts--;
  }
  public void updateCount() {
	  trycount++;  
  }
public static void main(String[] args) {
Random r=new Random();
NumberGame n=new NumberGame();
//System.out.println(n.getRandomNumber());

Scanner sc=new Scanner(System.in);
boolean bool=true;
while(bool) {
	if(n.getAttempts()<=0) {
		System.out.println("you loose");
		bool=false;
	}
	else {
	System.out.println("Enter your gusess from(1-100):");
    System.out.println("You have "+n.getAttempts()+ "  attempts ");
int playerGuess=sc.nextInt();
n.updateCount();
n.updateAttempts();


if(playerGuess==n.getRandomNumber()) {
System.out.println("Correct! You Win");
System.out.println("It tooks you "+n.getTrycount()+"attempts");


System.out.println("Your score is"+n.calculatescore(n.getAttempts()));
break;
}
else if(n.getRandomNumber()>playerGuess) {
System.out.println("No! The number is Higher. Guess again");
}


else {
System.out.println("No! The number is Lower. Guess again");
}
}
}	
}
}