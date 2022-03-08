
//***Work in Progess***

//creates ConsoleColors class
public class ConsoleColors {

 // creates color method to be called in Main.java 
 static void color() {
  System.out.println("\n" 
                     + "COLOR: \t \t ANSI CODE:" 
                     //background color coming soonish ...  
                     + "\n" + BLACK + "BLACK" + RESET + "\t \t \\033[0;30m" 
                     + "\n" + RED + "RED" + RESET + "\t \t \t \\033[0;31m" 
                     + "\n" + GREEN + "GREEN" + RESET +  "\t \t \\033[0;32m"
                     + "\n" + YELLOW + "YELLOW" + RESET + "\t \t \\033[0;33m"
                     + "\n" + BLUE + "BLUE" + RESET + "\t \t \\033[0;34m"
                     + "\n" + PURPLE + "PURPLE" + RESET + "\t \t \\033[0;35m"
                     + "\n" + CYAN + "CYAN" + RESET + "\t \t \\033[0;36m"
                     + "\n" + WHITE + "WHITE" + RESET + "\t \t \\033[0;37m");
  }


  //console text color reset (white-ish?)
  public static final String RESET = "\033[0m";
  
  //regular ANSI colors
  public static final String BLACK = "\033[0;30m"; //BLACK
  public static final String RED = "\033[0;31m";   //RED
  public static final String GREEN = "\033[0;32m"; //GREEN
  public static final String YELLOW = "\033[0;33m"; //YELLOW
  public static final String BLUE = "\033[0;34m"; //BLUE
  public static final String PURPLE = "\033[0;35m"; //PURPLE
  public static final String CYAN = "\033[0;36m"; //CYAN
  public static final String WHITE = "\033[0;37m";
  

}
