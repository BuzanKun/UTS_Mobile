package com.example.uts

object DataProvider {
    fun getBeritaById(beritaId: Int): Berita? {
        return beritaList.find { it.id == beritaId }
    }
    var beritaList = listOf(
        Berita(
            id = 1,
            image = R.drawable.persona_3_reload_icon,
            headerImage = R.drawable.persona_3_reload_bg,
            judul = "Persona 6: Everything We Know So Far",
            deskripsi = "All of the very early details we know about Atlus' inevitable Persona 5 follow-up",
            isiKonten = "With Persona 3 Reload officially in the rearview mirror, our next major slice of Persona-branded high school student simulation and turn-based dungeon battles will come via a presumed Persona 6. But when exactly will we see this next Persona game? And what will it be?\n" +
                    "\n" +
                    "In truth, we know very, very little right now, but that doesn't mean we can't take a look at some early rumours and comments from the teams over at Atlus regarding Persona's next mainline entry. So, let's run through all the brief bits of information we've learned so far about what's next for the series."
        ),
        Berita (
            id = 2,
            image = R.drawable.assassin_icon,
            headerImage = R.drawable.assassin_bg,
            judul = "Assassin's Creed Shadows Is Ditching An Iconic Franchise Feature",
            deskripsi = "Goodbye, panoramic camera.",
            isiKonten = "In Assassin's Creed Shadows, one of the franchise's most iconic features--synchronization points--will work a little differently than before.\n" +
                    "\n" +
                    "Following a cinematic reveal trailer, Ubisoft has revealed all kinds of details about the latest entry in the long-running series to IGN. The game will put players into the shoes of both a shinobi and a samurai in feudal Japan. While much of Assassin's Creed Shadows will sound familiar to fans--parkour, a large open world to explore, stealth assassinations, melee combat--there are some notable changes, particularly when it comes to filling out the game's map.\n"
        ),
        Berita (
            id = 3,
            image = R.drawable.mystbloom_icon,
            headerImage = R.drawable.mystbloom_bg,
            judul = "Bugged Valorant Mystbloom bundle gives players free wallhack",
            deskripsi = "Mystbloom skin bundle has been turning heads in Valorant, but for all the wrong reasons.",
            isiKonten = "On April 30, Riot released a sizeable patch, nerfing Cypher and Viper. Both agents had almost their entire toolkit reworked. Besides that, Riot also fixed the Split bug, which allowed players to jump at an unplayable area. However, all of that was overshadowed by a brand new Mystbloom bundle, which included pink, flowery skins. \n" +
                "\n" +
                "Now, the bundle caused some stir in the Valorant community after players noticed suspicious visuals upon equipping the gun skins. On May 2, Valorant content creator Average Jonas pointed out a severe bug that provides Mystbloom users a wallhack."
        ),
        Berita(
            id = 4,
            image = R.drawable.crosscode_icon,
            headerImage = R.drawable.crosscode_bg,
            judul = "CrossCode Review - A Lot Of Ambition",
            deskripsi = "CrossCode is an ambitious game, but its myriad parts lack cohesion.",
            isiKonten = "It's been a long, long road for CrossCode to finally hit consoles. The 16-bit throwback RPG started life as a widely praised 2012 tech demo, enjoyed a super-funded 2015 Indiegogo campaign, and then arrived on Steam in 2018. Two years later, it's hard not to feel that all this runway has caused CrossCode to be overly ambitious and complicated--even for veteran genre players. As I was sailing into my 20th hour and still trying to not second-guess my shaky strategy for the vast amount of stats that can be customized and stacked, the game was still unspooling tutorials and rolling out new wrinkles. CrossCode is a lot of game to wrap your head around, and one whose expansive menu screens and tutorials double as a mechanically overbearing strategy guide that cannot be skimmed to even start to get your bearings. Playing CrossCode can be a bit like going on a road trip without GPS: Every few miles, you have to pull over and unfold an unwieldy road atlas.\n" +
                    "\n" +
                    "CrossCode, at its heart, is not a retro-styled hollow homage to Super Nintendo titles like 1993's Secret of Mana and 1995's Chrono Trigger. Instead, it's something more like a full-throated continuation of their tradition of exploring massive worlds full of side quests, puzzles, colorful characters, and gear to collect--while also building on their thornier, more tactical contemporaries. CrossCode's fondness for this era of action role-playing games is clear out of the gate: Both the opening menu screen and introductory sequences set the tone with plaintive piano, chiming bells, and an oozing chiptune soundtrack that wouldn't be out of place on one of those \"lofi beats to relax/study to\" YouTube playlists that lean more heavily into nostalgia. The pixel art style doubles down on all this."
        ),
        Berita(
            id = 5,
            image = R.drawable.cod_icon,
            headerImage = R.drawable.cod_bg,
            judul = "Call of Duty 2024 Akan Langsung Masuk Game Pass?",
            deskripsi = "Microsoft kabarnya sudah memutuskan akan langsung melemparkan Call of Duty 2024 ke Game Pass saat rilis.",
            isiKonten = "Dengan nilai puluhan miliar USD yang sudah mereka gelontorkan untuk proses akuisisi, Activision Blizzard tentu saja otomatis menjadi salah satu nadi utama Microsoft dan divisi gaming mereka – Xbox saat ini. Secara rasional, akusisi ini seharusnya kian memperkuat posisi Xbox sebagai eksosistem gaming yang menggoda. Sayangnya, setidaknya hingga bulan Mei 2024 pada saat berita ini ditulis, akuisisi ini justru diikuti dengan lebih banyak “bencana” seperti penutupan studio dan PHK massal. Di sisi lain, Microsoft terlihat masih bingung dengan cara mereka menangani franchise raksasa dari studio yang kini dihitung sebagai first-party mereka. Namun setidaknya mereka sudah punya rencana untuk sang FPS andalan – Call of Duty.\n" +
                    "\n" +
                    "Berdasarkan laporan dari Wall Street Journal, Microsoft kabarnya sudah mengambil keputusan final soal cara mereka menangani rilis Call of Duty 2024 yang tabir misterinya akan dibuka di bulan Juni 2024 mendatang. Tidak lagi seperti di seri-seri sebelumnya, Microsoft akan langsung melempar seri terbaru Call of Duty ini ke langganan berbayar andalan mereka – Xbox Game Pass. Belum ada informasi tambahan apakah ini juga akan meliputi PC Game Pass nantinya. Tidak ada kejelasan juga apakah Game Pass akan tetap mempertahankan harga langganan Game Pass  dengan strategi ini atau tidak."
        )/*,
        Berita(
            id = 6,
            image = ,
            headerImage = ,
            judul = "",
            deskripsi = "",
            isiKonten = ""
        ),
        Berita(
            id = 7,
            image = ,
            headerImage = ,
            judul = "",
            deskripsi = "",
            isiKonten = ""
        ),
        Berita(
            id = 8,
            image = ,
            headerImage = ,
            judul = "",
            deskripsi = "",
            isiKonten = ""
        ),
        Berita(
            id = 9,
            image = ,
            headerImage = ,
            judul = "",
            deskripsi = "",
            isiKonten = ""
        ),
        Berita(
            id = 10,
            image = ,
            headerImage = ,
            judul = "",
            deskripsi = "",
            isiKonten = ""
        )*/
    )
}