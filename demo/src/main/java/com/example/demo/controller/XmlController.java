package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entity.User;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class XmlController {

    private final XmlMapper xmlMapper = new XmlMapper();

    @GetMapping("/parse-xml")
    public User parseXml() throws Exception {
        String xml = "<user><id>1</id><name>Ajay Kumar</name><email>ajay@example.com</email></user>";
        User user = xmlMapper.readValue(xml, User.class);
        System.out.println("Parsed User: " + user);
        return user;
    }
}
