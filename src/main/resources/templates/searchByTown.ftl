<form action="/town" method="get">
    <div class="form-group">
        <label for="exampleFormControlSelect1">Пошук по місту</label>

        <select class="form-control" id="exampleFormControlSelect1" name="townName">
            <#list towns as town>
                <option>${town.name}</option>
            </#list>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">знайти</button>
</form>