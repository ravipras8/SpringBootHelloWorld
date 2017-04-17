package com.sam.ravi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.ravi.dto.JsonFields;
import com.sam.ravi.service.AppService;

@RestController
@RequestMapping("/ravi")
public class AppResource {
	
	@Autowired
	private AppService appService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.GET, value = "/dynamic", produces = "application/json")
	public @ResponseBody JsonFields dynamicUi() {
		return appService.getFromjsonFile();
	}
}
