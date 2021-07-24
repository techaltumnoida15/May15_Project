package july17;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileData {
	//private ExcelFileData() {}
	
	@Test
	public void readData() throws Exception {
		FileInputStream fip = new FileInputStream(new File(System.getProperty("user.dir") + "//resources//testData.xlsx"));
		
		//Use POI
		//** file extension -> .xls [HSSF...] OR file extension -> .xlsx [XSSF...]
		XSSFWorkbook wb = new XSSFWorkbook(fip);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Get Rows
		int xRows = sheet.getLastRowNum() + 1;
		System.out.println("Total rows are = " + xRows);
		
		//Get columns
		int xCols = sheet.getRow(0).getLastCellNum();
		System.out.println("Total columns are = " + xCols);
		
		
		//Store? Array/ArrayList/HashSet/HashMap ?
		Map<String, String> excelData = null;
		List<Map<String, String>> testDetails = new ArrayList<Map<String,String>>();
		
		for(int i = 1; i<xRows; i++) {
			excelData = new HashMap<String, String>();
			
			for(int j = 0; j< xCols; j++) {
				String key = null;
				try {
					key = getStringCellCalue(sheet.getRow(0).getCell(j));
				} catch (Exception e) {}
				String value = null;
				
				try {
					value = getStringCellCalue(sheet.getRow(i).getCell(j));
				} catch (Exception e) {}
				
				excelData.put(key, value);
			}
			testDetails.add(excelData);
		}
		wb.close();
		System.out.println(testDetails);
		//return testDetails;
	}

	private static String getStringCellCalue(XSSFCell cell) throws Exception {
		String cellValue = null;
		if(cell.getCellType().name().equals(CellType.BLANK.name())) {
			cellValue = "";
		}
		else if(cell.getCellType().name().equals(CellType.NUMERIC.name())) {
			cellValue = String.valueOf(cell.getNumericCellValue());
			if(cellValue.contains(".0")) {
				cellValue = cellValue.split("\\.")[0];
			}
		}
		else if(cell.getCellType().name().equals(CellType.FORMULA.name())) {
			throw new Exception("Pls remove formula from cell.");
		}
		else {
			cellValue = cell.getStringCellValue();
		}
		return cellValue;
	}
}