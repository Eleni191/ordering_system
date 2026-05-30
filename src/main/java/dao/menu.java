package dao;
import model.menu_items;

import java.util.List;




public interface menu {
    boolean updaatemenu(menu_items m);
    List<menu_items>getmenu();

}
