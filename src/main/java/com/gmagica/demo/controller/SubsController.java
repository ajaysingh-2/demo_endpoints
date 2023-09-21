package com.gmagica.demo.controller;

import com.gmagica.demo.entity.SubsEntity;
import com.gmagica.demo.repository.SubsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/subuser")
public class SubsController {

    @Autowired
    private SubsRepository subsRepository;

    @PostMapping(path = "/subadd")
    public @ResponseBody String addNewSubs(@RequestParam String subsname, @RequestParam String plan, @RequestParam String email) {

        SubsEntity subs = new SubsEntity();
        subs.setSubsname(subsname);
        subs.setPlan(plan);
        subs.setEmail(email);
        subsRepository.save(subs);
        return "User Created";
    }

    @GetMapping(path = "/suball")
    public @ResponseBody Iterable <SubsEntity> getAllUsers() {
        return subsRepository.findAll();

    }

}
