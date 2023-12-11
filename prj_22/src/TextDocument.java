public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("TextDocument открыт.");
    }

    @Override
    public void save() {
        System.out.println("TextDocument сохранен.");
    }

    @Override
    public void close() {
        System.out.println("TextDocument закрыт.");
    }
}
