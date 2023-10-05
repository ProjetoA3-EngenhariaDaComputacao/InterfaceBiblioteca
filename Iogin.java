cd D:\Aulas_2023_02\ProjetoA3\Interface1.java; JAVA_HOME=C:\\Users cmd /c "\"D:\\Aulas_2023_02\\NetBeans-18\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.executable=C:\\Users\\bin\\java.exe -Dexec.mainClass=com.mycompany.interface1.java.login -Dexec.classpathScope=runtime -Dexec.appArgs= -Dmaven.ext.class.path=D:\\Aulas_2023_02\\NetBeans-18\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Scanning for projects...

-------------------< com.mycompany:Interface1.java >--------------------
Building Interface1.java 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.0:resources (default-resources) @ Interface1.java ---
skip non existing resourceDirectory D:\Aulas_2023_02\ProjetoA3\Interface1.java\src\main\resources

--- compiler:3.10.1:compile (default-compile) @ Interface1.java ---
Nothing to compile - all classes are up to date

--- exec:3.1.0:exec (default-cli) @ Interface1.java ---
Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException: Cannot invoke "java.net.URL.toExternalForm()" because "location" is null
	at java.desktop/javax.swing.ImageIcon.<init>(ImageIcon.java:232)
	at com.mycompany.interface1.java.login.initComponents(login.java:39)
	at com.mycompany.interface1.java.login.<init>(login.java:18)
	at com.mycompany.interface1.java.login$4.run(login.java:129)
	at java.desktop/java.awt.event.InvocationEvent.dispatch(InvocationEvent.java:318)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(EventQueue.java:773)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:720)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:714)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:400)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:87)
	at java.desktop/java.awt.EventQueue.dispatchEvent(EventQueue.java:742)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:203)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:124)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:113)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:109)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
	at java.desktop/java.awt.EventDispatchThread.run(EventDispatchThread.java:90)
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  2.072 s
Finished at: 2023-10-05T17:28:43-03:00
------------------------------------------------------------------------
