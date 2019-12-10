== PEMBELAJARAN BUILD GRADLE

- Instal Gradle
	Gradle yang diinstal adalah gradle versi 5+
- Build Script 
	Default Groovy
- Framework
	junit
- project name & source package 
	default ("demo")


------------------------------------------------------------------
Ketika Melakukan init maka program akan menjalankan tugas wrapper terlebih dahulu, yang kemudian menghasilkan skrip wrapper gradlew dan gradlew.bat. Kemudian ia menciptakan proyek baru dengan struktur berikut:


├── build.gradle
├── gradle    					1
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── java  				2
    │   │   └── demo
    │   │       └── App.java
    │   └── resources
    └── test      				3
        ├── java
        │   └── demo
        │       └── AppTest.java
        └── resources


1. Sub project pada angka satu (gradle) pertama dijalankan untuk mengenarate wrapper files 
2. Default java source yang mana pada folder ini file java kita tersimpan
3. kemudian pada java test folder yang merupakan file java kedua yang kita akan buat bernama AppTest.java Tersimpan 


-------------------------------------------------------------------

Melakukan build pada project

langkah pertama :
1. membuat sebuah file java dengan nama App.java pada directory demo _src/main/java/demo/App.java_
	source code:
		
		package demo;

		public class App {
		    public String getGreeting() {
			return "Hello world.";
		    }

	1	    public static void main(String[] args) {   
			System.out.println(new App().getGreeting());
		    }
		}

	pada source code ini yang ditandai dengan angka 1 dipanggil oleh plugin aplikasi "run" task

2. membuat file java lainnya dengan nama AppTest.java dalam directory demo _src/test/java/demo/AppTest.java_
	source code:
		
		package demo;

		import org.junit.Test;
		import static org.junit.Assert.*;

		public class AppTest {
		    @Test public void testAppHasAGreeting() {
			App classUnderTest = new App();
			assertNotNull("app should have a greeting", classUnderTest.getGreeting());
		    }
		}

3. lalu pada terminal kita jalankan/build program dengan perintah "./gradlew build"






