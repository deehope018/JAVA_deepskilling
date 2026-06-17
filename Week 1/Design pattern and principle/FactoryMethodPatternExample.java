interface document {
    void open();
}
class wordDocument implements document {
    public void open() {
        System.out.println("word document opened");
    }
}
class pdfDocument implements document {
    public void open() {
        System.out.println("pdf document opened");
    }
}
class excelDocument implements document {
    public void open() {
        System.out.println("excel document opened");
    }
}
abstract class documentFactory {
    abstract document createDocument();
}
class wordFactory extends documentFactory {
    public document createDocument() {
        return new wordDocument();
    }
}
class pdfFactory extends documentFactory {
    public document createDocument() {
        return new pdfDocument();
    }
}
class excelFactory extends documentFactory {
    public document createDocument() {
        return new excelDocument();
    }
}
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        documentFactory wordFactory = new wordFactory();
        document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        documentFactory pdfFactory = new pdfFactory();
        document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        documentFactory excelFactory = new excelFactory();
        document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}