package com.mygdx.game.engine;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

public class GdxExtension extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Timer timer;
	GameObject object;
	Engine engine;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		engine = new Engine(500, 500);
		timer = new Timer(5, true);
		object = new GameObject(new Vector2(0,0), new Dimension<Float>(0f,0f));

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);

		Timer.incrementTimers();

		object.justClicked();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}