public class Matriz {
	public int x, y;
	private int[][] m;

	public Matriz(int x, int y) {
		this.x = x;
		this.y = y;
		this.m = new int[x][y];
	}

	public void mostrarMatriz() {
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				System.out.print(this.m[i][j] + "   ");
			}
			System.out.println();
		}
	}

	private void Ordenar(int[] vec) {
		for (int i = 0; i < vec.length; i++) {
			for (int j = 0; j < vec.length; j++) {
				if (vec[i] > vec[j]) {
					int tmp = vec[j];
					vec[j] = vec[i];
					vec[i] = tmp;
				}
			}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[][] getM() {
		return m;
	}

	public void setM(int[][] m) {
		this.m = m;
	}

	/**
	 * Escribir un método en Java que permita comprobar si la diagonal principal de
	 * una matriz cuadrada de enteros tiene en cada posición un valor igual a la
	 * suma de todos los valores de las posiciones anteriores de dicha diagonal.
	 */
	public boolean consigna0() {
		int sum = 0, j;
		for (int i = 1; i < this.x; i++) {
			sum = 0;
			j = i - 1;
			while (j >= 0) {
				sum += m[j][j];
				j--;
			}
			if (m[i][i] != sum) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * Escribir un método en Java que permita comprobar si la multiplicación de
	 * todos los valores de una matriz numérica, dará 0 o no
	 */
	public boolean consigna01() {
		int i, j;
		for (i = 0; i < this.x; i++) {
			for (j = 0; j < this.y; j++) {
				if (this.m[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Escribir un método en Java que dada una matriz numérica, devuelva una matriz
	 * con la misma cantidad de elementos, pero donde cada valor es la suma de sus
	 * adyacentes originales (arriba, abajo, izquierda, y derecha; si existen)
	 */
	public void consigna02() {
		int[][] matriz1 = new int[this.x][this.y];
		int valor = 0;
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				valor = m[i][j];
				if ((i - 1) >= 0) {
					valor += m[i - 1][j];

				}
				if ((i + 1) < this.x) {
					valor += m[i + 1][j];
				}
				if ((j + 1) < this.y) {
					valor += m[i][j + 1];
				}
				if ((j - 1) >= 0) {
					valor += m[i][j - 1];

				}
				matriz1[i][j] = valor;

			}

		}
		for (int t = 0; t < matriz1.length; t++) {
			for (int p = 0; p < matriz1[t].length; p++) {
				System.out.print(matriz1[t][p] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * 
	 * Escribir un método en Java que de una matriz numérica dada, devuelva un
	 * vector con n elementos, donde cada elemento es la moda de una fila. Si
	 * hubiese más de una moda, se deberá utilizar la de mayor valor
	 */
	public int[] consigna03() {
		int[] vec = new int[this.y];
		int[] vec2 = new int[this.x];
		int z = 0;
		for (int i = 0; i < this.x; i++) {
			z = 0;
			for (int j = 0; j < this.y; j++) {

				vec[z] = m[i][j];
				z++;
			}
			Ordenar(vec);
			int cont = 0, contActual = 0;
			int moda1 = 0;
			int actual = 0;
			int x = 0, y = 0;
			while (x < vec.length) {
				actual = vec[x];
				contActual = 0;
				y = 0;
				while (y < vec.length) {
					if (actual == vec[y]) {
						contActual++;

					}
					y++;
				}
				if (contActual > cont) {
					moda1 = actual;
					cont = contActual;
				}

				x++;

			}
			vec2[i] = moda1;

		}
		for (int m = 0; m < vec2.length; m++) {
			System.out.print(vec2[m] + " ");
		}
		System.out.println();
		return vec2;
	}

	/**
	 * Escribir un método en Java que de una matriz cuadrada dada, devuelva una
	 * matriz con n filas, donde cada una tendrá los datos de una de las diagonales
	 * (de abajo a la izquierda hacia arriba a la derecha)
	 */
	public void consigna04() {
		int i = (this.x - 1);
		int j = 0;
		int limitJ = 0;
		int resta = 1;
		for (int x = 0; x < this.x; x++) {

			j = 0;
			i = (this.x - resta);
			while (i < this.x && j <= limitJ) {
				System.out.print(m[i][j] + " ");
				j++;
				i++;
			}
			resta++;
			limitJ++;
			System.out.println();
		}
		int limitF = (this.x - 1);
		int v = 0, n = 1, nL = 0;
		for (int l = 0; l < (this.x - 1); l++) {
			n += nL;
			while (v < limitF && n < this.x) {
				System.out.print(m[v][n] + " ");
				v++;
				n++;
			}
			System.out.println();
			limitF--;
			nL++;
			n = 1;
			v = 0;
		}
	}
}


