package com.example.patanapplication.ui.newsblog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.patanapplication.databinding.FragmentNewsblogBinding;
//import com.example.patanapplication.databinding.FragmentSlideshowBinding;

public class NewsblogFragment extends Fragment {

    private FragmentNewsblogBinding binding;
//
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        NewsblogViewModel slideshowViewModel =
//                new ViewModelProvider(this).get(NewsblogViewModel.class);
//
//        binding = FragmentNewsblogBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//
////        final TextView textView = binding.textnewsblog;
////        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
////        return root;
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }
}