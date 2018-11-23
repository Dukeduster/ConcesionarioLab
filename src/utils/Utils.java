/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;

/**
 *
 * @author CAMILO
 */
public class Utils {
    
    public static Color getRgbColor(String hex){
        Color rgb = Color.decode(hex);
        return rgb;
    }
    
}
