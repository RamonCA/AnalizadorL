/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorl;

import java.util.Scanner;

/**
 *
 * @author fatim
 */
public class AnalizadorL {
    int cont=0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Cadena;
        AnalizadorL a=new AnalizadorL();
        
        Scanner sc = new Scanner(System.in);
        String[] entradaArr;
        
        entradaArr = sc.nextLine().split(" ");
        
        for (int i = 0; i < entradaArr.length; i++) {
            a.cont=0;
            Cadena=entradaArr[i];
            a.e12(Cadena);
        }
        
        
    }
    
    public void e12(String c){
        if(Character.isDigit(c.charAt(cont))){
            //cont++;
            e13(c);
            cont++;
            
        }else{
            System.out.println("<"+c+","+"error>");
        }

    }
    
    public void e13(String c){

        if(Character.isDigit(c.charAt(cont))){
            cont++;
            if(cont<c.length()){
                if(c.charAt(cont)=='.'){
                    cont++;
                    e14(c);
                    
                }else if(c.charAt(cont)=='E'){
                    cont++;
                    e16(c);
                    
                }else                
                    e13(c);

            }
            else {
                e20(c);
            }
            

        }else{
            System.out.println("<"+c+","+"error>");
        }
    }
        
    public void e14(String c){
        if(Character.isDigit(c.charAt(cont))){
            e15(c);
            
        }else{
            System.out.println("<"+c+","+"error>");
        }        
    }
        
    public void e15(String c){

        if(Character.isDigit(c.charAt(cont))){
            cont++;
            if(cont<c.length()){
                if(c.charAt(cont)=='E'){
                    cont++;
                    e16(c);
                    
                }else                
                    e15(c);

            }
            else {
                e21(c);
            }
            

        }else{
            System.out.println("<"+c+","+"error>");
        }
    }
        
    public void e16(String c){
        //System.out.println(c.charAt(cont));
        if(Character.isDigit(c.charAt(cont))){
            e18(c);
            
        }else if(c.charAt(cont)=='+'||c.charAt(cont)=='-'){
            cont++;
            e17(c);
        }
        else{
            System.out.println("<"+c+","+"error>");
        } 
    }    

    public void e17(String c){
        if(Character.isDigit(c.charAt(cont))){
            e18(c);
            
        }else{
            System.out.println("<"+c+","+"error>");
        }  
    }
    
    public void e18(String c){
        if(Character.isDigit(c.charAt(cont))){
            cont++;
            if(cont<c.length()){               
                e18(c);
            }
            else {
                e19(c);
            }
            

        }else{
            System.out.println("<"+c+","+"error>");
        }
    }
        
    public void e19(String c){
        System.out.println("<"+c+","+"Exponente>");
    }
        
    public void e20(String c){
        System.out.println("<"+c+","+"entero>");
    }
        
    public void e21(String c){
        System.out.println("<"+c+","+"Flotante>");        
    }         
        
    
}
