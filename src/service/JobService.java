package service;

import model.Job;
import java.util.ArrayList;
import java.util.Iterator;

public class JobService {

    private ArrayList<Job> jobs = new ArrayList<>();

    // Add a new job application
    public void addJob(Job job) {
        jobs.add(job);
        System.out.println("Job added successfully!");
    }

    // View all job applications
    public void viewJobs() {
        if (jobs.isEmpty()) {
            System.out.println("No job applications found.");
            return;
        }

        for (Job job : jobs) {
            System.out.println(job);
        }
    }

    // Update job status by company name
    public void updateJobStatus(String companyName, String newStatus) {
        boolean found = false;

        for (Job job : jobs) {
            if (job.getCompanyName().equalsIgnoreCase(companyName)) {
                job.setStatus(newStatus);
                System.out.println("Job status updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Company not found.");
        }
    }

    // Search job by company name
    public void searchByCompany(String companyName) {
        boolean found = false;

        for (Job job : jobs) {
            if (job.getCompanyName().equalsIgnoreCase(companyName)) {
                System.out.println(job);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Company not found.");
        }
    }

    // Delete job by company name (optional but professional)
    public void deleteJob(String companyName) {
        Iterator<Job> iterator = jobs.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Job job = iterator.next();
            if (job.getCompanyName().equalsIgnoreCase(companyName)) {
                iterator.remove();
                System.out.println("Job deleted successfully!");
                found = true;
                break;
            }
        }


        if (!found) {
            System.out.println("Company not found.");
        }


    }
    public void totalJobs() {
        System.out.println("Total job applications: " + jobs.size());
    }

}
