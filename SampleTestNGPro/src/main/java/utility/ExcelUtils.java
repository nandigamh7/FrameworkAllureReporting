package main.java.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	public static String LoginPage = ("\\testdata\\LoginTestData.xlsx");

	
	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

		String[][] tabArray = null;

		try {
			if (SheetName.equals("SheetNameOne")) {
				String ChromeDriverPath = System.getProperty("user.dir") + LoginPage;
				FileInputStream ExcelFile = new FileInputStream(ChromeDriverPath);
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				// Access the required test data sheet
				ExcelWSheet = ExcelWBook.getSheet(SheetName);

				int startRow = 1;

				int startCol = 0;

				int ci, cj;

				int totalRows = ExcelWSheet.getLastRowNum();

				// you can write a function as well to get Column count

				int totalCols = ExcelWSheet.getRow(0).getLastCellNum();

				tabArray = new String[totalRows][totalCols];

				ci = 0;

				for (int i = startRow; i <= totalRows; i++, ci++) {
					cj = 0;
					for (int j = startCol; j < totalCols; j++, cj++) {
						tabArray[ci][cj] = getCellData(i, j);
						System.out.println(tabArray[ci][cj]);
					}
				}
			}
			if (SheetName.equals("SheetNameTwo")) {
				String ChromeDriverPath = System.getProperty("user.dir") + LoginPage;
				FileInputStream ExcelFile = new FileInputStream(ChromeDriverPath);

				// Access the required test data sheet
				ExcelWBook = new XSSFWorkbook(ExcelFile);

				ExcelWSheet = ExcelWBook.getSheet(SheetName);

				int startRow = 1;

				int startCol = 0;

				int ci, cj;

				int totalRows = ExcelWSheet.getLastRowNum();

				// you can write a function as well to get Column count

				int totalCols = ExcelWSheet.getRow(0).getLastCellNum();

				tabArray = new String[totalRows][totalCols];

				ci = 0;

				for (int i = startRow; i <= totalRows; i++, ci++) {
					cj = 0;
					for (int j = startCol; j < totalCols; j++, cj++) {
						tabArray[ci][cj] = getCellData(i, j);
						System.out.println(tabArray[ci][cj]);
					}
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return (tabArray);
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			int dataType = Cell.getCellType();
			if (dataType == 3) {
				return "";

			} else {
				String CellData = Cell.getStringCellValue();
				return CellData;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw (e);
		}
	}

	public static void setCellData(String Result, int RowNum, int ColNum, String filepath, String sheetname)
			throws Exception {

		try {

			Row = ExcelWSheet.createRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}

// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(filepath);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

	public static void setCellDataInLastRow(String Result, int ColNum, String filepath, String sheetname)
			throws Exception {

		int lastRowNum = ExcelWSheet.getLastRowNum();
		setCellData(Result, lastRowNum + 2, ColNum, filepath, sheetname);
	}

}
