/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft II-1 E
* Date: 2023-11-24
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }
}
