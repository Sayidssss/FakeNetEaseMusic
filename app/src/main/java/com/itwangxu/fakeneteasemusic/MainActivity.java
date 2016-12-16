package com.itwangxu.fakeneteasemusic;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
    implements
      NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {

  private DrawerLayout drawer;
  private Toolbar toolbar;
  private ImageButton discoverBtn;
  private ImageButton musicBtn;
  private ImageButton friendsBtn;
  private FloatingActionButton fab;
  private NavigationView navigationView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initActionBar(R.id.toolbar);
    initDrawer();
    initViews();
    intListener();

  }

  private void initViews() {
    fab = (FloatingActionButton) findViewById(R.id.fab);

    navigationView = (NavigationView) findViewById(R.id.nav_view);
  }

  private void intListener() {
    navigationView.setNavigationItemSelectedListener(this);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
      }
    });
    discoverBtn.setOnClickListener(this);
    friendsBtn.setOnClickListener(this);
    musicBtn.setOnClickListener(this);
  }

  private void initDrawer() {
    drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();
  }

  private void initActionBar(@IdRes int toolbarId) {
    toolbar = (Toolbar) findViewById(toolbarId);
    discoverBtn = (ImageButton) toolbar.findViewById(R.id.btn_discover);
    musicBtn = (ImageButton) toolbar.findViewById(R.id.btn_music);
    friendsBtn = (ImageButton) toolbar.findViewById(R.id.btn_friends);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayShowTitleEnabled(false);
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }


  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.nav_camera) {
      // Handle the camera action
    } else if (id == R.id.nav_gallery) {

    } else if (id == R.id.nav_slideshow) {

    } else if (id == R.id.nav_manage) {

    } else if (id == R.id.nav_share) {

    } else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

  @Override
  public void onClick(View view) {

  }
}
