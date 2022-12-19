# language:es
Característica: Solicitud de prestamo de libre inversion
  Escenario: 01 - Aprobacion de prestamo de libre inversion
    Dado que existe un usuario que solicita un prestamo de libre inversion
    Cuando el banco revisa su historial crediticio
    Y su puntaje es mayor a 630 puntos
    Entonces el prestamo de libre inversion es exitoso




  Escenario: 02 - prestamo de libre inversion No aprobado
    Dado que existe un usuario que solicita un prestamo de libre inversion
    Cuando el banco revisa su historial crediticio
    Y su puntaje es menor a 630 puntos
    Entonces el prestamo de libre inversion no es exitoso