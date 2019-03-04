# spring-mutual-authetication-poc
POC for mutual authentication where we are using 2 independent services to mutually communicate with each other using self signed certificates"

Steps followed:
1. Generate the self signed certificates for service1 and export the certificate

keytool -genkey -alias MyServer -keyalg RSA -validity 1825 -keystore "D:\keys\server\MyServer.jks" -storetype JKS -dname "CN=myserver.com,OU=wipro,O=wipro,L=kol,ST=wb,C=ind" -keypass password -storepass password


keytool -exportcert -alias MyServer -keystore "D:\keys\server\MyServer.jks" -file "D:\keys\server\MyServer.cer"

2. Generate the self signed certificates for service2 and export the certificate

keytool -genkey -alias MyClient -keyalg RSA -validity 1825 -keystore "D:\keys\client\MyClient.jks" -storetype JKS -dname "CN=client.com,OU=visa,O=visa,L=us,ST=austin,C=as" -keypass password -storepass password

keytool -exportcert -alias MyClient -keystore "D:\keys\client\MyClient.jks" -file "D:\keys\client\MyClient.cer"

3. Add the certificates in the mutual trusted stores

keytool -importcert -alias MyServer -keystore "D:\keys\client\MyClient.jks" -file "D:\keys\server\MyServer.cer"
keytool -importcert -alias MyClient -keystore "D:\keys\server\MyServer.jks" -file "D:\keys\client\MyClient.cer"
