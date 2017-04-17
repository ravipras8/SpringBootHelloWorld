package com.sam.ravi.service;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sam.ravi.dto.JsonFields;

@Component("AppService")
public class AppServiceImpl implements AppService {

	@Override
	public JsonFields getFromjsonFile() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			JsonFields jsonFields = mapper
					.readValue(new File("D:\\fields.json"),
					JsonFields.class);
			return jsonFields;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
