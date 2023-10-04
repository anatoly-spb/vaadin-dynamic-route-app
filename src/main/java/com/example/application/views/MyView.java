package com.example.application.views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;

public class MyView extends VerticalLayout implements HasUrlParameter<String> {

  
  private static final Logger log = LoggerFactory.getLogger(MyView.class);
  
  
  @Override
  public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
    log.info("setParameter: location={}, parameter={}", event.getLocation().getPathWithQueryParameters(), parameter);
  }

}
