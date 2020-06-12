//package et.com.synctech.mobileappexam;
//import com.orm.SugarRecord;
//public class EmployeeHelper extends SugarRecord<EmployeeHelper> {
//     int id;
//     String employee_name;
//     int employee_salary;
//     int employee_age;
//     String profile_image;
//
//    public EmployeeHelper(){
//    }
//
//    public EmployeeHelper(int id,String employee_name,int employee_salary,int employee_age,String profile_image ){
//        this.id = id;
//        this.employee_name = employee_name;
//        this.employee_salary = employee_salary;
//        this.employee_age = employee_age;
//        this.profile_image = profile_image;
//    }
//}
//
//
//
//
//
//
//
////package et.com.synctech.mobileappexam;
////
////import android.content.ContentValues;
////import android.content.Context;
////import android.database.sqlite.SQLiteDatabase;
////import android.database.sqlite.SQLiteOpenHelper;
////import android.provider.BaseColumns;
////
////import androidx.annotation.Nullable;
////
////public class EmployeeHelper extends SQLiteOpenHelper {
////
////    public static final String DataBaseName = "employee";
////    public static final String TableName = "employeeData";
////    public static final String Col_1 = "ID";
////    public static final String Col_2 = "EmployeeName";
////    public static final String Col_3 = "EmployeeSalary";
////    public static final String Col_4 = "EmployeeAge";
////    public static final String Col_5 = "ProfileImage";
////    private static final String SQL_CREATE_ENTRIES =
////            "CREATE TABLE " + TableName + " ( "+Col_1+ "INTEGER PRIMARY KEY AUTOINCREMENT,"+
////                    Col_2 +"Text," +Col_3+ "INTEGER,"+Col_4+ "INTEGER," +Col_5 +"Text)";
////    private static final String SQL_DELETE_ENTRIES =
////            "DROP TABLE IF EXISTS " + TableName;
////
////
////    public EmployeeHelper(@Nullable Context context) {
////        super(context, DataBaseName, null, 1);
////
////    }
////
////    @Override
////    public void onCreate(SQLiteDatabase db) {
////        db.execSQL(SQL_CREATE_ENTRIES);
////    }
////
////    @Override
////    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
////        db.execSQL(SQL_DELETE_ENTRIES);
////    }
////
////    public boolean add(String[] name){
////        SQLiteDatabase db = this.getWritableDatabase();
////        ContentValues contentValues = new ContentValues();
////        contentValues.put(Col_2, name[1]);
//////        contentValues.put(Col_3, employee.getEmployee_salary());
//////        contentValues.put(Col_4, employee.getEmployee_age());
//////        contentValues.put(Col_5, employee.getProfile_image());
////
////        long insert = db.insert(TableName,null,contentValues);
////        if(insert == -1){
////            return false;
////        }
////        else {
////            return true;
////        }
////    }
////}
////
