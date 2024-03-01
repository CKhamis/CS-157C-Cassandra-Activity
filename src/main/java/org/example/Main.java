package org.example;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class Main {
    public static void main(String[] args) {

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        Session session = cluster.connect("demo");

        String query = "SELECT * FROM emp";

        ResultSet result = session.execute(query);

        System.out.println(result.all());
    }
}