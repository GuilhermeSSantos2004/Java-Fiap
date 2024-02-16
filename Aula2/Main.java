
public class Main {
  public static void main(String[] args) {

    Account account = new Account("Nomeado via contrutor");

     System.out.println("Nome: " + account.getname() + "Saldo inicial: " + account.getsaldo() + "depositoEmconta:" + account.depositoEmConta(999.0f)  );
    
/*
    Account account = new Account("Nomeado via contrutor");
    System.out.println("Nome: " + account.name);

    System.out.println("Saldo inicial: " + account.saldo);
    
    account.name = "João";
    account.saldo = 875.0f;

    System.out.println("Saldo atribuido:" + account.saldo);
    account.depositoEmConta(100.0f);
    System.out.println("Saldo final: " + account.saldo);*/
  }


}