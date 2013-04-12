package curso.citic06;

import curso.citic06.R;

import android.app.Activity;
import android.app.Fragment;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class NewItemFragment extends Fragment {

	private OnNewItemAddedListener onNewItemAddedListener;

	public interface OnNewItemAddedListener {
		public void onNewItemAdded(String newItem);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		// TODO 6 - Cargar el Fragment
		
		// TODO 7 - Crear el listener para el EditText

		return view;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		try {
			// TODO 6.1 asociar el listener para ejecutar el callback
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString() + " must implement OnNewItemAddedListener");
		}
	}

}