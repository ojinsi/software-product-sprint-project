// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;


import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;
import com.google.sps.data.Event;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/events")
public class EventServlet extends HttpServlet {
  //private List<Event>events;

  private Event events[] = new Event[2];
  private List<Integer>months;

  @Override
  public void init(){
      months = new ArrayList <>();
      months.add(1);
      months.add(2);
      months.add(3);
      events[0].setData(1, 3, "WIT Connect", "https://womenimpacttech.com/wit-connect?gclid=Cj0KCQjwyPbzBRDsARIsAFh15JZ_ZMVKQbajsNq9qSF3p5ioDy4UYTLZwH-rrSeBHWerZOc-i5AQ3IgaAvJ8EALw_wcB");
      events[1].setData(1, 25, "Networking Event", "https://www.eventbrite.com/e/women-in-tech-networking-happy-hour-with-special-guest-upfront-ventures-tickets-93828614913");
    //   events.add(conference);
    //   events.add(networking);
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      for(int i = 1; i < months.size(); i ++){
          if(i == 1){
                  response.setContentType("text/html;");
                  response.getWriter().println("<h1>January</h1>");
          }
          for(int j = 0; j < events.length; j++ ){
              Event current = events[j];
              if (current.month == i){
                  response.setContentType("text/html;");
                  response.getWriter().print(current.day + " ");
                  response.getWriter().print(current.title + " ");
                  response.getWriter().print("<a href = current.link>More Information</a>");
              }
          }

      }
    }

  }
