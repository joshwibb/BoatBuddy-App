package com.example.boatbuddy

class ShapesDataSource {
    companion object{
        fun createDataSet(): ArrayList<ShapesItem>{
            val shapesList = ArrayList<ShapesItem>()
            val images = arrayOf<String>("drawable/towing", "drawable/sailunderpower", "drawable/trawling", "drawable/fishingnottrawling", "drawable/notundercommand", "drawable/restrictedinabilityday", "drawable/underwateropsday", "drawable/minesweeperday", "drawable/constrainedbydraughtday", "drawable/anchorday", "drawable/agroundday")
            val name = arrayOf<String>("Towing over 200m astern", "Sailing boat under power", "Fishing or trawling", "Fishing, not trawling, lines out", "Vessel not under command", "Vessel restricted in her ability to maneuver", "Underwater operations or dredging, pass on diamond side", "Minesweeping, keep well clear", "Vessel constrained by her draught", "Vessel at anchor", "Vessel aground")

            for (x in 0..10) {
                shapesList.add(ShapesItem(name[x], images[x]))
            }
            return shapesList
        }
    }
}