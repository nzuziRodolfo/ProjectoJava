/**
 * if
 */
public class ifTeste {


  public  void  irParaEscola(){

System.out.println("ir para escola");

    }

    void voltarParaCasa(){
System.out.println("ir para escola");   
    }

    void banharNachuva(){
System.out.println("banhar, vamos banhar na chuva");
    }

public static void main(String[] args) {
    ifTeste as = new ifTeste();
       int nivelDachuva = 1;
    if (nivelDachuva<2) {
        as.irParaEscola();
        as.voltarParaCasa();
    } 
     else if (nivelDachuva < 5){
    as.banharNachuva();
} else {
    as.voltarParaCasa(); 

}

    
}
}