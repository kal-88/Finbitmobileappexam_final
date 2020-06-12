package et.com.synctech.mobileappexam;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeList {
    @SerializedName("data")
    private List<Employee> employeeList;

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
