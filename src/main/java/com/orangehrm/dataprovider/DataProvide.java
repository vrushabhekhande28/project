package com.orangehrm.dataprovider;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orabgehrm.baseclass.Baseclass;
import com.orabgehrm.utility.NewExcelLibrary;

public class DataProvide  extends Baseclass 
{
	NewExcelLibrary excel=new  NewExcelLibrary("C:\\Users\\Asus\\eclipse-workspace\\Orage_HRM2\\src\\test\\resources\\TestData\\up.xlsx");
	
    @DataProvider(name="data")
 	public Object[][] getdatafromexcel() throws Throwable
 	{
 		int row=excel.getRowCount("vr");
 		System.out.println(row);
 		int col=excel.getColumnCount("vr");
 		System.out.println(col);
 		
 		Object[][] a=new Object[row][col];
 		
 		for(int i=0 ; i<row; i++)
 		{
 			for(int j=0 ; j<col ; j++)
 			{
 			  a[i][j]=excel.getCellData("vr", j, i+1) ;
 			}
 		}
 		System.out.println(Arrays.deepToString(a));
 		return a;
 	}

}
