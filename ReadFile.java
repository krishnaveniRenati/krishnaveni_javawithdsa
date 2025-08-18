package EXCEL;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	static XSSFSheet ws;//all data constant for reason static 
	public static String Excel(int row, int column) throws Exception//return data string //suppose location not find to use exception
	{
		String testData = null;//NO VALUE MEANS NULL DECLARE//
		testData = String.valueOf(ws.getRow(row).getCell(column));//ALREDY DEFINE DATA VALUE
		return testData;
	}
	public static void main(String[] args) {
		String filepath = System.getProperty("user.dir")+"\\src\\main\\resources\\File1.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		ws = wb.getSheetAt(0);  //Sheet1	
	
		for(int i=1;i<=ws.getLastRowNum();i++)//row loop 
		{
			System.out.println();
			for(int j=0;j<=2;j++)
			System.out.print(ReadFile.Excel(i,j) + "\t");
		}
	}


/*System.out.println(Excelfile.excel(1, 0));
System.out.println(Excelfile.excel(1, 1));
System.out.println(Excelfile.excel(2, 0));
System.out.println(Excelfile.excel(2, 1));*/


	}

}
