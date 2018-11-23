/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import model.color.Color;

/**
 *
 * @author CAMILO
 */
public class Controller {
    
    private LinkedList<Color> colors= new LinkedList<Color>();

    public Controller() {
        initColors();
    }
    
    
    
    public void initColors(){
        Color rojo = new Color("ROJO", "PRIMARIO", "#FF0000", "ROJO");
        this.colors.add(rojo);
        Color amarillo = new Color("AMARILLO", "PRIMARIO", "#FFFF00","AMARILLO");
        this.colors.add(amarillo);
        Color azul = new Color("AZUL", "PRIMARIO", "#0000FF", "AZUL");  
        this.colors.add(azul);
        Color naranja = new Color("NARANJA", "SECUNDARIO", "#FF8000", "AMARILLOROJO");
        this.colors.add(naranja);
        Color verde = new Color("VERDE", "SECUNDARIO", "#008F39","AMARILLOAZUL");
        this.colors.add(verde);
        Color violeta = new Color("VIOLETA", "SECUNDARIO", "#4C2882","AZULROJO");  
        this.colors.add(violeta);
        Color rojoViolaceo = new Color("VIOLETAROJIZO", "TERCIARIO", "#922B3E", "ROJOVIOLETA" );
        this.colors.add(rojoViolaceo);
        Color rojoAnaranjado = new Color("NARANJAROJIZO", "TERCIARIO", "#FF4000", "NARANJAROJO");
        this.colors.add(rojoAnaranjado);
        Color amarilloAnaranjado = new Color("AMARILLONARAJADO", "TERCIARIO", "#ED760E", "AMARILLONARANJA");  
        this.colors.add(amarilloAnaranjado);
        Color amarilloVerdoso = new Color("AMARILLOVERDOSO", "TERCIARIO", "#9ACD32", "AMARILLOVERDE");
        this.colors.add(amarilloVerdoso);
        Color azulVerdoso = new Color("AZULVERDOSO", "TERCIARIO", "#1F3438", "AZULVERDE");
        this.colors.add(azulVerdoso);
        Color azulViolaceo = new Color("AZULVIOLETA", "TERCIARIO", "#4f14b7", "AZULVIOLETA");  
        this.colors.add(azulViolaceo);
    }
    
    
    public List<Color> getPrimary(){
        List<Color> primarios ;
        primarios = this.colors.stream().filter(color -> color.getTipo().equals("PRIMARIO")).collect(Collectors.toList()); 
        return primarios;
    }
    
    public Color mixTwoColors(String nameColor1, String nameColor2){
        String key = nameColor1.concat(nameColor2);
        String inverseKey = nameColor2.concat(nameColor1);
        for(Color c :this.colors ){
            if(c.getKey().equals(key)|| c.getKey().equals(inverseKey)){
                return c;
            }
        }
        return null;
        
    }
    
    
    
    
    
}
