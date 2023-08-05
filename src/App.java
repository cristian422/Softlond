import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //se crea metodo scaner para ingresar datos por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese una opcion: ");
        int option=scanner.nextInt();

        switch(option){

            case 1://sumar dos numeros
            System.out.println("ingrese el primer numero: ");
            int numberOne = scanner.nextInt();
            
            System.out.println("ingrese el segundo numero: ");
            int numberTwo = scanner.nextInt();
            int add=numberOne+numberTwo;
            System.out.println("la suma es: "+ add);
            break;

            case 2://*programa que pida al usuario un número entero y determine si es par o impar. */
            System.out.println("Ingrese numero: ");
            int number=scanner.nextInt();
            if (number%2==0) {
                System.out.println("el numero es par");
            }else {
                System.out.println("el numero es inpar");
            }
            break;

            case 3:/*programa que calcule y muestre el área y el perímetro de un círculo. 
                    El usuario debe proporcionar el radio del círculo.
             */
            System.out.println("Ingrese el radio: ");
            int radio=scanner.nextInt();
            double perimetro =2*Math.PI*radio;
            double area2=Math.PI*radio*radio;
            System.out.println("el perimetro es: "+perimetro+" el area es: "+ area2);
            break;

            case 4:/*Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad */
            System.out.println("Ingrese la edad: ");
            int age=scanner.nextInt();
            // if ternario primera opcion se cumple segunda la opcion no se cumple
            String opcion=(age>=18)?"es mayor de edad":"Es menor de edad";
            System.out.println(opcion); 
            break;

            case 5://*Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos. */
            System.out.println("Ingrese Primer numero: ");
            int numOne=scanner.nextInt();
            System.out.println("Ingrese segundo numero: ");
            int numTwo=scanner.nextInt();
            String opcion1=(numOne>numTwo)?numOne+" es mayor que "+numTwo:numTwo+" Es mayor que "+numOne;
            System.out.println(opcion1);
            break;

            case 6:/**Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero. */
            System.out.println("Ingrese un numero: ");
            int num=scanner.nextInt();
            if (num>0) {
                System.out.println("el numero es positivo");
            }else if (num<0) {
                System.out.println("el numero es negativo");
            }else{
                System.out.println("el numero es "+num);
            }
            break;

            case 7:/*Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10 */
            System.out.println("Ingrese un numero: ");
            int numTabla=scanner.nextInt();
            for (int i = 1; i < 11; i++) {
                int result=numTabla*i;
                System.out.println(numTabla+ " * "+i+" = "+result);
            }
            break;
            /*Realiza un programa que simule un juego de adivinar un número.
            // El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. 
             El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar. */
            case 8:
            int random=(int)(Math.random()*101);
            System.out.println("el numero es "+random);
            System.out.println("Ingrese un numero: ");
            int numRandom=scanner.nextInt();

            while(random!=numRandom){
                if(numRandom>random){
                    System.out.println("estas arriba");
                }else{
                    System.out.println("estas abajo");
                }
                System.out.println("Ingrese un numero: ");
                numRandom=scanner.nextInt();
            }
            System.out.println("Correcto ;)  !!!!");
            break;
            /*Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial. */
            case 9:
            System.out.println("Ingrese un numero: ");
            int numfac=scanner.nextInt();
            int result=1;
            for (int index = 1; index <= numfac; index++) {
                result=result*(index);
            }
            System.out.println("el factorial es: "+result);
            break;

            /*Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci.
             //La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número:
              0, 1, 1, 2, 3, 5, 8, 13,  */
            case 10:
            
            int numfibo=20;
            int resultfibo=0;
            int next=1;
            System.out.println(resultfibo);
            for (int i = 1; i <numfibo; i++) {
                int guardar=resultfibo;
                resultfibo=resultfibo+next;
                next=guardar;
                System.out.println(resultfibo);
            }
            
            break;
            /*Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. 
            El usuario debe ingresar las longitudes de los tres lados. */
            case 11:
            System.out.println("Ingrese lado: ");
            int firstSide=scanner.nextInt();
            System.out.println("Ingrese lado: ");
            int secondSide=scanner.nextInt();
            System.out.println("Ingrese lado: ");
            int thirdSide=scanner.nextInt();
            boolean valido=true;
            if (!((firstSide+secondSide)>thirdSide && (firstSide+thirdSide)>secondSide &&(secondSide+thirdSide)>firstSide)) {
                valido=false;
                System.out.println("no es valido");
            }
            if (valido) {
                double s=(firstSide+secondSide+thirdSide)/2;
                //√(s * (s - a) * (s - b) * (s - c))
                double resultTriangulo=Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
                System.out.println(resultTriangulo);
            }
            
            break;
            /*Realiza un programa que pida al usuario un número entero y determine si es un número primo o no */
            case 12:
            System.out.println("Ingrese un numero: ");
            int numPrimo=scanner.nextInt();
            int i=1;
            int counter=0;
            while(i<=numPrimo){
                if ((numPrimo%i)==0) {
                    counter++;
                }
                i++;
            }
            if(counter==2){
                System.out.println("el numero es primo");
            }else{
                System.out.println("no es primo");
            }
            break;
            /*Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales*/
            //diseñado para usar con comas 3,123456 -->2 --->3,12
            case 13:
            System.out.println("Ingrese un numero: ");
            double numAround=scanner.nextDouble();
            System.out.println("Cuantos decimales: ");
            int numDecimals=scanner.nextInt();
            double NumAround2= Math.floor(numAround * Math.pow(10, numDecimals)) / Math.pow(10, numDecimals);
            System.out.println(NumAround2);
            break;
            /*Escribe un programa que solicite al usuario un número entero positivo y 
            verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios
            (excluyendo al propio número) es igual al número. */
            case 14:
            System.out.println("Ingrese un numero: ");
            int numPerfect=scanner.nextInt();
            int sumDivisores = 0;
            for (int l = 1; l <= numPerfect / 2; l++) {
            if (numPerfect % l == 0) {
                sumDivisores += l;
            }
        }
        if (numPerfect==sumDivisores) {
            System.out.println(numPerfect + " es un número perfecto.");
        } else {
            System.out.println(numPerfect + " no es un número perfecto.");
        }
            break;
            /*Crea un programa que pida al usuario un número entero y determine si es un número capicúa.
            Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda. */
            case 15:
            System.out.println("Ingrese un numero entero positivo: ");
            int numCapicua=scanner.nextInt();
            if(numCapicua>0 && numCapicua%1==0){
            String numCapicuaText=Integer.toString(numCapicua);
            String text="";
            System.out.println(numCapicuaText.length());
            
            int j = numCapicuaText.length()-1;
            while(j>0){
                System.out.println(text);
                text=text+numCapicuaText.charAt(j);
                System.out.println(numCapicuaText.charAt(j)+" "+text);
                j=j-1;
            }
            text=text+numCapicuaText.charAt(j);
            System.out.println("los numeros son:"+text+" "+numCapicuaText);
            if (text.equals(numCapicuaText)) {
                System.out.println("Es un numero capicua:"+text+" "+numCapicuaText);
            }else{
                System.out.println("no es un capicua "+text+"==="+numCapicuaText);
            }
        }else{System.out.println("no es un numero entero positivo");}
            break;
            /*Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. */
            case 16:
            System.out.println("Ingrese un numero: ");
            int numfiboUntil=scanner.nextInt();
            int resultfiboUntil=0;
            int nextUntil=1;
            System.out.println(resultfiboUntil);
            for (int o = 1; o <numfiboUntil; o++) {
                int guardar=resultfiboUntil;
                resultfibo=resultfiboUntil+nextUntil;
                next=guardar;
                System.out.println(resultfibo);
            }
            break;
            /*Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango. */
            case 17:
            System.out.println("Ingrese un numero de inicio: ");
            int numStart=scanner.nextInt();
            System.out.println("Ingrese un numero de fin: ");
            int numEnd=scanner.nextInt();
            //int inicial=1;//inicia en uno ya que mas adelante se empieza a dividir desde uno y no 0
            
            for (int j = numStart; j < numEnd; j++) {
                int count=0;
                for (int inicial = 1; inicial <= j; inicial++) {
                    if (j % inicial == 0) {
                        count++;
                    }
                }
                if(count==2){
                System.out.println(j+" es primo entre "+numStart+" y "+numEnd);
                }
            }
            break;
            /*Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas,
            // letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y
              la clase String para manipular la contraseña. */
            case 18:
            String pasword="";
            ArrayList<Character> mayusculas = new ArrayList<>(List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
            ArrayList<Character> minusculas = new ArrayList<>(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
            ArrayList<Character> numberList= new ArrayList<>(List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
            for (int index = 0; index < 8; index++) {
                int randomRango=(int)(Math.random()*3)+1;
                switch(randomRango){
                    case 1:
                    int randomMayusculas=(int)(Math.random()*26)+1;
                    String paso=String.valueOf(mayusculas.get(randomMayusculas));
                    pasword=paso+pasword;
                    break;
                    case 2:
                    int randomMinusculas=(int)(Math.random()*26)+1;
                    String pasoMinusculas=String.valueOf(minusculas.get(randomMinusculas));
                    pasword=pasoMinusculas+pasword;
                    break;
                    case 3:
                    int randomNUm=(int)(Math.random()*10)+1;
                    String pasoNum=String.valueOf(numberList.get(randomNUm));
                    pasword=pasoNum+pasword;
                    break;
                }
            }
            System.out.println("la pasword es: "+pasword);
            break;
            //Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas 
            case 19:
            
            System.out.print("Ingrese su nombre: ");
            String nombre=scanner.next();


            String nombreMayusculas = nombre.toUpperCase();
            String nombreMinusculas = nombre.toLowerCase();
    
            // Imprimir el nombre en mayúsculas y minúsculas
            System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
            System.out.println("Nombre en minúsculas: " + nombreMinusculas);
    
            break;
            case 20:
            System.out.print("Ingrese una cadena: ");
            String cadena1 = scanner.next();

            StringBuilder sb = new StringBuilder(cadena1);
            System.out.println(sb.reverse().toString());
            break;
            case 21:
            System.out.print("Ingrese una cadena: ");
            String cadenaCouter = scanner.next();
            Map<Character, Integer> frecuenciaCaracteres = new HashMap<>();
            for (char caracter : cadenaCouter.toCharArray()) {
                frecuenciaCaracteres.put(caracter, frecuenciaCaracteres.getOrDefault(caracter, 0) + 1);
            }
            System.out.println("Frecuencia de caracteres en la cadena:");
            for (Map.Entry<Character, Integer> entry : frecuenciaCaracteres.entrySet()) {
            char caracter = entry.getKey();
            int frecuencia = entry.getValue();
            System.out.println("'" + caracter + "' aparece " + frecuencia + " veces.");
        }

            break;
            /*Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo 
            (se lee igual de izquierda a derecha que de derecha a izquierda)  */
            case 22:
            System.out.print("Ingrese una frase: ");
            String frase = scanner.next();

            frase = frase.replaceAll("\\s", "").toLowerCase();
        // Comparamos la frase original con su reverso
                    boolean estado =frase.equals(new StringBuilder(frase).reverse().toString());
                    if (estado) {
                        System.out.println("La frase es un palíndromo.");
                    } else {
                        System.out.println("La frase no es un palíndromo.");
                    }
            break;
            /*Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene */
            case 23:

            Scanner escaner21 = new Scanner(System.in);
            System.out.print("Ingrese una oración: ");
            String oracion = escaner21.nextLine();
            escaner21.close();
            oracion = oracion.trim();
            int numeroPalabras;
            // Si la oración está vacía, retornamos 0
            if (oracion.isEmpty()) {
                numeroPalabras=0;
            }
            // Dividimos la oración en palabras utilizando los espacios como separadores
            String[] palabras = oracion.split("\\s+");
            // Retornamos el número de palabras
            numeroPalabras=palabras.length;
            System.out.println("La oración contiene " + numeroPalabras + " palabras.");
            break;
            /*Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones 
            de una letra específica por otra
 */
            case 24:
            Scanner scanner24 = new Scanner(System.in);

            System.out.print("Ingrese una cadena de texto: ");
            String cadena = scanner24.nextLine();
    
            System.out.print("Ingrese la letra a reemplazar: ");
            char letraOriginal = scanner24.nextLine().charAt(0);
    
            System.out.print("Ingrese la letra de reemplazo: ");
            char letraReemplazo = scanner24.nextLine().charAt(0);
    
            String nuevaCadena = reemplazarLetra(cadena, letraOriginal, letraReemplazo);
    
            System.out.println("Cadena resultante: " + nuevaCadena);
    
            break;
            /*Pide al usuario una frase y muestra cada palabra por separado 
 */
            case 25:
            Scanner separadoScanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase25 = separadoScanner.nextLine();
        
        // Dividimos la frase en palabras utilizando los espacios como separadores
        String[] palabras25 = frase25.split("\\s+");
        
        System.out.println("Palabras en la frase:");
        for (String palabra : palabras25) {
            System.out.println(palabra);
        }
        
        // Cerrar el Scanner después de su uso
        separadoScanner.close();

            break;
            /*Escribe un programa que pida al usuario una cadena y 
            muestre cuántos caracteres tiene sin contar los espacios en blanco 
 */
            case 26:
             // Crear un objeto Scanner para leer la entrada del usuario

        
        Scanner scanner26 = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena26 = scanner26.nextLine();
        
        int numeroCaracteres = contarCaracteresSinEspacios(cadena26);
        System.out.println("La cadena contiene " + numeroCaracteres + " caracteres (sin contar espacios).");
        
        // Cerrar el Scanner después de su uso
        scanner.close();
            break;
            /*Crea un programa que solicite al usuario una frase y 
            luego muestre las palabras ordenadas alfabéticamente
 */
            case 27:
            Scanner scanner27 = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase27 = scanner27.nextLine();

        // Dividimos la frase en palabras utilizando los espacios como separadores
        String[] palabras27 = frase27.split("\\s+");

        // Ordenamos las palabras alfabéticamente
        Arrays.sort(palabras27);

        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras27) {
            System.out.println(palabra);
        }

        // Cerrar el Scanner después de su uso
        scanner.close();
            break;
            /*Suma de elementos: Escribe un programa que calcule la suma de todos los elementos
            en un arreglo de enteros.
 */
            case 28:

            Scanner scanner28 = new Scanner(System.in);

            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamaño = scanner28.nextInt();
    
            int[] arreglo = new int[tamaño];
    
            // Pedir al usuario que ingrese los elementos del arreglo
            for (int l = 0; l < tamaño; l++) {
                System.out.print("Ingrese el elemento " + (l + 1) + ": ");
                arreglo[l] = scanner.nextInt();
            }
    
            int sumaTotal = sumaArreglo(arreglo);
            System.out.println("La suma de los elementos del arreglo es: " + sumaTotal);
    
            // Cerrar el Scanner después de su uso
            scanner.close();
    
            break;
            /*Encontrar el número más grande: 
            Crea un programa que encuentre el número más grande en un arreglo de enteros. */
            case 29:

            Scanner scanner29 = new Scanner(System.in);
            System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño29 = scanner29.nextInt();

        int[] arreglo29 = new int[tamaño29];

        // Pedir al usuario que ingrese los elementos del arreglo
        for (int L = 0; L < tamaño29; L++) {
            System.out.print("Ingrese el elemento " + (L + 1) + ": ");
            arreglo29[L] = scanner.nextInt();
        }

        int numeroMasGrande = encontrarMaximo(arreglo29);
        System.out.println("El número más grande en el arreglo es: " + numeroMasGrande);

        // Cerrar el Scanner después de su uso
        scanner.close();
            break;
            /*Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.
 */
            case 30:
            Scanner scanner30 = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño30 = scanner30.nextInt();

        int[] arreglo30 = new int[tamaño30];

        // Pedir al usuario que ingrese los elementos del arreglo
        for (int L = 0; L < tamaño30; L++) {
            System.out.print("Ingrese el elemento " + (L + 1) + ": ");
            arreglo30[L] = scanner30.nextInt();
        }

        int[] arregloSinDuplicados = eliminarDuplicados(arreglo30);

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo30);

        System.out.println("Arreglo sin duplicados:");
        imprimirArreglo(arregloSinDuplicados);

        // Cerrar el Scanner después de su uso
        scanner.close();
            break;
            /*Ordenar elementos: Implementa un algoritmo de ordenamiento 
            (por ejemplo, el algoritmo de burbuja o el de selección) 
            para ordenar un arreglo de enteros de manera ascendente.
 */
            case 31:
            Scanner scanner31 = new Scanner(System.in);

            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamaño31 = scanner31.nextInt();
    
            int[] arreglo31 = new int[tamaño31];
    
            // Pedir al usuario que ingrese los elementos del arreglo
            for (int L = 0; L < tamaño31; L++) {
                System.out.print("Ingrese el elemento " + (L + 1) + ": ");
                arreglo31[L] = scanner31.nextInt();
            }
    
            System.out.println("Arreglo original:");
            imprimirArreglo(arreglo31);
    
            // Ordenar el arreglo utilizando el algoritmo de burbuja
            ordenarPorBurbuja(arreglo31);
    
            System.out.println("Arreglo ordenado:");
            imprimirArreglo(arreglo31);
    
            // Cerrar el Scanner después de su uso
            scanner.close();
            break;

            /*Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y
            muestre su índice (o un mensaje si no se encuentra).
 */
            case 32:
            Scanner scanner32 = new Scanner(System.in);

            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamaño32 = scanner32.nextInt();
    
            int[] arreglo32 = new int[tamaño32];
    
            // Pedir al usuario que ingrese los elementos del arreglo
            for (int L = 0; L < tamaño32; L++) {
                System.out.print("Ingrese el elemento " + (L + 1) + ": ");
                arreglo32[L] = scanner32.nextInt();
            }
    
            System.out.print("Ingrese el número que desea buscar: ");
            int numeroBuscar = scanner32.nextInt();
    
            int indiceEncontrado = buscarNumero(arreglo32, numeroBuscar);
    
            if (indiceEncontrado != -1) {
                System.out.println("El número " + numeroBuscar + " se encuentra en el índice " + indiceEncontrado + " del arreglo.");
            } else {
                System.out.println("El número " + numeroBuscar + " no se encuentra en el arreglo.");
            }
    
            // Cerrar el Scanner después de su uso
            scanner.close();
        
            break;
            /*Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo. */
            case 33:
            Scanner scanner33 = new Scanner(System.in);

            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamaño33 = scanner33.nextInt();
    
            int[] arreglo33 = new int[tamaño33];
    
            // Pedir al usuario que ingrese los elementos del arreglo
            for (int L = 0; L < tamaño33; L++) {
                System.out.print("Ingrese el elemento " + (L + 1) + ": ");
                arreglo33[L] = scanner.nextInt();
            }
    
            // Contar la frecuencia de cada elemento en el arreglo utilizando un HashMap
            Map<Integer, Integer> frecuenciaElementos = new HashMap<>();
            for (int elemento : arreglo33) {
                int frecuencia = frecuenciaElementos.getOrDefault(elemento, 0) + 1;
                frecuenciaElementos.put(elemento, frecuencia);
            }
    
            System.out.println("Frecuencia de cada elemento en el arreglo:");
            for (Map.Entry<Integer, Integer> entry : frecuenciaElementos.entrySet()) {
                int elemento = entry.getKey();
                int frecuencia = entry.getValue();
                System.out.println("Elemento: " + elemento + ", Frecuencia: " + frecuencia);
            }
    
            // Cerrar el Scanner después de su uso
            scanner.close();
            break;
            /*Rotación de elementos: Implementa un programa que rote los elementos de un 
            arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
 */
            case 34:
            Scanner scanner34 = new Scanner(System.in);

            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamaño34 = scanner34.nextInt();
    
            int[] arreglo34 = new int[tamaño34];
    
            // Pedir al usuario que ingrese los elementos del arreglo
            for (int L = 0; L < tamaño34; L++) {
                System.out.print("Ingrese el elemento " + (L + 1) + ": ");
                arreglo34[L] = scanner.nextInt();
            }
    
            System.out.print("Ingrese la cantidad de posiciones a rotar: ");
            int posiciones = scanner34.nextInt();
    
            System.out.print("Ingrese la dirección de rotación (izquierda o derecha): ");
            String direccion = scanner34.next();
    
            int n = arreglo34.length;
            int[] auxiliar = new int[n];
    
            for (int M = 0; M < n; M++) {
                int indice;
                if (direccion.equalsIgnoreCase("izquierda")) {
                    indice = (M - posiciones + n) % n;
                } else if (direccion.equalsIgnoreCase("derecha")) {
                    indice = (M + posiciones) % n;
                } else {
                    System.out.println("Dirección de rotación inválida. Use 'izquierda' o 'derecha'.");
                    return;
                }
                auxiliar[indice] = arreglo34[M];
            }
    
            System.out.println("Arreglo después de la rotación:");
            for (int elemento : auxiliar) {
                System.out.print(elemento + " ");
            }
            System.out.println();
    
            // Cerrar el Scanner después de su uso
            scanner.close();
            break;
            /*Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10.
             Usa para esto una matriz */
            case 35:
            int[][] tablaMultiplicar = new int[10][10];

        // Llenar la matriz con las tablas de multiplicar
        for (int L = 0; L < 10; L++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[L][j] = (L + 1) * (L + 1);
            }
        }

        // Imprimir las tablas de multiplicar
        for (int L = 0; L < 10; L++) {
            System.out.println("Tabla del " + (L + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d x %2d = %3d\n", (L + 1), (j + 1), tablaMultiplicar[L][j]);
            }
            System.out.println();
        }
            break;


        }
        
        
        
    }
        public static int buscarNumero(int[] arreglo, int numero) {
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == numero) {
                    return i; // Retorna el índice si encuentra el número
                }
            }
            return -1; // Retorna -1 si el número no se encuentra en el arreglo
        }
    

        public static String reemplazarLetra(String cadena, char letraOriginal, char letraReemplazo) {
            char[] caracteres = cadena.toCharArray();
    
            for (int i = 0; i < caracteres.length; i++) {
                if (caracteres[i] == letraOriginal) {
                    caracteres[i] = letraReemplazo;
                }
            }
    
            return new String(caracteres);
        }

        public static int contarCaracteresSinEspacios(String cadena) {
            // Eliminamos los espacios en blanco de la cadena
            String cadenaSinEspacios = cadena.replace(" ", "");
            // Retornamos la longitud de la cadena sin espacios
            return cadenaSinEspacios.length();
        }

        public static int sumaArreglo(int[] arreglo) {
            int suma = 0;
            for (int elemento : arreglo) {
                suma += elemento;
            }
            return suma;
        }
        public static int encontrarMaximo(int[] arreglo) {
            int maximo = arreglo[0];
            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];
                }
            }
            return maximo;
        }
        public static int[] eliminarDuplicados(int[] arreglo) {
            ArrayList<Integer> listaSinDuplicados = new ArrayList<>();
    
            for (int elemento : arreglo) {
                if (!listaSinDuplicados.contains(elemento)) {
                    listaSinDuplicados.add(elemento);
                }
            }
    
            int[] arregloSinDuplicados = new int[listaSinDuplicados.size()];
            for (int i = 0; i < listaSinDuplicados.size(); i++) {
                arregloSinDuplicados[i] = listaSinDuplicados.get(i);
            }
    
            return arregloSinDuplicados;
        }
        public static void imprimirArreglo(int[] arreglo) {
            for (int elemento : arreglo) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        public static void ordenarPorBurbuja(int[] arreglo) {
            int n = arreglo.length;
            boolean intercambio;
            for (int i = 0; i < n - 1; i++) {
                intercambio = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                        intercambio = true;
                    }
                }
                // Si no hubo intercambios en una iteración, el arreglo ya está ordenado, se sale del ciclo.
                if (!intercambio) {
                    break;
                }
            }
        }
        
    
    
    }
    

