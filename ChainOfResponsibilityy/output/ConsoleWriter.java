package ChainOfResponsibilityy.output;

public class ConsoleWriter implements OutputDevice{
    @Override
    public void write(String output) {
        System.out.println(output);
    }
}
