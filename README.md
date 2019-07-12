# bootreact
Spring boot with react as an attempt to package and deploy both front end and backend components together for 
simplification of infrastructure.

## Package and deploy
| Package | Command | 
| :---         |     :---:      |
| Package and run backend as jar   | `mvn clean package && java -jar target/bootreact.jar`     |
| Package and run backend and frontend as jar  | `mvn clean package -Pfrontend,jar && java -jar target/bootreact.jar`     |
| Package backend as war     | `mvn clean package -Pwar`       |
| Package backend and frontend as war     | `mvn clean package -Pfrontend,war`       |

## Skipping front end executions
`mvn clean package -Pwar -Dskip.npm`