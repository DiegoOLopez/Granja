# Granja
Programa de registro de animales de granja, personal y proveedores

Se hara el uso de 4 super clases con los siguientes atributos y metodos:
1. Animales
  i. Atributos
    - especie
    - peso
    - fechaNacimiento
    - sexo
  ii. Metodos
    - getters & setters de los atributos
3. Persona Fisica
  i. Atributos
    - nombre
    - apellidoP
    - apellidoM
    - fechaNacimiento
    - sexo
  ii. Metodos
    - getters & setters de los atributos
5. Persona Moral
  i. Atributos
    - nombreEmpresa
    - fechaRegistro
    - RFC
    - giro
  ii. Metodos
    - getters & setters de los atributos
7. Domicilio
  i. Atributos
    - Pais
    - Estado
    - Municio
    - Localidad
    - Colonia
    - Calle
  ii. Metodos
    - getters & setters de los atributos

Y ahora se crearan 3 subsclases:
1. AniamlesGranja
  i. Atributos
    - ID
    - tipoAlimento
    - estadoSalud
  ii. Metodos
    - getters & setters de los atributos
3. Personal
  i. Atributos
    - cargo
    - sueldoPorHora
    - diasDeTrabajo
    - profesion
    - sueldoMensual
  ii. Metodos
    - getters & setters de los atributos (excepto sueldoMensual)
    - getter de sueldoMensual y agregar operacion matematica para calcular el sueldo mensual
5. Proveedores
  i. Atributos
    - productoComprado
    - pesoProducto
    - precioProducto
  ii. Metodos
    - getters & setters de los atributos
