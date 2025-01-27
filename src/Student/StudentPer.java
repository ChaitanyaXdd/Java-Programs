package Student;

class StudentInfo
{
    int r;
    String nm;
    int s1,s2,s3,s4,s5,s6;
    int sum = 0;
    double per;

    public void display()
    {
        System.out.println("Roll Number: " + r);
        System.out.println("Class: " + nm);
        System.out.println("Percentage: " + per);
    }

}
public class StudentPer extends StudentInfo {
    public StudentPer(int r,String nm,int s1,int s2,int s3,int s4,int s5,int s6)
    {
        this.r = r;
        this.nm = nm;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
    }
    public void percentage1()
    {
        sum = this.s1 + this.s2 + this.s3 + this.s4 + this.s5 + this.s6;
        per = sum /6;
    }
}
