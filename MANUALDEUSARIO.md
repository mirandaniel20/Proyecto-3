# <center> MANUAL DE USUARIO </center>

El programa hace una gestión de vechículos que utiliza una matriz ortogonal implementada con listas enlazadas para almacenar la información de vehículos.
Esta implementación permite un uso eficiente de la memoria al reservar el espacio solo para vehiculos.

Nuestro programa no tiene definida esa parte como tal, ya que no implementamos correctamente las listas enlazadas.

## FUNCIONAES PRINCIPALES
<center> InsertarVehiculo </center>

* Permite al usuario ingresar los datos de un nuevo vehículo (placa, color, linea, modelo y propietario) 
* Calcula el indice de la fila y columna basado en la placa del vehículo para determinar insertar el vehículo en la matriz ortogonal. 
* Insertar el vehículo en la matriz y actualiza las referencias *derecha*, *izquierda*, *arriba* y *abajo* de los nodos correspondientes. 

<center> Bscar Vehiculo </center>

* Solicita al usuario ingresar la placa del vehículo que desea buscar.
* Busca el vehiculo en la matriz ortogonal utilizando HASMAP
* Muestra la información e indica que el veículo no fue encontrado
* 
<center> Eliminar Vehiculo </center>


* Solicita al usuario ingresar la placa del vehículo que desea eliminar.
* Busca el vehículo en la matriz ortogonal utilizando la placa.
* elimina el vehiculo. 

## Estructura de Datos

* Vehiculo
* Nodo

El usuario puede interactuar con el sistema seleccionando opciones desde un menú en el que puede insertar un nuevo vehículo, buscar un vehículo por su placa, eliminar un vehículo por su placa o salir del sistema.