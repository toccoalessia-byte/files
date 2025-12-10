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

public Studente(String nome, String cognome,
