package com.mine.spring.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Job {
	private String jobName;
	private List<String> list;
	private Set<User> jobSet;
	private Map<String, String> jobMap;
	private Properties properties;
	private String[] arry;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String[] getArry() {
		return arry;
	}

	public void setArry(String[] arry) {
		this.arry = arry;
	}

	public Map<String, String> getJobMap() {
		return jobMap;
	}

	public void setJobMap(Map<String, String> jobMap) {
		this.jobMap = jobMap;
	}

	public Set<User> getJobSet() {
		return jobSet;
	}

	public void setJobSet(Set<User> jobSet) {
		this.jobSet = jobSet;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "Job [jobName=" + jobName + ", list=" + list + ", jobSet=" + jobSet + ", jobMap=" + jobMap
				+ ", properties=" + properties + ", arry=" + Arrays.toString(arry) + "]";
	}
}
