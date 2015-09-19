package org.dukecon.dukeconapp;

import org.dukecon.dukeconapp.utils.UrlConstants;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends Activity {

	private WebView webView;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		this.webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setWebChromeClient(new WebChromeClient());
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});

		if (savedInstanceState != null) {
			webView.restoreState(savedInstanceState);
		} else {
			webView.loadUrl(UrlConstants.WEBVIEW_URL);
		}
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
		webView.saveState(savedInstanceState);

		super.onSaveInstanceState(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_deutsch) {
			String javascript= "javascript: if(!document.getElementById('Deutsch').checked){ document.getElementById('Deutsch').click(); }" +
					"if(document.getElementById('Englisch').checked){ document.getElementById('Englisch').click(); }";
            webView.loadUrl(javascript);
			return true;
		}
		if (id == R.id.action_englisch) {
			String javascript="javascript: if(!document.getElementById('Englisch').checked){ document.getElementById('Englisch').click(); }" +
					"if(document.getElementById('Deutsch').checked){ document.getElementById('Deutsch').click(); }";
            webView.loadUrl(javascript);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		if (webView.canGoBack()) {
			webView.goBack();
		}
	}

}
