# Tegnologias Para la integracion de Soluciones 

## Aerolinea 

### Descripcion 

Este sistema es realizado para llevar el control correcto de una aerolinea.

### Requerimientos del Sistema

EL sistema podra realizar:

​	Alta de Pasajeros

​	Baja de Pasajeros

​	Actualizar Pasajero

Como tambien podrà:

​	Agregar Avion 

​	Eliminar Avion

​	Actualizar Avion

Rutas:

​	Agregar rutas 

​	Eliminar 

​	Modificar

### Variables

| Variables de Pasajeros | Tipo    |
| :--------------------- | ------- |
| Nombre                 | VARCHAR |
| Apellido               | VARCHAR |
| Direccion              | VARCHAR |

| Variables de Avion | Tipo    |
| ------------------ | ------- |
| IdAvion            | ENTERO  |
| Modelo             | VARCHAR |
| Pasajeros          | ENTERO  |
| Destino            | VARCHAR |

| Variables de Ruta | Tipo    |
| ----------------- | ------- |
| IdRuta            | ENTERO  |
| CiudadLlegada     | VARCHAR |
| CiudadSalida      | VARCHAR |

### Mensajes Exitosos

##### Pasajero

"Pasajero Agregado Exitosamente"

"Pasajero Eliminado Exitosamente"

"Pasajero Modificado Exitosamente"

##### Avion

"Avion Agregado Exitosamente"

"Avion Eliminado Exitosamente"

"Avion Modificado Exitosamente"

##### Ruta

"Ruta Agregado Exitosamente"

"Ruta Eliminado Exitosamente"

"Ruta Modificado Exitosamente"

### Mensajes de error

##### Pasajero

"Error al Agregar Pasajero"

"Error al Eliminar Pasajero"

"Error al Actualizar Pasajero"

##### Avion

"Error al Agregar Avion"

"Error al Eliminar Avion"

"Error al Actualizar Avion"

##### Ruta

"Error al Agregar Ruta"

"Error al Eliminar Ruta"

"Error al Actualizar Ruta"



