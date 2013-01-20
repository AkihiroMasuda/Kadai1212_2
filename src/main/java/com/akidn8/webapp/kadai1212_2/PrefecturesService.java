/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akidn8.webapp.kadai1212_2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *
 * @author akihiro
 */
@Path("/")
public class PrefecturesService {
   @GET
   @Path("/Prefectures/")
   public Response printPrefectures() {
       ResponseBuilder rb = Response.status(200); //OK返却
       rb.type("text/html;charset=UTF-8");
       rb.entity("{\"pref\":["
                      + "\"茨城県\","
                      + "\"栃木県\","
                      + "\"群馬県\","
                      + "\"埼玉県\","
                      + "\"千葉県\","
                      + "\"東京都\","
                      + "\"神奈川県\""
                      + "]}"
               );
       return rb.build();
   }    
}
