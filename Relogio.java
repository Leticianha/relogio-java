public class Relogio {
    private int hora, minuto, segundo;

    /*
     * construtor defult (padrão)
     * puclib Relogio()
     */

    //construtor recebe o mesmo nome da classe 
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    /*
     * *EXERCICIO*
     * Faça os métodos getMinuto, setMinuto, getSegundo setSegundo
     * Testar no main para ver se está ok
     */

    public void setHora(int hora) {
        if(hora >= 0 && hora < 24) {
            this.hora = hora;
        } 
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } 
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
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