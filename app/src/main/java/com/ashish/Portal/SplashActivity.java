package com.ashish.Portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ashish.Portal.R;
import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //SystemClock.sleep(3000);

        firebaseAuth=FirebaseAuth.getInstance();

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class );
        startActivity(mainIntent);
        //FirebaseUser currentUser = firebaseAuth.getCurrentUser();
//        if(currentUser==null){
//
//            Intent loginintent = new Intent(SplashActivity.this, RegisterActivity.class);
//            startActivity(loginintent);
//            finish();
//        }else {
//
//            FirebaseFirestore.getInstance().collection("USERS").document(currentUser.getUid()).update("Last seen", FieldValue.serverTimestamp())
//                    .addOnCompleteListener(new OnCompleteListener<Void>() {
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task) {
//                           if(task.isSuccessful()){
//                               Intent mainintent = new Intent(SplashActivity.this, MainActivity.class);
//                               startActivity(mainintent);
//                               finish();
//                           }else {
//                               String error=task.getException().getMessage();
//                               Toast.makeText(SplashActivity.this,error,Toast.LENGTH_SHORT).show();
//                           }
//                        }
//                    });
//        }
    }
}
