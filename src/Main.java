public class Main {
    public static void main(String[] args) {
        new UsuarioService(new EmailNotificador()).registrar("João");
        new UsuarioService(new WhatsappNotificador()).registrar("Maria");
        new UsuarioService(new SmsNotificador()).registrar("Pedro");
    }
}