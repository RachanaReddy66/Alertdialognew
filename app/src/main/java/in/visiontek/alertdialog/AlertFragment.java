package in.visiontek.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class AlertFragment extends DialogFragment {
    String[] colors_array = {"red","green","blue","yellow"};
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        /*builder.setIcon(R.drawable.ic_action_name);
        builder.setTitle("Erase Photos");
        builder.setMessage("All the Photos will be deleted");
        builder.setPositiveButton("Erase", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Photos Erased", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });*/
        builder.setTitle("pick a color");

        builder.setItems(colors_array, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
           // getResources().getStringArray(i);
                Toast.makeText(getActivity(), "my favourite color is  "+ colors_array[i], Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}
