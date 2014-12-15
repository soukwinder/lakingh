import java.util.Scanner;
import java.net.URI;
import java.awt.Desktop;

public class Lakingh{

int cash = 0;
int health = 100;
boolean kukar;

public void intro(){

Scanner scanner = new Scanner(System.in);
String naam;
System.out.print("Wat is je naam? ");
naam = scanner.nextLine();

System.out.println("Welkom in de wereld van Lakingh, " + naam);
System.out.println(" Elke nacht lag je er nog wakker van. Op een jonge leeftijd werd je vader beroofd, die z'n leven lang hard heeft gewerkt en eerlijk aan zijn geld is gekomen. Uit veiligheid ben je met je familie geëmigreerd naar je buurland. Nu, 15 jaar is je vader er nog steeds niet over, zowel finacieel als emotioneel. Je keert terug naar je thuisland en je bent uit op één ding: wraak.");
System.out.println("Zoek en vind de misdadiger in deze drukke stad. Je geld zal je helemaal zelf moeten verdienen, want je bent helemaal blut.");
}


public static void main (String[] args){

Lakingh lakingh = new Lakingh();

lakingh.intro();

}

}