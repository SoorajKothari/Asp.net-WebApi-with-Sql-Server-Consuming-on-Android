using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Web.Http;
using System.Web.Http.Cors;
using WebApplication5.Models;

namespace WebApplication5.Controllers
{
    public class WebController : ApiController
    {
        private EmployeeDBEntities mde = new EmployeeDBEntities();

        [HttpGet]
        public HttpResponseMessage findAll()
        {
            try
            {
                
                var responce = new HttpResponseMessage(HttpStatusCode.OK);

                responce.Content = new StringContent(JsonConvert.SerializeObject(mde.Employees.ToList()));
                responce.Content.Headers.ContentType = new MediaTypeHeaderValue("application/json");
                return responce;
            }
            catch
            {

                return new HttpResponseMessage(HttpStatusCode.BadGateway);
            }
        }
    }
}
