package com.example.app_av2;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class AdicionarProduto extends Activity {
    public void voltarAoMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
