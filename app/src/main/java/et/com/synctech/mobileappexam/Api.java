package et.com.synctech.mobileappexam;

import java.lang.reflect.Array;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {
    String Base_url = "http://dummy.restapiexample.com/api/v1/";
//    @GET("employees")
//    Call<List<Employee>> getEmployees();

    @GET("employees")
    Call<EmployeeList> getEmployeeList();

//    @GET("{employees}")
//    Call<List<Employee>> getAllEmployees(@Path("employees") String employees);
//
//    @GET("{employees}/{id}")
//    Call<Employee> createEmployee(@Path("employees") String employees,
//                                  @Body(Employee employee));
}
