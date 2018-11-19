package com.util;


import java.io.FileOutputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfReportGenerator {

	private static ArrayList<HashMap<String, String>> reports = new ArrayList<HashMap<String,String>>();
	private static String FILE = "target/Report Summary.pdf";
	private static Font catFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
	private static Font redFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.RED);
	private static Font blueFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.BLUE);
	private static Font smallBold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
	private static Font small = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
	
	public static void addResultRecord(String id, String desc, String status, String time, String comment){
		HashMap<String, String> record = new HashMap<String, String>();
		record.put("#",id);
		record.put("description", desc);
		record.put("status", status);
		record.put("time", time);
		record.put("comment",comment );
		reports.add(record);
	}
	
	public static void generateReport(String environment, ArrayList<HashMap<String, String>> results){
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();
			addTitlePage(document);
			addTable(document, environment, results);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void generateReport(String environment){
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();
			addTitlePage(document);
			addTable(document, environment, reports);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void addTable(Document document, String environment, ArrayList<HashMap<String, String>> results) throws DocumentException{
		boolean overallStatus = true;
		
		PdfPTable table = new PdfPTable(new float[] { 2, 5, 2, 2, 4 });
		table.setWidthPercentage(100);
        table.setSpacingBefore(0f);
        table.setSpacingAfter(0f);

		PdfPCell c1 = new PdfPCell(new Phrase("Test Case #"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Description"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Status"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("Elapsed Time"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Notes"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.addCell(c1);
				
		table.setHeaderRows(1);
		
		Integer passed = 0;
		Integer failed = 0;
		Integer testcases = 0;
		
		for(HashMap<String, String> k : results){
			addIdValue(table, k.get("#"));
			addLeftValue(table, k.get("description"));
			addStatusValue(table, k.get("status"));
			addLeftValue(table, k.get("time"));
			addLeftValue(table, k.get("comment"));
			if(k.get("status").toLowerCase().contains("fail")){
				overallStatus = false;
				failed++;
			}else{
				passed++;
			}testcases++;
		}
		
		Paragraph preface = new Paragraph();
		if(overallStatus){
			preface.add(new Phrase("PASSED", blueFont));
		}else{
			preface.add(new Phrase("FAILED", redFont));
		}
		preface.add(new Phrase(" : "+environment +" Environment", smallBold));
		addEmptyLine(preface, 1);
		
		// Summary 
		
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		PdfPTable summaryTable = new PdfPTable(new float[] { 2, 1, 1, 6 });
		summaryTable.setWidthPercentage(100);
		summaryTable.setHorizontalAlignment(Element.ALIGN_LEFT);
		
		PdfPCell s1 = new PdfPCell(new Phrase("Total Passed: "));
		s1.setHorizontalAlignment(Element.ALIGN_LEFT);
		s1.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s1);
		
		PdfPCell s1c = new PdfPCell(new Phrase(passed.toString()));
		s1c.setHorizontalAlignment(Element.ALIGN_LEFT);
		s1c.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s1c);

		PdfPCell s1p = new PdfPCell(new Phrase(String.valueOf(df.format((Double.valueOf(passed)/(testcases))*100)+"%")));
		s1p.setHorizontalAlignment(Element.ALIGN_RIGHT);
		s1p.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s1p);
		
		Image green = Image.getInstance(1, 1, 3, 8, new byte[] { (byte)0, (byte)255, (byte)0 });
        green.scaleAbsolute(((Float.valueOf(passed)/(testcases))*100)*3, 10);
		
		PdfPCell s1m = new PdfPCell(green);
		s1m.setHorizontalAlignment(Element.ALIGN_LEFT);
		s1m.setVerticalAlignment(Element.ALIGN_MIDDLE);
		s1m.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s1m);
		
		PdfPCell s2 = new PdfPCell(new Phrase("Total Failed: "));
		s2.setHorizontalAlignment(Element.ALIGN_LEFT);
		s2.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s2);
		
		PdfPCell s2c = new PdfPCell(new Phrase(failed.toString()));
		s2c.setHorizontalAlignment(Element.ALIGN_LEFT);
		s2c.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s2c);
		
		PdfPCell s2p = new PdfPCell(new Phrase(String.valueOf(df.format((Double.valueOf(failed)/(testcases))*100)+"%")));
		s2p.setHorizontalAlignment(Element.ALIGN_RIGHT);
		s2p.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s2p);
		
		Image red = Image.getInstance(1, 1, 3, 8, new byte[] { (byte)255, (byte)0, (byte)0 });
        red.scaleAbsolute(((Float.valueOf(failed)/(testcases))*100)*3, 10);
		
		PdfPCell s2m = new PdfPCell(red);
		s2m.setHorizontalAlignment(Element.ALIGN_LEFT);
		s2m.setVerticalAlignment(Element.ALIGN_MIDDLE);
		s2m.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s2m);
		
		PdfPCell s3 = new PdfPCell(new Phrase("Total Tests: "));
		s3.setHorizontalAlignment(Element.ALIGN_LEFT);
		s3.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s3);
		
		PdfPCell s3c = new PdfPCell(new Phrase(testcases.toString()));
		s3c.setHorizontalAlignment(Element.ALIGN_LEFT);
		s3c.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s3c);
		
		PdfPCell s3p = new PdfPCell(new Phrase(String.valueOf(100+"%")));
		s3p.setHorizontalAlignment(Element.ALIGN_RIGHT);
		s3p.setBorder(Rectangle.NO_BORDER);
		summaryTable.addCell(s3p);
		
		Image blue = Image.getInstance(1, 1, 3, 8, new byte[] { (byte)0, (byte)0, (byte)255, });
        blue.scaleAbsolute(100*3, 10);
		
		PdfPCell s3m = new PdfPCell(blue);
		s3m.setHorizontalAlignment(Element.ALIGN_LEFT);
		s3m.setBorder(Rectangle.NO_BORDER);
		s3m.setVerticalAlignment(Element.ALIGN_MIDDLE);
		summaryTable.addCell(s3m);

		document.add(preface);
		document.add(new Paragraph(" "));
		document.add(summaryTable);
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(table);
	}
	
	public static void addIdValue(PdfPTable table, String value){
		PdfPCell cell = new PdfPCell(new Phrase(value, small));
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
	}
	
	public static void addStatusValue(PdfPTable table, String value){
		PdfPCell cell;
		if(value.toLowerCase().contains("pass")){
			cell = new PdfPCell(new Phrase(value.toUpperCase(), blueFont));
		} else {
			cell = new PdfPCell(new Phrase(value.toUpperCase(), redFont));
		}
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
	}
	
	public static void addCenterValue(PdfPTable table, String value){
		PdfPCell cell = new PdfPCell(new Phrase(value, small));
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
	}
	
	public static void addLeftValue(PdfPTable table, String value){
		PdfPCell cell = new PdfPCell(new Phrase(value, small));
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
	}

	public static void main(String[] args) {
		// --- Sample Data
				HashMap<String, String> h = new HashMap<String, String>();
				ArrayList<HashMap<String, String>> r = new ArrayList<HashMap<String, String>>();
				h.put("#", "@10001");
				h.put("description", "This is the Desc");
				h.put("status", "Failed");
				h.put("time", "1 minute 32 seconds");
				h.put("comment", "this passed");
				
				
				
				
				h = new HashMap<String, String>();
				r.add(h);
				h.put("#", "@10002");
				h.put("description", "This is the Desc");
				h.put("status", "Failed");
				h.put("time", "1 minute 32 seconds");
				h.put("comment", "this fail");
				r.add(h);
				
				h = new HashMap<String, String>();
				h.put("#", "@10003");
				h.put("description", "This is the Desc");
				h.put("status", "Failed");
				h.put("time", "1 minute 32 seconds");
				h.put("comment", "this passed");
				r.add(h);
				h = new HashMap<String, String>();
				h.put("#", "@10004");
				h.put("description", "This is the Desc");
				h.put("status", "Failed");
				h.put("time", "1 minute 32 seconds");
				h.put("comment", "this passed");
				r.add(h);
				h = new HashMap<String, String>();
				h.put("#", "@10005");
				h.put("description", "This is the Desc");
				h.put("status", "Failed");
				h.put("time", "1 minute 32 seconds");
				h.put("comment", "this passed");
				r.add(h);
				h = new HashMap<String, String>();
				h.put("#", "@10006");
				h.put("description", "This is the Desc");
				h.put("status", "Passed");
				h.put("time", "1 minute 32 seconds");
				h.put("comment", "this passed");
				r.add(h);
		generateReport("51", r);
	}

	private static void addTitlePage(Document document) throws DocumentException {
		Paragraph preface = new Paragraph();
		addEmptyLine(preface, 1);
		preface.add(new Paragraph("DELTA-SNAPP", catFont));
		preface.add(new Paragraph(new Date().toString(), smallBold));
		addEmptyLine(preface, 1);

		document.add(preface);
		
		// Start a new page
		//document.newPage();
	}

	private static void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}
	
}
