/*OPERADORES RALACIONAIS E ARITMÉTICOS*/
package javaapplication33;
public class JavaApplication33 {

    
    public static void main(String[] args) {
        boolean r;
        int a, b;
        a=4;
        b=4;
        r= a==b;
        System.out.println("EXPRESSÃO 1: " + r);
        r=a>b;
        System.out.println("EXPRESSÃO 2: "+r);
        r=a<b;
        System.out.println("EXPRESSÃO 3: "+r);
        r=a>=b;
        System.out.println("EXPRESSÃO 4: "+r);
        r=a<=b;
        System.out.println("EXPRESSÃO 5: "+r);
        r=a!=b;
        System.out.println("EXPRESSÃO 6: "+r);
        r=a+2>=b-2;
        System.out.println("EXPRESSÃO 7: "+r);
        r=(a+b)*2!=a+b-3;
        System.out.println("EXPRESSÃO 8: "+r);
        
    }
    
}
