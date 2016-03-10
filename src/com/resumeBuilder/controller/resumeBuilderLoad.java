package com.resumeBuilder.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class resumeBuilderLoad {

	@RequestMapping("/viewSummary")
	public ModelAndView loadResume(){
		
		Map<String,String> resumeData = new HashMap<String,String>();
		
		resumeData.put("summary","I am a passionate web developer with total IT experience of more than 8 years, primarily worked on ColdFusion, Java/J2EE and .NET framework. Very quick to adapt to challenging environments, avid learner, eager to learn new things and work on any platform and deliver perfectly. I am able to quickly comprehend and understand the complex systems and work on them.<br> I am a certified Sun Java Web Component Developer.");
        
		return new ModelAndView("viewSummary","resumeData",resumeData);
		
	}
}
