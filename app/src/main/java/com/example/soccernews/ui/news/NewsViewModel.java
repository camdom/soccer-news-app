package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.ui.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news; // Cria uma variável com o nome de news do tipo MutableLiveData que por sua vez armazena uma lista de objetos da classe NEWS
                                                    // Live
    public NewsViewModel() {
        this.news = new MutableLiveData<>();          // Instancia uma lista mutavel com o nome de news

        //TODO Remover mock de noticias
        List<News> news = new ArrayList<>();     //
        news.add(new News("Ferroviária tem desfalque importante", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley"));
        news.add(new News("Ferrinha joga no sábado", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley"));
        news.add(new News("Copa do Mundo Feminina na reta final", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {

        return this.news;
    }
}