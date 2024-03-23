public class Onca extends Animal {

    public Onca() {
        this.especie = "Onça Pintada";
    }

    public Onca(int idade) {
        this.especie = "Onça Pintada";
        this.idade = idade;
    }

    public void escalar(){ //metodo
        System.out.println("A Onça está subindo na árvore");
    }

    public void nadar(){
        System.out.println("A onça entrou no rio");
    }


    @Override //anotação --> define que o metodo da super classe vai ser  sobreescrito
    public void comer() {
        nadar();
        cacar();
        System.out.println("A Onça está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("A onça está cansada.");
        escalar();
        super.dormir();
    }
}

