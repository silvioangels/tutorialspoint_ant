package com.tutorialspoint._10_Extending_Ant;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;

public class MyTask extends Task {
	String message;

	public void execute() throws BuildException {
		log("Message: " + message, Project.MSG_INFO);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}