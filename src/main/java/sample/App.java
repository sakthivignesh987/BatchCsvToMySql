package sample;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("studentJob");
		JobExecution execution = (JobExecution) jobLauncher.run(job, new JobParameters());
		System.out.println(execution.toString());
		System.out.println("Exit Status:" + execution.getExitStatus());
	
	}

}
