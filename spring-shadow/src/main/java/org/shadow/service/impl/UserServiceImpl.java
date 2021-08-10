package org.shadow.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.shadow.service.UserService;

@Slf4j(topic = "e")
public class UserServiceImpl implements UserService {
	@Override
	public String query(int id, String name) {
		log.debug("id:{}",id);
		log.debug("query database-----------logic");
		return name;
	}

	@Override
	public void del() {
		log.debug("del mysql----logic");
	}
}
