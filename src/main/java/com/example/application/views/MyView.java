package com.example.application.views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;

public class MyView extends VerticalLayout implements BeforeEnterObserver, AfterNavigationObserver, HasUrlParameter<String> {

  
  private static final Logger log = LoggerFactory.getLogger(MyView.class);
  
  Label label = new Label();

  public MyView() {
  }
  
  @Override
  public void beforeEnter(BeforeEnterEvent event) {
    log.info("beforeEnter: location={}", event.getLocation().getPathWithQueryParameters());
  }


  @Override
  public void afterNavigation(AfterNavigationEvent event) {
    log.info("afterNavigation: location={}", event.getLocation().getPathWithQueryParameters());
    label.setText(event.getLocation().getPathWithQueryParameters());
  }

  @Override
  public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
    log.info("setParameter: location={}, parameter=parameter", event.getLocation().getPathWithQueryParameters(), parameter);
  }

}
