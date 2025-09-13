package com.sample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reporter {

    static ExtentReports report;
    static ExtentSparkReporter spark;

    // Setup method to initialize report
    public static void setupReport() {
        report = new ExtentReports();
        spark = new ExtentSparkReporter("target/Spark.html");
        report.attachReporter(spark);
    }

    // Tear down method to flush the report
    public static void flushReport() {
        if (report != null) {
            report.flush();
        }
    }
}
