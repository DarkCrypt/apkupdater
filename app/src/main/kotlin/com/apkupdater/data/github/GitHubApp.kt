package com.apkupdater.data.github

data class GitHubApp(
    val packageName: String,
    val user: String,
    val repo: String,
    val extra: Regex? = null
)

val GitHubApps = listOf(
    GitHubApp("app.accrescent.client", "accrescent", "accrescent"),
    GitHubApp("org.adaway", "AdAway", "AdAway"),
    GitHubApp("com.beemdevelopment.aegis", "beemdevelopment", "Aegis"),
    GitHubApp("m.co.rh.id.a_flash_deck", "rh-id", "a-flash-deck"),
    GitHubApp("dev.ukanth.ufirewall", "ukanth", "afwall"),
    GitHubApp("de.seemoo.at_tracking_detection.release", "seemoo-lab", "AirGuard"),
    GitHubApp("com.aliucord", "Aliucord", "Aliucord"),
    GitHubApp("com.escodro.alkaa", "igorescodro", "alkaa"),
    GitHubApp("deltazero.amarok", "deltazefiro", "Amarok-Hider"),
    GitHubApp("com.amaze.filemanager", "TeamAmaze", "AmazeFileManager"),
    GitHubApp("me.hackerchick.catima", "CatimaLoyalty", "Android"),
    GitHubApp("website.leifs.delta", "Delta-Icons", "android"),
    GitHubApp("com.duckduckgo.mobile.android", "duckduckgo", "Android"),
    GitHubApp("mega.privacy.android.app", "meganz", "android"),
    GitHubApp("com.nextcloud.client", "nextcloud", "android"),
    GitHubApp("com.owncloud.android", "owncloud", "android"),
    GitHubApp("org.owntracks.android", "owntracks", "android"),
    GitHubApp("com.protonvpn.android", "ProtonVPN", "android-app"),
    GitHubApp("com.github.ashutoshgngwr.noice", "trynoice", "android-app"),
    GitHubApp("com.itsaky.androidide", "AndroidIDEOfficial", "AndroidIDE"),
    GitHubApp("com.droidheat.musicplayer", "gauravjot", "android-noad-music-player"),
    GitHubApp("com.razeeman.util.simpletimetracker", "Razeeman", "Android-SimpleTimeTracker"),
    GitHubApp("xyz.Quickdev.Animiru.mi", "Quickdesh", "Animiru"),
    GitHubApp("com.kl3jvi.animity", "kl3jvi", "animity"),
    GitHubApp("xyz.jmir.tachiyomi.mi", "aniyomiorg", "aniyomi"),
    GitHubApp("xyz.jmir.tachiyomi.mi.debug", "aniyomiorg", "aniyomi-preview"),
    GitHubApp("com.ichi2.anki", "ankidroid", "Anki-Android"),
    GitHubApp("exa.lnx.a", "EXALAB", "AnLinux-App"),
    GitHubApp("com.menny.android.anysoftkeyboard", "AnySoftKeyboard", "AnySoftKeyboard"),
    GitHubApp("org.courville.nova", "nova-video-player", "aos-AVP"),
    GitHubApp("com.apkupdater", "rumboalla", "apkupdater"),
    GitHubApp("com.standardnotes", "standardnotes", "app"),
    GitHubApp("com.xBrowserSync.android", "xbrowsersync", "app"),
    GitHubApp("org.fossify.applauncher", "FossifyOrg", "App-Launcher"),
    GitHubApp("io.github.muntashirakon.AppManager", "MuntashirAkon", "AppManager"),
    GitHubApp("so.onekey.app.wallet.dev", "OneKeyHQ", "app-monorepo"),
    GitHubApp("org.wikipedia", "wikimedia", "apps-android-wikipedia"),
    GitHubApp("cm.aptoide.pt", "Aptoide", "aptoide-client-v8"),
    GitHubApp("com.donnnno.arcticons", "Arcticons-Team", "Arcticons", contains("normal")),
    GitHubApp("com.donnnno.arcticons.you", "Arcticons-Team", "Arcticons", contains("you")),
    GitHubApp("com.donnnno.arcticons.light", "Arcticons-Team", "Arcticons", contains("black")),
    GitHubApp("com.donnnno.arcticons.daynight", "Arcticons-Team", "Arcticons", contains("dayNight")),
    GitHubApp("com.gianlu.aria2app", "devgianlu", "Aria2App"),
    GitHubApp("com.dimowner.audiorecorder", "Dimowner", "AudioRecorder"),
    GitHubApp("com.funkymuse.aurora", "FunkyMuse", "Aurora"),
    GitHubApp("io.ente.auth", "ente-io", "auth"),
    GitHubApp("me.jmh.authenticatorpro", "jamie-mh", "AuthenticatorPro"),
    GitHubApp("org.oxycblt.auxio", "OxygenCobalt", "Auxio"),
    GitHubApp("deckers.thibault.aves", "deckerst", "aves"),
    GitHubApp("org.kde.bettercounter", "albertvaka", "bettercounter"),
    GitHubApp("de.markusfisch.android.binaryeye", "markusfisch", "BinaryEye"),
    GitHubApp("com.minar.birday", "m-i-n-a-r", "birday"),
    GitHubApp("com.shadow.blackhole", "Sangwan5688", "BlackHole"),
    GitHubApp("v.blade", "vhaudiquet", "BladePlayer"),
    GitHubApp("org.blokada.origin.alarm", "blokadaorg", "blokada"),
    GitHubApp("org.fossify.calculator", "FossifyOrg", "Calculator"),
    GitHubApp("org.fossify.calendar", "FossifyOrg", "Calendar"),
    GitHubApp("org.fossify.camera", "FossifyOrg", "Camera"),
    GitHubApp("app.grapheneos.camera", "GrapheneOS", "Camera"),
    GitHubApp("com.phaseshifter.canora", "vetux", "canora"),
    GitHubApp("cgeo.geocaching", "cgeo", "cgeo"),
    GitHubApp("com.skydoves.chatgpt", "skydoves", "chatgpt-android"),
    GitHubApp("com.looker.droidify", "Droid-ify", "client"),
    GitHubApp("com.github.lamarios.clipious", "lamarios", "clipious"),
    GitHubApp("org.fossify.clock", "FossifyOrg", "Clock"),
    GitHubApp("com.bnyro.clock", "you-apps", "ClockYou"),
    GitHubApp("com.lagradost.cloudstream3", "recloudstream", "cloudstream"),
    GitHubApp("com.omelan.cofi", "rozPierog", "Cofi"),
    GitHubApp("org.fossify.contacts", "FossifyOrg", "Contacts"),
    GitHubApp("com.ferrarid.converterpro", "ferraridamiano", "ConverterNOW"),
    GitHubApp("com.akylas.documentscanner", "Akylas", "com.akylas.documentscanner"),
    GitHubApp("org.cromite.cromite", "uazo", "cromite"),
    GitHubApp("id.psw.vshlauncher", "EmiyaSyahriel", "CrossLauncher"),
    GitHubApp("com.nathanatos.Cuppa", "ncosgray", "cuppa_mobile"),
    GitHubApp("com.froxot.cuscon.foss", "MiepHD", "cuscon"),
    GitHubApp("com.brunochanrio.dangoplayeruni", "brunochanrio", "DangoPlayer"),
    GitHubApp("at.bitfire.davdroid", "bitfireAT", "davx5-ose"),
    GitHubApp("org.fossify.dialer", "FossifyOrg", "Dialer"),
    GitHubApp("com.felix.diohub", "NamanShergill", "diohub"),
    GitHubApp("com.tachibana.downloader", "TachibanaGeneralLaboratories", "download-navi"),
    GitHubApp("org.fossify.draw", "FossifyOrg", "Draw"),
    GitHubApp("me.rosuh.easywatermark", "rosuH", "EasyWatermark"),
    GitHubApp("im.vector.app", "element-hq", "element-android"),
    GitHubApp("io.element.android.x", "element-hq", "element-x-android"),
    GitHubApp("org.eu.exodus_privacy.exodusprivacy", "Exodus-Privacy", "exodus-android-app"),
    GitHubApp("eu.faircode.email", "M66B", "FairEmail"),
    GitHubApp("com.nononsenseapps.feeder", "spacecowboy", "Feeder"),
    GitHubApp("com.caydey.ffshare", "caydey", "ffshare"),
    GitHubApp("org.fossify.filemanager", "FossifyOrg", "File-Manager"),
    GitHubApp("dev.jdtech.jellyfin", "jarnedemeulemeester", "findroid"),
    GitHubApp("org.fossify.flashlight", "FossifyOrg", "Flashlight"),
    GitHubApp("com.flick", "sheeshcake", "Flickv3"),
    GitHubApp("com.flixclusive", "rhenwinch", "Flixclusive"),
    GitHubApp("dev.beamlak.flixquest", "BeamlakAschalew", "flixquest"),
    GitHubApp("app.d3rt0xx.flyffdroid", "d3rt0xx", "FlyffDroid"),
    GitHubApp("io.freetubeapp.freetube", "MarmadileManteater", "FreeTubeCordova"),
    GitHubApp("com.jonjomckay.fritter", "jonjomckay", "fritter"),
    GitHubApp("org.fossify.gallery", "FossifyOrg", "Gallery"),
    GitHubApp("com.dot.gallery", "IacobIonut01", "Gallery"),
    GitHubApp("geddit.buzl.uk", "kaangiray26", "geddit-app"),
    GitHubApp("com.gh4a", "slapperwan", "gh4a"),
    GitHubApp("com.starry.greenstash", "Pool-Of-Tears", "GreenStash"),
    GitHubApp("com.jhelum.gyawun", "jhelumcorp", "gyawun"),
    GitHubApp("com.pavlenko.Habo", "xpavle00", "Habo"),
    GitHubApp("com.aistra.hail", "aistra0528", "Hail"),
    GitHubApp("com.anandnet.harmonymusic", "anandnet", "Harmony-Music"),
    GitHubApp("com.supersuman.hymn", "supersu-man", "hymn"),
    GitHubApp("io.github.forkmaintainers.iceraven", "fork-maintainers", "iceraven-browser"),
    GitHubApp("ru.tech.imageresizershrinker", "T8RIN", "ImageToolbox"),
    GitHubApp("ml.docilealligator.infinityforreddit", "Docile-Alligator", "Infinity-For-Reddit"),
    GitHubApp("com.zionhuang.music", "z-huang", "InnerTune"),
    GitHubApp("app.simple.inure", "Hamza417", "Inure"),
    GitHubApp("pan.alexander.tordnscrypt.stable", "Gedsh", "InviZible"),
    GitHubApp("com.ivy.wallet", "Ivy-Apps", "ivy-wallet"),
    GitHubApp("org.jellyfin.mobile", "jellyfin", "jellyfin-android"),
    GitHubApp("org.jellyfin.androidtv", "jellyfin", "jellyfin-androidtv"),
    GitHubApp("com.jerboa", "dessalines", "jerboa"),
    GitHubApp("com.blockbasti.justanotherworkouttimer", "blockbasti", "just_another_workout_timer"),
    GitHubApp("keepass2android.keepass2android_nonet", "PhilippC", "keepass2android", contains("nonet")),
    GitHubApp("keepass2android.keepass2android", "PhilippC", "keepass2android", notContains("nonet")),
    GitHubApp("com.kunzisoft.keepass.free", "Kunzisoft", "KeePassDX"),
    GitHubApp("org.fossify.keyboard", "FossifyOrg", "Keyboard"),
    GitHubApp("com.crequency.kitx.mobile", "Crequency", "KitX-Mobile"),
    GitHubApp("com.chooloo.www.koler", "Chooloo", "koler"),
    GitHubApp("org.koreader.launcher", "koreader", "koreader"),
    GitHubApp("org.koitharu.kotatsu", "KotatsuApp", "Kotatsu"),
    GitHubApp("de.mm20.launcher2", "MM2-0", "Kvaesitso"),
    GitHubApp("org.fossify.launcher", "FossifyOrg", "Launcher"),
    GitHubApp("app.lawnchair", "LawnchairLauncher", "lawnchair"),
    GitHubApp("com.swordfish.lemuroid", "Swordfish90", "Lemuroid"),
    GitHubApp("com.absinthe.libchecker", "LibChecker", "LibChecker"),
    GitHubApp("de.markusfisch.android.libra", "markusfisch", "Libra"),
    GitHubApp("com.iakmds.librecamera", "iakmds", "librecamera"),
    GitHubApp("com.foobnix.pro.pdf.reader", "foobnix", "LibreraReader"),
    GitHubApp("org.proninyaroslav.libretorrent", "proninyaroslav", "libretorrent"),
    GitHubApp("com.github.libretube", "libre-tube", "LibreTube"),
    GitHubApp("com.inspiredandroid.linuxcommandbibliotheca", "SimonSchubert", "LinuxCommandLibrary"),
    GitHubApp("com.martinmimigames.littlemusicplayer", "martinmimigames", "little-music-player"),
    GitHubApp("org.localsend.localsend_app", "localsend", "localsend"),
    GitHubApp("com.f0x1d.logfox", "F0x1d", "LogFox"),
    GitHubApp("theredspy15.ltecleanerfoss", "TheRedSpy15", "LTECleanerFOSS"),
    GitHubApp("rasel.lunar.launcher", "iamrasel", "lunar-launcher"),
    GitHubApp("com.m3u.androidApp", "realOxy", "M3UAndroid"),
    GitHubApp("com.topjohnwu.magisk", "topjohnwu", "Magisk"),
    GitHubApp("net.gsantner.markor", "gsantner", "markor"),
    GitHubApp("org.joinmastodon.android", "mastodon", "mastodon-android"),
    GitHubApp("me.zhanghai.android.files", "zhanghai", "MaterialFiles"),
    GitHubApp("com.mattermost.rn", "mattermost", "mattermost-mobile"),
    GitHubApp("de.syss.MifareClassicTool", "ikarus23", "MifareClassicTool"),
    GitHubApp("jp.panta.misskeyandroidclient", "pantasystem", "Milktea"),
    GitHubApp("info.shiosyakeyakini.miria", "shiosyakeyakini-info", "miria"),
    GitHubApp("miru.miaomint", "miru-project", "miru-app"),
    GitHubApp("com.x8bit.bitwarden", "bitwarden", "mobile"),
    GitHubApp("org.thoughtcrime.securesms", "mollyim", "mollyim-android"),
    GitHubApp("com.limelight", "moonlight-stream", "moonlight-android"),
    GitHubApp("is.xyz.mpv", "mpv-android", "mpv-android"),
    GitHubApp("rocks.mucke.github", "moritz-weber", "mucke"),
    GitHubApp("org.fossify.musicplayer", "FossifyOrg", "Music-Player"),
    GitHubApp("com.iven.musicplayergo", "enricocid", "Music-Player-Go"),
    GitHubApp("com.gokadzev.musify", "gokadzev", "Musify"),
    GitHubApp("com.mhss.app.mybrain", "mhss1", "MyBrain"),
    GitHubApp("com.mirfatif.mylocation", "mirfatif", "MyLocation"),
    GitHubApp("com.starry.myne", "Pool-Of-Tears", "Myne"),
    GitHubApp("xyz.nextalone.nagram", "NextAlone", "Nagram"),
    GitHubApp("com.msob7y.namida", "namidaco", "namida"),
    GitHubApp("com.cylonid.nativealpha", "cylonid", "NativeAlphaForAndroid"),
    GitHubApp("tachiyomi.mangadex", "CarlosEsco", "Neko"),
    GitHubApp("nekox.messenger", "NekoX-Dev", "NekoX"),
    GitHubApp("com.machiav3lli.backup", "NeoApplications", "Neo-Backup"),
    GitHubApp("cz.tutislav.neodeemer", "Tutislav", "neodeemer"),
    GitHubApp("com.saggitt.omega", "NeoApplications", "Neo-Launcher"),
    GitHubApp("com.machiav3lli.fdroid", "NeoApplications", "Neo-Store"),
    GitHubApp("eu.faircode.netguard", "M66B", "NetGuard"),
    GitHubApp("org.schabi.newpipe", "TeamNewPipe", "NewPipe"),
    GitHubApp("com.omgodse.notally", "OmGodse", "Notally"),
    GitHubApp("org.fossify.notes", "FossifyOrg", "Notes"),
    GitHubApp("com.streetwriters.notesnook", "streetwriters", "notesnook"),
    GitHubApp("dev.imranr.obtainium", "ImranR98", "Obtainium"),
    GitHubApp("com.darkempire78.opencalculator", "Darkempire78", "OpenCalc"),
    GitHubApp("com.app.openlib", "dstark5", "Openlib"),
    GitHubApp("software.mdev.bookstracker", "mateusz-bak", "openreads-android"),
    GitHubApp("app.organicmaps", "organicmaps", "organicmaps"),
    GitHubApp("sh.ppy.osulazer", "ppy", "osu"),
    GitHubApp("com.arjanvlek.oxygenupdater", "oxygen-updater", "oxygen-updater"),
    GitHubApp("org.catrobat.paintroid", "Catrobat", "Paintroid"),
    GitHubApp("com.arn.scrobble", "kawaiiDango", "pano-scrobbler"),
    GitHubApp("app.grapheneos.pdfviewer", "GrapheneOS", "PdfViewer"),
    GitHubApp("app.simple.peri", "Hamza417", "Peri"),
    GitHubApp("com.perol.play.pixez", "Notsfsssf", "pixez-flutter"),
    GitHubApp("com.ismartcoding.plain", "ismartcoding", "plain-app"),
    GitHubApp("com.brouken.player", "moneytoo", "Player"),
    GitHubApp("hu.vmiklos.plees_tracker", "vmiklos", "plees-tracker"),
    GitHubApp("com.spicychair.weather", "SpicyChair", "pluvia_weather_flutter"),
    GitHubApp("com.pocket_plan.j7_003", "RayLeaf-Studios", "PocketPlan"),
    GitHubApp("com.secuso.privacyFriendlyCodeScanner", "SecUSo", "privacy-friendly-qr-scanner"),
    GitHubApp("hr.dtakac.prognoza", "davidtakac", "prognoza"),
    GitHubApp("com.prateekmedia.pstube", "prateekmedia", "pstube"),
    GitHubApp("com.utopia.pxviewr", "alphasp", "pxview"),
    GitHubApp("org.mavlink.qgroundcontrolbeta", "mavlink", "QGroundControl"),
    GitHubApp("com.lagradost.quicknovel", "LagradOst", "QuickNovel"),
    GitHubApp("net.programmierecke.radiodroid2", "segler-alex", "RadioDroid"),
    GitHubApp("com.yoshi.rain", "DarkMooNight", "Rain"),
    GitHubApp("com.minar.randomix", "m-i-n-a-r", "randomix"),
    GitHubApp("me.ash.reader", "Ashinch", "ReadYou"),
    GitHubApp("com.bnyro.recorder", "you-apps", "RecordYou"),
    GitHubApp("org.quantumbadger.redreader", "QuantumBadger", "RedRReader"),
    GitHubApp("com.celzero.bravedns", "celzero", "rethink-app"),
    GitHubApp("code.name.monkey.retromusic", "RetroMusicPlayer", "RetroMusicPlayer"),
    GitHubApp("app.rvx.android.youtube", "NoName-exe", "revanced-extended"),
    GitHubApp("app.revanced.manager.flutter", "revanced", "revanced-manager"),
    GitHubApp("it.fast4x.rimusic", "fast4x", "RiMusic"),
    GitHubApp("com.carriez.flutter_hbb", "rustdesk", "rustdesk"),
    GitHubApp("com.adilhanney.saber", "saber-notes", "saber"),
    GitHubApp("com.trisven.safenotes", "keshav-space", "safenotes"),
    GitHubApp("info.dvkr.screenstream", "dkrivoruchko", "ScreenStream"),
    GitHubApp("eu.darken.sdmse", "d4rken-org", "sdmaid-se"),
    GitHubApp("com.junkfood.seal", "JunkFood02", "Seal"),
    GitHubApp("network.loki.messenger", "oxen-io", "session-android"),
    GitHubApp("moe.shizuku.privileged.api", "RikkaApps", "Shizuku"),
    GitHubApp("com.michaldrabik.showly2", "michaldrabik", "showly-2.0"),
    GitHubApp("com.simplemobiletools.applauncher", "SimpleMobileTools", "Simple-App-Launcher"),
    GitHubApp("com.simplemobiletools.calculator", "SimpleMobileTools", "Simple-Calculator"),
    GitHubApp("com.simplemobiletools.calendar.pro", "SimpleMobileTools", "Simple-Calendar"),
    GitHubApp("com.simplemobiletools.camera", "SimpleMobileTools", "Simple-Camera"),
    GitHubApp("com.simplemobiletools.clock", "SimpleMobileTools", "Simple-Clock"),
    GitHubApp("com.simplemobiletools.contacts.pro", "SimpleMobileTools", "Simple-Contacts"),
    GitHubApp("com.simplemobiletools.dialer", "SimpleMobileTools", "Simple-Dialer"),
    GitHubApp("com.simplemobiletools.draw.pro", "SimpleMobileTools", "Simple-Draw"),
    GitHubApp("com.simplemobiletools.filemanager.pro", "SimpleMobileTools", "Simple-File-Manager"),
    GitHubApp("com.simplemobiletools.flashlight", "SimpleMobileTools", "Simple-Flashlight"),
    GitHubApp("com.simplemobiletools.gallery.pro", "SimpleMobileTools", "Simple-Gallery"),
    GitHubApp("com.simplemobiletools.keyboard", "SimpleMobileTools", "Simple-Keyboard"),
    GitHubApp("com.simplemobiletools.launcher", "SimpleMobileTools", "Simple-Launcher"),
    GitHubApp("com.simplemobiletools.musicplayer", "SimpleMobileTools", "Simple-Music-Player"),
    GitHubApp("com.simplemobiletools.notes.pro", "SimpleMobileTools", "Simple-Notes"),
    GitHubApp("com.tomfong.simpleqr", "tomfong", "simple-qr"),
    GitHubApp("com.simplemobiletools.smsmessenger", "SimpleMobileTools", "Simple-SMS-Messenger"),
    GitHubApp("com.simplemobiletools.voicerecorder", "SimpleMobileTools", "Simple-Voice-Recorder"),
    GitHubApp("chat.simplex.app", "simplex-chat", "simplex-chat"),
    GitHubApp("com.maxrave.simpmusic", "maxrave-dev", "SimpMusic"),
    GitHubApp("com.sketchware.remod", "Sketchware-Pro", "Sketchware-Pro"),
    GitHubApp("free.rm.skytube.extra", "SkyTubeTeam", "SkyTube"),
    GitHubApp("com.liskovsoft.smarttubetv", "yuliskov", "SmartTube"),
    GitHubApp("org.fossify.smsmessenger", "FossifyOrg", "SMS-Messenger"),
    GitHubApp("com.katiearose.sobriety", "KiARC", "Sobriety"),
    GitHubApp("com.artxdev.songtube", "SongTube", "SongTube-App"),
    GitHubApp("com.github.soulsearching", "enteraname74", "SoulSearching"),
    GitHubApp("com.toasterofbread.spmp", "toasterofbread", "spmp"),
    GitHubApp("com.shabinder.spotiflyer", "Shabinder", "SpotiFlyer"),
    GitHubApp("oss.krtirtho.spotube", "KRTirtho", "spotube"),
    GitHubApp("com.bobbyesp.spowlo", "BobbyESP", "Spowlo"),
    GitHubApp("com.tanasi.streamflix", "stantanasi", "streamflix"),
    GitHubApp("com.zhenxiang.superimage", "Lucchetto", "SuperImage"),
    GitHubApp("com.github.catfriend1.syncthingandroid", "Catfriend1", "syncthing-android"),
    GitHubApp("com.nutomic.syncthingandroid", "syncthing", "syncthing-android"),
    GitHubApp("eu.kanade.tachiyomi", "tachiyomiorg", "tachiyomi"),
    GitHubApp("eu.kanade.tachiyomi.az", "az4521", "TachiyomiAZ"),
    GitHubApp("eu.kanade.tachiyomi.j2k", "Jays2Kings", "tachiyomiJ2K"),
    GitHubApp("eu.kanade.tachiyomi.sy", "jobobby04", "TachiyomiSY"),
    GitHubApp("org.telegram.messenger.beta", "Telegram-FOSS-Team", "Telegram-FOSS"),
    GitHubApp("com.termux", "termux", "termux-app"),
    GitHubApp("com.fsck.k9", "thunderbird", "thunderbird-android"),
    GitHubApp("com.martinmimigames.tinymusicplayer", "martinmimigames", "tiny-music-player"),
    GitHubApp("de.moekadu.metronome", "thetwom", "toc2"),
    GitHubApp("com.yoshi.todark", "darkmoonight", "ToDark"),
    GitHubApp("com.demomiru.tokeiv2", "Sovan22", "Tokeii"),
    GitHubApp("net.kollnig.missioncontrol", "TrackerControl", "tracker-control-android"),
    GitHubApp("org.zephyrsoft.trackworktime", "mathisdt", "trackworktime"),
    GitHubApp("com.kylecorry.trail_sense", "kylecorry31", "Trail-Sense"),
    GitHubApp("com.bnyro.translate", "you-apps", "TranslateYou"),
    GitHubApp("de.grobox.liberario", "grote", "Transportr"),
    GitHubApp("de.moekadu.tuner", "thetwom", "Tuner"),
    GitHubApp("com.keylesspalace.tusky", "tuskyapp", "Tusky"),
    GitHubApp("de.tutao.tutanota", "tutao", "tutanota"),
    GitHubApp("com.perflyst.twire", "twireapp", "Twire"),
    GitHubApp("org.isoron.uhabits", "iSoron", "uhabits"),
    GitHubApp("link.unlinked", "un-linked", "unlinked"),
    GitHubApp("net.xzos.upgradeall", "DUpdateSystem", "UpgradeAll"),
    GitHubApp("com.jamal2367.urlradio", "jamal2362", "URL-Radio"),
    GitHubApp("rocks.poopjournal.vacationdays", "Crazy-Marvin", "VacationDays"),
    GitHubApp("dev.aryak.varanasi", "devaryakjha", "varanasi_mobile_app"),
    GitHubApp("app.suhasdissa.vibeyou", "you-apps", "VibeYou"),
    GitHubApp("com.crazylegend.vigilante", "FunkyMuse", "Vigilante"),
    GitHubApp("it.vfsfitvnm.vimusic", "vfsfitvnm", "ViMusic"),
    GitHubApp("org.fossify.voicerecorder", "FossifyOrg", "Voice-Recorder"),
    GitHubApp("com.Frontesque.vuetube", "VueTubeApp", "VueTube"),
    GitHubApp("org.wordpress.android", "wordpress-mobile", "WordPress-Android"),
    GitHubApp("com.xc3fff0e.xmanager", "Team-xManager", "xManager"),
    GitHubApp("com.github.andreyasadchy.xtra", "crackededed", "Xtra"),
    GitHubApp("com.deniscerri.ytdl", "deniscerri", "ytdlnis"),
    GitHubApp("com.yubico.yubioath", "Yubico", "yubioath-flutter"),
    GitHubApp("com.zulipmobile", "zulip", "zulip-mobile")
)

fun contains(text: String) = Regex("^.*$text.*\$")

fun notContains(text: String) = Regex("^((?!$text).)*\$")
