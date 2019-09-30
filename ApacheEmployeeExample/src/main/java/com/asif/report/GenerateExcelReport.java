package com.asif.report;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.asif.model.Employee;
import com.asif.service.EmployeeService;

public class GenerateExcelReport {

	  public static void main(String[] args) throws Exception {
		
		   EmployeeService service = new EmployeeService();
		 List<Employee> employeeList=  service.getEmployeeDetail();
		     
		 GenerateExcelReport report= new GenerateExcelReport();
		 report.generateReport(employeeList);
	}
	  
	  
	  public void generateReport(List<Employee> list)throws Exception
	  {
		  
		     // creating workbook
		  
		   Workbook book = new HSSFWorkbook();
		//creating the sheet    
		Sheet sheet=   book.createSheet("Employee Data");
		
		
		//creating the head row 
		    Row headRow=   sheet.createRow(0);
	   
		    //setting the value in the cell of the row 
		    
		     headRow.createCell(0).setCellValue("EmployeeName");
		     headRow.createCell(1).setCellValue("EmployeeEmail");
		     headRow.createCell(2).setCellValue("EmployeeAddress");
		     headRow.createCell(3).setCellValue("Salary");
		     
		    
		    int indexRow = 1;
		    
		    
		    for(Employee emp: list )
		    {
		    	//creating the row 
		    	
		    	Row row = sheet.createRow(indexRow);
		    	
		    	row.createCell(0).setCellValue(emp.getName());
		    	row.createCell(1).setCellValue(emp.getEmail());
		    	row.createCell(2).setCellValue(emp.getAddress());
		    	row.createCell(3).setCellValue(emp.getSalary());
		    	indexRow++;
		    }
		    
		    
		    //writing workbook data in the file using  fileoutputStream
		    
		    
		    FileOutputStream fos= new FileOutputStream("Employee-Data.xls");
		    book.write(fos);
		    book.close();
		    fos.close();
		    
		    System.out.println("Report Has been generated Successfully");
		    
	  }
}
