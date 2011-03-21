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

	public Collection<Weather> read(String filename, Date date, String startTime, String endTime) throws IOException  {
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
			boolean isValid = false;
			
			for (int i = 2; i < sheet.getRows(); i++) {
				cell = sheet.getCell(0, i);
				d = df.parse(cell.getContents());
				cal = new GregorianCalendar();
				cal.setTime(d);
				if(current.get(Calendar.DATE) == cal.get(Calendar.DATE) && current.get(Calendar.MONTH) == cal.get(Calendar.MONTH)){
					//System.out.println(sheet.getCell(1, i).getContents());
					if(sheet.getCell(1, i).getContents().equals(startTime)){
						isValid = true;
					}
					else if(sheet.getCell(1, i).getContents().equals(endTime)){
						isValid = false;
					}
					if(isValid){
						cell = sheet.getCell(2, i);
						//System.out.println(sheet.getCell(1, i).getContents());
						Weather weather = new Weather();
						weather.setDate(d);
						weather.setTemperature(Double.parseDouble(cell.getContents()));
						cell = sheet.getCell(7, i);
						//System.out.println(cell.getContents());
						weather.setWindSpeed(Integer.parseInt(cell.getContents()));
						cell = sheet.getCell(17, i);
						weather.setRainFall(Double.parseDouble(cell.getContents()));
						cell = sheet.getCell(16, i);
						weather.setPressure(Double.parseDouble(cell.getContents()));
						col.add(weather);
						//break;
					}
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