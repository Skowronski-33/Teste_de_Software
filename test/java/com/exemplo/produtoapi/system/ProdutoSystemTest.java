package com.exemplo.produtoapi.system;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProdutoSystemTest {

    @LocalServerPort
    private int port;

    private WebDriver driver;
    private String baseUrl;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        baseUrl = "http://localhost:" + port;
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void deveCadastrarUmProdutoPelaInterfaceWeb() {
        // 1. Ação: Navega para a página
        driver.get(baseUrl + "/produtos");

        // 2. Ação: Preenche o formulário
        driver.findElement(By.id("nome")).sendKeys("Teclado Mecânico");
        driver.findElement(By.id("preco")).sendKeys("350.50");
        driver.findElement(By.id("quantidade")).sendKeys("25");

        // 3. Ação: Submete o formulário
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // 4. Verificação: Confere se o produto aparece na tabela
        WebElement pageContent = driver.findElement(By.tagName("body"));
        assertTrue(pageContent.getText().contains("Teclado Mecânico"));
        assertTrue(pageContent.getText().contains("350.5"));
        // --- CORREÇÃO AQUI ---
        assertTrue(pageContent.getText().contains("25"));
    }
}