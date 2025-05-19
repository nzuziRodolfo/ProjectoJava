/*@authour:Nzuzi Rodolfo */

public class tipo {

    
public static void main(String[] args) {
    

    boolean flag = true;
    char ch = 'N';
    int i = 257;
    byte b = 12;
    short s = 24;
    
    long l = 890L; // observa aqui o L
    float f = 3.145f; // observa aqui o f
    double d = 2.1828;
    conta: 
    System.out.println("flag  ="+flag);
    System.out.println("ch  ="+ ch);
    System.out.println("i  ="+i);
    System.out.println("b  ="+b);
    System.out.println(" s  ="+s);
    System.out.println("l  ="+l);
    System.out.println("f  ="+f);
    System.out.println("d  ="+d);

    int a[] = {2,4,7,0,9,0};
    
   

    int [] e = a.clone();

    for (int j : e) {
        System.out.println(j);
    }
        
    }



}

