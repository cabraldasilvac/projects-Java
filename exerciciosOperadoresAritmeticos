public class exerciciosOperadoresAritmeticos {

	public static void main(String[] args) {

		System.out.println("prePos");
		prePos();
		System.out.println("Aritimético");
		aritmetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedência");
		precedencia();

	}

	private static void prePos() {
		System.out.println("=================== ");
		int k = 10;

		int i = ++k;
		int j = k--;
		int x = k;

		System.out.println("i: " + i);
		System.out.println("j: " + i);
		System.out.println("x: " + i);
		System.out.println(" ");
	}

	private static void aritmetico() {
		System.out.println("=================== ");
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		// Variáveis de resultdo
		int r1 = a + b;
		int r2 = c - a;
		int r3 = d * b;
		int r4 = e / a;
		int r5 = c % b;

		// Saida dos resultados
		System.out.println("a+b: " + r1);
		System.out.println("c-a: " + r2);
		System.out.println("d*b: " + r3);
		System.out.println("e/a: " + r4);
		System.out.println("c%b: " + r5);
		System.out.println(" ");
	}

	private static void atribuicao() {
		System.out.println("=================== ");

		// Variáveis de Resultado
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5F;
		double d = f;

		System.out.println("d: " + d);

		i += 5; // i = i + 5
		j -= 3; // j = j - 3
		d /= 2.7d; // d = d / 2.7d
		l *= 3; // l = l * 3
		k %= 2; // k = k % 2

		// Saida dos Resultados
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("d: " + d);
		System.out.println("l: " + l);
		System.out.println("k: " + k);

		i = k = j;

		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println(" ");
	}

	private static void precedencia() {
		System.out.println("=================== ");

		int i = 10;
		int j = 20;
		int k = 30;

		int a = i++ + --j * k; // 10 + 19 + 30 -> 10 + 570 -> 1

		System.out.println("i++ + --j: " + a);

		System.out.println("i: " + i); // 11

		int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

		System.out.println("k /  --i %3 + 1 : " + b);

		System.out.println("i: " + i); // 10

		int c = 2;

		c *= i += 5; // c = 2 * i; i = 1 + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; c = 30

		System.out.println("c *= i += 5: " + c); // 30
		System.out.println("=================== ");

	}
}
