package com.example.soccernews.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.soccernews.databinding.FragmentNewsBinding;
import com.example.soccernews.databinding.FragmentNewsBinding;
import com.example.soccernews.ui.adapters.NewsAdapter;



public class NewsFragment extends Fragment {

    private FragmentNewsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NewsViewModel NewsViewModel = new ViewModelProvider(this).get(NewsViewModel.class);

        binding = FragmentNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

         binding.rvNews.setLayoutManager(new LinearLayoutManager(getContext()));

         NewsViewModel.getNews().observe(getViewLifecycleOwner(), news ->    {
            binding.rvNews.setAdapter(new NewsAdapter(news));

        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}