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
        ),
        Berita(
            id = 6,
            image = R.drawable.hok_icon,
            headerImage = R.drawable.hok_bg,
            judul = "Game Honor of Kings dan Mobile Legends, Apakah Ada Kesamaan Permainan?",
            deskripsi = "Developer TiMi Studio Group dan publisher Level Infinite telah mengonfirmasi, game Honor of Kings akan melanjutkan peluncuran global pada 20 Juni 2024. Dikutip dari situs webnya, permainan ini akan tersedia antara lain di Amerika Utara, Eropa, Jepang. Game ini permainan pertarungan, tapi apakah mirip seperti Mobile Legends? ",
            isiKonten = "Game Honor of Kings dirilis oleh TiMi Studio Grup di Cina pada 2015. Permainan ini dikenal dengan desain karakter, narasi cerita, dan optimalisasi permainan yang baik, sehingga menjadi game yang banyak dimainkan. Dalam pembuatannya, pengembang berkolaborasi dengan komposer ternama seperi Hans Zimmer, Joe Hisaishi, dan Howard Shore, untuk pembuatan musik latar.\n" +
                    "\n" +
                    "Dikutip dari Game Loop, Honor of Kings menawarkan pengalaman MOBA yang menantang para pemain untuk bekerja sama mengalahkan lawan mereka. Permainannya pertempuran antara dua tim, yang masing-masing memiliki lima pemain bergerak maju di sepanjang tiga jalur menuju wilayah lawan sambil mempertahankan markas sendiri.\n" +
                    "\n" +
                    "Pada 2020, Honor of Kings mencatat ada 100 juta pengguna aktif harian. Ini membuatnya menjadi game yang banyak dimainkan di Cina dan menjadi inspirasi para pembuat konten. Pada 2022, game ini memiliki pertandingan profesional melalui Honor of Kings International Championship."
        ),
        Berita(
            id = 7,
            image = R.drawable.gamedev_icon,
            headerImage = R.drawable.gamedev_bg,
            judul = "Pertumbuhan Game Developer Profesional di Indonesia Masih 80-an, Jumlah Gamers Tembus 121 Juta Lebih\n",
            deskripsi = "Jumlah game developer di Indonesia masih mencapai 80an. Sedangkan jumlah gamers atau pemain game mencapai 121,7  juta",
            isiKonten = "Hal itu disampaikan oleh Riris Marpaung, CEO of GameCharger Studio pada wartawan di sela kegiatan pertemuan dengan game developer lokal di Ascent Premiere Hotel and Convention Malang, Jumat malam (17/5/2024). Data itu dikutip dari Kominfo pada 2021.\n" +
                    "\n" +
                    "\"Jumlah pemain game hampir separuh dari jumlah penduduk Indonesia,\" kata dia.\n" +
                    "\n" +
                    "Dan sebagian besar para pemain game di Indonesia memakai HP/perangkat mobile baru perangkat komputer. Dengan jumlah game developer profesional yang masih sedikit menjadi peluang karena potensinya besar jika melihat jumlah pemain game.\n" +
                    "\n" +
                    "Kegiatan di hotel itu diadakan oleh AMD Indonesia untuk lebih mengenalkan prosesor AMD Ryzen yang dapat menjadi pilihan utama bagi para game developer guna meningkatkan kualitas dan kinerja game yang mereka ciptakan.\n" +
                    "\n" +
                    "Ditambahkan Donnie Brahmandhika, Retail and Product Enablement Manager AMD Indonesia, pihaknya mendorong perkembangan game developer lokal supaya makin bisa berkarya.\n" +
                    "\n" +
                    "\"Sekarang kan era gaming makin meningkat. Sebenarnya yang ingin kami harapkan adalah tidak hanya membuat game untuk Indonesia tapi juga bisa buat luar. Sebab platform gaming makin banyak dan bisa dijual global,\" papar Donnie.\n" +
                    "\n" +
                    "Sehingga berpeluang bisa dinikmati masyarakat global. \"Dari AMD mendukung para game developer bisa berkarya dan tumbuh lagi penerus-penerus sebelumnya,\" tambah dia.\n" +
                    "\n" +
                    "Game developer ada di sejumlah daerah di Indonesia, termasuk Malang. Karena itu, Malang menjadi kota pertama yang dikunjungi AMD Indonesia dan menyusul ke wiiayaj lain.\n" +
                    "\n" +
                    "Menurut Riris, membuat game butuh perangkat yang mumpuni agar bisa menyamai produk game developer seperti dari Jepang, China, Australia dan Korea.\n" +
                    "\n" +
                    "\"Makanya kami ingin menunjukkan tunjukan bahwa prosesor AMD tak hanya bisa buat main games atau kerja biasa, tapi bisa lebih dari itu,\" katanya.\n" +
                    "\n" +
                    "Menurut Riris, dengan banyaknya orang bermain game menjadi peluang untuk membuat game yang perlu dimainkan. Jumlah game developer profesional yang masih 80 an masih terpusat di Jawa seperti di \n" +
                    "Bandung, Malang, Jogja, Surabaya, Jakarta, Bogor dan Tangerang.\n" +
                    "\n" +
                    "\"Penyembabnya adalah dari talentnya yang lulusan perguruan tinggi lebih memilih bekerja di bidang lain dibanding jadi game developer. Mungkin karena lebih familiar dengan brand e commerse atau perusahaan teknologi,\" jawab Riris.\n" +
                    "\n" +
                    "Maka jika melihat pasarnya yang luas dari sisi pemain, harusnya produk game meningkat. Namun bisa jadi pemain game lebih suka dengan produk luar. Namun orang luar menghargai produk Indonesia.\n"
        ),
        Berita(
            id = 8,
            image = R.drawable.helldiver_icon,
            headerImage = R.drawable.helldiver_bg,
            judul = "Helldivers 2 Game PlayStation dengan Penjualan Tercepat Sepanjang Masa",
            deskripsi = "Belum lama ini PlayStation merilis game terbarunya berjudul Helldivers 2. Katanya game ini menjadi produk mereka dengan penjualan tercepat sepanjang masa.",
            isiKonten = "Diketahui kalau Helldivers 2 terjual lebih dari 12 juta kopi. Jumlah sebanyak itu didapatkannya hanya dalam waktu tiga bulan, sejak pertama kali diluncurkan pada tanggal 8 Februari 2024 lalu.\n" +
                    "\n" +
                    "Dalam laporannya kepada investor, Sony mengatakan bahwa game shooter yang menyambangi gamer di PS5 dan PC ini melebih ekspektasi. Game garapan Arrowhead Studios tersebut diklaim mencapai tonggak penjualan yang begitu mengesankan pada 5 Mei lalu, dilansir detikINET dari IGN, Rabu (15/5/2024)."
        ),
        Berita(
            id = 9,
            image = R.drawable.pointgo_icon,
            headerImage = R.drawable.pointgo_bg,
            judul = "Banyak Peminat, Pointgo, Situs Top Up Game Berencana Ekspansi Variasi Produk",
            deskripsi = "Bagi para gamer, istilah top up sudah tidak asing lagi. Top up game dilakukan untuk membeli mata uang dalam game yang bisa digunakan untuk membeli aksesori atau keuntungan lainnya.",
            isiKonten = "Salah satu situs top up game yang populer adalah Pointgo. Situs ini menyediakan berbagai produk game seperti Mobile Legends, FreeFire, Genshin Impact, Valorant, PUBG, dan banyak lagi. Selain itu, Pointgo juga menawarkan jasa joki rank untuk berbagai game online.\n" +
                    "\n" +
                    "Tidak hanya itu, Pointgo menyediakan voucher untuk berbagai platform digital seperti Steam Wallet, Google Play, Spotify, Roblox, Vidio, dan lainnya. Pointgo bahkan menjual voucher PLN dan pulsa.\n" +
                    "\n" +
                    "Baca Juga: Pointgo Klaim Jadi Pelopor Penyedia Layanan Top Up Games\n" +
                    "\n" +
                    "Didirikan oleh Aldo Handrian pada November 2022, Pointgo bertujuan menjadi solusi bagi para gamer yang ingin mendapatkan pengalaman gaming maksimal. \"Kami ingin memastikan bahwa para gamer memiliki akses ke berbagai pilihan game yang mereka cintai,\" kata Aldo dalam siaran pers, Jumat (17/5).\n" +
                    "\n" +
                    "Dalam waktu singkat, Pointgo mengklaim telah mencatat ratusan ribu transaksi setiap bulan. Para gamer lebih memilih layanan POINTGO dibandingkan situs lain atau situs resmi karena variasi produk yang banyak dan harga yang kompetitif.\n" +
                    "\n" +
                    "Pointgo juga sering mengadakan flash sale dengan harga termurah. Proses transaksi otomatis yang cepat menjadi nilai tambah yang membuat para gamer puas.\n" +
                    "\n" +
                    "Selain fokus pada produk dan layanan, Pointgo menerapkan strategi pemasaran yang cerdas. Mereka aktif memproduksi konten menarik tentang game di platform seperti Instagram dan TikTok, yang membantu membangun komunitas online yang besar dan setia.\n" +
                    "\n" +
                    "Baca Juga: Main Game Makin Murah dengan Promo Voucher dan Cashback Pembelian Pulsa dari BRI\n" +
                    "\n" +
                    "Akun Instagram POINTGO telah memiliki 226.000 pengikut, sementara akun TikTok Pointgo mencapai lebih dari 2,7 juta pengikut. Angka ini sangat impresif untuk bisnis yang masih relatif baru.\n" +
                    "\n" +
                    "Dukungan dari influencer gamer ternama seperti ONIC Lydia, ONIC Awwah, Shannon Wong, dan lainnya, juga memperkuat reputasi Pointgo sebagai layanan yang aman dan terpercaya di industri game Indonesia.\n" +
                    "\n" +
                    "Melihat potensi pertumbuhan yang besar, Pointgo berencana untuk ekspansi variasi produk. POINTGO berniat untuk menambah berbagai produk menarik ke platform merek  agar dapat menarik lebih banyak pelanggan dan memperluas jangkauan bisnisnya.\n" +
                    "\n" +
                    "Apalagi akun Instagram dan TikTok Pointgo juga sudah memiliki followers yang cukup banyak, meskipun tergolong baru. Ini menunjukkan pertumbuhan Pointgo yang cukup signifikan di bidang digital. \n" +
                    "\n" +
                    "Baca Juga: Gandeng Perbakin, Kejuaraan Menembak Nasional Bank DKI Cup 2023 Sukses Digelar\n" +
                    "\n" +
                    "\"Oleh karena itu, kami berencana melakukan ekspansi variasi produk,” ujar Aldo.\n" +
                    "\n" +
                    "Aldo berencana untuk terus meningkatkan strategi pemasaran dan layanan pelanggan untuk mempertahankan kualitas layanan. Ekspansi ini dilakukan untuk menjadikan Pointgo menjadi situs top up game nomor satu di Indonesia. "
        ),
        Berita(
            id = 10,
            image = R.drawable.godzilla_icon,
            headerImage = R.drawable.godzilla_bg,
            judul = "Godzilla Minus One Sets Record For Most Pirated Movie of All Time! Lands First Place on Torrent Charts Followed By Dune: Part Two",
            deskripsi = "Takashi Yamazaki’s Godzilla Minus One made history by winning the first Academy Award in the 70-year-old Godzilla franchise in March 2024",
            isiKonten = "Takashi Yamazaki’s Godzilla Minus One, which made history by winning the first Academy Award in the venerable 70-year-old Godzilla franchise this year, reportedly also broke the record for the most pirated movie ever.\n" +
                    "\n" +
                    "Set in the aftermath of Japan’s defeat in World War II, Godzilla Minus One, made for a reported \$15 million, became a global phenomenon earning \$116 Million worldwide.\n" +
                    "\n" +
                    "The movie, which had a limited theatrical release in December 2023 due to low box office expectations, has ended up being the most pirated movie of all time, followed by Dune: Part Two. The data extrapolated by Torrent Freak, the go-to site for all things piracy, said the movie is the most pirated film in the chart, followed by Dune: Part Two and Arcadian."
        )
    )
}