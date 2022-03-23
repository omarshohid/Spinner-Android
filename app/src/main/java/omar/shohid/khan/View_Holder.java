package omar.shohid.khan;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class View_Holder extends RecyclerView.ViewHolder {

    TextView name;
    ImageView imageView;
    Spinner noOfItem;
    TextView tvPrice;
    Button btnAdd;

    View_Holder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.itemName);
        imageView = (ImageView) itemView.findViewById(R.id.image);
        noOfItem = (Spinner) itemView.findViewById(R.id.noOfItem);
        tvPrice = (TextView) itemView.findViewById(R.id.tvPrice);
        btnAdd = (Button) itemView.findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),FoodDetails.class);
                intent.putExtra("name",name.getText());
                intent.putExtra("price",Integer.parseInt(tvPrice.getText().toString()));
                intent.putExtra("quantity",Integer.parseInt(noOfItem.getSelectedItem().toString()));
                intent.putExtra("image",Integer.parseInt(imageView.getTag().toString()));

                view.getContext().startActivity(intent);
               //Toast.makeText(view.getContext(), name.getText() + ", # of item:" + noOfItem.getSelectedItem().toString() + ", Unit price: " + tvPrice.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}