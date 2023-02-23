package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();


		if (shape.equals("ellipse")) {
			if (filled == false) {
				StdDraw.setPenColor(red, green, blue);
				StdDraw.ellipse(x1, y1, x2, y2);
			}
			if (filled == true) {
				StdDraw.setPenColor(red, green, blue);
				StdDraw.filledEllipse(x1, y1, x2, y2);
			}
		} else if (shape.equals("rectangle")) {
			if (filled == false) {
				StdDraw.setPenColor(red, green, blue);
				StdDraw.rectangle(x1, y1, x2, y2);
			}
			if (filled == true) {
				StdDraw.setPenColor(red, green, blue);
				StdDraw.filledRectangle(x1, y1, x2, y2);
			}
		} else {
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			if (filled == false) {
				double[] array = { x1, x2, x3 };
				double[] secondArray = { y1, y2, y3 };
				StdDraw.setPenColor(red, green, blue);
				StdDraw.polygon(array, secondArray);
			}
			if (filled == true) {
				double[] array = { x1, x2, x3 };
				double[] secondArray = { y1, y2, y3 };
				StdDraw.setPenColor(red, green, blue);
				StdDraw.filledPolygon(array, secondArray);
			}
		}

	}
}
