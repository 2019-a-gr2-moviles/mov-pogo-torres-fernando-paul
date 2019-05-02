fun main(args: Array<String>){
    println("Quien podra ayudarme")

    /*
    * Comentario
    * */

    // Variables
    //Que es mutar? Cambiar?
    // Mutables
    var nombre = "Fernando"
    nombre = "Paul"
    //Inmutables
    val nombreI="Fernando"
    //nombreI="Paul"

    val apellido: String = "Pogo"
    val edad: Int = 23
    val sueldo: Double = 130.0
    val casado: Boolean = false
    val profesor: Boolean = false
    val hijos = null


    //Duck Typing
    //Si parece un pato
    //Si camina como pato
    //Si suena como pato
    //Si vuela como pato
    //PATO

    //Condicionales
    if(apellido == "Pogo" || nombre=="Fernando")
    {
        println("Verdadero")
    }
    else
    {
        println("Falso")
    }
    val tieneNombreYApellido = if(apellido!=null && nombre!=null)"ok" else "no"
    print(tieneNombreYApellido)

    estaJalado( 1.0)
    estaJalado(8.0)
    estaJalado(0.0)
    estaJalado(7.0)
    estaJalado(10.0)

}


fun estaJalado(nota: Double): Double {
    when(nota)
    {
        7.0->{
            println("Pasaste con las justas")
        }
        10.0->{
            println("Genial:D Felicidades")
        }
        0.0->{
            println("Dios mio que vago!")
        }
        else -> {
            println("Tu nota es: $nota")
            println("Tu nota es: ${nota}")

        }
    }
    return nota
}