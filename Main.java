public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        // relogio.hora = 19;
        // relogio.minuto = 34;

        relogio.setHora(8);
        relogio.setMinuto(10);
        relogio.setSegundo(20);
        relogio.exibir();

        System.out.println("Hora atual: " + relogio.getHora() + " " + "Minuto atual: " + relogio.getMinuto() + " "  + "Segundo atual: " + relogio.getSegundo());
    }
}
