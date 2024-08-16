import java.util.*

val reader = Scanner(System.`in`)

//              Desafios de Lógica de Programação – AndroidDev

// >>>>>>>>>>>>>>> 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
//entre A e B e mostre se a soma é menor que C.

fun somaABC(){
    println("Digite o  valor da letra A: ")
    var a = reader.nextInt()

    println("Digite o  valor da letra B: ")
    var b = reader.nextInt()

    println("Digite o  valor da letra C: ")
    var c = reader.nextInt()

    var soma = a+b
    var menor = ""
    if(soma < c){
        menor = "é"
    }else{
        menor = "não é"
    }

    println("A soma de A e B é: ${soma}.")
    println("C ${menor} menor do que a soma de A e B.")

}

//fun main() {
//    somaABC()
//}

// >>>>>>>>>>>>>>> 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é
//par ou ímpar, positivo ou negativo.

fun ParImpaPosiNega() {
    var tipo1 = ""
    var tipo2 = ""
    println("Digite um número: ")
    var number = reader.nextInt()
    if(number > 0){
        tipo1 = "positivo"
    }else{
        tipo1 = "negativo"
    }
    if(number%2 == 0){
        tipo2 = "par"
    }else{
        tipo2 = "ímpar"
    }

    println("Seu número ${number} é ${tipo1} e ${tipo2}.")

}

//fun main() {
//    ParImpaPosiNega()
//}


// >>>>>>>>>>>>>>> 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
//iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de
//qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor
//na tela.

fun somaOuMultiplica() {
    var c = 0
    var operacao = ""

    println("Digite o valor inteiro de A: ")
    var a = reader.nextInt()

    println("Digite o valor inteiro de B: ")
    var b = reader.nextInt()

    if(a == b){
        c = a+b
        operacao = "soma"
    }else{
        c = a*b
        operacao = "multiplicação"
    }
    println("O valor de C é a ${operacao} de A e B que resulta em: ${c}.")
}

//fun main() {
//    somaOuMultiplica()
//}

// >>>>>>>>>>>>>>> 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o
//seu sucessor.

fun antESuc() {
    var c = 0
    var operacao = ""

    println("Digite um valor inteiro: ")
    var number = reader.nextInt()

    var antecessor = number - 1
    var sucessor = number + 1

    println("O seu número é ${number}.")
    println("O antecessor do seu número é ${antecessor}.")
//    println("O antecessor do seu número é ${number-1}.")
    println("O sucessor do seu número é ${sucessor}.")
//    println("O sucessor do seu número é ${number+1}.")
}

//fun main() {
//    antESuc()
//}


// >>>>>>>>>>>>>>> 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base
//para o Salário mínimo R$ 1.293,20).

fun calculaSalario(){
    val salarioMinimo = 1293.20

    println("Digite o seu salário: ")
    var salario = reader.nextInt()

    var divisao = salario/salarioMinimo
    println("O seu salário equivale a ${String.format("%.2f", divisao)} salários mínimos (R$ 1.293,20).")

}

//fun main() {
//    calculaSalario()
//}


// >>>>>>>>>>>>>>> 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
fun reajuste() {
    println("Digite um valor: ")
    var number = reader.nextInt()
    var reajuste = number*1.05

    println("O seu valor ${number} reajustado em 5% será de ${reajuste}.")

}

//fun main() {
//    reajuste()
//}

// >>>>>>>>>>>>>>> 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são
//VERDADEIRO ou FALSO.

fun boolean() {
    println("Digite um valor booleano [true/false]: ")
    var valor1 = reader.nextBoolean()

    println("Digite outro valor booleano [true/false]: ")
    var valor2 = reader.nextBoolean()

    if(valor1){
        if (valor2){
            println("Ambos os valores são True.")
        }
            println("O primeiro valor é True e o segundo é False.")
    }else{
        if(valor2){
            println("O primeiro valor é Falso e o segundo é True.")
        }else{
            println("Ambos os valores são False.")
        }
    }

}

//fun main() {
//    boolean()
//}

// >>>>>>>>>>>>>>> 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores
//em ordem decrescente

fun order() {

    var number2 = 0
    var number3 = 0
    var maior = 0
    var meio = 0
    var menor = 0


    println("Digite o primeiro valor inteiro: ")
    var number1 = reader.nextInt()

    do {
        println("Digite o segundo valor inteiro: ")
        number2 = reader.nextInt()
    }while(number2 == number1)

    do {
        println("Digite o terceiro valor inteiro: ")
        number3 = reader.nextInt()
    }while((number3 == number1) || (number3 == number2))

//    println(number1)
//    println(number2)
//    println(number3)
    if (number1 > number2){
        if (number1 > number3){
            maior = number1
            if(number2>number3){
                meio = number2
                menor = number3
            }else{
                meio = number3
                menor = number2
            }
        }else{
            maior = number3
            meio = number1
            menor = number2
        }
    }else{
        if (number1 > number3){
            maior = number2
            meio = number1
            menor = number3
        }else{
            menor = number1
            if(number2>number3){
                maior = number2
                meio = number3
            }else{
                maior = number3
                meio = number2
            }
        }
    }
 println("${maior}, ${meio}, ${menor}")
}

//fun main() {
//    order()
//}

// >>>>>>>>>>>>>>> 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o
//seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
//Fórmula do IMC = peso / (altura) ²
//Tabela Condições IMC
//Abaixo de 18,5 | Abaixo do peso
//Entre 18,6 e 24,9 | Peso ideal (parabéns)
//Entre 25,0 e 29,9 | Levemente acima do peso
//Entre 30,0 e 34,9 | Obesidade grau I
//Entre 35,0 e 39,9 | Obesidade grau II (severa)
//Maior ou igual a 40 | Obesidade grau III (mórbida)

fun imc() {

    var peso:Double = 0.0
    var altura:Double = 0.0
    var imc:Double = 0.0

    println("Digite o seu peso: ")
    peso = reader.nextDouble()

    println("Digite a sua altura: ")
    altura = reader.nextDouble()

    imc = peso / (altura*altura)
    var imcs = String.format("%.2f", imc)

//Abaixo de 18,5 | Abaixo do peso
//Entre 18,6 e 24,9 | Peso ideal (parabéns)
//Entre 25,0 e 29,9 | Levemente acima do peso
//Entre 30,0 e 34,9 | Obesidade grau I
//Entre 35,0 e 39,9 | Obesidade grau II (severa)
//Maior ou igual a 40 | Obesidade grau III (mórbida)


    if(imc < 18.5){
        println("Seu IMC é ${imcs} e você está abaixo do peso.")
    }else if(imc >= 18.6 && imc <= 24.9){
        println("Seu IMC é ${imcs} e você está no peso ideal (parabéns).")
    }else if(imc >= 25.0 && imc <= 29.9){
        println("Seu IMC é ${imcs} e você está levemente acima do peso.")
    }else if(imc >= 30 && imc <= 34.9){
        println("Seu IMC é ${imcs} e você está com obesidade grau I.")
    }else if(imc >= 35.0 && imc <= 39.9){
        println("Seu IMC é ${imcs} e você está com obesidade grau II (severa).")
    }else{
        println("Seu IMC é ${imcs} e você está com obesidade grau III (mórbida).")
    }

}

//fun main() {
//    imc()
//}



// >>>>>>>>>>>>>>> 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média
//das notas.

fun mediaNota() {

    println("Digite a primeira nota: ")
    var nota1 = reader.nextDouble()

    println("Digite a segunda nota: ")
    var nota2 = reader.nextDouble()

    println("Digite a terceira nota: ")
    var nota3 = reader.nextDouble()

    var media = (nota1+nota2+nota3)/3

    println("A média das suas notas é: ${String.format("%.2f", media)}.")

}

//fun main() {
//    mediaNota()
//}