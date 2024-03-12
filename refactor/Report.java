package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // imprimir título
        imprimirTitulo();

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        conclusion();

    }
    void imprimirTitulo(){
        System.out.println("Título del Reporte");
    }
    void conclusion(){
        System.out.println("Conclusión del Reporte");
    }
}