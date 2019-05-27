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
    holaMundo("Fernando");
    holaMundoAvanzado(2);

    val arregloCumpleanos: Array<Int> = arrayOf<Int>(1,2,3,4);

    var arregloTodo: Array<Any> = arrayOf(1,"asd",10.2,true);

    arregloCumpleanos[0] = 5;
    arregloCumpleanos.set(0,6);

    arregloTodo = arrayOf(5,2,3,4)

    //val notas: ArrayList<Int> = arrayListOf<Int>(1,2,3,4,5,6)

    val notas = arrayListOf(1,2,3,4,5,6);

    //FOR EACH -> itera el arreglo
    notas.forEach{ nota:Int ->
        println(nota)
    }

    //FOR EACH -> itera el arreglo
    notas.forEachIndexed{ indice, nota ->
        println("Indice:  $indice");
        println("Nota: $nota")
        //return Unit
    }

    // MAP -> itera y modifica el arreglo
    // Impares +1 Pares +2
    val notaDos = notas.map{nota:Int ->
        val modulo = nota % 2;
        when (modulo) {
            0 -> {
                nota+2;
            }
            else -> {
                nota+1;
            }
        }
    }

    notaDos.forEach{
        println("Notas 2: $it");
    }

    val respuestaFilter=notas
        .filter{//Filtrar el arreglo
        it in 3..4
        // it > 2 && it<5
        }
        .map{ //Mutar o Cambiar el arreglo
            it *2;
        }

    respuestaFilter.forEach{
        println("Notas: $it");
    }

    val novias = arrayListOf(1,2,3,4,5);

    val respuestaNovia=novias.any{
        it==3
    }

    println(respuestaNovia);

    val tazos = arrayListOf(1,2,3,4,5,6,7);

    val respuestaTazos=tazos.all{
        it>1
    }

    println(respuestaTazos); //false

    val totalTazo=tazos.reduce{valorAcumulado,tazo->
       valorAcumulado + tazo
    }
    println(totalTazo);

    //val fecha= Date();
    //fecha.time = 11231231;
    //fecha.year = 2000;
    //fecha= Date(1989,6,10);

    println(sumeDosNumeros(1,3));
    //IMPORTANTE: numUno y numDos los pone el editor de texto

}

fun holaMundo(mensaje: String): Unit{
    println("Mensaje: $mensaje.");
}

fun holaMundoAvanzado(mensaje:Any):Unit{
    println("Mensaje: $mensaje");
}

fun sumeDosNumeros(numUno: Int, numDos: Int): Int
{
    return numUno + numDos
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

class Usuario{
    public var nombre:String = "";
    public var apellido:String;

    constructor(apellido:String){
        this.apellido = apellido;
    }
}

class UsuarioKT(public var nombre:String,
                public var apellido: String){
    init{
        println("");
    }
    fun hola():String{
        return this.apellido;
    }
    fun hola2(){

    }
}

fun nombres(){
    val variable = UsuarioKT("Fernando","Pogo");
    variable.apellido;

}

class BaseDeDatos{
    companion object{
        val usuarios = arrayListOf(1,2,3);
        fun agregarUsuario(usuario:Int){
            this.usuarios.add(usuario)
        }
        fun eliminarUsuario(usuario:Int){
            //this.usuarios
        }
    }
}

class Usuario2(val cedula:String){
    public var nombre:String="";
    public var apellido:String="";
    constructor (cedulaM:String, apellido:String):this(cedulaM){
        this.apellido=apellido;
    }

    companion object{
        val gravedad = 10.5;
        fun correr(){
            println("Estoy corriendo en $gravedad");
        }
    }
}

fun aa(){
    Usuario2.gravedad;
    Usuario2.correr();
}

open class Numeros(var numeroUno: Int,
                    var numeroDos: Int){

}

class Suma(numeroUnos: Int,
           numeroDoss:Int):
    Numeros(numeroUnos,numeroDoss){
}
fun cc(){
    val a= Suma(1,3);

}

fun presley(requerido:Int,
            opcional:Int=1,
            nulo : UsuarioKT?){
    if(nulo != null){
        nulo.nombre;
    }
    val nombresito = nulo?.nombre.toString();
    nulo!!.nombre;
    nombresito.toString();
}
fun cdd(){
    presley(1, nulo=null);
    //presley(1,1,0);
    presley(1,1,null);
}