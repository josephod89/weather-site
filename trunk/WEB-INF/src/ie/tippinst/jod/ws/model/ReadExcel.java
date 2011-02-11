package ie.tippinst.jod.ws.model;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	private String inputFile;

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String read() throws IOException  {
		File inputWorkbook = new File(inputFile);
		Workbook w = null;
		Sheet sheet = null;
		Cell cell = null;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			sheet = w.getSheet(0);
			// Loop over first 10 column and lines

			/*for (int j = 0; j < sheet.getColumns(); j++) {
				for (int i = 0; i < sheet.getRows(); i++) {
					Cell cell = sheet.getCell(j, i);
					CellType type = cell.getType();
					if (cell.getType() == CellType.LABEL) {
						System.out.println("I got a label "
								+ cell.getContents());
					}

					if (cell.getType() == CellType.NUMBER) {
						System.out.println("I got a number "
								+ cell.getContents());
					}

				}
			}*/
			cell = sheet.getCell(2, 2);
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return cell.getContents();
	}
}