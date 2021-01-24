package org.voicemailtel.meet.framework.data;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.voicemailtel.meet.framework.config.AppConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    private static Workbook workbook;

    private ExcelReader() {
        try {
            Path path = Paths.get(AppConfig.getProperties("datafile.path"), AppConfig.getProperties("datafile.name"));
            InputStream inputStream = new FileInputStream(path.toFile());
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException ex) {

        }
    }

    public static List<Object[]> getDataFromSheet(String sheetName, boolean skipHeader) {
        if (null == workbook) {
            new ExcelReader();

        }
        Sheet sheet = workbook.getSheet(sheetName);
        List<Object[]> data = new ArrayList<>();

        Iterator<Row> rowIterator = sheet.rowIterator();
        if (skipHeader && rowIterator.hasNext()) {
            rowIterator.next();
        }

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator();

            List<Object> cellData = new ArrayList<>();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                if (cell.getCellType() == CellType.STRING) {
                    cellData.add(cell.getStringCellValue());
                }

                if (cell.getCellType() == CellType.NUMERIC) {
                    cellData.add(cell.getNumericCellValue());

                }
                if (cell.getCellType() == CellType.BOOLEAN) {
                    cellData.add(cell.getBooleanCellValue());

                }
                data.add(cellData.toArray());

            }
        }
        return data;
    }
}











