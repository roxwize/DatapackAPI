package dev.caveatemptor;

public class Main {
    public static void main(String[] args) {
        DataPack dataPack = new DataPack("TESTPACK", "Hello World!");

        Namespace helloWorld = new Namespace("TestPacK");

        Teleport teleport = new Teleport(TargetSelector.ALL, new Location(0, 100, 0));
        Function tpToSpawn = new Function("TpTo_Spawn");
        tpToSpawn.addCommand(teleport);

        helloWorld.addFunction(tpToSpawn);

        dataPack.addNamespace(helloWorld);

        dataPack.generate();
    }
}