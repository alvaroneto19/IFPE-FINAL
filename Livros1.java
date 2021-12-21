package biblioteca;

import java.lang.String;
import java.util.ArrayList;
public class Livros extends Biblioteca implements Interface{
    
    private String titulo;
    private String autor;
    private String tipo;
    private float preço;
    private int chave;
    
    public Livros(){}
    
    public Livros(String titulo,String autor,String tipo,float preço,float chave){
       this.titulo=titulo;
       this.autor=autor;
       this.tipo=tipo;
       this.preço=preço;
       this.chave=(int) chave; 
    }

    private static ArrayList<Livros> verlivros = new ArrayList<>();
    
    
    static ArrayList<Livros> getverlivros(){
        
        return verlivros;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreço()  {
        return preço;
    
    }
    public void setPreço(int preço){
        
        
        this.preço = preço;
           
    }

    public int getChave() {
        return (int) chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
    
    //public void setpreço( float preço)//**
   
    {        
        //if (preço < 0)
           // this.preço = 0;
        //else
            //this.preço = preço;
        
    }

    public String colocar() {
        
        
        return "Titulo: " + titulo + "\nautor: " + autor + "\ntipo: " + tipo  + String.format("\npreço:  R$ %.2f: ",preço) + "\nchave: " + chave;
    }
   
    static void adicionar(Livros a){
        verlivros.add(a);
   }
    
    static  double analisedeestoque(){
       double total=0;
         for(Livros a : verlivros){
             total += a.getPreço();
             
         }
         
         return total;
     }     
     
   
        
        static  public String ver(){
        String saida = "";
        int i = 1;
        for (Livros a : verlivros){
         saida += "\n=======LIVRO NUMERO"+ (i++) + " ========\n";
                   saida += a.colocar() + "\n";
 
        }
                     return saida;
      
   }
        
       public  static int verificar(String tipo){
         int quantidade = 0;   
         for (Livros a : verlivros){
            if(a.getTipo().equalsIgnoreCase(tipo)){
                quantidade++;
            }
        } 
        return quantidade;
      
   
   }    
          
         static int verificar(double começo, double fim){
      int quantidade = 0;
         
         for(Livros a : verlivros){
             if(a.getPreço()>= começo && a.getPreço()<= fim){
                 quantidade++;
             }
             
         }
          return quantidade;
       
   }
  
  static  boolean retirar(String titulo){
        for(Livros a : verlivros){
                  if(a.getTitulo().equalsIgnoreCase(titulo)){
                      verlivros.remove(a);
                      return true;
                  }
                  
              }
              return false;
          
  }
   static void adicionar(Livraria nLivros){
       
   }
   
}





    
