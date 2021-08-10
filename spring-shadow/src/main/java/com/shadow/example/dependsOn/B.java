package com.shadow.example.dependsOn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class B {
	public void tb(){
		log.debug("tb");
	}
}
