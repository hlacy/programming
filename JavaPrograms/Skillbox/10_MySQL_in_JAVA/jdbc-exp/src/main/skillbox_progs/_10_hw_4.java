

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import java.io.File;

public class _10_hw_4 {

    public static final String SCRIPT_FILE = "export.sql";

//    private static SchemaExport getSchemaExport(){
//        SchemaExport schemaExport = new SchemaExport();
//        File outFile = new File(SCRIPT_FILE);
//        String outputFilePath = outFile.getAbsolutePath();
//
//        schemaExport.setDelimiter(";");
//        schemaExport.setOutputFile(outputFilePath);
//
//        schemaExport.setHaltOnError(false);
//
//        return schemaExport;
//    }

    public static void createTable(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
//        SchemaExport export = getSchemaExport();

        System.out.println("Creating...");
        createTable();
    }

}
