package com.resumeBuilder.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class resumeBuilderLoad {

	@RequestMapping(value="/viewSummary",method = RequestMethod.POST)
	public ModelAndView loadResume(@RequestParam String page,HttpServletRequest request,HttpServletResponse response){
		
		Map<String,String> resumeData = new HashMap<String,String>();
		
		if(page.equals("summary")){
			
			resumeData.put("summary","I am a passionate web developer with total IT experience of more than 8 years, primarily worked on ColdFusion, Java/J2EE and .NET framework. Very quick to adapt to challenging environments, avid learner, eager to learn new things and work on any platform and deliver perfectly. I am able to quickly comprehend and understand the complex systems and work on them.<br> I am a certified Sun Java Web Component Developer.");
			
		}else if(page.equals("career")){
			resumeData.put("summary","<li>Around 5 Years of IT experience as a developer of a web application in Java/J2EE (ATG) and support and enhancement of Java/J2EE applications.<br>"+
					"<li>Around 6 years of IT experience as a developer for ColdFusion using FW/1, Cold spring and legacy systems.<br>"+
					"<li>Around 2 years of working experience in using mxunit for test driven development.<br>"+
					"<li>Sun certified java programmer 1.5 with 88%. <br>"+
					"<li>Sun certified web component Developer with 95%. <br>"+
					"<li>Basic knowledge and work experience in Java Swings.<br>"+
					"<li>Good Understanding of Core Java, J2EE, Java script, Ajax, JQuery, html5, css and JSP.<br>"+
					"<li>Supported various ColdFusion sites, Java/J2EE and solved the critical production issues on time.<br>"+
					"<li>Knowledge and work experience in C#.Net and ASP.NET.<br>"+
					"<li>Around 5 years of working experience as a ColdFusion developer for development of end-to-end websites and web applications.<br>"+
					"<li>Experience in developing ColdFusion Webservice, which interacts with third party system using xml requests.<br>"+
					"<li>Good understanding of design patterns like singleton, factory, MVC, dependency Injection.<br>"+
					"<li>Able to understand complex code base quickly with no guidance.<br>"+
					"<li>Having work experience in Oracle 10(g), PL/SQL, and MySQL.<br>"+
					"<li>Good Understanding of Object Oriented Concepts and experience in formulating solutions in Object Oriented Programming way.<br>"+
					"<li>Having work experience with MVC frameworks such as FW/1, Cold Spring, Mura, ATG, JSF 2.0.<br>"+
					"<li>Having work experience in the enhancements of MS Access, VBA.<br>"+
					"<li>Familiar with RESTful APIs, couch base database.<br>"+
					"<li>Familiar with Software Life Cycle Model, Agile Methodology (Scrum)<br>"+
					"<li>Worked on tools like ARS Remedy, Microsoft VSS, Mercury Quality Center, Cornerstone, Subclipse, spotfire.<br>"+
					"<li>Experience in Unix Platform and implemented a cluster to simulate a distributed computing environment.<br>"+
					"<li>Experience in interacting with clients for requirements gathering and worked with them on Oracle Migration, J2EE server migration and setting up Virtual server.<br>"+
					"<li>Excellent communication skills. Experience in interacting with American and European clients and gained their trust. Appreciated by customers often.<Br>");
		}
		
        
		return new ModelAndView("viewSummary","resumeData",resumeData);
		
	}
}
