public class Main {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(5, 7);
        Retangulo ret2 = new Retangulo(3, 4);
        
        ret1.exibirInformacoes();
        System.out.println();
        ret2.exibirInformacoes();
        
        Scanner scanner = new Scanner(System.in);
        Retangulo[] retangulos = new Retangulo[5];

        for (int i = 0; i < retangulos.length; i++) {
            System.out.print("Digite a largura do retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            retangulos[i] = new Retangulo(largura, altura);
        }

        Retangulo maiorArea = retangulos[0];
        Retangulo menorPerimetro = retangulos[0];

        for (Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
            System.out.println();

            if (retangulo.calcularArea() > maiorArea.calcularArea()) {
                maiorArea = retangulo;
            }

            if (retangulo.calcularPerimetro() < menorPerimetro.calcularPerimetro()) {
                menorPerimetro = retangulo;
            }
        }

        System.out.println("Retângulo com maior área:");
        maiorArea.exibirInformacoes();
        System.out.println();

        System.out.println("Retângulo com menor perímetro:");
        menorPerimetro.exibirInformacoes();
        System.out.println();

        Arrays.sort(retangulos, (r1, r2) -> Double.compare(r1.calcularArea(), r2.calcularArea()));

        System.out.println("Retângulos ordenados por área crescente:");
        for (Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
            System.out.println();
        }

        Retangulo[] novosRetangulos = new Retangulo[10];
        System.arraycopy(retangulos, 0, novosRetangulos, 0, retangulos.length);

        for (int i = 5; i < novosRetangulos.length; i++) {
            System.out.print("Digite a largura do novo retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura do novo retângulo " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            novosRetangulos[i] = new Retangulo(largura, altura);
        }

        System.out.println("Informações de todos os retângulos após expansão do vetor:");
        for (Retangulo retangulo : novosRetangulos) {
            retangulo.exibirInformacoes();
            System.out.println();
        }
        
        scanner.close();
    }
}
