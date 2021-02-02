#!/bin/bash

sed -i "s/boutique/$DBNAME/g" boutique.java
sed -i "s/anson/$DBUSER/g" boutique.java
sed -i "s/Anson@123/$DBPASSWORD/g" boutique.java
sed -i "s/localhost/$DBHOST/g" boutique.java

cd /

java -cp .:mysql-connector-java-5.1.18-bin.jar boutique.java $pname $price
