package ie.tippinst.jod.ws.model;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public Collection<Weather> read(String filename, Date date) throws IOException  {
		File inputWorkbook = new File(filename);
		Workbook w = null;
		Sheet sheet = null;
		Cell cell = null;
		Calendar current = new GregorianCalendar();
		current.setTime(date);
		Date d = null;
		Calendar cal = null;
		Collection<Weather> col = new ArrayList<Weather>();
		
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			sheet = w.getSheet(0);
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			
			for (int i = 2; i < sheet.getRows(); i++) {
				cell = sheet.getCell(0, i);
				d = df.parse(cell.getContents());
				cal = new GregorianCalendar();
				cal.setTime(d);
				if(current.get(Calendar.DATE) == cal.get(Calendar.DATE) && current.get(Calendar.MONTH) == cal.get(Calendar.MONTH)){
					cell = sheet.getCell(2, i);
					Weather weather = new Weather();
					weather.setDate(d);
					weather.setTemperature(Double.parseDouble(cell.getContents()));
					col.add(weather);
					//break;
				}
			}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return col;
	}
}