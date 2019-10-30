<#import "parts/common.ftl" as c>
<@c.page>
<#--    <nav class="navbar navbar-expand-lg navbar-light sticky-top" style="background-color: #e3f2fd;">-->
<#--        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"-->
<#--                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">-->
<#--            <span class="navbar-toggler-icon"></span>-->
<#--        </button>-->

<#--        <div class="collapse navbar-collapse" id="navbarSupportedContent">-->
<#--            <ul class="navbar-nav mr-auto">-->
<#--                <li class="nav-item">-->
<#--                    <a class="nav-link" href="/">Головна</a>-->
<#--                </li>-->
<#--                <li class="nav-item">-->
<#--                    <a class="nav-link" href="/main">Показати вузи</a>-->
<#--                </li>-->

<#--                <li class="nav-item dropdown">-->
<#--                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"-->
<#--                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">-->
<#--                        Контактні данні-->
<#--                    </a>-->
<#--                </li>-->

<#--                <li class="nav-item dropdown">-->
<#--                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"-->
<#--                       data-toggle="dropdown"-->
<#--                       aria-haspopup="true" aria-expanded="false">-->
<#--                        Спеціальності-->
<#--                    </a>-->
<#--                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">-->
<#--                        <#list vyzs as v>-->
<#--                            <#list v.facultets as f>-->
<#--                                <a class="dropdown-item" href="#">${f.number} ${f.title}</a>-->
<#--                            </#list>-->
<#--                        &lt;#&ndash;&ndash;&gt;-->
<#--                        </#list>-->
<#--                    </div>-->
<#--                </li>-->
<#--            </ul>-->

<#--        </div>-->
<#--    </nav>-->


<#--    <div class="row p-2 justify-content-around">-->
    <div class="container-fluid">
        <#include "navbar.ftl">
    </div>
    <div class="container">
        <div class="p-2 m-2">
            <#include "carousel.ftl">
        </div>
    </div>
<#--    </div>-->
    <div class="container">
        <div class="row justify-content-around">
            <div class="alert alert-success col-xs-12 col-sm-12 col-md-5 col-lg-5">
                <#include "searchByTown.ftl">
            </div>
            <div class="alert alert-success col-xs-12 col-sm-12 col-md-5 col-lg-5">
                <#include "searchByFacultetTitle.ftl">
            </div>
        </div>
        <div class="row justify-content-around">
            <div class="alert alert-success col-xs-12 col-sm-12 col-md-5 col-lg-5">
                <#include "searchByTownAndFacultetNumber.ftl">
            </div>
            <div class="alert alert-success col-xs-12 col-sm-12 col-md-5 col-lg-5">
                <#include "searchByTownAndFacultetTitle.ftl">
            </div>
        </div>
    </div>

<#--    <form action="/town" method="get">-->
<#--        <div class="form-group">-->
<#--            <label for="exampleFormControlSelect1">Пошук по місту</label>-->

<#--            <select class="form-control" id="exampleFormControlSelect1" name="town">-->
<#--                <#list vyzs as vyz>-->
<#--                    <option>${vyz.town}</option>-->
<#--                </#list>-->
<#--            </select>-->
<#--        </div>-->

<#--        <button type="submit" class="btn btn-primary">Submit</button>-->
<#--    </form>-->

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

    <script>
        $('.carousel').carousel()
    </script>
<#--    <script src="/js/main.js"></script>-->
</@c.page>
