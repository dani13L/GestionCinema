package com.test.application.views.testBack;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.application.data.services.SalleService;
import com.test.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Test")
@Route(value = "test", layout = MainLayout.class)
public class Testview extends VerticalLayout{
    @Autowired
    private SalleService salleService;
    public Testview(){
        Button saveBtn= new Button("Save");
        TextField field= new TextField();

        HorizontalLayout horizontalLayout=new HorizontalLayout(field,saveBtn);
        saveBtn.addClickListener(e ->{
            salleService.saveSalle(field.getValue());
    });

    add(horizontalLayout);
    
    
}
}