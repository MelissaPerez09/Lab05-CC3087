package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://imgur.com/Fz3YyBR.png"),
            Affirmation(R.string.affirmation2, "https://imgur.com/qjOOur1.png"),
            Affirmation(R.string.affirmation3, "https://imgur.com/1tA7Wmr.png"),
            Affirmation(R.string.affirmation4, "https://imgur.com/FDtV4gW.png"),
            Affirmation(R.string.affirmation5, "https://imgur.com/ofzqTyx.png"),
            Affirmation(R.string.affirmation6, "https://imgur.com/drK6d85.png"),
            Affirmation(R.string.affirmation7, "https://imgur.com/pTWNOv0.png"),
            Affirmation(R.string.affirmation8, "https://imgur.com/QjzFQJx.png"),
            Affirmation(R.string.affirmation9, "https://imgur.com/PI4JUqO.png"),
            Affirmation(R.string.affirmation10, "https://imgur.com/zMsAs97.png")
        )
    }
}