package learnTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Learning_Multiple_Datas {
	// all pending works are present in karthi qsp whatsapp .
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/main/resources/RegisterData1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("RegisterToDWS");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		String male = cell.getStringCellValue();
		
		String firstName = row.getCell(1).getStringCellValue();
		}
}

