/* 
 * ..::⋮⋮⁞⁞WOW MEOW WOW⁞⁞⋮⋮::.. 
 * ˙˙::⋮⋮⁞⁞˓˓ก₍⸍⸌̣ʷ̣̫⸍̣⸌₎ค˒˒ ⁞⁞⋮⋮::˙˙
 * "IF CODING IS NOT FUN WHAT'S THE POINT!" 
 * MEOWSER EXPERIMENT: #0001
 * Playing w/Java & Colors Self Study
 * Simple color changes for Java console
 */


class Main {
  public static void main(String[] args) {

/* 
 * Prints standard console color & inserts line break. 
 * Uses escape sequences "\n" for line breaks. 
 * Uses \033[47m to create white background.
 * Note the use of "\". Everytime you see one its related to a   
 * Java escape sequence. I used them a lot in this code to help with  
 * visual styling and for the colors to show.
 */
    System.out.println("\n"+ "H" + 
                       ("\033[0;30m" + ("\033[47m" + "E")) + "\033[0;31mL"
                       + "\033[0;32mL" + "\033[0;33mO" + " " 
                       + "\033[0;34mW" + "\033[0;35mO"+ "\033[0;36mR"
                       + ("\033[0;30m" + ("\033[47m" + "L")) 
                       + "\033[0;37mD" + "\033[0;33m!");


    //Prints display title 
    System.out.println("\033[0m \n" + "REGULAR ANSI COLORS IN JAVA CONSOLE:" + "\n");

    //Prints color and ANSI code title | \t is for tabbing
    System.out.println("COLOR: \t \t ANSI CODE: \n");

    // There's probably a cleaner way to do it but this works for now. 
    System.out.println("\033[0;30m" 
                       + ("\033[47m" + "BLACK") 
                       + "\033[0;37m \t \t \\033[0;30m");         //BLACK
    System.out.println("\033[0;31m" 
                       + "RED \033[0;37m \t \t \\033[0;31m");     //RED
    System.out.println("\033[0;32m" 
                       + "GREEN \033[0;37m \t \t \\033[0;32m");   //GREEN
    System.out.println("\033[0;33m" 
                       + "YELLOW \033[0;37m \t \\033[0;33m");     //YELLOW
    System.out.println("\033[0;34m" 
                       + "BLUE \033[0;37m \t \t \\033[0;34m");    //BLUE
    System.out.println("\033[0;35m" 
                       + "PURPLE \033[0;37m \t \\033[0;35m");     //PURPLE
    System.out.println("\033[0;36m" 
                       + "CYAN \033[0;37m \t \t \\033[0;36m");    //CYAN
    System.out.println("\033[0;37m" 
                       + "WHITE \033[0;37m \t \t \\033[0;37m");   //WHITE 



    


  }

  


}