package com.example.boatbuddy

class LightsDataSource {
    companion object{
        fun createDataSet(): ArrayList<LightsItem>{
            val lightsList = ArrayList<LightsItem>()
            val images = arrayOf<String>("drawable/gt50m", "drawable/lt50m", "drawable/lt12m", "drawable/lt7m", "drawable/hovercraft", "drawable/sailing", "drawable/sailinglt20m", "drawable/pilot", "drawable/trawler", "drawable/fishing", "drawable/notundercomm", "drawable/restrictedinability", "drawable/underwaterops", "drawable/minesweeper", "drawable/constrainedbydraught", "drawable/towlt50mlt200m", "drawable/towlt50mgt200m", "drawable/towgt50mlt200m", "drawable/towgt50mgt200m", "drawable/anchorgt100m", "drawable/anchorgt50m", "drawable/anchorlt50m", "drawable/aground")
            val name = arrayOf<String>("Power vessel, underway, LOA > 50m", "Power vessel, underway, LOA < 50m", "Power vessel, underway, LOA < 12m", "Power vessel, underway, LOA < 7m & max. speed 7 knts", "Hovercraft, yellow light flashing", "Sailing vessel, underway", "Sailing vessel, underway, LOA < 20m", "Pilot vessel on duty", "Trawler, underway", "Fishing vessel (not trawler), underway", "Vessel not under command", "Vessel restricted in its ability to maneuver", "Underwater operations, only pass on green side", "Minesweeper", "Vessel constrained by her draft", "Towing vessel LOA < 50m, tow line < 200m", "Towing vessel LOA < 50m, tow line > 200m", "Towing vessel LOA > 50m, tow line < 200m", "Towing vessel LOA > 50m, tow line > 200m", "Vessel at anchor, LOA > 100m", "Vessel at anchor, LOA > 50m", "Vessel at anchor, LOA < 50m", "Vessel aground")

            for (x in 0..22) {
                lightsList.add(LightsItem(name[x], images[x]))
            }
            return lightsList
        }
    }
}