package excelReadingPackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WayoneExel {
	 public static final String SAMPLE_XLSX_FILE_PATH = "C:\\D\\ExcelData\\wayonereading.xlsx";

	    public static void main(String[] args) throws IOException, InvalidFormatException {

	        // Creating a Workbook from an Excel file (.xls or .xlsx)
	        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

	        // Retrieving the number of sheets in the Workbook
	        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
	        
	        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
	        System.out.println("Retrieving Sheets using Iterator");
	        while (sheetIterator.hasNext()) {
	            Sheet sheet = sheetIterator.next();
	            System.out.println("=> " + sheet.getSheetName());
	        }
	    }

}
