package source.abstractions.assignment;

public class Client {
    public static void main(String[] args) {
        DellNotebook dellNotebook = new DellNotebook();
        dellNotebook.scroll();
        dellNotebook.click();

        HPNotebook hpNotebook = new HPNotebook();
        hpNotebook.scroll();
        hpNotebook.click();
    }
}
