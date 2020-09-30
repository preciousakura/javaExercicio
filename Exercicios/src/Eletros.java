public class Eletros {
    String[] eletros = new String[100];
    int quant = 0;

    public void adicionarEletro(String eletro){
        eletros[quant] = eletro;
        System.out.println("O produto "+eletros[quant]+" foi adicionado com sucesso.");
        quant++;
      }
  
      public void removeEletro(int codigo){
        if((codigo-1 < (quant) && (codigo > 0))) {
        System.out.println("O produto "+eletros[codigo-1]+" foi removido com sucesso.");
        eletros[codigo-1] = null;

      }
      else{
        System.out.println("Código Inválido!");
      }
    }
  
      public void mostraEletro(){
        if (quant > 0) {
        System.out.println("------------- ELETRÔNICOS -------------");
        for(int i = 0; i < quant; i++){
          if(eletros[i] != null){
            System.out.println((i+1)+". "+eletros[i]);
          }
        }
      }
      else{
        System.out.println("Sem produtos cadastrados!");
      }
    }
}
