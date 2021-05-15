package hw5;

public abstract class CollegeApplicant {
    private String name;
    private String college;

    public CollegeApplicant() {}

    public CollegeApplicant(String name, String college) {
        this.name = name;
        this.college = college;
    }

    public String getCollege() {
        return this.college;
    }

    public String getName() {
        return this.name;
    }
}

class Undergrad extends CollegeApplicant {
    private int sat;
    private double gpa;

    public Undergrad(String name, String college, int sat, double gpa) {
        super(name, college);
        this.sat = sat;
        this.gpa = gpa;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

class Graduate extends CollegeApplicant{
    private String collegeOfOrigin;

    public Graduate(String name, String college, String collegeOfOrigin) {
        super(name, college);
        this.collegeOfOrigin = collegeOfOrigin;
    }

    public String checkOrigin() {
        if (collegeOfOrigin.equals(this.getCollege())) return "from inside";
        return "from outside";
    }

    public String getCollegeOfOrigin() {
        return collegeOfOrigin;
    }

    public void setCollegeOfOrigin(String collegeOfOrigin) {
        this.collegeOfOrigin = collegeOfOrigin;
    }
}




