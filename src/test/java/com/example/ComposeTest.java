package com.example;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;

/**
 * Unit test for simple App.
 */
public class ComposeTest 
{
    @Test
    public void composeTest() throws Exception
    {
        new DockerComposeContainer(new File("docker-compose.yml").getCanonicalFile())
                .withBuild(true)
                .withExposedService("hello", 80, 
                        Wait.forHttp("/index.html").withStartupTimeout(Duration.ofSeconds(60)))
                .start();

    }
    

}
