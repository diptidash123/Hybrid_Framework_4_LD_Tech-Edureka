package Generics_Frame;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExternalDataFile implements Auto_constant
{
  public static String Datafetching(String path,String sheet,int row,int cell) throws IOException
  {
	  FileInputStream file=new FileInputStream(excelfilepath);
	  XSSFWorkbook data=new XSSFWorkbook(file);
	  String variable=data.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();  
	  return variable;
	  
  }
}