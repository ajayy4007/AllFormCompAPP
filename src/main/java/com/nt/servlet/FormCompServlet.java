package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formurl")
public class FormCompServlet extends HttpServlet {
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//getPrintWriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read from data
		String name=req.getParameter("pname");
		String addrs=req.getParameter("paddrs");
		int age=Integer.parseInt(req.getParameter("page"));
		String gender=req.getParameter("gender");
		String ms=req.getParameter("ms");
		String qlfy=req.getParameter("qlfy");
		String languages[]=req.getParameterValues("languages");
		String hobies[]=req.getParameterValues("hobies");
		String dob=req.getParameter("dob");
		String tob=req.getParameter("tob");
		String month=req.getParameter("mob");
		String wbd=req.getParameter("wdb");
		int favNumber=Integer.parseInt(req.getParameter("favNumber"));
		long mobileNo=Long.parseLong(req.getParameter("mobileNo"));
		String mail=req.getParameter("mail");
		String favColor=req.getParameter("favColor");
		int income=Integer.parseInt(req.getParameter("income"));
		String url=req.getParameter("fburl");
		String favSS=req.getParameter("favSearch");
		//write bussines logic
		if(gender.equalsIgnoreCase("M")) {
			if(age<5) 
				pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"you are baby boy</h1>");
			else if(age<13)
				pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"you are a small boy</h1>");
			else if(age<19)
				if(ms.equalsIgnoreCase("married"))
				{
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are married teenager boy</h1>");
				}
				else
				{
					pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are  teenager boy</h1>");	
				}
			else if(age<35)
				if(ms.equalsIgnoreCase("married"))
				{
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are  married young age man</h1>");
				}
				else
				{
					pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are  young age man</h1>");
				}
			else if(age<50)
				if(ms.equalsIgnoreCase("married"))
				{
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are married young age man</h1>");
				}
				else
				{
					pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are married young age man</h1>");
				}
			else 
				if(ms.equalsIgnoreCase("married")) {
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are old man</h1>");
			}else
			{
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are old man</h1>");
			}
		}
	else {
		if(age<5) {
		pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"you are baby girl</h1>");
		}
		else if(age<13) {
			pw.println("<h1 style='color:blue;text-align:center'>Master::"+name+"you are a small girl</h1>");
		}else if(age<19) {
			if(ms.equalsIgnoreCase("married")) 
			pw.println("<h1 style='color:blue;text-align:center'>Miss::"+name+"you are teenager married  girl</h1>");
			else
				pw.println("<h1 style='color:blue;text-align:center'>Miss::"+name+"you are teenage girl</h1>");
	}
		else if(age<35) {
			if(ms.equalsIgnoreCase("married"))
			pw.println("<h1 style='color:blue;text-align:center'>Mrs::"+name+"you are young aged married Woman</h1>");
			else
				pw.println("<h1 style='color:blue;text:align:center'>Mrs::"+name+"You are young aged Women</h1>");
		}else if(age<50) 
			if(ms.equalsIgnoreCase("married")) { 
			pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are middle age married woman</h1>");
			}
			else {
				pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are middle age woman</h1>");
			}else 
				if(ms.equalsIgnoreCase("married")) {
			pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are married old age man</h1>");
				}else {
					pw.println("<h1 style='color:blue;text-align:center'>Mr::"+name+"you are married old age man</h1>");
	}
	}
		//display the form data
		pw.println("<br><br><b>Form Data::</b><br>");
		pw.println("<br><b>name::</b>"+name);
		pw.println("<br><b>age::</b>"+age);
		pw.println("<br><b>Address::</b>"+addrs);
		pw.println("<br><b>Gender::</b>"+gender);
		pw.println("<br><b>Marital Status::</b>"+ms);
		ms=(ms==null)?"single":ms;
		pw.println("<br><b>Qualification::</b>"+qlfy);
		pw.println("<br><b>know langauge::</b>"+Arrays.toString(languages));
		if (languages==null)
			languages=new String[] {
					"no language are salected"
			};
		pw.println("<br><b>hobies::</b>"+Arrays.toString(hobies));
		if(hobies==null)
			hobies=new String[] {
					"no hobies are salected"
			};
		pw.println("<br><b>DOB::</b>"+dob);
		pw.println("<br><b>TOD::</b>"+tob);
		pw.println("<br><b>Month of Birth::</b>"+month);
		pw.println("<br><b>Week of Birth::</b>"+wbd);
		pw.println("<br><b>favColor::</b>"+favColor);
		pw.println("<br><b>SearchString::</b>"+favSS);
		pw.println("<br><b>income::</b>"+income);
		pw.println("<br><b>mobileNo::</b>"+mobileNo);
		pw.println("<br><b>Email::</b>"+mail);
		pw.println("<br><b>fav Number::</b>"+favNumber);
		pw.println("<br><b>FB URL::</b>"+url);
		pw.println("<a href='all_comp_form.html'>Home</a>");
		pw.close();
	}
		

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
