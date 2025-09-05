package com.app.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ace")
public class HandlerComponent {
	
	@Value("data")
	private String hb;
	
	@Value("meta")
	String hh;
	
	public HandlerComponent() {
		super();
	}
	
	public String toString() {
		return "HandlerComponent [hb = "+hb+", hh = "+hh+"]";
	}
}
