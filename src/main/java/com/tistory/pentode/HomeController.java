package com.tistory.pentode;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tistory.pentode.service.BoardService;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@Resource(name = "boardService")
	private BoardService boardService;

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "")
	public String welcome(Model model) throws Exception {
		log.debug("{}", "index");
	    return "index";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/jsp", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "jsp/home";
	}
	
	
}
