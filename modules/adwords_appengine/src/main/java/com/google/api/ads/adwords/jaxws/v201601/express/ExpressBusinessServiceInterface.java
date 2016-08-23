// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201601.express;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201601.cm.Selector;


/**
 * 
 *       A service which fetches and manages AdWords Express businesses.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ExpressBusinessServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201601.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201601.express.ObjectFactory.class
})
public interface ExpressBusinessServiceInterface {


    /**
     * 
     *         Retrieves the Express businesses that meet the criteria set in the given selector.
     *         
     *         @param selector the selector specifying the AdWords Express businesses to return
     *         @return list of AdWords Express businesses identified by the selector
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusinessPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusinessServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusinessServiceInterfacegetResponse")
    public ExpressBusinessPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601")
        Selector selector)
        throws ApiException
    ;

    /**
     * 
     *         Performs the given {@link ExpressBusinessOperation}.
     *         
     *         @param operations list of unique operations; the same AdWords Express business cannot be
     *         specified in more than one operation
     *         @return the updated AdWords Express businesses
     *       
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusiness>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusinessServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusinessServiceInterfacemutateResponse")
    public List<ExpressBusiness> mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601")
        List<ExpressBusinessOperation> operations)
        throws ApiException
    ;

}