<form action="/findAllByTownAndFacultetTitle" method="get">
    <div class="form-group">
        <label for="exampleFormControlSelect1">Пошук по місту та назві спеціалізації</label>
        <select class="form-control" id="exampleFormControlSelect1" name="town">
            <#list towns as town>
                <option>${town.name}</option>
            </#list>
        </select>

        <select class="form-control" name="title">
            <#list facultets as facultet>
                <option>${facultet.title} </option>
            </#list>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">знайти</button>
</form>