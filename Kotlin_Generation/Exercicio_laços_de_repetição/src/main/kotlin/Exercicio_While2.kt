fun main(){

    var opcaoEscolh = 0
    var idades = 0
    var sexo = 0
    var pessoasCal = 0
    var mulheresNer = 0
    var homensAgre = 0
    var outrosCal =0
    var pessoasNerMais40 = 0
    var pessoasCalMenos18 = 0
    var i = 0

    while(i < 2){
        print("Digite sua idade: ")
        idades = readln().toInt()

        print("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ")
        sexo = readln().toInt()

        println("Escolha uma das opções:\n" + "1: se você é calma;\n" + "2: se você é nervosa;\n" +  "3: se você é agressiva")
        opcaoEscolh = readln().toInt()

        if (opcaoEscolh == 1){
            pessoasCal++
        }

        if (sexo==1 && opcaoEscolh ==2){
            mulheresNer++
        }

        if (sexo==2 && opcaoEscolh ==3){
            homensAgre++
        }

        if (sexo==3 && opcaoEscolh ==1){
            outrosCal++
        }

        if (opcaoEscolh==2 && idades > 40){
            pessoasNerMais40++
        }

        if (opcaoEscolh==1 && idades < 18){
            pessoasCalMenos18++
        }
        i++
    }

    println("Número de pessoas calmas: $pessoasCal")
    println("Número de mulheres nervosas: $mulheresNer")
    println("Número de homens agressivos: $homensAgre")
    println("Número de outros calmos: $outrosCal")
    println("Número de pessoas nervosas com mais de 40 anos: $pessoasNerMais40")
    println("Número de pessoas calmas com menos de 18 anos: $pessoasCalMenos18")

}