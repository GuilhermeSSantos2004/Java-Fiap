public class Account {
  private String name;
  private float saldo;

  
  float depositoEmConta (float valor){

    if (valor <= 0){
      System.out.println("Valor inválido");
      return 0;
    }
    else {
      this.setsaldo(saldo + valor);
      //saldo += valor;
      return saldo;
    }

  }

  // GETTERS AND SETTERS

  public float getsaldo (){
    return this.saldo;
  }

  private void setsaldo (float saldo){
    this.saldo = saldo;
  }

  public String getname(){
    return this.name;
  }

  // CONSTRUTOR 

  public Account(String name){
    this.name = name;
    this.saldo = 0.0f;
  }
}