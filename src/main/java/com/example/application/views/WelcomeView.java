package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value="welcome", layout=MainLayout.class)
@RouteAlias(value="", layout=MainLayout.class)
public class WelcomeView extends VerticalLayout {

  public WelcomeView() {
    add("Welcome");
  }
}
