package ua.vyz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.vyz.model.Facultet;
import ua.vyz.model.Town;
import ua.vyz.model.Vyz;
import ua.vyz.repository.FacultetRepository;
import ua.vyz.repository.TownRepository;
import ua.vyz.repository.VyzRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VyzApplication {

    public static void main(String[] args) {
        SpringApplication.run(VyzApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(final VyzRepository vyzRepository, final TownRepository townRepository, final FacultetRepository facultetRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {

                Town kyiv = new Town(1,"Київ");
                Town lviv = new Town(2,"Львів");
                Town kp = new Town(3,"Кам'янець-Подільський");
                Town kharkiv = new Town(4,"Харків");

                townRepository.save(kyiv);
                townRepository.save(lviv);
                townRepository.save(kp);
                townRepository.save(kharkiv);

                Facultet f122 = new Facultet(1, "122", "Комп'ютерні науки");
                facultetRepository.save(f122);
                Facultet f124 = new Facultet(2, "124", "Системний аналіз");
                facultetRepository.save(f124);
                Facultet f073 = new Facultet(3, "073", "Менеджмент");
                facultetRepository.save(f073);
                Facultet f171 = new Facultet(4, "171", "Електроніка");
                facultetRepository.save(f171);
                Facultet f075 = new Facultet(5, "075", "Маркетинг");
                facultetRepository.save(f075);
                Facultet f051 = new Facultet(6, "051", "Економіка");
                facultetRepository.save(f051);
                Facultet f072 = new Facultet(7, "072", "Фінанси, банківська справа та страхування");
                facultetRepository.save(f072);
                Facultet f131 = new Facultet(8, "131", "Прикладна механіка");
                facultetRepository.save(f131);
                Facultet f125 = new Facultet(9, "125", "Кібербезпека");
                facultetRepository.save(f125);
                Facultet f172 = new Facultet(10, "172", "Телекомунікації та радіотехніка");
                facultetRepository.save(f172);
                Facultet f133 = new Facultet(11, "133", "Галузеве машинобудування");
                facultetRepository.save(f133);
                Facultet f105 = new Facultet(12, "105", "Прикладна фізика та наноматеріали");
                facultetRepository.save(f105);
                Facultet f113 = new Facultet(13, "113","Прикладна математика");
                facultetRepository.save(f113);
                Facultet f061 = new Facultet(14, "061", "Журналістика");
                facultetRepository.save(f061);
                Facultet f121 = new Facultet(15, "121", "Інженерія програмного забезпечення");
                facultetRepository.save(f121);
                Facultet f132 = new Facultet(16, "132", "Матеріалознавство");
                facultetRepository.save(f132);
                Facultet f143 = new Facultet(17, "143", "Атомна енергетика");
                facultetRepository.save(f143);
                Facultet f032 = new Facultet(18, "032", "Історія та археологія");
                facultetRepository.save(f032);
                Facultet f104 = new Facultet(19, "104", "Фізика та астрономія");
                facultetRepository.save(f104);
                Facultet f081 = new Facultet(20, "081", "Право");
                facultetRepository.save(f081);
                Facultet f123 = new Facultet(21, "124", "Комп'ютерна інженерія");
                facultetRepository.save(f123);
                Facultet f053 = new Facultet(22, "053", "Психологія");
                facultetRepository.save(f053);
                Facultet f082 = new Facultet(23, "082", "Міжнародне право");
                facultetRepository.save(f082);
                Facultet f101 = new Facultet(24, "101", "Екологія");
                facultetRepository.save(f101);
                Facultet f091 = new Facultet(25, "091", "Біологія");
                facultetRepository.save(f091);
                Facultet f111 = new Facultet(26, "111", "Математика");
                facultetRepository.save(f111);
                Facultet f144 = new Facultet(27, "144", "Теплоенергетика");
                facultetRepository.save(f144);
                Facultet f162 = new Facultet(28, "162", "Біотехнології та біоінженерія");
                facultetRepository.save(f162);
                Facultet f181 = new Facultet(29, "181", "Харчові технології");
                facultetRepository.save(f181);
                Facultet f242 = new Facultet(30, "242", "Туризм");
                facultetRepository.save(f242);
                Facultet f263 = new Facultet(31, "263", "Цивільна безпека");
                facultetRepository.save(f263);
                Facultet f033 = new Facultet(32, "033", "Філософія");
                facultetRepository.save(f033);
                Facultet f035 = new Facultet(33, "035", "Філологія");
                facultetRepository.save(f035);
                Facultet f052 = new Facultet(34, "052", "Політологія");
                facultetRepository.save(f052);
                Facultet f054 = new Facultet(35, "054", "Соціологія");
                facultetRepository.save(f054);
                Facultet f076 = new Facultet(36, "076", "Підприємництво");
                facultetRepository.save(f076);
                Facultet f071 = new Facultet(37, "071", "Облік і оподаткування");
                facultetRepository.save(f071);
                Facultet f201 = new Facultet(38, "201", "Агрономія");
                facultetRepository.save(f201);
                Facultet f192 = new Facultet(39, "192", "Будівництво та цивільна інженерія");
                facultetRepository.save(f192);
                Facultet f241 = new Facultet(40, "241", "Готельно-ресторанна справа");
                facultetRepository.save(f241);
                Facultet f227 = new Facultet(41, "227", "Фізична реабілітація");
                facultetRepository.save(f227);
                Facultet f017 = new Facultet(42, "017", "Фізична культура і спорт");
                facultetRepository.save(f017);
                Facultet f012 = new Facultet(43, "012", "Дошкільна освіта");
                facultetRepository.save(f012);
                Facultet f013 = new Facultet(44, "013", "Початкова освіта");
                facultetRepository.save(f013);
                Facultet f016 = new Facultet(45, "016", "Спеціальна освіта");
                facultetRepository.save(f016);
                Facultet f231 = new Facultet(46, "231", "Соціальна робота");
                facultetRepository.save(f231);
                Facultet f145 = new Facultet(47, "145", "Гідроенергетика");
                facultetRepository.save(f145);
                Facultet f153 = new Facultet(48, "153", "Мікро- та наносистемна техніка");
                facultetRepository.save(f153);
                Facultet f126 = new Facultet(49, "126", "Інформаційні системи та технології");
                facultetRepository.save(f126);
                Facultet f292 = new Facultet(50, "292", "Міжнародні економічні відносини");
                facultetRepository.save(f292);


                List<Facultet> kpiFacultets = Arrays.asList(f122, f124, f172, f131, f133, f105, f113, f125, f061, f073, f121, f143, f104, f171, f075);
                List<Facultet> dutFacultets = Arrays.asList(f121, f122, f124, f125, f073, f075, f051, f172, f124);
                List<Facultet> kneuFacultets = Arrays.asList(f073, f081, f076, f122, f051, f072, f071, f125, f292, f053, f054, f242, f076);
                List<Facultet> nubipFacultets = Arrays.asList(f051, f053, f061, f073, f075, f122, f125, f133, f081, f162, f124, f122, f201, f053);
                List<Facultet> kentuFacultets = Arrays.asList(f081, f051, f073, f292, f053, f035, f061, f075, f124, f125, f181, f121, f242, f241);
                List<Facultet> lpiFacultets= Arrays.asList(f263, f051, f073, f075, f242, f054, f292, f143, f131, f132, f035, f121, f124, f122, f125, f081, f053);
                List<Facultet> kpnuFacultets = Arrays.asList(f122, f032, f035, f061, f227, f076, f017, f013, f242, f016, f101, f231, f051, f053, f052, f091);
                List<Facultet> hpiFacultets = Arrays.asList(f101, f113, f132, f133, f145, f263, f171, f105, f113, f122, f153, f051, f061, f075, f125, f053, f054);
                List<Facultet> lnuFacultets = Arrays.asList(f121, f122, f126, f153, f051, f072, f073, f075, f076, f051, f071, f054);

                String kpiPicture = "http://ipic.su/img/img7/fs/kpi.1572474212.jpg";
                String dutPicture = "http://ipic.su/img/img7/fs/dut.1572473908.png";
                String kneyPicture = "http://ipic.su/img/img7/fs/kney.1572473968.jpg";
                String nybipPicture = "http://ipic.su/img/img7/fs/nybip.1572474034.png";
                String knteyPicture = "http://ipic.su/img/img7/fs/knteu.1572474085.jpg";
                String lpPicture = "http://ipic.su/img/img7/fs/lp.1572473729.jpg";
                String hpiPicture = "http://ipic.su/img/img7/fs/hpi.1572474301.jpg";
                String kpnyPicture = "http://ipic.su/img/img7/fs/kpny.1572474416.jpg";
                String lnyPicture = "http://ipic.su/img/img7/fs/lny.1572474590.jpg";







                List<Vyz> vyzs = Arrays.asList(
                        new Vyz(1, "КПІ", "Київський політехнічний інститут", kyiv,  kpiFacultets, "https://kpi.ua/", kpiPicture),
                        new Vyz(2, "ДУТ", "Державний університет телекомунікацій", kyiv, dutFacultets, "http://www.dut.edu.ua/ua/3-vstupniku", dutPicture),
                        new Vyz(3, "КНЕУ", "Київський національний економічний університет", kyiv, kneuFacultets, "https://kneu.edu.ua/", kneyPicture),
                        new Vyz(4, "НУБІП", "Національний університет біоресурсів і природокористування України", kyiv, nubipFacultets, "https://nubip.edu.ua/", nybipPicture),
                        new Vyz(5, "КНТЕУ", "Київський національний торгово-економічний університет", kyiv, kentuFacultets, "https://knute.edu.ua/", knteyPicture),
                        new Vyz(6, "ЛП", "Львівська політехніка", lviv, lpiFacultets, "http://lp.edu.ua/", lpPicture),
                        new Vyz(7, "ХПІ", "Харківський політехнічний інститут", kharkiv, hpiFacultets, "https://www.kpi.kharkov.ua/ukr/",hpiPicture),
                        new Vyz(8, "КПНУ", "Кам'янець-Подільський національний університет", kp, kpnuFacultets, "http://kpnu.edu.ua/",kpnyPicture),
                        new Vyz(9, "ЛНУ", "Львівський національний університет", lviv, lnuFacultets, "http://www.lnu.edu.ua/",lnyPicture));

                vyzs.forEach(vyzRepository::save);
//                Facultet botanu = new Facultet(1, "Ботани");
//                List<Facultet> facultets = new ArrayList<>();
//                facultets.add(botanu);
//
//                Facultet pacuku = new Facultet(2, "pacanu");
//                List<Facultet> facultetPacuku = new ArrayList<>();
//                facultetPacuku.add(pacuku);
//
//                facultetRepository.save(botanu);
//                facultetRepository.save(pacuku);

//                Town lviv = new Town(1,"Львів");
//                Town odessa = new Town(2,"Одеса");
//                Town kyiv = new Town(3,"Київ");
//                Town kharkiv = new Town(4,"Харків");

//                townRepository.save(lviv);
//                townRepository.save(odessa);
//                townRepository.save(kyiv);
//                townRepository.save(kharkiv);


//                List<Vyz> vyzs = Arrays.asList(new Vyz(1, "MED", odessa, facultets),
//                        new Vyz(2, "NAO", lviv,  facultets),
//                        new Vyz(3, "SHMAO", kyiv, facultets),
//                        new Vyz(4, "PUT", kyiv, facultetPacuku),
//                        new Vyz(5, "KOC", lviv, facultets),
//                        new Vyz(6, "UNI", kharkiv, facultets));
//
//                vyzs.forEach(vyzRepository::save);

            }
        };
    }
}
