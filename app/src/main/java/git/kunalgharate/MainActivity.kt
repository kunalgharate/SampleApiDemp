package git.kunalgharate

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    private val progressDialog: ProgressDialog? = null
    private lateinit var recyclerView: RecyclerView
    private var customAdapter: CustomAdapter? = null
    private lateinit var userList: ArrayList<ApiData.IssueQuestionDatum>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rv_data)
        val mLayoutManager: RecyclerView.LayoutManager = GridLayoutManager(applicationContext, 1)
        recyclerView.setLayoutManager(mLayoutManager)
        recyclerView.setItemAnimator(DefaultItemAnimator())
        userListFromRestApi
    }//  DialogHelper.getAlertWithMessage("Error",t.getMessage(),MainActivity.this);// Toast.makeText(getApplicationContext(),""+user.getId(),Toast.LENGTH_SHORT).show();

    //  progressDialog = createProgressDialog(this);
    private val userListFromRestApi: Unit
        private get() {

            //  progressDialog = createProgressDialog(this);
            val retrofitInterface = RetrofitClient.getClient().create(
                RetrofitInterface::class.java
            )
            val call = retrofitInterface.getUsers("Security_Agency")
            call.enqueue(object : Callback<List<ApiData>> {
                override fun onResponse(
                    call: Call<List<ApiData>>,
                    response: Response<List<ApiData>>
                ) {

                    Toast.makeText(this@MainActivity,response.body()[0].message,Toast.LENGTH_LONG);
                    Log.d("dataResponse", "onResponse: "+response.body()[0].message)
                  //  progressDialog!!.dismiss()
                    userList = ArrayList(response.body()[0].issueQuestionData)
                    customAdapter = CustomAdapter(applicationContext, userList) { user, position ->
                        // Toast.makeText(getApplicationContext(),""+user.getId(),Toast.LENGTH_SHORT).show();
                    }
                    recyclerView!!.adapter = customAdapter
                }

                override fun onFailure(call: Call<List<ApiData>>, t: Throwable) {

                    Log.d("dataResponse", "onResponse: T data   "+t.message)
                    //progressDialog!!.dismiss()
                    //  DialogHelper.getAlertWithMessage("Error",t.getMessage(),MainActivity.this);
                }
            })
        }

    /*  public ProgressDialog createProgressDialog(Context mContext) {
        ProgressDialog dialog = new ProgressDialog(mContext);
        try {
            dialog.show();
        } catch (WindowManager.BadTokenException e) {

        }
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_layout);
        return dialog;
    }
*/
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_item, menu)
        val searchItem = menu.findItem(R.id.menu_search)
        var searchView: SearchView? = null
        if (searchItem != null) {
            searchView = searchItem.actionView as SearchView
        }
        searchView!!.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                customAdapter!!.filter.filter(newText)
                return true
            }
        })
        return super.onCreateOptionsMenu(menu)
    }
}
