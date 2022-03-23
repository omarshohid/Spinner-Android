package omar.shohid.khan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        TextView noItemSelected = (TextView) findViewById(R.id.noItemSelected);
        Spinner ddlItem = (Spinner) findViewById(R.id.ddlItem);
        Button btnView = (Button) findViewById(R.id.btnView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int itemIndex = ddlItem.getSelectedItemPosition();
                if(itemIndex > 0){
//                    List<Data> filteredData = new ArrayList<>();
//                    for (int i=0; i<data.size(); i++){
//                        Data item = data.get(i);
//                        if(item.category == itemIndex){
//                            filteredData.add(item);
//                        }
//                    }
                    List<Data> filteredData = new Data().get_food_items(itemIndex);
                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                    RecyclerView_Adapter adapter = new RecyclerView_Adapter(filteredData, getApplication());
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


                    if(filteredData.size() > 0){
                        recyclerView.setVisibility(View.VISIBLE);
                        noItemSelected.setVisibility(View.INVISIBLE);
                    }
                    else{
                        recyclerView.setVisibility(View.INVISIBLE);
                        noItemSelected.setText("No data found");
                        noItemSelected.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Please select a category first",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}