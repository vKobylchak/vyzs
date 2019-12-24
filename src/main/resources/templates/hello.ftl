<#import "parts/common.ftl" as c>
<@c.page>
    <div class="container-fluid">
        <#include "navbar.ftl">
    </div>
    <div class="container">
        <div class="p-2 m-2">
            <#include "carousel.ftl">
        </div>
    </div>
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
</@c.page>
