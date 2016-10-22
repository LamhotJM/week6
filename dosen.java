/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

public class Dosen {

    private String kodeDosen;
    private String namaDosen;
    private String email;
    private int kpi;

    public Dosen() {
        this.kodeDosen = null;
        this.namaDosen = null;
        this.email = null;
        this.kpi = -1;
    }

    public Dosen(String lectureId, String lectureName, String lectureEmail, int lectureKPI) {
        this.kodeDosen = lectureId;
        this.namaDosen = lectureName;
        this.email = lectureEmail;
        this.kpi = lectureKPI;
    }

    public void setLectureId(String newLectureId) {
        this.kodeDosen = newLectureId;
    }

    public void setLectureName(String newLectureName) {
        this.namaDosen = newLectureName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setKPI(int newKPI) {
        this.kpi = newKPI;
    }

    public String getLectureId() {
        return kodeDosen;
    }

    public String getLectureName() {
        return namaDosen;
    }

    public String getEmail() {
        return email;
    }

    public int getKPI() {
        return kpi;
    }

    @Override
    public String toString() {

        return String.format("%5s %-15s %-20s %-15s ", this.getLectureId(), this.getLectureName(), this.getEmail(),this.getKPI())+"\n";
    }

}
