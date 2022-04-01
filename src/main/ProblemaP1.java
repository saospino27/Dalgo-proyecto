package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProblemaP1 {
	
	public final static double INFINITY = Double.POSITIVE_INFINITY;
	
	/**
	 * Input is not checked for compliance with integrity constraints.
	 * This is the responsibility of the case/input provider.
	 * For example, it is not verified that n is greater than 0 and less than 1000 (this is an integrity constraint).
	 * For example, if you put extra spaces at the beginning, between elements, or at the end of a line, you will get an error.
	 * And so on with all integrity restrictions.
	 */
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\ASUS\\Documents\\JavaProjects\\Proyecto_1\\src\\main\\input.txt");
			InputStream in = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = br.readLine();
			String[] answers = new String[0];
			if (line != null && line.length() > 0) {
				answers = new String[Integer.parseInt(line)];
			}
			for (int i = answers.length; i > 0; i--) {
				line = br.readLine();
				int[] nmp = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
				int n = nmp[0], m = nmp[1], p = nmp[2];
				line = br.readLine();
				int[] energy = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
				for (int k = 0; k < p; k++) {
					line = br.readLine();
					int[] currenPortal = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
				}
			}
			br.close();
			for (String answer: answers) {
				System.out.println(answer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
