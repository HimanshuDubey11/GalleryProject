package himanshu.project.com.galleryproject;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.Data> {

    ArrayList<String> listOfAllImages;

    public GalleryAdapter(ArrayList<String> listOfAllImages) {
        this.listOfAllImages = listOfAllImages;
    }

    @NonNull
    @Override
    public GalleryAdapter.Data onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_gallery_adapter,null);

        return new Data(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryAdapter.Data data, int i) {

        data.imageView.setImageURI(Uri.parse(listOfAllImages.get(i)));

    }

    @Override
    public int getItemCount() {
        return listOfAllImages.size();
    }

    public class Data extends RecyclerView.ViewHolder {
        ImageView imageView;
        public Data(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.dataimage);
        }
    }
}
