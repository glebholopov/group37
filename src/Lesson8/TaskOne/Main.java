package Lesson8.TaskOne;

public class Main {
    public static void main(String[] args) {

        // 1 способ
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();

        director.jobTitle();
        accountant.jobTitle();
        worker.jobTitle();

        System.out.println("--------------------");

        // 2 способ
        JobTitleable[] titles = new JobTitleable[3];
        titles[0] = new Director();
        titles[1] = new Accountant();
        titles[2] = new Worker();

        for (JobTitleable title : titles) {
            title.jobTitle();
        }
    }
}