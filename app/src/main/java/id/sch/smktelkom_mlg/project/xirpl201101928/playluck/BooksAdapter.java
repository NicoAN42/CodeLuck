package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.drawable;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.id;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.layout;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.string;

/**
 * Created by Aisyatush Shofiah on 03/12/2016.
 */

public class BooksAdapter extends BaseAdapter {
    private final Context mContext;
    private final Book[] book;
    private final Book[] books = {
            new Book(string.abc_an_amazing_alphabet_book, string.dr_seuss, drawable.abc,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/abc.jpg"),
            new Book(string.are_you_my_mother, string.dr_seuss, drawable.areyoumymother,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/areyoumymother.jpg"),
            new Book(string.where_is_babys_belly_button, string.karen_katz, drawable.whereisbabysbellybutton,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/whereisbabysbellybutton.jpg"),
            new Book(string.on_the_night_you_were_born, string.nancy_tillman, drawable.onthenightyouwereborn,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/onthenightyouwereborn.jpg"),
            new Book(string.hand_hand_fingers_thumb, string.dr_seuss, drawable.handhandfingersthumb,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/handhandfingersthumb.jpg"),
            new Book(string.the_very_hungry_caterpillar, string.eric_carle, drawable.theveryhungrycaterpillar,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/theveryhungrycaterpillar.jpg"),
            new Book(string.the_going_to_bed_book, string.sandra_boynton, drawable.thegoingtobedbook,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/thegoingtobedbook.jpg"),
            new Book(string.oh_baby_go_baby, string.dr_seuss, drawable.ohbabygobaby,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/ohbabygobaby.jpg"),
            new Book(string.the_tooth_book, string.dr_seuss, drawable.thetoothbook,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/thetoothbook.jpg"),
            new Book(string.one_fish_two_fish_red_fish_blue_fish, string.dr_seuss, drawable.onefish,
                    "http://www.raywenderlich.com/wp-content/uploads/2016/03/onefish.jpg")
    };

    // 1
    public BooksAdapter(Context context, Book[] books) {
        mContext = context;
        book = books;
    }

    // 2
    @Override
    public int getCount() {
        return this.book.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book book = this.books[position];

        // view holder pattern
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
            convertView = layoutInflater.inflate(layout.linearlayout_book, null);

            ImageView imageViewCoverArt = (ImageView) convertView.findViewById(id.imageview_cover_art);
            TextView nameTextView = (TextView) convertView.findViewById(id.textview_book_name);
            TextView authorTextView = (TextView) convertView.findViewById(id.textview_book_author);
            ImageView imageViewFavorite = (ImageView) convertView.findViewById(id.imageview_favorite);

            BooksAdapter.ViewHolder viewHolder = new BooksAdapter.ViewHolder(nameTextView, authorTextView, imageViewCoverArt, imageViewFavorite);
            convertView.setTag(viewHolder);
        }

        BooksAdapter.ViewHolder viewHolder = (BooksAdapter.ViewHolder) convertView.getTag();
        viewHolder.imageViewCoverArt.setImageResource(book.getImageResource());
        viewHolder.nameTextView.setText(this.mContext.getString(book.getName()));
        viewHolder.authorTextView.setText(this.mContext.getString(book.getAuthor()));
        viewHolder.imageViewFavorite.setImageResource(book.getIsFavorite() ? drawable.star_enabled : drawable.star_disabled);

        return convertView;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // Your "view holder" that holds references to each subview
    private class ViewHolder {
        private final TextView nameTextView;
        private final TextView authorTextView;
        private final ImageView imageViewCoverArt;
        private final ImageView imageViewFavorite;

        public ViewHolder(TextView nameTextView, TextView authorTextView, ImageView imageViewCoverArt, ImageView imageViewFavorite) {
            this.nameTextView = nameTextView;
            this.authorTextView = authorTextView;
            this.imageViewCoverArt = imageViewCoverArt;
            this.imageViewFavorite = imageViewFavorite;
        }
    }
}
