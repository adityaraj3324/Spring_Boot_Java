package com.app;

public class Repository {
	private int path;
	private String repoName;
	
	
	public Repository() {
		super();
	}
	
	
	public int getPath() {
		return path;
	}
	public void setPath(int path) {
		this.path = path;
	}
	public String getRepoName() {
		return repoName;
	}
	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}
	
	
	@Override
	public String toString() {
		return "Repository [path=" + path + ", repoName=" + repoName + "]";
	}
}
