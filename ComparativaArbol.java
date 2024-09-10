class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

public class ComparativaArbol {

    //comprobar si dos árboles son similares
    public boolean sonSimilares(Nodo arbol1, Nodo arbol2) {
        // Si ambos árboles son nulos, son similares
        if (arbol1 == null && arbol2 == null) {
            return true;
        }

        // Si uno de los árboles es nulo y el otro no, no son similares
        if (arbol1 == null || arbol2 == null) {
            return false;
        }

        // Comparar los subárboles izquierdo y derecho
        return sonSimilares(arbol1.izquierda, arbol2.izquierda)
                && sonSimilares(arbol1.derecha, arbol2.derecha);
    }

    public static void main(String[] args) {
        ComparativaArbol comparador = new ComparativaArbol();

        //arbol prueba1
        Nodo arbol1 = new Nodo(1);
        arbol1.izquierda = new Nodo(2);
        arbol1.derecha = new Nodo(3);
        arbol1.izquierda.izquierda = new Nodo(4);
        arbol1.izquierda.derecha = new Nodo(5);

        Nodo arbol2 = new Nodo(1);
        arbol2.izquierda = new Nodo(2);
        arbol2.derecha = new Nodo(3);
        arbol2.izquierda.izquierda = new Nodo(4);
        arbol2.izquierda.derecha = new Nodo(5);
        //arbol prueba2
        Nodo arbol3 = new Nodo(1);
        arbol3.izquierda = new Nodo(2);
        arbol3.derecha = new Nodo(3);
        arbol3.izquierda.izquierda = new Nodo(4);

        // Comparar los árboles
        boolean similares = comparador.sonSimilares(arbol1, arbol2);
        System.out.println("Los árboles son similares: " + similares);


        // Comparar el primer árbol con el árbol diferente
        boolean noSimilares = comparador.sonSimilares(arbol1, arbol3);
        System.out.println("El primer árbol y el tercer árbol son similares: " + noSimilares);
    }
}
