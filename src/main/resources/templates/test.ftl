<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ВУЗ</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link rel="stylesheet" href="css/test.css">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light sticky-top" style="background-color: #e3f2fd;">
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
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
        </ul>
    </div>
</nav>
<div class="container">
    <div class="alert alert-light text-center" role="alert">
        <h2>Тест</h2>
    </div>
    <div class="text-right">
        <span class="text-right" style="color:#006699;text-decoration:underline;cursor:pointer;"
              onclick="document.getElementById('instruction').style.display = showhide(document.getElementById('instruction').style.display)">
Інструкція</span>
    </div>
    <div id="instruction" style="display: none">
        <ul class="alert alert-secondary" role="alert">
            <li>Виберіть відповідь (один із запропонованих варіантів) в кожному з 12 питань;</li>
            <li>Нажміть на кнопку "Показати результат";</li>
            <li>Ви не отримаєте відповідь, якщо не відповісте на всі запитання;</li>
            <li>Щоб скинути результати тестування нажміть кнопку "Зкинути відповіді";</li>
        </ul>
    </div>
    <form name="test" class="form-group">
        <ol>
            <li><b> Як би ви описали ваш звичайний найстрій? </b><br/>
                <input type="radio" name="Q1"/> 1.В мене зазвичай не стійкий настрій<br/>
                <input type="radio" name="Q1"/> 2.В мене зазвичай стійкий настрій<br/>
                <input type="radio" name="Q1"/> 3.Мій настрій як погода в горах, зовсім не стійкий<br/>
                <input type="radio" name="Q1"/> 4.В мене завжди гарний та життєрадісний настрій<br/>
                <br>
            </li>
            <li><b>Яка поведінка в тебе буває частіше?</b><br/>
                <input type="radio" name="Q2"/> 1.Я завжди активний і енергійний<br/>
                <input type="radio" name="Q2"/> 2.Я веду себе спокійно, говорю стримано<br/>
                <input type="radio" name="Q2"/> 3.Я боязкий і не впевнений, голос тихий і слабкий<br/>
                <input type="radio" name="Q2"/> 4.Я людина метушня! різкі жести і швидка вимова<br/>
                <br>
            </li>
            <li><b>Який з висловів описує тебе точніше за інші?</b><br/>
                <input type="radio" name="Q3"/> 1.Навіть якщо невдачі стаються я всерівно піду до кінця<br/>
                <input type="radio" name="Q3"/> 2.Я хвилююсь за невдачі і можливо навіть покину совю справу<br/>
                <input type="radio" name="Q3"/> 3.Я шукаю більш легкий шлях вирішення проблеми<br/>
                <input type="radio" name="Q3"/> 4.Я не беру до голови невдачі і вілдразу ж берусь до справи <br/>
                <br>
            </li>
            <li><b>Який з висловів характеризує тебе краще за інші?</b><br/>
                <input type="radio" name="Q4"/> 1.Я швидко втомлююсь, впадаю в фантазії та мрії<br/>
                <input type="radio" name="Q4"/> 2.Активно берусь за справу, але швидко перегораю<br/>
                <input type="radio" name="Q4"/> 3.Впертісь - це про мене чого б це не коштувало я завжди доводжу все
                до кінця <br/>
                <input type="radio" name="Q4"/> 4.Радий будь-якій роботі, берусь навіть за декілька робіт
                одночасно<br/>
                <br>
            </li>
            <li><b>Який з висловів більш точно описує стиль твого спілкування?</b><br/>
                <input type="radio" name="Q5"/> 1.Спілкуюсь емоційно, голосно сміюсь, активно жестикулюю<br/>
                <input type="radio" name="Q5"/> 2.Легко починаю розмову, стараюсь розворушити людей<br/>
                <input type="radio" name="Q5"/> 3.Я скромний і соромʼязливий<br/>
                <input type="radio" name="Q5"/> 4.Я не прагну спілкуватись з людьми<br/>
                <br>
            </li>
            <li><b>Як ти зазвичай виражаєш свої емоції, ти ділишся своїми почуттями з оточуючими</b><br/>
                <input type="radio" name="Q6"/> 1.Я схильний розділяти радістні і сумні моменти мого життя з іншими
                людьми<br/>
                <input type="radio" name="Q6"/> 2.Я закритий і не є відвертим з іншими людьми<br/>
                <input type="radio" name="Q6"/> 3.Я все тримаю в собі і преживаю все сам<br/>
                <input type="radio" name="Q6"/> 4.Я бурхливо переживаю емоції іноді навіть ділюсь ними з незнайомими
                людьми, але це рідкість<br/>
                <br>
            </li>
            <li><b>Я ти зазвичай реагуєш на зауваження на твію адресу?</b><br/>
                <input type="radio" name="Q7"/> 1.Спокійно, але ставати на одні і тіж граблі ніхто не забороняв<br/>
                <input type="radio" name="Q7"/> 2.Що!? я буду сперечатися до останнього<br/>
                <input type="radio" name="Q7"/> 3.Вислухаю и виправлюся<br/>
                <input type="radio" name="Q7"/> 4.Це може мене вбити довго буду переживати<br/>
                <br>
            </li>
            <li><b>Як ти відносишся до роботи?</b><br/>
                <input type="radio" name="Q8"/> 1.Після роботи я довго не беруся за нову<br/>
                <input type="radio" name="Q8"/> 2.Не втомлююся, але перемикнутись на іншу роботу важко<br/>
                <input type="radio" name="Q8"/> 3.Легко перелаштовуюся можу навіть покинути почату справу<br/>
                <input type="radio" name="Q8"/> 4.Легко беруся за наву справу<br/>
                <br>
            </li>
            <li><b> Як ти переносиш образи?
                </b><br/>
                <input type="radio" name="Q9"/> 1.Дуже емоційно, але швидко відходжу<br/>
                <input type="radio" name="Q9"/> 2.Легко і просто, навіть до голови не беру<br/>
                <input type="radio" name="Q9"/> 3.Важко і надовго залишаються в памʼяті <br/>
                <input type="radio" name="Q9"/> 4.Я важко переживаю, але зовні цього не показую<br/>
                <br>
            </li>
            <li><b>Як ти відносишся до гумору?</b><br/>
                <input type="radio" name="Q10"/> 1.Люблю, вмію, практикую<br/>
                <input type="radio" name="Q10"/> 2.Тільки спробуй наді мною пожартувати!Ображуся!<br/>
                <input type="radio" name="Q10"/> 3.Ціную гарний гумор, але розіргрувати не моє<br/>
                <input type="radio" name="Q10"/> 4.Жарти це все і мені байдуже ображаються на мене чи ні<br/>
                <br>
            </li>
            <li><b>Як ти відносишся до справ?</b><br/>
                <input type="radio" name="Q11"/> 1.Перед початком прораховую всі ризики і плани<br/>
                <input type="radio" name="Q11"/> 2.Не задумуюся, беру і роблю, якщо що швидко перелаштовуююсь<br/>
                <input type="radio" name="Q11"/> 3.Створюю пла по ходу роботи, легко перелаштовую план<br/>
                <input type="radio" name="Q11"/> 4.З важкістю створюю план, я не рішучий, я не знаю що робити
                далі<br/>
                <br>
            </li>
            <li><b>Як ти відносишся до вражень?</b><br/>
                <input type="radio" name="Q12"/> 1.Я дуже люблю враження<br/>
                <input type="radio" name="Q12"/> 2.Я не прагну вражень<br/>
                <input type="radio" name="Q12"/> 3.Я люблю яскраві враження, але я не пргану їх<br/>
                <input type="radio" name="Q12"/> 4.Я часту шукаю нові враження<br/>
                <br/></li>
        </ol>
        <p><textarea name="s1" rows="4" cols="70" readonly> </textarea></p>
        <input onclick="check_me()" type="button" class="btn btn-success" value="Показати результат"/>&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" class="btn btn-secondary" value="Зкинути відповіді"/>
    </form>
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
    <h5></h5>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script type="text/javascript" language="JavaScript">
    var res = "111111111111"

    function check_me() {
        var count = 0
        with (document.test) {
            if (!Q1[0].checked && !Q1[1].checked && !Q1[2].checked && !Q1[3].checked) {
                count += 1
            }
            ;
            if (!Q2[0].checked && !Q2[1].checked && !Q2[2].checked && !Q2[3].checked) {
                count += 1
            }
            ;
            if (!Q3[0].checked && !Q3[1].checked && !Q3[2].checked && !Q3[3].checked) {
                count += 1
            }
            ;
            if (!Q4[0].checked && !Q4[1].checked && !Q4[2].checked && !Q4[3].checked) {
                count += 1
            }
            ;
            if (!Q5[0].checked && !Q5[1].checked && !Q5[2].checked && !Q5[3].checked) {
                count += 1
            }
            ;
            if (!Q6[0].checked && !Q6[1].checked && !Q6[2].checked && !Q6[3].checked) {
                count += 1
            }
            ;
            if (!Q7[0].checked && !Q7[1].checked && !Q7[2].checked && !Q7[3].checked) {
                count += 1
            }
            ;
            if (!Q8[0].checked && !Q8[1].checked && !Q8[2].checked && !Q8[3].checked) {
                count += 1
            }
            ;
            if (!Q9[0].checked && !Q9[1].checked && !Q9[2].checked && !Q9[3].checked) {
                count += 1
            }
            ;
            if (!Q10[0].checked && !Q10[1].checked && !Q10[2].checked && !Q10[3].checked) {
                count += 1
            }
            ;
            if (!Q11[0].checked && !Q11[1].checked && !Q11[2].checked && !Q11[3].checked) {
                count += 1
            }
            ;
            if (!Q12[0].checked && !Q12[1].checked && !Q12[2].checked && !Q12[3].checked) {
                count += 1
            }
            ;
            if (count > 0) {
                alert("Ви виконали не всі завдання. Перевір себе!")
            } else answer()
        }
    }

    function control(k, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12) {
        if (k == 1 && f1.checked) return true;
        if (k == 2 && f2.checked) return true;
        if (k == 3 && f3.checked) return true;
        if (k == 4 && f4.checked) return true;
        if (k == 5 && f5.checked) return true;
        if (k == 6 && f6.checked) return true;
        if (k == 7 && f7.checked) return true;
        if (k == 8 && f8.checked) return true;
        if (k == 9 && f9.checked) return true;
        if (k == 10 && f10.checked) return true;
        if (k == 11 && f11.checked) return true;
        if (k == 12 && f12.checked) return true;
        return false;
    }

    function answer() {
        answ = "";
        with (document) {
            answ += control(res.charAt(0), test.Q1[0]) ? "2" : "0"
            answ += control(res.charAt(0), test.Q1[1]) ? "3" : "0"
            answ += control(res.charAt(0), test.Q1[2]) ? "1" : "0"
            answ += control(res.charAt(0), test.Q1[3]) ? "4" : "0"

            answ += control(res.charAt(1), test.Q2[0]) ? "4" : "0"
            answ += control(res.charAt(1), test.Q2[1]) ? "3" : "0"
            answ += control(res.charAt(1), test.Q2[2]) ? "1" : "0"
            answ += control(res.charAt(1), test.Q2[3]) ? "2" : "0"

            answ += control(res.charAt(2), test.Q3[0]) ? "4" : "0"
            answ += control(res.charAt(2), test.Q3[1]) ? "1" : "0"
            answ += control(res.charAt(2), test.Q3[2]) ? "2" : "0"
            answ += control(res.charAt(2), test.Q3[3]) ? "3" : "0"

            answ += control(res.charAt(3), test.Q4[0]) ? "1" : "0"
            answ += control(res.charAt(3), test.Q4[1]) ? "2" : "0"
            answ += control(res.charAt(3), test.Q4[2]) ? "4" : "0"
            answ += control(res.charAt(3), test.Q4[3]) ? "3" : "0"

            answ += control(res.charAt(4), test.Q5[0]) ? "3" : "0"
            answ += control(res.charAt(4), test.Q5[1]) ? "4" : "0"
            answ += control(res.charAt(4), test.Q5[2]) ? "1" : "0"
            answ += control(res.charAt(4), test.Q5[3]) ? "2" : "0"

            answ += control(res.charAt(5), test.Q6[0]) ? "4" : "0"
            answ += control(res.charAt(5), test.Q6[1]) ? "1" : "0"
            answ += control(res.charAt(5), test.Q6[2]) ? "2" : "0"
            answ += control(res.charAt(5), test.Q6[3]) ? "3" : "0"

            answ += control(res.charAt(6), test.Q7[0]) ? "3" : "0"
            answ += control(res.charAt(6), test.Q7[1]) ? "1" : "0"
            answ += control(res.charAt(6), test.Q7[2]) ? "4" : "0"
            answ += control(res.charAt(6), test.Q7[3]) ? "2" : "0"

            answ += control(res.charAt(7), test.Q8[0]) ? "1" : "0"
            answ += control(res.charAt(7), test.Q8[1]) ? "3" : "0"
            answ += control(res.charAt(7), test.Q8[2]) ? "2" : "0"
            answ += control(res.charAt(7), test.Q8[3]) ? "4" : "0"

            answ += control(res.charAt(8), test.Q9[0]) ? "3" : "0"
            answ += control(res.charAt(8), test.Q9[1]) ? "4" : "0"
            answ += control(res.charAt(8), test.Q9[2]) ? "1" : "0"
            answ += control(res.charAt(8), test.Q9[3]) ? "2" : "0"

            answ += control(res.charAt(9), test.Q10[0]) ? "3" : "0"
            answ += control(res.charAt(9), test.Q10[1]) ? "1" : "0"
            answ += control(res.charAt(9), test.Q10[2]) ? "2" : "0"
            answ += control(res.charAt(9), test.Q10[3]) ? "4" : "0"

            answ += control(res.charAt(10), test.Q11[0]) ? "2" : "0"
            answ += control(res.charAt(10), test.Q11[1]) ? "4" : "0"
            answ += control(res.charAt(10), test.Q11[2]) ? "3" : "0"
            answ += control(res.charAt(10), test.Q11[3]) ? "1" : "0"

            answ += control(res.charAt(11), test.Q12[0]) ? "1" : "0"
            answ += control(res.charAt(11), test.Q12[1]) ? "2" : "0"
            answ += control(res.charAt(11), test.Q12[2]) ? "3" : "0"
            answ += control(res.charAt(11), test.Q12[3]) ? "4" : "0"

            showResult();
        }
    }

    function showResult() {
        var nok = 0;
        var i, s;

        for (i = 0; i < answ.length; i++) {
            nok += answ.charAt(i) == "1" ? 1 : 0;
        }
        for (i = 0; i < answ.length; i++) {
            nok += answ.charAt(i) == "2" ? 2 : 0;
        }
        for (i = 0; i < answ.length; i++) {
            nok += answ.charAt(i) == "3" ? 3 : 0;
        }
        for (i = 0; i < answ.length; i++) {
            nok += answ.charAt(i) == "4" ? 4 : 0;
        }
        for (i = 0; i < answ.length; i++) {
            nok += answ.charAt(i) == "5" ? 5 : 0;
        }


        if (nok < 48) s = "Ви сангвінік, ви вмієте зосередитись на одній задачі, ви будете успішними в таких професіях: програміст, продавець, офіціант, вчитель, психолг, вихователь, журналіст, адвокат, юрист, техногог ";
        if (nok < 32) s = "Ви флегматик, ви любите порядок, але вам дуже складно робити вибір, найбільшого успіху ви досягните в таких професіях: лаборант, диспетчер, ювелір, ветеренар, врач терапевт, математик, механік, коректор баз данних, економіст ";
        if (nok < 26) s = "Ви холерик, ви природжений лідер, вам притаманні професії де потрібна пдвищена концентрація, ви досягните значного успіху в таких професіях: товарознавець, артист, дипломат, журналіст, постачальник, підприємець, хірург, льотчик  ,поліцейський, диспетчер, водій, тренер, менеджер, будівельник, режисер, кухар, слідчий, геолог, електрик ";
        if (nok < 19) s = "Ви меланхолік, ви тиха і врівноважена осбистість, найбільш комфортно будете відчувати себе в таких сферах: програміст, аудитор, літературний редактор, аналітик, психолог, вчитель, модельєр, дизайнер, композитор, геолог, зоотехнік, агроном, токар";
        document.test.s1.value = "Набрано балів:" + nok + "." + s + ".";

    }

    function showhide(obj) {
        if (obj == 'none') return 'inline';
        else return 'none';
    }
</script>
</body>
</html>