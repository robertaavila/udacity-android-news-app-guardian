package com.example.android.newsappguardian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.newsappguardian.R;

import java.util.ArrayList;

    public class NewsAdapter extends ArrayAdapter<News> {

        public NewsAdapter(Context context, ArrayList<News> news) {
            super(context, 0, news);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.item, parent, false);
            }

            News currentNews = getItem(position);
            TextView newsTitleTextView = listItemView.findViewById(R.id.titulo_lista);
            String title = currentNews.getmTitulo();
            newsTitleTextView.setText(title);

            TextView newsCategorytextView = listItemView.findViewById(R.id.categoria_lista);
            String category = currentNews.getmCategoria();
            newsCategorytextView.setText(category);

            TextView newsDatetextView = listItemView.findViewById(R.id.data_lista);
            String date = currentNews.getmData();
            newsDatetextView.setText(date);

            TextView newsAuthortextView = listItemView.findViewById(R.id.autor_lista);
            String author = currentNews.getmAutor();
            newsAuthortextView.setText(author);

            return listItemView;
        }
}
