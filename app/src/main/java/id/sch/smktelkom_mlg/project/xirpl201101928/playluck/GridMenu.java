package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.drawable;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.id;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.layout;
import id.sch.smktelkom_mlg.project.xirpl201101928.playluck.R.string;

/**
 * Created by Aisyatush Shofiah on 03/12/2016.
 */

public class GridMenu extends AppCompatActivity {
    private static final String favoritedBookNamesKey = "favoritedBookNamesKey";
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_grid);

        GridView gridView = (GridView) this.findViewById(id.gridview);
        final BooksAdapter booksAdapter = new BooksAdapter(this, this.books);
        gridView.setAdapter(booksAdapter);

        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Book book = GridMenu.this.books[position];
                book.toggleFavorite();

                // This tells the GridView to redraw itself
                // in turn calling your BooksAdapter's getView method again for each cell
                booksAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // construct a list of books you've favorited
        ArrayList<Integer> favoritedBookNames = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getIsFavorite()) {
                favoritedBookNames.add(book.getName());
            }
        }

        // save that list to outState for later
        outState.putIntegerArrayList(GridMenu.favoritedBookNamesKey, favoritedBookNames);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // get our previously saved list of favorited books
        ArrayList<Integer> favoritedBookNames =
                savedInstanceState.getIntegerArrayList(GridMenu.favoritedBookNamesKey);

        // look at all of your books and figure out which are the favorites
        for (int bookName : favoritedBookNames) {
            for (Book book : this.books) {
                if (book.getName() == bookName) {
                    book.setIsFavorite(true);
                    break;
                }
            }
        }
    }
}
