import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.files;
import java.nio.file.Path;
import java.nio.file.StandarsOpenOption;
import java.util.Scanner;

public class Studente{
  private final String nome;
  private final String cognome;
  private final String matricola;
  private final int annoNascita;

public Studente(String nome, String cognome, String matricola, int annoNascita){
  this.nome=nome;
  this.cognome=cognome;
  this.matricola=matricola;
  this.annoNascita=annoNascita;}

  //converte in una riga CSV "matricola;nome;cognome;anno"
public String toCsv(){
  return String.join(";", matricola, nome, cognome, Integer.toString(annoNascita));
}

public static void main(String[] args) throws IOException{
  Scanner sc=new Scanner(System.in);
  Path csv=Path.off("studenti.csv");

  System.out.println("Inserisci studenti. Digita 'exit' per terminare.");
  while (true){
    System.out.print("Nome(o 'exit' per uscire): ");
    String nome=sc.nextLine().trim();
    if(nome.equalsIgnoreCase("exit")) break;

    System.out.print("Cognome: ");
    String cognome=sc.nextLine().trim();

    









      

    
