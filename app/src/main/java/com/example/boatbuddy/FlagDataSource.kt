package com.example.boatbuddy

class FlagDataSource {
    companion object{
        fun createDataSet(): ArrayList<FlagItem>{
            val flagList = ArrayList<FlagItem>()
            val images = arrayOf<String>("drawable/a", "drawable/b", "drawable/c", "drawable/d", "drawable/e", "drawable/f", "drawable/g", "drawable/h", "drawable/i", "drawable/j", "drawable/k", "drawable/l", "drawable/m", "drawable/n", "drawable/o", "drawable/p", "drawable/q", "drawable/r", "drawable/s", "drawable/t", "drawable/u", "drawable/v", "drawable/w", "drawable/x", "drawable/y", "drawable/z", "drawable/understood", "drawable/f0", "drawable/f1", "drawable/f2", "drawable/f3", "drawable/f4", "drawable/f5", "drawable/f6", "drawable/f7", "drawable/f8", "drawable/f9")
            val phonetics = arrayOf<String>("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu", "Understood", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
            val meanings = arrayOf<String>("I have a diver down; keep well clear at slow speed.", "I am taking in; discharging; or carrying dangerous cargo.", "Yes or affirmative.", "I am maneuvering with difficulty; keep clear.", "I am altering my course to starboard.", "I am disabled; communicate with me.", "I require a pilot.", "I have a pilot on board.", "I am altering my course to port. (International)", "I am on fire and have dangerous cargo; keep well clear of me; or I am leaking dangerous cargo.", "I wish to communicate with you.", "You should stop your vessel immediately.", "My vessel is stopped and making no way through the water.", "No or negative.", "Man overboard.", "In port: All personnel return to ship; the vessel is about to procede to sea.", "Ship meets health regulations; request clearance into port. (International)", "None. (International)", "Moving astern. (International)", "Keep clear; engaged in trawling. (International)", "You are running into danger.", "I require assistance.", "I require medical assistance.", "Stop carrying out your intentions and watch for my signals.", "I am dragging anchor. (International)", "I require a tug.", "Message is understood. Also numeric decimal point. (International)", "Numeral zero (International)", "Numeral one. (International)", "Numeral two. (International)", "Numeral three. (International)", "Numeral four. (International)", "Numeral five. (International)", "Numeral six. (International)", "Numeral seven. (International)", "Numeral eight (International)", "Numeral nine (International)")

            for (x in 0..36) {
                flagList.add(FlagItem(phonetics[x], meanings[x], images[x]))
            }
            return flagList
        }
    }
}