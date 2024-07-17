# Automatización de la pagina Demoblaze
Este repositorio contiene la automatización de pruebas para una aplicación web de ventas de productos tecnologicos demoblaze

## Escenarios Automatizados
- Login
- Registro
- Agregar prodcutos al carrito y validar la suma de los mismos

# Requisitos Para Ejecucion
- Clonar Repositorio
https://github.com/jorgeescorcia/Automatizacion_Demoblaze
# Login
Ejecutas el TestRunnerLogin.java y verificaras que la funcion login, se loguea exitosamente
# Registro
Para el registro ejecutas el TestRunnerRegistro.java el cual utiliza datos aleatorios para dicho registro utilizando la libreria faker
# Agregar Productos al carrito
Para probar esta funcionalidad ejecutas TestRunnerAgregarProductos.java, el cual se registra con datos aleatorios generados por faker y se loguea con los mismos datos, tambien agrega los productos al carrito y hace la suma de los mismos

# Stack Utilizado

- Java Development Kit (JDK) 11
- Serenity BDD - Patron Screenplay
- Gradle 7.6.3
- Gherkin
- Chrome Version > 100

  
