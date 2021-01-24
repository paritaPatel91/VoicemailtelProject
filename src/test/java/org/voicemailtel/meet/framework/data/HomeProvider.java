package org.voicemailtel.meet.framework.data;

import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.List;

public class HomeProvider {

    @DataProvider(name = "demoProvider")
    public Iterator<Object[]> getRequestDemodata() {
        List<Object[]> requestDemo = ExcelReader.getDataFromSheet("RequestDemo", true);
        return requestDemo.listIterator();


    }

    @DataProvider
    public Iterator<Object[]> fanFactsProvider() {
        List<Object[]> requestDemo = ExcelReader.getDataFromSheet("FunFacts", true);
        return requestDemo.listIterator();


    }
}