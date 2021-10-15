/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.popovichia.learning.lesson2;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/** @author Igor */
@Service
public class ApplicationContextTest {

  @Autowired private ApplicationContext applicationContext;

  public void doTest() {
    Map<String, Singer> beans = applicationContext.getBeansOfType(Singer.class);
    beans.entrySet().stream()
        .forEach(
            bean ->
                System.out.println(
                    "bean key - " + bean.getKey() + "; bean value - " + bean.getValue()));
  }
}
