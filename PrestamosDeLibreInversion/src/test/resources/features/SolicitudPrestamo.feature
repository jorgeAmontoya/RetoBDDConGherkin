# language:es

Característica: Solicitud de prestamo de libre inversion

  Escenario: 01 - Aprobacion de prestamo de libre inversion
    Dado que existe un usuario que solicita un prestamo de libre inversion
    Cuando el banco revisa su historial crediticio
    Y su puntaje de 631 puntos es mayor o igual al establecido de 630
    Entonces el prestamo de libre inversion es exitoso


  Escenario: 02 - prestamo de libre inversion No aprobado
    Dado que existe un usuario que solicita un prestamo de libre inversion
    Cuando el banco revisa su historial crediticio
    Y su puntaje de 620 puntos es menor al establecido de 630
    Entonces el prestamo de libre inversion no es exitoso