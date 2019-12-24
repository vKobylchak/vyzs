<nav class="navbar navbar-expand-lg navbar-light sticky-top" style="background-color: #e3f2fd;" >
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/">Головна</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/main">Показати вузи</a>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Контактні данні
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">sasha.borovskiy2002@gmail.com</a>
                            <a class="dropdown-item" href="#">+380979807246</a>
                </div>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    Спеціальності
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <#list vyzs as v>
                        <#list v.facultets as f>
                        <a class="dropdown-item" href="#">${f.number} ${f.title}</a>
                        </#list>
                    </#list>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/test">Тести</a>
            </li>
        </ul>
    </div>
</nav>
