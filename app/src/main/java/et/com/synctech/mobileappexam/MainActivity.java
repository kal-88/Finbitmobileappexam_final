package et.com.synctech.mobileappexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import et.com.synctech.mobileappexam.employeeModel.Employees;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Employees employees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.listView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);

        Call<EmployeeList> call = api.getEmployeeList();
        call.enqueue(new Callback<EmployeeList>() {
            @Override
            public void onResponse(Call<EmployeeList> call, Response<EmployeeList> response) {
                EmployeeList employeeList = response.body();

                String[] employee_name  = new String[employeeList.getEmployeeList().size()];
                Integer[] idNo = new Integer[employeeList.getEmployeeList().size()];
                Integer[] employee_salary = new Integer[employeeList.getEmployeeList().size()];
                Integer[] employee_age = new Integer[employeeList.getEmployeeList().size()];
                String[] profile_image  = new String[employeeList.getEmployeeList().size()];
                for (int i =0; i<employeeList.getEmployeeList().size(); i++){
                    idNo[i] = employeeList.getEmployeeList().get(i).getId();
                    employee_name[i] = employeeList.getEmployeeList().get(i).getEmployee_name();
                    employee_salary[i] = employeeList.getEmployeeList().get(i).getEmployee_salary();
                    employee_age[i] = employeeList.getEmployeeList().get(i).getEmployee_age();
                    profile_image[i] = employeeList.getEmployeeList().get(i).getProfile_image();
                    employees = new Employees();
                    employees.setIdNo(idNo[i]);
                    employees.setEmployee_name(employee_name[i]);
                    employees.setEmployee_salary(employee_salary[i]);
                    employees.setEmployee_age(employee_age[i]);
                    employees.setProfile_image(profile_image[i]);
                    employees.save();
                    Toast.makeText(MainActivity.this,"Insert json file successful", Toast.LENGTH_SHORT).show();
                }


                listView.setAdapter(
                        new ArrayAdapter<String>(
                                getApplicationContext(),
                                android.R.layout.simple_list_item_1,
                                employee_name
                        )
                );
            }

            @Override
            public void onFailure(Call<EmployeeList> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
