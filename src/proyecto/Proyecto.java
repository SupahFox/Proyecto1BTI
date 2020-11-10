
package proyecto;
import java.util.Scanner;
import java.util.Random;

public class Proyecto {

    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1=0;
    int salir = 0;
    do{
        System.out.println("1 para el tateti");
        System.out.println("2 para piedra papel o tijeras");
        System.out.println("3 para juego de dados");
        System.out.println("4 para cartas ");
        System.out.println("5 para juego de la moneda");      
    
    num1= teclado.nextInt();
        switch(num1){
        case 1:
         int tateti= tateti(num1 , num1);
          break;
        case 2:
         int ppot= ppot(num1 , num1);
          break;
        }
     System.out.println("Deseas salir? Oprime 1 para salir o escribe cualquier número para continuar");
     salir = teclado.nextInt();
    }while(salir != 1);
  }
    
     public static int tateti(int a , int b) {
      Scanner teclado = new Scanner (System.in);
    int linea1[] = new int[3];
    String op;
    
    char fila1[] = {' ', ' ', ' '};
    char fila2[] = {' ', ' ', ' '};
    char fila3[] = {' ', ' ', ' '};
    
    boolean X = true;
    boolean O = false;
    int cont = 0;
    int salir = 0;
    int repetido = 0;
       
        System.out.println(" ");
        System.out.println("TATETI");
        System.out.println(" ");
        
        System.out.println("La tabla se ve asì");
        System.out.println("   1   2   3 ");
        System.out.println(" ═══════ ");
        System.out.println("a║  ║  ║  ║");
        System.out.println(" ═══════ ");
        System.out.println("b║  ║  ║  ║");
        System.out.println(" ═══════ ");
        System.out.println("c║  ║  ║  ║");
        System.out.println(" ═══════ ");
       

        do{

       if(X == true){
        System.out.println("Jugador 1 (X). Ingrese una posicion");
        }
       if(O == true){
        System.out.println("Jugador 2 (O). Ingrese una posicion");
        }

            
            
        op = teclado.nextLine();
        
        //LINEA 1
        //A1
        if(op.equals("a1") && X==true){ 
        fila1[0] = 'X';
        cont++;
        }
        
        if(op.equals("a1") && O==true){ 
        fila1[0] = 'O';
        cont++;
        }
        
       //A2
        if(op.equals("a2") && X==true){
        fila1[1] = 'X';
        cont++;
        }
        if(op.equals("a2") && O==true){
        fila1[1] = 'O';
        cont++;
        }
      //A3
        if(op.equals("a3")&& X==true){
        fila1[2] = 'X';
        cont++;
        }
        if(op.equals("a3") && O==true){
        fila1[2] = 'O';
        cont++;
        }
        
      //LINEA 2
      //b1
        if(op.equals("b1") && X==true){ 
        fila2[0] = 'X';
        cont++;
        }
        if(op.equals("b1") && O==true){ 
        fila2[0] = 'O';
        cont++;
        }
      //b2
        if(op.equals("b2") && X==true){
        fila2[1] = 'X';
        cont++;
        }
        if(op.equals("b2") && O==true){
        fila2[1] = 'O';
        cont++;
        }
      //b3
        if(op.equals("b3")&& X==true){
        fila2[2] = 'X';
        cont++;
        }
        if(op.equals("b3")&& O==true){
        fila2[2] = 'O';
        cont++;
        }
        
      //LINEA 3
      //c1
        if(op.equals("c1") && X==true){ 
        fila3[0] = 'X';
        cont++;
        }
        if(op.equals("c1") && O==true){ 
        fila3[0] = 'O';
        cont++;
        }
      //c2
        if(op.equals("c2") && X==true){
        fila3[1] = 'X';
        cont++;
        }
        if(op.equals("c2") && O==true){
        fila3[1] = 'O';
        cont++;
        }
      //c3
        if(op.equals("c3")&& X==true){
        fila3[2] = 'X';
        cont++;
        }
        if(op.equals("c3")&& O==true){
        fila3[2] = 'O';
        cont++;
        }
        
        if(cont ==1){
        O = true;
        X = false;
        }
        if(cont ==2){
        O = false;
        X = true;
        }
        if(cont ==3){
        O = true;
        X = false;
        cont = 1;
        }
    System.out.println("    1    2    3 ");
    System.out.println(" ═════════ ");     
    System.out.println("a║ "+fila1[0]+" ║ "+fila1[1]+" ║ "+fila1[2]+" ║");
    System.out.println(" ═════════ ");
    System.out.println("b║ "+fila2[0]+" ║ "+fila2[1]+" ║ "+fila2[2]+" ║");
    System.out.println(" ═════════ ");
    System.out.println("c║ "+fila3[0]+" ║ "+fila3[1]+" ║ "+fila3[2]+" ║");
    System.out.println(" ═════════ ");
    
    //COMPROBAR LINEAS HORIZONTALES
    // X
    if(fila1[0] == 'X' && fila1[1] == 'X' && fila1[2] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    } 
    if(fila2[0] == 'X' && fila2[1] == 'X' && fila2[2] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    if(fila3[0] == 'X' && fila3[1] == 'X' && fila3[2] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
  //O  
    if(fila1[0] == 'O' && fila1[1] == 'O' && fila1[2] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    } 
    if(fila2[0] == 'O' && fila2[1] == 'O' && fila2[2] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    if(fila3[0] == 'O' && fila3[1] == 'O' && fila3[2] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    
    
    //COMPROBAR LINEAS VERTICALES
    // X
    if(fila1[0] == 'X' && fila2[0] == 'X' && fila3[0] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    } 
    if(fila1[1] == 'X' && fila2[1] == 'X' && fila3[1] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    if(fila1[2] == 'X' && fila2[2] == 'X' && fila3[2] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
  //O  
    if(fila1[0] == 'O' && fila2[0] == 'O' && fila3[0] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    } 
    if(fila1[1] == 'O' && fila2[1] == 'O' && fila3[1] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    if(fila1[2] == 'O' && fila2[2] == 'O' && fila3[2] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    
    
    
    //LINEAS DIAGONALES
    //X
    if(fila1[0] == 'X' && fila2[1] == 'X' && fila3[2] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    } 
    if(fila3[2] == 'X' && fila2[1] == 'X' && fila1[0] == 'X'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    //O
    if(fila1[0] == 'O' && fila2[1] == 'O' && fila3[2] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    } 
    if(fila3[2] == 'O' && fila2[1] == 'O' && fila1[0] == 'O'){
        System.out.println("Jugador 1. Ganaste!!!");
        System.out.println("Quieres salir? Escribe 1 para salir");
        salir = teclado.nextInt();
    }
    
 
    }while(salir != 1);
        
    return a + b;
  }
  
     public static int ppot(int a , int b){
      System.out.println("No hay");
      return a + b;
  }
  
     public static int moneda (int a, int b){
     Scanner sc = new Scanner(System.in);
     Random rnd = new Random();
     int moneda = 0;
     int op = 0;
     int tirar= 0;
     do{
     System.out.println("Para tirar la moneda escribe 1");
     tirar = sc.nextInt();
     if(tirar==1){
      moneda = 1 + rnd.nextInt(2);
     
      System.out.println("Desea tirar otra moneda? Escribe 1 para salir");
     op = sc.nextInt();
     }
     }while(op != 1);
     return a + b;
}
}
