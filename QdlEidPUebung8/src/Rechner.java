import java.util.Scanner;

public class Rechner {
	Scanner s = new Scanner(System.in);
	Operator[] bo = new Operator[100];
	int anzBo = 0;

	public Rechner(Scanner s) {
		this.s = s;
	}

	public String liesAusdruck1() {
		int zahl1 = s.nextInt();
		int zahl2 = s.nextInt();
		String operator;
		String erg;
		do {
			System.out.println("Bitte einen Operator eingeben:");
			operator = s.next();
			switch (operator) {
			case "+":
				erg = zahl1 + operator + zahl2 + "=" + (zahl1 + zahl2);
				break;
			case "-":
				erg = zahl1 + operator + zahl2 + "=" + (zahl1 - zahl2);
				break;
			case "*":
				erg = zahl1 + operator + zahl2 + "=" + (zahl1 * zahl2);
				break;
			case "/":
				erg = zahl1 + operator + zahl2 + "=" + (zahl1 / zahl2);
				break;
			default:
				erg = zahl1 + operator + zahl2 + "=" + "<Ungueltiger Operator>";
				break;
			}
			return erg;
			// if(operator=="+") ist falsch; weil die Referenze nicht gleich sind; mit ===
			// vergleichen die Referenz;
			// if(operator.equals("+")) ist richtig.weil die Inhalte gleich sind;mit
			// x.equals() vergleichen die Inhalte;
		} while (operator != null);

	}

	public Operator liesAusdruck() {
		int zahl1 = s.nextInt();
		String operator = s.next();
		Operator erg = null;
		if (operator.equals("!")) {
			erg = new Factorial(zahl1);
		} else {
			int zahl2 = s.nextInt();
			if (operator.equals("+")) {
				erg = new PlusOp(zahl1, zahl2);
			} else if (operator.equals("-")) {
				erg = new MinusOp(zahl1, zahl2);
			} else if (operator.equals("*")) {
				erg = new MultiOp(zahl1, zahl2);
			} else if (operator.equals("/")) {
				erg = new DiviOp(zahl1, zahl2);
			} else if (operator.equals("^")) {
				erg = new PotenzOp(zahl1, zahl2);
			} else {
				erg = null;
			}
		}
		return erg;
	}

	public void printAusdruck(Operator ausdruck) {
		String erg = "";
		if (ausdruck != null) {
			erg = ausdruck.toString() + "=" + ausdruck.calculate();
			System.out.println(erg);
		}
	}

	public void liesEingabe() {
		String str;
		do {
			str = s.next();
			switch (str) {
			case "i":
				liesUndSpeichereAusdruck();
				break;
			case "o":
				gibtAusdrueckeAus();
			case "q":
				break;
			case "d":
				loescheAusdruck();
				break;
			case "s":
				addiereAlle();
				break;
			case "p":
				multipAlle();
				break;
			case "m":
				maxi();
				break;
			case "paint":
				zeichne();
				break;
			default:
				System.out.println("<Ungueltige Eingabe>");
			}
		} while (!str.equals(null));

	}

	public void liesUndSpeichereAusdruck() {
		if (anzBo < bo.length) {
			bo[anzBo++] = liesAusdruck();
		}
	}

	public void gibtAusdrueckeAus() {
		for (int i = 0; i < anzBo; i++) {
			if (bo[i] != null)
				printAusdruck(bo[i]);
		}

	}

	public void loescheAusdruck() {
		int n;
		do {
			n = s.nextInt();
			n--;
			if (n >= 0 && bo[n] != null) {

				while (bo[n + 1] != null && n + 1 < anzBo) {
					bo[n] = bo[n + 1];
					n++;
				}
				bo[n] = null;
				anzBo--;
			}
		} while (n <= anzBo);
	}

	public void addiereAlle() {
		String erg = "";
		double erg2 = 0;
		for (int i = 0; i < anzBo; i++) {
			if (bo[i] != null) {
				if (i != anzBo - 1) {
					erg += bo[i].toString() + "+";
					erg2 += bo[i].calculate();
				} else {
					erg += bo[i].toString();
					erg2 += bo[i].calculate();
				}
			}
		}
		System.out.println(erg + "=" + erg2);

	}

	public void multipAlle() {
		String erg = "";
		double erg2 = 1;
		for (int i = 0; i < anzBo; i++) {
			if (bo[i] != null) {
				if (i != anzBo - 1) {
					erg += bo[i].toString() + "*";
					erg2 *= bo[i].calculate();
				} else {
					erg += bo[i].toString();
					erg2 *= bo[i].calculate();
				}
			}
		}
		System.out.println(erg + "=" + erg2);
	}

	public void maxi() {
		String erg = "";
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < anzBo; i++) {
			if (bo[i].calculate() > max) {
				max = bo[i].calculate();
				erg = bo[i].toString();
			}
		}
		System.out.println("Maximum : " + erg + "=" + max);
	}

	public void zeichne() {		
		String str=s.next();
		for (int i = 0; i < anzBo; i++) {
			for (int j = 0; j < bo[i].calculate(); j++) {
				System.out.print(str);
			}
			System.out.println("");
		}
	}
}
