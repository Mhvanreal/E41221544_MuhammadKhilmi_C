/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Faktorial {
    static int faktorialrekursif(int n){
        if (n == 0 ){
            return 1;
        }else {
            return n * faktorialrekursif(n - 1);
        }
    }
    static int faktorialinteratif(int n){
        int faktor = 1;
        for (int i = n; i >= 1;i--){
        faktor *=i;    
        }
        return faktor;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(faktorialrekursif(3));
        System.out.println(faktorialinteratif(5));
    
    }
    
    
}
