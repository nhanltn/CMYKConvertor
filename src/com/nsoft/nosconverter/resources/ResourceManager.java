package com.nsoft.nosconverter.resources;


import java.io.InputStream;

public class ResourceManager {
	public static InputStream getResource(String name){
		return ResourceManager.class.getResourceAsStream(name);
	}
}
