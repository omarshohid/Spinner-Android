package omar.shohid.khan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetails extends AppCompatActivity {
    String name;
    Integer price;
    Integer quantity;
    Integer imageId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        price = intent.getIntExtra("price",0);
        quantity = intent.getIntExtra("quantity",0);
        imageId = intent.getIntExtra("image",0);


        ImageView imageview = (ImageView) findViewById(R.id.itemImage);
        TextView tvName = (TextView) findViewById(R.id.itemName);
        TextView tvPrice = (TextView) findViewById(R.id.tvPrice);
        TextView tvQty = (TextView) findViewById(R.id.noOfItem);

        imageview.setImageResource(imageId);
        tvName.setText(name);
        tvPrice.setText("Price: "+String.valueOf(price)+" (BDT)");
        tvQty.setText("Order Qty: "+String.valueOf(quantity));


    }
}