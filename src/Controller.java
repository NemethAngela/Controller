/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft II-1 E
* Date: 2023-11-24
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

public class Controller implements IControllable{

    @Override
    public void start() {
        System.out.println("The controller started.");
    }

    @Override
    public void stop() {
        System.out.println("The controller stoped.");
    }

    @Override
    public void restart() {
        System.out.println("The controller has restarted.");
    }
    
}
