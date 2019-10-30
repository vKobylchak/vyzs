<form action="/facultetTitle" method="get">
    <div class="form-group">
        <label for="exampleFormControlSelect1">Пошук по назві факультету</label>

        <select class="form-control" name="facultetTitle">
<#--        <select class="form-control" id="exampleFormControlSelect2" name="number">-->
            <#list facultets as facultet>
                <option>${facultet.title} </option>
<#--                <option>${facultet.number} ${facultet.title}</option>-->
            </#list>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">знайти</button>
</form>