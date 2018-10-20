/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package proyectopersonajes;


/**
 *
 * @author Khriiz
 */
public class Proyectopersonajes {

   public String clase;
   public String subclase;
   public int hp;
   public String genero;
   public String raza;
   
   
   
   public Proyectopersonajes(){
       
       System.out.println("hola");
       
   }
   public Proyectopersonajes(String clase, String subclase, int hp, String genero, String raza){
       
       this.clase = clase;
       this.subclase = subclase;
       this.hp = hp;
       this.genero = genero;
       this.raza = raza;
       
      
       
   }
   
   
   public static void main (String [] args){
       
     
       
       Proyectopersonajes pj1 = new Proyectopersonajes ("Arquero","Cazador",1500,"Masculino","Humano");
       
       pj1.clase = "Arquero";
       pj1.subclase = "Cazador";
       pj1.hp = 1500;
       pj1.genero = "Masculino";
       pj1.raza = "Humano";
       
       System.out.println("Personaje N°1: ");
       System.out.println(pj1.clase);
       System.out.println(pj1.subclase);
       System.out.println("HP: " + pj1.hp);
       System.out.println(pj1.genero);
       System.out.println(pj1.raza);
       
       Proyectopersonajes pj2 = new Proyectopersonajes ("Gerrero","Caballero",3500,"Masculino","Humano");
       
       pj2.clase = "Guerrero";
       pj2.subclase = "Caballero";
       pj2.hp = 3500;
       pj2.genero = "Masculino";
       pj2.raza = "Humano";
       
       System.out.println("Personaje N°2: ");
       System.out.println(pj2.clase);
       System.out.println(pj2.subclase);
       System.out.println("HP: " + pj2.hp);
       System.out.println(pj2.genero);
       System.out.println(pj2.raza);
       
       Proyectopersonajes pj3 = new Proyectopersonajes ("Gerrero","Barbaro",3000,"Femenino","Enano");
       
       pj3.clase = "Guerrero";
       pj3.subclase = "Barbaro";
       pj3.hp = 3000;
       pj3.genero = "Femenino";
       pj3.raza = "Enano";
       
       System.out.println("Personaje N°3: ");
       System.out.println(pj3.clase);
       System.out.println(pj3.subclase);
       System.out.println("HP: " + pj3.hp);
       System.out.println(pj3.genero);
       System.out.println(pj3.raza);
       
       Proyectopersonajes pj4 = new Proyectopersonajes ("Arquero","Tirador",1475,"Femenino","Humano");
       
       pj4.clase = "Arquero";
       pj4.subclase = "Tirador";
       pj4.hp = 1475;
       pj4.genero = "Femenino";
       pj4.raza = "Humano";
       
       System.out.println("Personaje N°4: ");
       System.out.println(pj4.clase);
       System.out.println(pj4.subclase);
       System.out.println("HP: " + pj4.hp);
       System.out.println(pj4.genero);
       System.out.println(pj4.raza);
       
       Proyectopersonajes pj5 = new Proyectopersonajes ("Alquimista","Curador",1400,"Femenino","Enano");
       
       pj5.clase = "Alquimista";
       pj5.subclase = "Curador";
       pj5.hp = 1400;
       pj5.genero = "Femenino";
       pj5.raza = "Enano";
       
       System.out.println("Personaje N°5: ");
       System.out.println(pj5.clase);
       System.out.println(pj5.subclase);
       System.out.println("HP: " + pj5.hp);
       System.out.println(pj5.genero);
       System.out.println(pj5.raza);
   }
}