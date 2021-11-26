
package Actividad;

import javax.swing.JOptionPane;

/*
Realizar un programa utilizando switch e if 
Que pregunte el nombre del usuario y posteriormente muestre el siguiente menu:
**********************
Menu de Actividades
D. Dormir
E. Estudiar
T. Trabajar
Que deseas hacer?
****************************
En caso de que sea D hacer lo siguiente:
Preguntar cuantas horas desea dormir.
* Si las horas estan entre 1 a 4 informar que es poco tiempo pero se sobrevive.
* Si las horas estan entre 5 y 8, informar que son las horas promedio que un ser humano duerme.
* Si las horas son mayores a 8, informar que es demasiado y que duerme mas de lo que vive.
En cualquier otro caso, informarle que no se puede vivir sin dormir
*****************************
En caso de que sea E hacer lo siguiente:
Preguntar cuantas horas desea Estudiar.
* Si las horas son menor o igual a cero, informar que mejor se ponga a trabajar
* Si las horas estan entre 1 y 7, informarle que es un Estudiante Normal.
En cualquier otro caso, informarle que es un NERD...
**************************************
En caso de que sea T hacer lo siguiente:
Preguntar cuantas horas desea trabajar.
* Si las horas estan entre 1 y 8, informarle que es Trabajador.
* Si las horas estan entre 9 y 12, informarle que es super trabajador.
* Si las horas son mayor a 12, informarle que no tiene vida social pero seguramente algun dia sera millonario
En cualquier otro caso, informarle que es el dueño de la empresa o es un narco
*******************
En cualquier otro caso, informar que no selecciono una opcion correcta
 */
public class Actividad {
    public static void main(String[] args) {
        String usuario;
        char opcion;
        int horas;
        
        usuario = JOptionPane.showInputDialog(" Ingrese su usuario ");
        
        opcion = JOptionPane.showInputDialog( " Menu de Actividades\n" +
                "D. Dormir\n" +
                "E. Estudiar\n" +
                "T. Trabajar\n" +
                "Que deseas hacer? ").charAt(0);
        
        switch(opcion){
            case 'd':
            case 'D': horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas desea dormir: "));
                if (horas>= 1 && horas <=4 ){
                    JOptionPane.showMessageDialog(null, horas+" horas. Es poco tiempo pero se sobrevive");
                }
                else if (horas>= 5 && horas <=8 ){
                    JOptionPane.showMessageDialog(null, horas+" Son las horas promedio que un ser humano duerme.");
                }
                else if (horas> 8){
                    JOptionPane.showMessageDialog(null, horas+" Horas es demasiado, duermes mas de lo que vive");
                }
                else {
                    JOptionPane.showMessageDialog(null, horas+". Hay que dormir lo necesario para poder vivir");                    
                }
                break;
                
            case 'e':   
            case 'E': horas = Integer.parseInt(JOptionPane.showInputDialog(" Cuantas horas deseas estudiar: "));
                if (horas<= 0){
                    JOptionPane.showMessageDialog(null, horas+" Nombe, Mejor PONTE A TRABAJAR");
                }
                else if (horas>= 1 && horas <=7 ){
                    JOptionPane.showMessageDialog(null, horas+" Average Student");
                }
                else {
                    JOptionPane.showMessageDialog(null, horas+". Eres NERD");                    
                }
                break;
                
            case 't':    
            case 'T': horas = Integer.parseInt(JOptionPane.showInputDialog(" Cuantas horas desea Trabajar: "));
                if (horas>= 1 && horas <=8 ){
                    JOptionPane.showMessageDialog(null, horas+" horas. Trabajador normalito ");
                }
                else if (horas>= 9 && horas <=12 ){
                    JOptionPane.showMessageDialog(null, horas+" Super Trabajador");
                }
                else if (horas> 12){
                    JOptionPane.showMessageDialog(null, horas+" Horas. NO social Life");
                }
                else {
                    JOptionPane.showMessageDialog(null, horas+". Seras dueño de la company");                    
                }
                break;
                
            default: 
                JOptionPane.showMessageDialog(null, " No selecciono una opcion correcta");
                break;
        
        }
    }
}
