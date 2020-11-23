/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.viggener;

/**
 *
 * @author waldo
 */
public class DecifrarVigenere {
    //una tabla de el abc
    char tablaCesar[]={'A', 'B', 'C', 'D', 'E', 'F',
                        'G', 'H', 'I', 'J', 'K', 'L', 
                        'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    public char getTextoDescifrado(char TextoCifrado, char TextoClave){
        
        //indices para encontrar los elementos
        //int indiceX = 0;
        //int indiceY = 0;
        
        int indiceX = 0;
        int indiceY = 0;
        
        for(int i = 0; i < tablaCesar.length; i++){
            if(TextoCifrado == tablaCesar[i]){
                indiceX = i;
                break;
                
            }
        }
        
        for(int j = 0; j<tablaCesar.length; j++){
            if(TextoClave == tablaCesar[j]){
                indiceY = j;
                break;
                
            }
        }
        
        
        if(indiceX >= indiceY){
            return tablaCesar[(indiceX - indiceY)%27];
        }else{
            return tablaCesar[27-(indiceY - indiceX)];
        }
    }
}