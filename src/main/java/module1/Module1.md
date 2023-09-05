# Módulo 1

## Clases

Una clase es una plantilla para la creación de objetos.

Está conformada por atributos (variables) y métodos (funciones).

Los atributos y métodos son llamados los miembros de la clase.

La clase no necesariamente debe ser pública, pero en caso de tener 2 o más clases en un archivo al menos UNA debe ser púiblica.


### Ejemplo:

```
public class Person {

    // Declaración de la variable (atributo) 'name'
    String name;

    // Método de la clase para acceder a la variable 'name'
    public String getName() {
        return name;
    }
}

// Otra clase en mismo archivo
class Animal{

}
```