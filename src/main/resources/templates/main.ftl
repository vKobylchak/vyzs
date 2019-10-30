<#import "parts/common.ftl" as c>
<#--<#import "parts/login.ftl" as l>-->
<@c.page>
<#--   <#include "parts/navbar.ftl">-->

<#--    <#list vyzs as vyz>-->




    <div class="container-fluid">
        <#include "navbar.ftl">
    </div>
<#--    <div class="container">-->
<#--        &lt;#&ndash;    <div>&ndash;&gt;-->
<#--        <#include "carousel.ftl">-->
<#--    </div>-->









<#--        <div class="card text-center">-->
<#--            <div class="card-header">-->
<#--                ${vyz.title}-->
<#--            </div>-->
<#--            <div class="card-body">-->
<#--                <h5 class="card-title">${vyz.town.name}</h5>-->


<#--                <div class="btn-group" role="group">-->
<#--                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"-->
<#--                            aria-expanded="false">Спеціальності-->
<#--                    </button>-->
<#--                    <div class="dropdown-menu " aria-labelledby="btnGroupDrop1">-->

<#--                        <#list vyz.facultets as f>-->
<#--                            <h6 class="dropdown-item" type="name">${f.title}</h6>-->
<#--                        </#list>-->
<#--                    </div>-->
<#--                </div>-->

<#--            </div>-->
<#--            <div class="card-footer text-muted">-->
<#--                <a href="${vyz.link}" class="badge badge-pill badge-warning">${vyz.title}</a>-->

<#--                &lt;#&ndash;            Vyz passing score ${vyz.passingScore}&ndash;&gt;-->
<#--            </div>-->
<#--        </div>-->

    <div class="container mt-4">
        <div class="row">

            <#list vyzs as vyz>
                <div class="col-auto mb-3">
                    <div class="card  bg-light mb-3" style="width: 18rem;">
                        <div class="card-body">
                            <#--        <div class="card-deck">-->

                            <#--            <div class="card">-->
                            <img src="${vyz.picture}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${vyz.title}</h5>
                                <p class="card-text">${vyz.fullTitle}</p>
                            </div>
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-outline-primary dropdown-toggle"
                                        data-toggle="dropdown"
                                        aria-haspopup="true"
                                        aria-expanded="false">Спеціальності
                                </button>
                                <div class="dropdown-menu " aria-labelledby="btnGroupDrop1">

                                    <#list vyz.facultets as f>
                                        <h6 class="dropdown-item" type="name">${f.title}</h6>
                                    </#list>
                                </div>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted"><a href="${vyz.link}">${vyz.title}</a></small>
                            </div>
                            <#--            </div>-->

                            <#--        </div>-->
                        </div>
                    </div>
                </div>
            <#else>
                <div class="alert alert-danger" role="alert">
                    Не знайдено жодного результату за вашим запитом
                </div>
            </#list>
        </div>
    </div>

    <div class="container footer p3 fixed-bottom sticky-bottom">
        <div class="row justify-content-between">
            <div class="col d-none d-sm-none d-md-block">
                <p>&copy; 2019</p>
            </div>
            <div class="col">
                <p><i class="fab fa-java"></i> java</p>
            </div>
            <div class="col d-none d-sm-none d-md-block">
                <p>sasha.borovskiy2002@gmail.com</p>
            </div>
            <div class="col">
                <p>Borovskiy</p>
            </div>
            <div class="col">
                <p><strong>+380979807246</strong></p>
            </div>
        </div>
    </div>
    <div class="m-2 p-2">
        <h5>  </h5>
    </div>
<#--    <#else>-->
<#--        No nikakih Vyzs-->
<#--    </#list>-->
</@c.page>