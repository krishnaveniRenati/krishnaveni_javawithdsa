package EXCEL;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;			//cell or column
import org.apache.poi.ss.usermodel.Row;				//Row
import org.apache.poi.xssf.usermodel.XSSFSheet;		//sheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook;	//excel
public class WriteFile {

	public static void main(String[] args) throws Exception{
		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet = workbook.createSheet("Java Books");
			         
			Object[][] bookData = {
			                {"Venkatesh", "Indramohan", 79},
			                {"Vinoth", "Keshav", 77},
			                {"Karthik", "Purushothaman", 86},};
			                
			int rowCount = 0;
			for (Object[] aBook : bookData) // For each LOOP
			{
			      Row row = sheet.createRow(++rowCount);
			      int columnCount = 0;
			      for (Object field : aBook) {
			      Cell cell = row.createCell(++columnCount);
			      if (field instanceof String) 
			      {
			          cell.setCellValue((String) field);
			      } else if (field instanceof Integer) 
			      		{
			    	  		cell.setCellValue((Integer) field);
			      		}
			      }
				  }

				try (FileOutputStream outputStream = new FileOutputStream("src//main//resources//File1.xlsx")) 
				{
			            workbook.write(outputStream); 
				}
		}
		}

	}


