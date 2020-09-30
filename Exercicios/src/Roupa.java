public class Roupa {
    String[] roupas = new String[100];
    int quant = 0;

    public void adicionarRoupa(String roupa){
        roupas[quant] = roupa;
        System.out.println("O produto "+roupas[quant]+" foi adicionado com sucesso.");
        quant++;
      }
  
      public void removeRoupa(int codigo){
        if((codigo-1 < (quant) && (codigo > 0))) {
        System.out.println("O produto "+roupas[codigo-1]+" foi removido com sucesso.");
        roupas[codigo-1] = null;
        
      }
      else{
        System.out.println("Código Inválido!");
      }
    
    }
  
      public void mostraRoupa(){
        if (quant > 0) {
        System.out.println("------------- ROUPAS -------------");
        for(int i = 0; i < quant; i++){
          if(roupas[i] != null){
            System.out.println((i+1)+". "+roupas[i]);
          }
        }
      }
      else{
        System.out.println("Sem produtos cadastrados!");
      }
    }
}
