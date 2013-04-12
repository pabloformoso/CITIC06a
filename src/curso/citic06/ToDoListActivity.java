package curso.citic06;

import java.util.ArrayList;

import curso.citic06.R;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class ToDoListActivity extends Activity implements NewItemFragment.OnNewItemAddedListener {
  
  private ArrayList<ToDoItem> todoItems;
  private ToDoItemAdapter aa;

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
      
    
    // TODO 1 Extraemos las referencias a los Fragments

    
    
    // Instaciamos el Array
    todoItems = new ArrayList<ToDoItem>();
     
    // TODO 2 Array adapter para los contenidos. Implementado en Objeto separado.

  }
  
  // Callback esperado por la impentaci—n de la interfaz OnNewItemAddedListener
  public void onNewItemAdded(String newItem) {
    // TODO 3 Rellenar la lista
  }

}