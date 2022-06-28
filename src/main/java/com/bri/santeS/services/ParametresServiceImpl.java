package com.bri.santeS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS.dao.ParametresRepository;
import com.bri.santeS.entities.Parametres;

@CrossOrigin(origins = "*")
@RestController
public class ParametresServiceImpl implements ParametresService{
	@Autowired
    private ParametresRepository parametresRepository;
	
	@Override
    @GetMapping("/getParametres")
    @ResponseBody
    public List<Parametres> getParametres(){
        return parametresRepository.findAll();
    }

}
