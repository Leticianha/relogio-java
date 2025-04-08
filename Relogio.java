public class Relogio {
    private int hora, minuto, segundo;

    /*
     * *EXERCICIO*
     * Faça os métodos getMinuto, setMinuto, getSegundo setSegundo
     * Testar no main para ver se está ok
     */

    public void setHora(int novaHora) {
        if(novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        } 
    }

    public void setMinuto(int novoMinuto) {
        if(novoMinuto >= 0 && novoMinuto < 60) {
            minuto = novoMinuto;
        } 
    }

    public void setSegundo(int novoSegundo) {
        if(novoSegundo >= 0 && novoSegundo < 60) {
            segundo = novoSegundo;
        } 
    }

    //para trazer o valor
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void exibir() {
        System.out.printf("%02d:%02d:%02d\n" , hora, minuto, segundo );
    }
}