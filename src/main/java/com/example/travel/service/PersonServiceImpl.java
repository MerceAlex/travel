package com.example.travel.service;

import java.util.List;

import com.example.travel.mapper.PersonMapper;
import com.example.travel.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonMapper personMapper;
	@Override
	public List<User> select() {
		
		return personMapper.select();
	}

}
