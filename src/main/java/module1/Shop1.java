package module1; /**
 * Los imports de java.lang son redundantes, dado que Java lo hace automáticamente.
 */

import java.lang.System;
import java.lang.*;
import java.util.Random;


import static java.lang.Math.abs;
/**
 * Para importar todos los métodos estáticos de una clase se debe importar usando la palabra static.
 * <p>
 *  EJEMPLO: import static java.lang.Math.*;
 *  <p>
 * Tener cuidado si se esta importando la librería o no, dado que en el examen no se resaltan los errores.
 * <p>
 * Con * se trae todos los imports de una libería. Además, esto no sirve para los package, solo es válido para las clases.
 * <p>
 * EJEMPLO: import java.*.Random o import java.*, estos ejemplos no son válidos en Java, dado que el wildcard solo aplica para clases.
 * <p>
 * EJEMPLO: import java.util.Random.*, tampoco es válido para importar los métodos de una clase.
 */

public class Shop1 {

    public static void main(String[] args) {

        abs(17);

        Random random = new Random();
        System.out.println(random.nextInt(10));
    }

}
