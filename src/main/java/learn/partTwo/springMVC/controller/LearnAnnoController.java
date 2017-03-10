package learn.partTwo.springMVC.controller;

import com.alibaba.fastjson.JSON;
import learn.partOne.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by clz on 2017/1/18.
 */
@Controller
@RequestMapping("/learn")
public class LearnAnnoController {
    @RequestMapping("/index")
    public String getIndex() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=utf-8")//定制response的媒体返回类型，application/json之类的
    public String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }

    @ResponseBody
    @RequestMapping(value = "/pathvar/{text}", produces = "text/plain;charset=utf-8")
    public String learnPathVariable(@PathVariable("text") String text, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str:" + text;
    }

    @ResponseBody
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=utf-8")
    public String learnRequestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,id:" + id;
    }

    @ResponseBody
    @RequestMapping(value = "/obj", produces = "text/plain;charset=utf-8")
    public String learnObjReq(Person person, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,person:" + JSON.toJSONString(person);
    }

    @ResponseBody
    @RequestMapping(value = {"/name", "/code"}, produces = "text/plain;charset=utf-8")
    public String learnTwo(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }
}
