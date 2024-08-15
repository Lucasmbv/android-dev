import java.util.Scanner

//      ANDROID DEV - DESAFIO 01
//"Desenvolva um programa que solicite ao usuário o tipo de energia
//(eletricidade ou gás natural) e o respectivo consumo. Utilize fatores
//de emissão específicos para cada tipo de energia: Eletricidade (0.475
//kg C02/kWh) e gás natural (2.0 kg C02/m3). O programa deve calcular
//a pegada de carbono para cada tipo de energia inserido e, ao final,
//apresentar o valor total da pegada de carbono."


// FUNÇÃO -Caucula pegada de carbono
fun pegadaDeCarbono(consumo:Int, energia:Int): Float {
    val emissaoEletrica:Float = 0.475f
    val emissaoGasNatural:Float = 2.0f
    var calculo:Float = 0.0f


    if(energia == 1){
        calculo = consumo * emissaoEletrica
    }else{
        calculo = consumo * emissaoGasNatural
    }

    return calculo

}


fun main() {

    // DECLARAÇÃO - Variáveis globais
    val reader = Scanner(System.`in`)
    var resp1 = 0
    var resp2 = 0
    var tipo = ""
    var tipo2 = ""
    var consumo = 0
    var consumo2 = 0
    var resultado:Float = 0.0f
    var resultado2:Float = 0.0f
    var outrotipo = ""

    // INPUT - Usuário escolhe o primeiro tipo de energia
    do {
        println("Digite o número do tipo de energia que deseja utilizar? (1 ou 2)")
        println("[1] - Eletricidade")
        println("[2] - Gás natural")
        resp1 = reader.nextInt()
    }while (resp1 != 1 && resp1 != 2)

    // Printa o tipo escolhido e define as variáveis
    if (resp1 === 1){
        println("Você escolheu a Eletricidade")
        tipo = "Eletricidade"
        tipo2 = "Gás natural"
        resp2 = 2

    }else{
        println("Você escolheu a Gás natural")
        tipo = "Gás natural"
        tipo2 = "Eletricidade"
        resp2 = 1
    }

    // INPUT - Usuário define o consumo de energia1
    do {
        println("Quanto de ${tipo} você pretende consumir? ")
        consumo = reader.nextInt()
    }while(consumo <= 0)


    // INPUT - Usuário decide se quer outro tipo de energia
    do {
        println("Você também deseja utilizar ${tipo2}?[s/n]")
        outrotipo = readLine()!!
    }while(outrotipo != "s" && outrotipo != "n")

    // INPUT - Usuário define o consumo de energia2 e calcula a pegada de carbono2
    if(outrotipo == "s"){
        do {
            println("Quanto de ${tipo2} você pretende consumir? ")
            consumo2 = reader.nextInt()
        }while(consumo2 <= 0)

        resultado2 = pegadaDeCarbono(consumo2, resp2)

    }

    // CALCULA - Pegada de caborno 1
    resultado = pegadaDeCarbono(consumo, resp1)

    // PRINTA - Pegada de caborno 1
    println("A sua pegada de caborno de ${tipo} é: ${resultado} kg CO2")

    // PRINTA - Pegada de caborno 2 e PRINTA/CALCULA pegada total de carbono
    if (outrotipo == "s"){
        println("A sua pegada de caborno de ${tipo2} é: ${resultado2} kg CO2")
        println("Desta forma, o seu total de pegada de caborno é: ${resultado+resultado2} kg CO2")
    }



}