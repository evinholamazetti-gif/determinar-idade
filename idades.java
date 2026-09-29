import java.util.Scanner; import java.util.Arrays;
public class IdadeCamila { public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] idades = new int[3];
idades[0] = scanner.nextInt();
idades[1] = scanner.nextInt();
idades[2] = scanner.nextInt();
Arrays.sort(idades);
(índice 1) System.out.println(idades[1]); scanner.close(); } }
