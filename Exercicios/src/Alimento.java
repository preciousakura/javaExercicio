


public class Alimento {
    String[] alimento = new String[100];
    int quant = 0;

    public void adicionarAlimento(String alim){
      alimento[quant] = alim;
      System.out.println("O produto "+alimento[quant]+" foi adicionado com sucesso.");
      quant++;
    }

    public void removeAlimento(int codigo){
      if((codigo-1 < (quant) && (codigo > 0))) {
      System.out.println("O produto "+alimento[codigo-1]+" foi removido com sucesso.");
      alimento[codigo-1] = null;

    }
    else{
      System.out.println("Código Inválido!");
    }
  
  }

    public void mostraAlimentos(){
      if (quant > 0) {
      System.out.println("------------- ALIMENTOS -------------");
      for(int i = 0; i < quant; i++){
        if(alimento[i] != null){
          System.out.println((i+1)+". "+alimento[i]);
        }
      }
    }
    else{
      System.out.println("Sem produtos cadastrados!");
    }
    }
}


