<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>
    <div>
        <@l.back />
    </div>
    <div>
        <@l.logout />
    </div>


    <#if wrongParam??>
        Hi ${wrongParam}, How are you?
    </#if>

<#--    <#if wrongParam>-->
<#--        <h1>WRONG PARAM</h1>-->
<#--    </#if>-->


    <#list vyzs as vyz>
        <div>
            <b>${vyz.title}</b>
            <strong>${vyz.town}</strong>
            <strong>${vyz.passingScore}</strong>

        </div>
        <#else>
        No nikakih Vyzs
    </#list>
</@c.page>