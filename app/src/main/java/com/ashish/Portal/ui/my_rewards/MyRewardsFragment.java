//package com.ashish.Portal.ui.my_rewards;
//
//import android.app.Dialog;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.ashish.Portal.DBquerries;
//import com.ashish.Portal.MyRewardsAdapter;
//import com.ashish.Portal.R;
//
//public class MyRewardsFragment extends Fragment {
//    public MyRewardsFragment() {
//    }
//    public static MyRewardsAdapter rewardsAdapter;
//    private Dialog loadingDialog;
//    private RecyclerView rewardsRecyclerView;
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//        View root = inflater.inflate(R.layout.fragment_my_rewards, container, false);
//        rewardsRecyclerView=root.findViewById(R.id.my_rewards_recyclerview);
////////////loading dialog
//
//        loadingDialog=new Dialog(getContext());
//        loadingDialog.setContentView(R.layout.loading_progress_dialog);
//        loadingDialog.setCancelable(false);
//        loadingDialog.getWindow().setBackgroundDrawable(getContext().getDrawable(R.drawable.slider_background));
//        loadingDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        loadingDialog.show();
//
//        //////////loading dialog
//
//
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
//        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
//        rewardsRecyclerView.setLayoutManager(linearLayoutManager);
//
//        rewardsAdapter=new MyRewardsAdapter(DBquerries.rewardModelList,false);
//        rewardsRecyclerView.setAdapter(rewardsAdapter);
//
//        if(DBquerries.rewardModelList.size() == 0){
//            DBquerries.loadRewards(getContext(),loadingDialog,true);
//        }else {
//            loadingDialog.dismiss();
//        }
//
//        rewardsAdapter.notifyDataSetChanged();
//        return root;
//    }
//}