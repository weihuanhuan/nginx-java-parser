package com.github.odiszapc.nginxparser;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ComplexLuaTest extends ParseTestBase {
    @Test
    public void testC1() throws Exception {
        NgxConfig conf = parse("complexlua/nginx.conf");

        NgxParam luaInit = conf.findParam("http", "init_by_lua");
        NgxBlock ifBlock = conf.findIfBlock("http", "server","location","if");
        NgxBlock luaWorker = conf.findLuaBlock("http", "init_worker_by_lua_block");
        List<NgxEntry> luaWorkerAll = conf.findAll(NgxLuaBlock.class, "http", "init_worker_by_lua_block");

        System.out.println(luaInit);
        System.out.println(ifBlock);
        System.out.println(luaWorker);
        System.out.println(luaWorkerAll);

        Path path = Paths.get("F:/JetBrains/IntelliJ IDEA/nginx-java-parser/src/test/resources", "complexlua", "nginx-dump.conf");
        Path absolutePath = path.toAbsolutePath();

        if (absolutePath.toFile().exists()) {
            boolean delete = absolutePath.toFile().delete();
            System.out.println(String.format("delete %s = %s", absolutePath, delete));
        }
        NgxDumper dumper = new NgxDumper(conf);
        dumper.dumpToFile(absolutePath);

        NgxConfig confDump = parse("complexlua/nginx-dump.conf");
        Path path2 = Paths.get("F:/JetBrains/IntelliJ IDEA/nginx-java-parser/src/test/resources", "complexlua", "nginx-dump-dump.conf");
        Path absolutePath2 = path2.toAbsolutePath();

        if (absolutePath2.toFile().exists()) {
            boolean delete = absolutePath2.toFile().delete();
            System.out.println(String.format("delete %s = %s", absolutePath, delete));
        }
        NgxDumper dumper2 = new NgxDumper(confDump);
        dumper2.dumpToFile(absolutePath2);
    }
}
