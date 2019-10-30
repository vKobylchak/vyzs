<form action="/findAllByTownAndFacultet" method="get">
    <div class="form-group">
        <label for="exampleFormControlSelect1">Пошук по місту та номеру спеціалізації</label>


        <select class="form-control" id="exampleFormControlSelect1" name="town">
            <#list towns as town>
                <option>${town.name}</option>
            </#list>
        </select>

        <select class="form-control" name="number">
            <#--        <select class="form-control" id="exampleFormControlSelect2" name="number">-->
            <#list facultets as facultet>
                <option>${facultet.number} </option>
            <#--                <option>${facultet.number} ${facultet.title}</option>-->
            </#list>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">знайти</button>
</form>