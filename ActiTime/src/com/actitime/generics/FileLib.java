package com.actitime.generics;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author alok ranjan
 *
 */
public class FileLib {
/**
 * 
 * @param Key
 * @return
 * @throws IOException
 */
	public String getPropertyValue(String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		 String value = p.getProperty(Key);
		 return value;
	}
	/**
	 * 
	 * @param Sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws IOException
	 */
	public String getExcelValue(String Sheetname,int rownum,int cellnum) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).toString();
		return value;
	}
}
