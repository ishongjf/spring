package org.shadow.dao;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "e")
public class MemberDao implements MDao {

	public String query(int id,String name){

		log.debug("---------------query--------logic");
		return name+"-return";
	}

	@Override
	public void del() {

	}
}

