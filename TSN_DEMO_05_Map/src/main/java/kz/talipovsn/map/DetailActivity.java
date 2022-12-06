package kz.talipovsn.map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Доступ к компоненту отображения HTML-страниц
        WebView webView = findViewById(R.id.webView);

        // Считываем название страницы и имя файла для отображения
        String titleMarker = getIntent().getStringExtra(getString(R.string.tMarker));
        String markerFileName = getIntent().getStringExtra(getString(R.string.mfile));

        // Загрузка HTML-страницы в компонет из внутреннего ресурса
        webView.loadUrl(markerFileName);

        webView.getSettings().setJavaScriptEnabled(true);
        // Установка заголовка окна
        this.setTitle(titleMarker);
    }

    // Метод для выхода из окна
    public void detailButtonClickExit(View view) {
        finish();
    }

}
