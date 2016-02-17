package com.test.androidside;

import android.os.Bundle;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
	}

	public void javaTestFunc(String strFromUnity) {
		UnityPlayer.UnitySendMessage("AndroidManager", "SetJavaLog", strFromUnity + "HelloWorld");
	}
}