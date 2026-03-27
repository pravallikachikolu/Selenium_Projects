package com.orangehrm.selniumuiframework.gernericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook wb;
	Sheet sheet;
	//Load Excel File
		public void loadExcelFile(String filePath,String sheetName) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream(filePath);
			 wb = WorkbookFactory.create(fis);
			sheet = wb.getSheet(sheetName);
			
		}
		//Read Data
		public String getDataFromSingleCell(int rowNum, int cellNum) {

			Row row = sheet.getRow(rowNum);
		    if (row == null) {
		        return "";
		    }

		    Cell cell = row.getCell(cellNum, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

		    switch (cell.getCellType()) {
		        case STRING:
		            return cell.getStringCellValue();

		        case NUMERIC:
		            return String.valueOf((int) cell.getNumericCellValue());

		        default:
		            return "";
		    }  
		}
		
		//Write the data
		public void writeDataInTheCell(String filePath,String sheetName,int rowNo,int celNo,String  data) throws IOException {

			Row row = sheet.getRow(rowNo);
			
			if(row==null) {
				row=sheet.createRow(rowNo);
			}
			
			Cell cell = row.getCell(celNo);
			if(cell==null) {
				cell=row.createCell(celNo);
			}
			cell.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(filePath);
			wb.write(fos);
			fos.close();
		}
		
		//Get entire data using data provider
		public Object[][] getDataFromTheExcelSheet() throws IOException{
			 int rowCount = sheet.getLastRowNum();
			    int colCount = sheet.getRow(0).getLastCellNum();

			    Object[][] data = new Object[rowCount][colCount];

			    for(int i = 1; i <= rowCount; i++) {
			        Row row = sheet.getRow(i);

			        for(int j = 0; j < colCount; j++) {
			            Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			            data[i-1][j] = cell.toString();
			        }
			    }
			    return data;
		}

}
