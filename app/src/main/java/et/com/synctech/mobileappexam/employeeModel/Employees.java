package et.com.synctech.mobileappexam.employeeModel;

import com.orm.SugarRecord;
import com.orm.dsl.Column;
import com.orm.dsl.Table;

@Table(name = "Employees")
public class Employees extends SugarRecord {
    @Column(name = "idNo")
    private int idNo;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name = "employee_salary" )
    private int employee_salary;

    @Column(name = "employee_age")
    private int employee_age;

    @Column(name = "profile_image")
    private String profile_image;

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }


    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
