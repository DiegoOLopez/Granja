# Granja
Programa de registro de animales de granja, personal y proveedores

Se hara el uso de 4 super clases con los siguientes atributos y metodos:
1. Animales
  i. Atributos
    - String especie //Especie a la que pertenece el animal
    - float peso //Peso del animal
    - Date fechaNacimiento //Fecha de nacimiento del animal
    - String sexo //sexo del animal
  ii. Metodos
    - getters & setters de los atributos //agregamos los get y set de cada uno de los atributos
3. Persona Fisica
  i. Atributos
    - String nombre //Nombre de la persona fisica
    - String apellidoP //Apellido paterno de la persona fisica
    - String apellidoM //Apellido materno de la persona fisica
    - Date fechaNacimiento //Fecha de nacimiento de la persona fisica
    - String sexo //Sexo de la persona fisica
  ii. Metodos
    - getters & setters de los atributos //agregamos los get y set de cada uno de los atributos
5. Persona Moral
  i. Atributos
    - String nombreEmpresa //Nombre de la empresa
    - Date fechaRegistro //Fecha de registro de la empresa
    - String RFC //RFC de la empresa
    - String giro //A que se dedica la empresa o giro de la empresa
  ii. Metodos
    - getters & setters de los atributos //agregamos los get y set de cada uno de los atributos
7. Domicilio
  i. Atributos
    - String Pais //pais al que pertenece la persona
    - String Estado //estado al que pertenece la persona
    - String Municipio //municipio al que pertenece la persona
    - String Localidad //localidad a la que pertenece la persona
    - String Colonia //colonia a la que pertenece la persona
    - String Calle //calle a la que pertenece la persona
  ii. Metodos
    - getters & setters de los atributos //agregamos los get y set de cada uno de los atributos
Y ahora se crearan 3 subsclases:
1. AniamlesGranja
  i. Atributos
    - int ID //Identificador del animal
    - String tipoAlimento //El alimento que consume el animal
    - String estadoSalud //Como se encuentra de salud el animal
  ii. Metodos
    - getters & setters de los atributos
3. Personal
  i. Atributos
    - String cargo //Cargo que tiene el personal (Minimo 141 pesos)
    - float sueldoPorHora //Sueldo que recibe por hora el personal
    - float horasTrabajo //Horas que trabaja diariamente la persona (Maximo 24 horas)
    - int diasDeTrabajo //Dias que trabaja a la semana el personal (Maximo 7 dias)
    - String profesion //Prefesion que tiene el personal
    - float sueldoMensual //Sueldo que recibe mensualmente la persona
  ii. Metodos
    - getters & setters de los atributos (excepto sueldoMensual) //agregamos los get y set de cada uno de los atributos excepto de sueldoMensual
    - getter de sueldoMensual y agregar operacion matematica para calcular el sueldo mensual //calculo del sueldo mensual
5. Proveedores
  i. Atributos
    - String productoComprado //Que tipo de producto compramos al proveedor
    - String pesoProducto //El peso de cada producto que compramos al proveedor
    - float precioProducto //El precio de cada producto que compramos al proveedor
  ii. Metodos
    - getters & setters de los atributos //agregamos los get y set de cada uno de los atributos
