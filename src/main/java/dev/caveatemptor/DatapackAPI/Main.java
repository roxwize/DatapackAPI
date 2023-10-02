package dev.caveatemptor.DatapackAPI;

import dev.caveatemptor.DatapackAPI.Command.Teleport;
import dev.caveatemptor.DatapackAPI.Datapack.Datapack;
import dev.caveatemptor.DatapackAPI.Function.Function;
import dev.caveatemptor.DatapackAPI.Namespace.Namespace;
import dev.caveatemptor.DatapackAPI.Target.TargetPlayer;
import dev.caveatemptor.DatapackAPI.Target.TargetSelector;
import dev.caveatemptor.DatapackAPI.Vector.Vector2;
import dev.caveatemptor.DatapackAPI.Vector.Vector3;

public class Main {
    public static void main(String[] args) {
        Datapack dataPack = new Datapack("TESTPACK", "Hello World!");

        Namespace helloWorld = new Namespace("TestPacK");

        Teleport teleport = new Teleport(TargetSelector.ALL, new Vector3(0, 100, 0));
        Function tpToSpawn = new Function("TpTo_Spawn");
        tpToSpawn.addCommand(teleport);

        Teleport tp = new Teleport(new TargetPlayer("emptor_"), new Vector3(0, 100, 0), new Vector2(60, 0));
        Function tp2 = new Function("What");
        tp2.addCommand(tp);

        helloWorld.addFunction(tpToSpawn);
        helloWorld.addFunction(tp2);

        dataPack.addNamespace(helloWorld);

        dataPack.generate();
    }
}