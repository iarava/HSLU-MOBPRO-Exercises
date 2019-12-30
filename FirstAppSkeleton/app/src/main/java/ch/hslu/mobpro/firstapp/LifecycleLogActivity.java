package ch.hslu.mobpro.firstapp;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Logs lifecycle transitions into the LogCat view of the ADT-Debugger.
 *
 * @author Ruedi Arnold
 */

public class LifecycleLogActivity extends Activity {

    /*Erstes mal Starten der App*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onCreate() aufgerufen");
    }


    // TODO: Add further implementions of onX-methods.
    /*Starten der App (auch aus Hintergrundapplikation*/
    @Override
    public void onStart(){
        super.onStart();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onStart() aufgerufen");
    }

    /*App aus Hintergrundapplikation gestartet*/
    @Override
    public void onRestart(){
        super.onRestart();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onRestart() aufgerufen");
    }

    /*App ist aktiv*/
    @Override
    public void onResume(){
        super.onResume();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onResume() aufgerufen");
    }

    /*App wird in den Hintergrund geschoben*/
    @Override
    public void onPause(){
        super.onPause();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onPause() aufgerufen");
    }

    /*App läuft im Hintergrund*/
    @Override
    public void onStop(){
        super.onStop();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onStop() aufgerufen");
    }

    /*Back wird aufgerufen*/
    @Override
    public void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onDestroy() aufgerufen");
    }
}