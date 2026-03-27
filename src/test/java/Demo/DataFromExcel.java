package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class DataFromExcel {
	@Test
	public void Test() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHrm_CommomData/Vacancies.xlsx");
		Workbook workbook = WorkbookFactory.create(fis); //to make the copy of the physical file
		Sheet sheet = workbook.getSheet("AddVacancy");
		
		for(int i=1; i<=sheet.getLastRowNum(); i++) {
			String vacancyName =sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(vacancyName);
		}
		
		//to display one value
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String vacancyName = cell.getStringCellValue();
//		System.out.println(vacancyName);
		workbook.close();
		
	}

}
