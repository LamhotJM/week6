/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lamhot
 */
public class DosenEngine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Dosen> Lecturers = new ArrayList();
        Dosen Lecturer1 = new Dosen();

        Lecturer1.setLectureId("D0234");
        Lecturer1.setLectureName("Dono");
        Lecturer1.setEmail("dono@binus.ac.id");
        Lecturer1.setKPI(3);

        Lecturers.add(Lecturer1);

        Dosen lecturer2 = new Dosen();

        lecturer2.setLectureId("D4536");
        lecturer2.setLectureName("Merry");
        lecturer2.setEmail("merry@gmail.com");
        lecturer2.setKPI(4);

        Lecturers.add(lecturer2);

        Dosen lecturer3 = new Dosen();

        lecturer3.setLectureId("D7890");
        lecturer3.setLectureName("Derwin");
        lecturer3.setEmail("derder@hotmail.com");
        lecturer3.setKPI(4);

        Lecturers.add(lecturer3);

        Dosen lecturer4 = new Dosen();

        lecturer4.setLectureId("D1932");
        lecturer4.setLectureName("Joko Saja");
        lecturer4.setEmail("jokoSaja@binus.ac.id");
        lecturer4.setKPI(5);

        Lecturers.add(lecturer4);

        System.out.println("1.Insert new lecturer's data: ");
        System.out.println("2.Edit lecturer's data: ");
        System.out.println("3.Exit program ");
        System.out.println("Insert your option [1..3]: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:

                do {
                    Dosen newStudents = new Dosen();

                    System.out.println("Insert lecture's code [DXXXX]: ");
                    newStudents.setLectureId(input.next());

                    System.out.println("Insert lecture's name: ");
                    newStudents.setLectureName(input.next());

                    System.out.println("Insert lecture's email [contains ''@'']: ");
                    newStudents.setEmail(input.next());

                    System.out.println("Insert lecture's KPI [1..6]: ");
                    newStudents.setKPI(input.nextInt());
                    Lecturers.add(newStudents);
                    System.out.println(DosenEngine.printResult(Lecturers));

                } while (Lecturers.size() < 7);
                System.out.println("Lecturer’s data has reached the maximum capacity");
                break;
            case 2:
                System.out.println("Edit lecture's data");
                System.out.println("-------------------");
                System.out.println("Insert lecture's code [DXXXX]: ");
                String idDosen = input.nextLine();
                for (Dosen dosenData : Lecturers) {
                    if (dosenData.getLectureId().equals(idDosen)) {
                        System.out.println("Insert lecture's name: ");
                        dosenData.setLectureName(input.next());

                        System.out.println("Insert lecture's email [contains ''@'']: ");
                        dosenData.setEmail(input.next());

                        System.out.println("Insert lecture's KPI [1..6]: ");
                        dosenData.setKPI(input.nextInt());
                    }
                }
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please choose option");
                break;
        }
    }

    public static String printResult(List Lecturers) {
        StringBuilder builder = new StringBuilder();
        Lecturers.stream().forEach((value) -> {
            builder.append(value);
        });
        String text = builder.toString();
        System.out.println("           Current Lecturer's Data           ");
        System.out.println("           -----------------------           ");
        System.out.println("Code  Name            Email               KPI");
        System.out.println("=============================================");  
        return text;
    }

}
