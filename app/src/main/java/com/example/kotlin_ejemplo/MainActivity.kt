package com.example.kotlin_ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.security.KeyStore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       //Lección 1:
        // Lección 2:
        //tiposDeDatos()

        //Lección 3:
        //sentenciasIf()

        //Leccion 4:
        //sentenciaWhen()

        //Lección 5:
        //arrays()

        //Lección 6:
        //maps()

        //Lección 7:
        loops()
    }

    /*
    * LECCIÓN 1
    * Aquí vamos a hablar de variables y constantes.
    */
    private fun variablesYConstantes() {

        // Variables

        var myFirstVariable = "Hello Hackermen!!!!!"
        var myFirstNumber = 1

        println(myFirstVariable)
        myFirstVariable = "Bienvenido a MoureDEV"
        println(myFirstVariable)

        //No se puede cambiar la asignación de un TIPO DE DATO.
        //myFirstVariable = 1

        var mySecondVariable = "Suscríbete"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)
        myFirstVariable = "Ya te has suscrito?"
        println(myFirstVariable)
        // Constantes

        val myFirstConstant = "Te ha gustado el tutorial?"

        println(myFirstConstant)
    }

    /*
    * LECCIÓN 2
    * Hablaremos de Tipos de Datos
    * */
    private fun tiposDeDatos() {


        //String
        val myString: String = "Hola Hackermen22222!"
        val myString2 = "Bienvenidos a JackDev"
        val myString3: String = myString + " " + myString2

        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt = 8
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        val myLong = 1121234342349999344
        println(myInt3)
        println(myLong)

        //Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 //En realidad es un tipo Int
        val myDouble4: Double = myDouble + myDouble2 + myDouble3

        println(myDouble4)


        //Boolean

        val myBool = true
        val myBool2 = false

        //No Funciona
        //val myBool3 = myBool + myBool2

        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    /*
    * LECCIÓN 3
    * Aquí vamos a hablar de sentencias IF
    * */
    private fun sentenciasIf() {
        val myNumber = 71

        //Operadores condicionales
        /*
        if (myNumber <= 10) {
            println("$myNumber es menor o igual que 10")
        } else {
            println("$myNumber es mayor que 10")
        }
        */
        if (myNumber <= 10 && myNumber > 5) {
            println("$myNumber es menor o igual que 10 y mayor que 5")
        } else if (myNumber == 60) {
            println("$myNumber es igual a 60")
        } else if (myNumber != 70) {
            println("$myNumber no es igual a 70")
        } else {
            println("$myNumber es mayor que 10 y menor que 5")
        }

    }

    /*
    * LECCIÓN 4
    * Aquí se habla de la sentencia When
    * */
    fun sentenciaWhen() {
        //When con String
        val country = "Brasil"

        when (country) {
            "España", "Mexico", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            }
            "EEUU" -> {
                print("El idioma es Inglés")
            }
            "Francia" -> {
                print("El idioma es Francés")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }

        //When con Int
        val age = 100
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolescente")
            }
            in 18..99 -> {
                println("Eres un adulto")
            }
            else -> {
                println("😱😱😱😱")
            }

        }

    }

    /*
    * LECCIÓN 5
    * Aquí vamos a hablar de Arrays
    * */
    fun arrays() {

        val name = "Jack"
        val surname = "Daga"
        val company = "Verisure"
        val age = "26"

        // Creación de un ARRAY

        val myArray = arrayListOf<String>()

        // Añadir elemento al ARRAY de uno en uno.

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(myArray)

        // Acceso a datos

        //posición entre corchetes [ ], empezando de 0
        val myCompany: String = myArray[2]

        println(myCompany)

        // Modificación de datos
        myArray[5] = "Suscríbete y activa la campana"
        println(myArray)

        // Eliminación de datos

        myArray.removeAt(4)
        println(myArray)

        // Recorrer los datos del ARRAY
        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        // Contador de elemento del array

        println(myArray.count())

        // Se limpia el array
        myArray.clear()
        println(myArray.count())

        myArray.first()
        myArray.last()
        myArray.sort()

    }

    /*
    * LECCIÓN 6
    * Aquí vamos a hablar de Maps || Diccionarios
    * */
    fun maps() {

        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        // Añadir elementos al mapa
        myMap = mutableMapOf("Jack" to 1, "Pedro" to 2, "Sara" to 3)
        println(myMap)

        // Añadir un solo valor al mapa, el mapa dejará de ser un mapOf para ser un mutableMapOf y así poder añadir valores.

        myMap["Ana"] = 7
        myMap.put("María", 8)
        println(myMap)

        // Actualización de un dato
        myMap.put("Brais", 3)
        myMap["Brais"] = 4
        println(myMap)

        myMap.put("Jodeeeeeeer", 3)
        println(myMap)

        // Acceso a un dato

        println(myMap["Brais"])

        // Eliminar un dato
        myMap.remove("Brais")
        println(myMap)
    }

    /*
    * LECCIÓN 7
    * Aquí hablaremos de Bubles
    * */
    private fun loops() {
        // Bucles
        val myArray: List<String> = listOf("Hola", "Bienvenidos a los bucles y a la gestión de cambios en Github versión 3", "Sucríbete")
        val myMap: MutableMap<String, Int> = mutableMapOf("Brais" to 1, "Maria" to 2, "Jose" to 5)

        // For
        for (myString in myArray) {
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 0 until 10) {
            println(x)
        }
    }
}
