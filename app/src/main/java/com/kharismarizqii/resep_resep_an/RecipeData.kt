package com.kharismarizqii.resep_resep_an

object RecipeData {
    private val recipeNames = arrayOf(
        "Ayam Panggang Saus Jamur Ala Masako",
        "Bakwan Tahu Udang Ala Sajiku",
        "Ayam Goreng Lengkuas Sajiku",
        "Sup Iga Sapi Korea Ala Masako",
        "Bihun Kuah Tom Yum Ala AJI‑NO‑MOTO",
        "Udang Saus Lada Hitam Ala SAORI"
    )

    private val recipeImage = arrayOf(
        "https://www.dapurumami.com/uploads/recipe/AnvdL/thumb_APSJ_940x576px.jpg",
        "https://www.dapurumami.com/uploads/recipe/Yuo3X/thumb_BTU-Cover_940x576px.jpg",
        "https://www.dapurumami.com/uploads/recipe/WJYla/Ayam%20Goreng%20Lengkuas%20ala%20Sajiku-2.jpg",
        "https://www.dapurumami.com/uploads/recipe/LZmZH/thumb_SIS-Cover_940x576px.jpg",
        "https://www.dapurumami.com/uploads/recipe/HrteP/thumb_BKTY.jpg",
        "https://www.dapurumami.com/uploads/recipe/xFSxJ/thumb_20201104.jpg"
    )

    private val recipeRating = arrayOf(
        4.0,
        4.5,
        5.0,
        5.0,
        3.0,
        4.2
    )

    private val recipeIngredients = arrayOf(
        "700 gr Ayam fillet\n" +
                "100 gr jamur kancing\n" +
                "1/2 bks Masako Rasa Ayam 10 gr\n" +
                "350 ml Susu cair\n" +
                "1 sdm Daun peterseli cincang\n" +
                "1/2 sdt Merica hitam\n" +
                "4 sdm Minyak goreng",

        "80 gr Tahu putih\n" +
                "50 gr Udang cincang\n" +
                "2 sdm Kacang polong\n" +
                "20 gr Wortel\n" +
                "1 bks Sajiku Tepung Bumbu Bakwan Crispy 90gr\n" +
                "500 ml Minyak goreng\n" +
                "130 ml Air putih",

        "1 ekor ayam, berat 1 kg, potong 8\n" +
                "3 siung bawang putih\n" +
                "1 sdm biji ketumbar, sangrai\n" +
                "5 btr kemiri, sangrai\n" +
                "2 cm kunyit, kupas dan bakar hingga berubah warna\n" +
                "1 cm jahe, kupas\n" +
                "4 lbr daun salam\n" +
                "2 btg serai, memarkan\n" +
                "100 gr Lengkuas, cuci bersih, parut kasar berikut kulitnya\n" +
                "1 bks Sajiku Bumbu Ayam Goreng\n" +
                "200 ml of air\n" +
                "1/4 sdt merica bubuk\n" +
                "Minyak secukupnya",

        "250 gr  Iga sapi rebus\n" +
                "100 gr Soun rebus\n" +
                "40 gr Jamur enoki\n" +
                "80 gr Lobak\n" +
                "1 bks Masako® Rasa Sapi 10 gr\n" +
                "1 bh Bawang bombay\n" +
                "2 siung Bawang putih\n" +
                "1 btg Daun bawang\n" +
                "1 ruas Jahe\n" +
                "800 ml Air\n" +
                "3 sdm Minyak goreng",

        "100 gr Bihun\n" +
                "8 bh Bakso ikan\n" +
                "50 gr Sawi hijau\n" +
                "30 gr Tauge\n" +
                "1 sdt AJI-NO-MOTO®\n" +
                "5 sdm Air jeruk nipis\n" +
                "1 btg Sereh\n" +
                "8 lbr Daun jeruk\n" +
                "1 sdm Garam\n" +
                "40 gr Gula\n" +
                "700 ml Air\n" +
                "2 sdm Mi\n" +
                "4 bh Cabai merah keriting\n" +
                "50 ml Air",

        "250 gr Udang galah\n" +
                "1 bks SAORI® Saus Lada Hitam\n" +
                "1/2 bh Bawang bombay\n" +
                "3 sdm Minyak goreng"

    )

    private val recipeGuide = arrayOf(
        "Langkah 1\n" +
                "Iris jamur kancing dan potong dadu ayam fillet. Sisihkan.\n" +
                "\n" +
                "Langkah 2\n" +
                "Panaskan minyak goreng, masukkan ayam fillet, panggang hingga berwarna kecoklatan.\n" +
                "\n" +
                "Langkah 3\n" +
                "Tambahkan jamur kancing, aduk rata.\n" +
                "\n" +
                "Langkah 4\n" +
                "Masukkan susu cair, daun peterseli cincang, 1/2 bungkus Masako Rasa Ayam, dan merica hitam. Aduk rata dan masak hingga matang.",

        "Langkah 1\n" +
                "\n" +
                "Potong wortel bentuk dadu kecil, hancurkan tahu menggunakan garpu, sisihkan\n" +
                "\n" +
                "Langkah 2\n" +
                "\n" +
                "Campurkan Sajiku Tepung Bumbu Bakwan Crispy dengan air, aduk rata\n" +
                "\n" +
                "Langkah 3\n" +
                "\n" +
                "Masukkan wortel, tahu, udang cincang, dan kacang polong, aduk rata\n" +
                "\n" +
                "Langkah 4\n" +
                "\n" +
                "Panaskan minyak goreng, masukkan adonan, goreng hingga matang dan berwarna kuning keemasan",

        "Langkah 1\n" +
                "Haluskan bawang putih, biji ketumbar, kemiri, kunyit dan jahe.\n" +
                "\n" +
                "Langkah 2\n" +
                "Panaskan minyak dalam wajan dengan api sedang. Tumis bumbu halus hingga harum, tambahkan daun salam, serai dan setengah dari lengkuas parut. Tumis kembali hingga bumbu matang. Tambahkan garam, lada dan sedikit air.\n" +
                "\n" +
                "Langkah 3\n" +
                "Masukkan potongan ayam, air, merica bubuk dan Sajiku Ayam Goreng. Aduk rata dan masak (ungkep) dengan api kecil hingga ayam matang dan bumbu surut. Bolak-balik ayam sesekali. Apabila perlu, tambahkan air selama pemasakan.\n" +
                "\n" +
                "Langkah 4\n" +
                "Angkat ayam, tiriskan, dan tinggalkan sisa bumbu dalam wajan. Tambahkan sisa parutan lengkuas ke dalam bumbu. Masak kembali selama 5 menit.\n" +
                "\n" +
                "Langkah 5\n" +
                "Panaskan minyak yang cukup untuk menggoreng ayam di dalam wajan bersih. Goreng ayam hingga kematangan dan warna yang diinginkan. Goreng sisa bumbu di dalam minyak sambil diaduk hingga mengering. Angkat dan tiriskan.\n" +
                "\n" +
                "Langkah 6\n" +
                "Sajikan ayam goreng dan taburan bumbu lengkuas kering dengan nasi uduk, tempe dan tahu, sambal dan lalapan.",

        "Langkah 1\n" +
                "\n" +
                "Iris-iris bawang bombay, bawang putih, daun bawang , dan lobak , geprek jahe, sisihkan.\n" +
                "\n" +
                "Langkah 2\n" +
                "\n" +
                "Panaskan minyak goreng, tumis bawang putih, bawang bombay , jahe dan daun bawang hingga harum.\n" +
                "\n" +
                "Langkah 3\n" +
                "\n" +
                "Masukkan iga sapi, lobak, dan air, aduk rata, masak hingga mendidih.\n" +
                "\n" +
                "Langkah 4\n" +
                "\n" +
                "Tambahkan Masako® Rasa Sapi, jamur enoki, soun, aduk sebentar, angkat dan sajikan.",

        "Langkah 1\n" +
                "\n" +
                "Potong sawi hijau, haluskan cabai merah keriting dan air 50 ml , sisihkan.\n" +
                "\n" +
                "Langkah 2\n" +
                "\n" +
                "Panaskan minyak goreng, tumis bumbu halus hingga harum.\n" +
                "\n" +
                "Langkah 3\n" +
                "\n" +
                "Masukkan 700 ml air, air jeruk nipis , gula, sereh, daun jeruk, AJI‑NO‑MOTO®, dan garam, masak hingga mendidih.\n" +
                "\n" +
                "Langkah 4\n" +
                "\n" +
                "Tambahkan bakso ikan, sawi hijau, tauge, dan bihun, aduk sebentar, angkat dan sajikan.",

        "Langkah 1\n" +
                "\n" +
                "Iris bawang bombay , sisihkan\n" +
                "\n" +
                "Langkah 2\n" +
                "\n" +
                "Panaskan minyak goreng, tumis bawang bombay hingga layu\n" +
                "\n" +
                "Langkah 3\n" +
                "\n" +
                "Masukkan udang\n" +
                "\n" +
                "Langkah 4\n" +
                "\n" +
                "Tambahkan SAORI® Saus Lada Hitam , aduk rata, masak hingga matang, angkat dan sajikan."

    )

    val listData: ArrayList<Recipe>
        get() {
            val list = arrayListOf<Recipe>()
            for (position in recipeNames.indices) {
                val recipe = Recipe(
                    recipeNames[position],
                    recipeImage[position],
                    recipeRating[position],
                    recipeIngredients[position],
                    recipeGuide[position]
                    )
                list.add(recipe)
            }
            return list
        }
}