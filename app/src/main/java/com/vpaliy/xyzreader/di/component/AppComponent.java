package com.vpaliy.xyzreader.di.component;

import android.content.Context;

import com.vpaliy.xyzreader.data.scheduler.BaseSchedulerProvider;
import com.vpaliy.xyzreader.di.module.ApplicationModule;
import com.vpaliy.xyzreader.di.module.DataModule;
import com.vpaliy.xyzreader.di.module.NetworkModule;
import com.vpaliy.xyzreader.domain.Article;
import com.vpaliy.xyzreader.domain.IRepository;
import com.vpaliy.xyzreader.ui.Navigator;
import com.vpaliy.xyzreader.ui.articles.ArticlesActivity;
import com.vpaliy.xyzreader.ui.articles.IArticlesConfig;
import com.vpaliy.xyzreader.ui.base.BaseActivity;
import com.vpaliy.xyzreader.ui.base.bus.RxBus;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class,
        DataModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(BaseActivity activity);
    void inject(ArticlesActivity activity);
    IRepository<Article> repository();
    Context context();
    BaseSchedulerProvider scheduler();
    Navigator navigator();
    RxBus bus();
    IArticlesConfig articlesConfig();
}
