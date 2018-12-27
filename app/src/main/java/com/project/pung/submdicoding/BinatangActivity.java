package com.project.pung.submdicoding;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class BinatangActivity extends AppCompatActivity {

    //public static String Extra_Name;
    TextView tNama, tDetails;
    //TextView tDetails;
    ImageView tPhoto;
    Bitmap bitmap;
    String URLIMAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binatang);

        tNama = (TextView)findViewById(R.id.t_nama);
        String tname = getIntent().getStringExtra("nama");
        tNama.setText(tname);

        URLIMAGE=getIntent().getStringExtra("photo").toString();
        tPhoto = (ImageView)findViewById(R.id.img_item_photo);
        new GetImageFromURL(tPhoto).execute(URLIMAGE);

        tDetails = (TextView)findViewById(R.id.t_details);
        String tdetails = getIntent().getStringExtra("details").toString();
        tDetails.setText(tdetails);

        getSupportActionBar().setTitle(tname);
        //String tphoto = getIntent().getStringExtra("photo");
        //public static Drawable LoadImageFromWebURL(String tphoto) {
            //try {
                //InputStream iStream = (InputStream) new URL(tphoto).getContent();
                //Drawable drawable = Drawable.createFromStream(iStream, "");
                //return drawable;
            //} catch (Exception e) {
                //return null;
           // }}
        //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        //StrictMode.setThreadPolicy(policy);
        //try {
           // URL url = new URL(tphoto);
           // tPhoto.setImageBitmap(BitmapFactory.decodeStream((InputStream)url.getContent()));
           // return;

       // } catch (Exception e) {
            //Log.e(TAG, e.getMessage());
       // }

       // public static Bitmap (String tphoto) {
            //try {
               // URL url = new URL(tphoto);
               // HttpURLConnection connection = (HttpURLConnection) url.openConnection();
              //  connection.setDoInput(true);
               // connection.connect();
               // InputStream input = connection.getInputStream();
               // Bitmap myBitmap = BitmapFactory.decodeStream(input);
              //  return myBitmap;
           // } catch (IOException e) {
            //    e.printStackTrace();
            //    return null;
           // }

        //}

        //Drawable drawableProfile = new BitmapDrawable(getResources(), Bitmap);

        //tphoto.se(tphoto)
        //int iphoto = Integer.valueOf(tphoto);
       // tPhoto.setImageResource();



        }

    public class GetImageFromURL extends AsyncTask<String, Void, Bitmap> {
        ImageView imgView;

        public  GetImageFromURL(ImageView imgView){
            this.imgView = imgView;
        }

        @Override
        protected Bitmap doInBackground(String... url) {
            String urldisplay = url[0];
            bitmap = null;
            try {
                InputStream srt = new java.net.URL(urldisplay).openStream();
                bitmap = BitmapFactory.decodeStream(srt);
            } catch (Exception e){
                e.printStackTrace();
            }

            return bitmap;

        }

        @Override
        protected  void onPostExecute(Bitmap bitmap){
            super.onPostExecute(bitmap);
            imgView.setImageBitmap(bitmap);
        }


    }
}
