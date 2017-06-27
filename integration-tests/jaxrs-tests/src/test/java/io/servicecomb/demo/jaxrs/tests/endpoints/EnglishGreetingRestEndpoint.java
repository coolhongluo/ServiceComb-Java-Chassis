/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.demo.jaxrs.tests.endpoints;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import io.servicecomb.provider.rest.common.RestSchema;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@RestSchema(schemaId = "englishGreetingRestEndpoint")
@Path("/")
public class EnglishGreetingRestEndpoint {

  @GET
  @Path("/sayHi")
  @Produces(TEXT_PLAIN)
  public String sayHi(@QueryParam("name") String name) {
    return "Hi " + name;
  }

  @GET
  @Path("")
  @Produces(TEXT_PLAIN)
  public String home() {
    return "Welcome home";
  }
}