package emerick.tp.classes.objets.partie1.example.myapp


class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor