package SOLID;

public class InterfaceSegregationPrinciple {
    public void run_wrong(){
        ClassicPrinter classicPrinter = new ClassicPrinter();
        classicPrinter.print("Report");
        classicPrinter.scan("Document");
        classicPrinter.fax("Photo");
    }

    public void run_correct(){
        MultiFunctionMachine mfm = new MultiFunctionMachine();
        mfm.print("Report");
        mfm.scan("Document");
        mfm.fax("Contract");

        // Crear una impresora básica
        BasicPrinter printer = new BasicPrinter();
        printer.print("Invoice");

        // Crear un escáner básico
        BasicScanner scanner = new BasicScanner();
        scanner.scan("Photo");
    }
}

// Ejemplo de que NO hacer

interface MultiFunctionDevice {
    void print(String document);
    void scan(String document);
    void fax(String document);
}


class ClassicPrinter implements MultiFunctionDevice {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        // No hace nada, porque la impresora básica no soporta escaneo
    }

    @Override
    public void fax(String document) {
        // No hace nada, porque la impresora básica no soporta fax
    }
}


// Ejemplo de que SI hacer

interface Printer {
    void print(String document);
}

interface Scanner {
    void scan(String document);
}

interface Fax {
    void fax(String document);
}


class BasicPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}


class BasicScanner implements Scanner {
    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}


class MultiFunctionMachine implements Printer, Scanner, Fax {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Sending fax: " + document);
    }
}
