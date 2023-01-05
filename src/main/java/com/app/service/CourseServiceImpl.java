package com.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Override
	public List<String> getCourses() {
		// TODO Auto-generated method stub
		return Arrays.asList("Java","Python");
	}

}
