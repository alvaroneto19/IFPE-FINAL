package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Biblioteca {

    
   
    public static void main(String[] args) throws EscolhalimitadaExceções{
    Biblioteca teste = new Biblioteca();
    
    Scanner teclado = new Scanner(System.in);    
    Scanner tecladoString = new Scanner(System.in);     
  
       
        
        int cadastramento;
        double começo,fim;
        Livros nLivros;
        
        String titulo, autor, tipo;
        float preço = 0;    
        int chave;
        
        do{
                 criarcadastro();
                 try{
                
                     cadastramento = tecladoString.nextInt();
                        if(cadastramento != 1 
                        && cadastramento != 2 
                        && cadastramento != 3 
                        && cadastramento != 4 
                        && cadastramento != 5
                        && cadastramento != 6
                        && cadastramento != 7){
                            
                        }else{
                            
                        }
                 
                     }catch(Exception a){
                         System.out.println("Opçao invalida, escolha de [1-7]");
                         System.out.print("Digite Novamente: ");
                         cadastramento = teclado.nextInt();
                     
                 }
                
                 
                switch(cadastramento){
                case 1:
                    System.out.println(">>>>>>> ADICIONAR OBRA <<<<<<");
                    
                    System.out.print("titulo: ");
                    titulo=tecladoString.nextLine();
                    System.out.println("\n");
                    System.out.print("Autor: ");
                    autor=tecladoString.nextLine();
                    System.out.print("Tipo:");
                    tipo=tecladoString.nextLine();                  
                    System.out.print("Preço: ");
                    // LANÇAMENTO DE EXCEÇÃO //
                    try{
                        preço=tecladoString.nextFloat();
                        if(preço > 500){
                            throw new EscolhalimitadaExceções();
                        }else{             
                        }
                    }catch (EscolhalimitadaExceções a){
                           System.out.println("Diacordo com normas, o preço não pode extender R$ 500 reias");
                           System.out.print("Por favor, colocar preço no limite ");
                           System.out.print("Preço: ");
                           preço=teclado.nextFloat(); 
                    }
                    System.out.print("Chave: ");
                    // LANÇAMENTO DE EXCEÇÃO //
                    try{
                    chave=teclado.nextInt();   
                    if(chave != 100 && chave != 101 && chave != 102 && chave != 103){
 
                        throw new EscolhalimitadaExceções();
 
                    }else{
                     
                    }
                       } catch (EscolhalimitadaExceções a){
                           System.out.println("Chave so é valido com valores de 100 a 105");
                           System.out.print("Digite novamente: ");
                           chave=teclado.nextInt(); 
    
                        
                    }
 
                    nLivros = new Livros(titulo,autor,tipo,preço,chave);
                    Livros.adicionar(nLivros);
                    break;
                    
                     
                           
                      
                    
               
                           
                   
                    
                case 2:
                    System.out.println(">>>>>> VERIFICAR OBRAS <<<<<<");
                    System.out.println("---Ver todos os livros----");
                    System.out.println(Livros.ver());
                    break;
                case 3:
                    System.out.println(">>>>> REMOVER LIVRO <<<<<   ");
                    System.out.print("Titulo do livro: ");
                    titulo=tecladoString.nextLine();
                    if (! (Livros.getverlivros().isEmpty())){
                        if (Livros.retirar(titulo)){
                            System.out.println("Livro retirado");
                            
                        }else{
                            System.out.println("Esse Livro nao foi encontrado");
                        }
                    }else{
                        System.out.println(" Sem livros na livraria ");
                        
                    }
                    break;
                    
                    
                case 4:
                    System.out.println(">>>>> VER POR TIPO <<<<<");
                    System.out.println("Tipo do livro;"
                            + "");
                    tipo = tecladoString.nextLine();
                    System.out.println("Há "+Livros.verificar(tipo)+ " livros(s) do mesmo tipo ");
                    
                    break;
                    
                case 5:
                    System.out.println(">>>>> VER MELHOR OPÇÃO DE PREÇO <<<<");
                    System.out.println("Faixa de preço: ");
                    começo=teclado.nextDouble();
                    fim=teclado.nextDouble();
                    System.out.println("Ha"+Livros.verificar(começo,fim)
                            + "livros(S) com valores entre "
                            +String.format("R$ %.2f e R$ $.2.f",começo,fim));

                    break;
                    
                case 6:
                    System.out.println(">>>>Avalição de estoque da livraria do if<<<<");
                    System.out.println("Avaliado em: " + String.format("R$ %.2f",Livros.analisedeestoque()));
                    
                    break;
                    
                case 7:
                    System.out.println(">>>Ate la<<<<");
                    System.out.println("Nos vemos em um novo ano");
                    break;
                    
                default:
                    System.out.println("Escolha de [1-7]");
                         
                         
            }
        }
        
        
        while(cadastramento != 7);
        
        
       
        
    }
        
  
  
          static void criarcadastro(){
              
              
                   System.out.println("===========BIBLIOETECA IFPE============");
                   System.out.println("1 - ADICIONAR");
                   System.out.println("2 - VERIFICAR");
                   System.out.println("3 - REMOVER LIVRO");
                   System.out.println("4 - PESQUISAR POR TIPO ");
                   System.out.println("5 - PESQUISAR POR PREÇO");
                   System.out.println("6 - ANALISE DE ESTOQUE");
                   System.out.println(" 7 - IR EMBORA DESTA FINAL QUE NÃO QUERO FICAR ");
                   System.out.println(">>>>>>> QUAL OPCAO<<<<<");              
        
          }

   
}
   
             

          
