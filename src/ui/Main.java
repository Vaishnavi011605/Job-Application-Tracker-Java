package ui;

import model.Job;
import service.JobService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JobService service = new JobService();

        while (true) {
            System.out.println("\n*** Job Application Tracker ***");
            System.out.println("1. Add Job");
            System.out.println("2. View Jobs");
            System.out.println("3. Update Job Status");
            System.out.println("4. Search Job by Company");
            System.out.println("5. Delete Job");
            System.out.println("6. Total Job Count");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Company Name: ");
                    String company = sc.nextLine();

                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Applied Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    System.out.print("Enter Status (Applied/Interview/Rejected/Selected): ");
                    String status = sc.nextLine();

                    Job job = new Job(company, role, location, date, status);
                    service.addJob(job);
                    break;

                case 2:
                    service.viewJobs();
                    break;

                case 3:
                    System.out.print("Enter Company Name to Update Status: ");
                    String updateCompany = sc.nextLine();

                    System.out.print("Enter New Status: ");
                    String newStatus = sc.nextLine();

                    service.updateJobStatus(updateCompany, newStatus);
                    break;

                case 4:
                    System.out.print("Enter Company Name to Search: ");
                    String searchCompany = sc.nextLine();
                    service.searchByCompany(searchCompany);
                    break;

                case 5:
                    System.out.print("Enter Company Name to Delete: ");
                    String deleteCompany = sc.nextLine();
                    service.deleteJob(deleteCompany);
                    break;

                case 6:
                    service.totalJobs();
                    break;

                case 7:
                    System.out.println("Good luck with your applications!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
