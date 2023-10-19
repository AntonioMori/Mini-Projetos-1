// main class
public class historyTelling{
     
    public static void main(String[] args) {
        funcoes.saida(dados.capitulos.titulo);
        funcoes.saida(dados.capitulos.cap1);
        funcoes.saida(dados.escolhas.escolha_A +"\n" + dados.escolhas.escolha_B);
        int escolha = funcoes.entradaInt("Escolha uma opção: ");
        
        while(escolha != 1 && escolha != 2){
            funcoes.saida("Opção inválida, digite novamente.");
            escolha = funcoes.entradaInt("Escolha uma opção: ");
        }

        if(escolha == 1){

            funcoes.saida(dados.escolhas.escolha_A + "\n" + dados.capitulos.cap2);
            escolha = 0;

            funcoes.saida(dados.escolhas.escolha_A1 + "\n" + dados.escolhas.escolha_A2);
            escolha = funcoes.entradaInt("Escolha uma opção: ");
           
            while(escolha != 1 && escolha != 2){
                funcoes.saida("Opção inválida, digite novamente.");
                escolha = funcoes.entradaInt("Escolha uma opção: ");
            }
            
            if(escolha == 1){
                funcoes.saida(dados.escolhas.escolha_A1 + "\n" + dados.finais.final_A1);
            }
            else if(escolha == 2){
                funcoes.saida(dados.escolhas.escolha_A2 + "\n" + dados.finais.final_A2);
            }

        }

         else if (escolha == 2){

            funcoes.saida(dados.escolhas.escolha_B + "\n" + dados.capitulos.cap2);
            escolha = 0;
            
            funcoes.saida(dados.escolhas.escolha_B1 + "\n" + dados.escolhas.escolha_B2);
            escolha = funcoes.entradaInt("Escolha uma opção: ");

            while(escolha != 1 && escolha != 2){
                funcoes.saida("Opção inválida, digite novamente.");
                escolha = funcoes.entradaInt("Escolha uma opção: ");
            }

            if(escolha == 1){
                funcoes.saida(dados.escolhas.escolha_B1 + "\n" + dados.finais.final_B1);
            }
            else if(escolha == 2){
                funcoes.saida(dados.escolhas.escolha_B2 + "\n" + dados.finais.final_B2);
            }
        }

       
    
    
    
    
    
    
    
    
    }
}