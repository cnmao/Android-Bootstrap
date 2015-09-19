package com.beardedhen.androidbootstrap.support;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a static map of Font Awesome Icon Codes to unicode characters, and a static instance
 * of the FontAwesome typeface.
 * See the <a href="http://fortawesome.github.io/Font-Awesome/cheatsheet/">Cheatsheet</a> for icon
 * codes.
 */
public class FontAwesomeIconMap {

    private static final Map<CharSequence, CharSequence> MAP = new HashMap<>();
    private static Typeface font;
    private static final String UNKNOWN_CODE = "fa-question";

    static { // Auto-generated FA-Map from 2015-02-07
        MAP.put("fa-adjust", "\uf042");
        MAP.put("fa-adn", "\uf170");
        MAP.put("fa-align-center", "\uf037");
        MAP.put("fa-align-justify", "\uf039");
        MAP.put("fa-align-left", "\uf036");
        MAP.put("fa-align-right", "\uf038");
        MAP.put("fa-ambulance", "\uf0f9");
        MAP.put("fa-anchor", "\uf13d");
        MAP.put("fa-android", "\uf17b");
        MAP.put("fa-angellist", "\uf209");
        MAP.put("fa-angle-double-down", "\uf103");
        MAP.put("fa-angle-double-left", "\uf100");
        MAP.put("fa-angle-double-right", "\uf101");
        MAP.put("fa-angle-double-up", "\uf102");
        MAP.put("fa-angle-down", "\uf107");
        MAP.put("fa-angle-left", "\uf104");
        MAP.put("fa-angle-right", "\uf105");
        MAP.put("fa-angle-up", "\uf106");
        MAP.put("fa-apple", "\uf179");
        MAP.put("fa-archive", "\uf187");
        MAP.put("fa-area-chart", "\uf1fe");
        MAP.put("fa-arrow-circle-down", "\uf0ab");
        MAP.put("fa-arrow-circle-left", "\uf0a8");
        MAP.put("fa-arrow-circle-o-down", "\uf01a");
        MAP.put("fa-arrow-circle-o-left", "\uf190");
        MAP.put("fa-arrow-circle-o-right", "\uf18e");
        MAP.put("fa-arrow-circle-o-up", "\uf01b");
        MAP.put("fa-arrow-circle-right", "\uf0a9");
        MAP.put("fa-arrow-circle-up", "\uf0aa");
        MAP.put("fa-arrow-down", "\uf063");
        MAP.put("fa-arrow-left", "\uf060");
        MAP.put("fa-arrow-right", "\uf061");
        MAP.put("fa-arrow-up", "\uf062");
        MAP.put("fa-arrows", "\uf047");
        MAP.put("fa-arrows-alt", "\uf0b2");
        MAP.put("fa-arrows-h", "\uf07e");
        MAP.put("fa-arrows-v", "\uf07d");
        MAP.put("fa-asterisk", "\uf069");
        MAP.put("fa-at", "\uf1fa");
        MAP.put("fa-automobile", "\uf1b9");
        MAP.put("fa-backward", "\uf04a");
        MAP.put("fa-ban", "\uf05e");
        MAP.put("fa-bank", "\uf19c");
        MAP.put("fa-bar-chart", "\uf080");
        MAP.put("fa-bar-chart-o", "\uf080");
        MAP.put("fa-barcode", "\uf02a");
        MAP.put("fa-bars", "\uf0c9");
        MAP.put("fa-bed", "\uf236");
        MAP.put("fa-beer", "\uf0fc");
        MAP.put("fa-behance", "\uf1b4");
        MAP.put("fa-behance-square", "\uf1b5");
        MAP.put("fa-bell", "\uf0f3");
        MAP.put("fa-bell-o", "\uf0a2");
        MAP.put("fa-bell-slash", "\uf1f6");
        MAP.put("fa-bell-slash-o", "\uf1f7");
        MAP.put("fa-bicycle", "\uf206");
        MAP.put("fa-binoculars", "\uf1e5");
        MAP.put("fa-birthday-cake", "\uf1fd");
        MAP.put("fa-bitbucket", "\uf171");
        MAP.put("fa-bitbucket-square", "\uf172");
        MAP.put("fa-bitcoin", "\uf15a");
        MAP.put("fa-bold", "\uf032");
        MAP.put("fa-bolt", "\uf0e7");
        MAP.put("fa-bomb", "\uf1e2");
        MAP.put("fa-book", "\uf02d");
        MAP.put("fa-bookmark", "\uf02e");
        MAP.put("fa-bookmark-o", "\uf097");
        MAP.put("fa-briefcase", "\uf0b1");
        MAP.put("fa-btc", "\uf15a");
        MAP.put("fa-bug", "\uf188");
        MAP.put("fa-building", "\uf1ad");
        MAP.put("fa-building-o", "\uf0f7");
        MAP.put("fa-bullhorn", "\uf0a1");
        MAP.put("fa-bullseye", "\uf140");
        MAP.put("fa-bus", "\uf207");
        MAP.put("fa-buysellads", "\uf20d");
        MAP.put("fa-cab", "\uf1ba");
        MAP.put("fa-calculator", "\uf1ec");
        MAP.put("fa-calendar", "\uf073");
        MAP.put("fa-calendar-o", "\uf133");
        MAP.put("fa-camera", "\uf030");
        MAP.put("fa-camera-retro", "\uf083");
        MAP.put("fa-car", "\uf1b9");
        MAP.put("fa-caret-down", "\uf0d7");
        MAP.put("fa-caret-left", "\uf0d9");
        MAP.put("fa-caret-right", "\uf0da");
        MAP.put("fa-caret-square-o-down", "\uf150");
        MAP.put("fa-caret-square-o-left", "\uf191");
        MAP.put("fa-caret-square-o-right", "\uf152");
        MAP.put("fa-caret-square-o-up", "\uf151");
        MAP.put("fa-caret-up", "\uf0d8");
        MAP.put("fa-cart-arrow-down", "\uf218");
        MAP.put("fa-cart-plus", "\uf217");
        MAP.put("fa-cc", "\uf20a");
        MAP.put("fa-cc-amex", "\uf1f3");
        MAP.put("fa-cc-discover", "\uf1f2");
        MAP.put("fa-cc-mastercard", "\uf1f1");
        MAP.put("fa-cc-paypal", "\uf1f4");
        MAP.put("fa-cc-stripe", "\uf1f5");
        MAP.put("fa-cc-visa", "\uf1f0");
        MAP.put("fa-certificate", "\uf0a3");
        MAP.put("fa-chain", "\uf0c1");
        MAP.put("fa-chain-broken", "\uf127");
        MAP.put("fa-check", "\uf00c");
        MAP.put("fa-check-circle", "\uf058");
        MAP.put("fa-check-circle-o", "\uf05d");
        MAP.put("fa-check-square", "\uf14a");
        MAP.put("fa-check-square-o", "\uf046");
        MAP.put("fa-chevron-circle-down", "\uf13a");
        MAP.put("fa-chevron-circle-left", "\uf137");
        MAP.put("fa-chevron-circle-right", "\uf138");
        MAP.put("fa-chevron-circle-up", "\uf139");
        MAP.put("fa-chevron-down", "\uf078");
        MAP.put("fa-chevron-left", "\uf053");
        MAP.put("fa-chevron-right", "\uf054");
        MAP.put("fa-chevron-up", "\uf077");
        MAP.put("fa-child", "\uf1ae");
        MAP.put("fa-circle", "\uf111");
        MAP.put("fa-circle-o", "\uf10c");
        MAP.put("fa-circle-o-notch", "\uf1ce");
        MAP.put("fa-circle-thin", "\uf1db");
        MAP.put("fa-clipboard", "\uf0ea");
        MAP.put("fa-clock-o", "\uf017");
        MAP.put("fa-close", "\uf00d");
        MAP.put("fa-cloud", "\uf0c2");
        MAP.put("fa-cloud-download", "\uf0ed");
        MAP.put("fa-cloud-upload", "\uf0ee");
        MAP.put("fa-cny", "\uf157");
        MAP.put("fa-code", "\uf121");
        MAP.put("fa-code-fork", "\uf126");
        MAP.put("fa-codepen", "\uf1cb");
        MAP.put("fa-coffee", "\uf0f4");
        MAP.put("fa-cog", "\uf013");
        MAP.put("fa-cogs", "\uf085");
        MAP.put("fa-columns", "\uf0db");
        MAP.put("fa-comment", "\uf075");
        MAP.put("fa-comment-o", "\uf0e5");
        MAP.put("fa-comments", "\uf086");
        MAP.put("fa-comments-o", "\uf0e6");
        MAP.put("fa-compass", "\uf14e");
        MAP.put("fa-compress", "\uf066");
        MAP.put("fa-connectdevelop", "\uf20e");
        MAP.put("fa-copy", "\uf0c5");
        MAP.put("fa-copyright", "\uf1f9");
        MAP.put("fa-credit-card", "\uf09d");
        MAP.put("fa-crop", "\uf125");
        MAP.put("fa-crosshairs", "\uf05b");
        MAP.put("fa-css3", "\uf13c");
        MAP.put("fa-cube", "\uf1b2");
        MAP.put("fa-cubes", "\uf1b3");
        MAP.put("fa-cut", "\uf0c4");
        MAP.put("fa-cutlery", "\uf0f5");
        MAP.put("fa-dashboard", "\uf0e4");
        MAP.put("fa-dashcube", "\uf210");
        MAP.put("fa-database", "\uf1c0");
        MAP.put("fa-dedent", "\uf03b");
        MAP.put("fa-delicious", "\uf1a5");
        MAP.put("fa-desktop", "\uf108");
        MAP.put("fa-deviantart", "\uf1bd");
        MAP.put("fa-diamond", "\uf219");
        MAP.put("fa-digg", "\uf1a6");
        MAP.put("fa-dollar", "\uf155");
        MAP.put("fa-dot-circle-o", "\uf192");
        MAP.put("fa-download", "\uf019");
        MAP.put("fa-dribbble", "\uf17d");
        MAP.put("fa-dropbox", "\uf16b");
        MAP.put("fa-drupal", "\uf1a9");
        MAP.put("fa-edit", "\uf044");
        MAP.put("fa-eject", "\uf052");
        MAP.put("fa-ellipsis-h", "\uf141");
        MAP.put("fa-ellipsis-v", "\uf142");
        MAP.put("fa-empire", "\uf1d1");
        MAP.put("fa-envelope", "\uf0e0");
        MAP.put("fa-envelope-o", "\uf003");
        MAP.put("fa-envelope-square", "\uf199");
        MAP.put("fa-eraser", "\uf12d");
        MAP.put("fa-eur", "\uf153");
        MAP.put("fa-euro", "\uf153");
        MAP.put("fa-exchange", "\uf0ec");
        MAP.put("fa-exclamation", "\uf12a");
        MAP.put("fa-exclamation-circle", "\uf06a");
        MAP.put("fa-exclamation-triangle", "\uf071");
        MAP.put("fa-expand", "\uf065");
        MAP.put("fa-external-link", "\uf08e");
        MAP.put("fa-external-link-square", "\uf14c");
        MAP.put("fa-eye", "\uf06e");
        MAP.put("fa-eye-slash", "\uf070");
        MAP.put("fa-eyedropper", "\uf1fb");
        MAP.put("fa-facebook", "\uf09a");
        MAP.put("fa-facebook-f", "\uf09a");
        MAP.put("fa-facebook-official", "\uf230");
        MAP.put("fa-facebook-square", "\uf082");
        MAP.put("fa-fast-backward", "\uf049");
        MAP.put("fa-fast-forward", "\uf050");
        MAP.put("fa-fax", "\uf1ac");
        MAP.put("fa-female", "\uf182");
        MAP.put("fa-fighter-jet", "\uf0fb");
        MAP.put("fa-file", "\uf15b");
        MAP.put("fa-file-archive-o", "\uf1c6");
        MAP.put("fa-file-audio-o", "\uf1c7");
        MAP.put("fa-file-code-o", "\uf1c9");
        MAP.put("fa-file-excel-o", "\uf1c3");
        MAP.put("fa-file-image-o", "\uf1c5");
        MAP.put("fa-file-movie-o", "\uf1c8");
        MAP.put("fa-file-o", "\uf016");
        MAP.put("fa-file-pdf-o", "\uf1c1");
        MAP.put("fa-file-photo-o", "\uf1c5");
        MAP.put("fa-file-picture-o", "\uf1c5");
        MAP.put("fa-file-powerpoint-o", "\uf1c4");
        MAP.put("fa-file-sound-o", "\uf1c7");
        MAP.put("fa-file-text", "\uf15c");
        MAP.put("fa-file-text-o", "\uf0f6");
        MAP.put("fa-file-video-o", "\uf1c8");
        MAP.put("fa-file-word-o", "\uf1c2");
        MAP.put("fa-file-zip-o", "\uf1c6");
        MAP.put("fa-files-o", "\uf0c5");
        MAP.put("fa-film", "\uf008");
        MAP.put("fa-filter", "\uf0b0");
        MAP.put("fa-fire", "\uf06d");
        MAP.put("fa-fire-extinguisher", "\uf134");
        MAP.put("fa-flag", "\uf024");
        MAP.put("fa-flag-checkered", "\uf11e");
        MAP.put("fa-flag-o", "\uf11d");
        MAP.put("fa-flash", "\uf0e7");
        MAP.put("fa-flask", "\uf0c3");
        MAP.put("fa-flickr", "\uf16e");
        MAP.put("fa-floppy-o", "\uf0c7");
        MAP.put("fa-folder", "\uf07b");
        MAP.put("fa-folder-o", "\uf114");
        MAP.put("fa-folder-open", "\uf07c");
        MAP.put("fa-folder-open-o", "\uf115");
        MAP.put("fa-font", "\uf031");
        MAP.put("fa-forumbee", "\uf211");
        MAP.put("fa-forward", "\uf04e");
        MAP.put("fa-foursquare", "\uf180");
        MAP.put("fa-frown-o", "\uf119");
        MAP.put("fa-futbol-o", "\uf1e3");
        MAP.put("fa-gamepad", "\uf11b");
        MAP.put("fa-gavel", "\uf0e3");
        MAP.put("fa-gbp", "\uf154");
        MAP.put("fa-ge", "\uf1d1");
        MAP.put("fa-gear", "\uf013");
        MAP.put("fa-gears", "\uf085");
        MAP.put("fa-genderless", "\uf1db");
        MAP.put("fa-gift", "\uf06b");
        MAP.put("fa-git", "\uf1d3");
        MAP.put("fa-git-square", "\uf1d2");
        MAP.put("fa-github", "\uf09b");
        MAP.put("fa-github-alt", "\uf113");
        MAP.put("fa-github-square", "\uf092");
        MAP.put("fa-gittip", "\uf184");
        MAP.put("fa-glass", "\uf000");
        MAP.put("fa-globe", "\uf0ac");
        MAP.put("fa-google", "\uf1a0");
        MAP.put("fa-google-plus", "\uf0d5");
        MAP.put("fa-google-plus-square", "\uf0d4");
        MAP.put("fa-google-wallet", "\uf1ee");
        MAP.put("fa-graduation-cap", "\uf19d");
        MAP.put("fa-gratipay", "\uf184");
        MAP.put("fa-group", "\uf0c0");
        MAP.put("fa-h-square", "\uf0fd");
        MAP.put("fa-hacker-news", "\uf1d4");
        MAP.put("fa-hand-o-down", "\uf0a7");
        MAP.put("fa-hand-o-left", "\uf0a5");
        MAP.put("fa-hand-o-right", "\uf0a4");
        MAP.put("fa-hand-o-up", "\uf0a6");
        MAP.put("fa-hdd-o", "\uf0a0");
        MAP.put("fa-header", "\uf1dc");
        MAP.put("fa-headphones", "\uf025");
        MAP.put("fa-heart", "\uf004");
        MAP.put("fa-heart-o", "\uf08a");
        MAP.put("fa-heartbeat", "\uf21e");
        MAP.put("fa-history", "\uf1da");
        MAP.put("fa-home", "\uf015");
        MAP.put("fa-hospital-o", "\uf0f8");
        MAP.put("fa-hotel", "\uf236");
        MAP.put("fa-html5", "\uf13b");
        MAP.put("fa-ils", "\uf20b");
        MAP.put("fa-image", "\uf03e");
        MAP.put("fa-inbox", "\uf01c");
        MAP.put("fa-indent", "\uf03c");
        MAP.put("fa-info", "\uf129");
        MAP.put("fa-info-circle", "\uf05a");
        MAP.put("fa-inr", "\uf156");
        MAP.put("fa-instagram", "\uf16d");
        MAP.put("fa-institution", "\uf19c");
        MAP.put("fa-ioxhost", "\uf208");
        MAP.put("fa-italic", "\uf033");
        MAP.put("fa-joomla", "\uf1aa");
        MAP.put("fa-jpy", "\uf157");
        MAP.put("fa-jsfiddle", "\uf1cc");
        MAP.put("fa-key", "\uf084");
        MAP.put("fa-keyboard-o", "\uf11c");
        MAP.put("fa-krw", "\uf159");
        MAP.put("fa-language", "\uf1ab");
        MAP.put("fa-laptop", "\uf109");
        MAP.put("fa-lastfm", "\uf202");
        MAP.put("fa-lastfm-square", "\uf203");
        MAP.put("fa-leaf", "\uf06c");
        MAP.put("fa-leanpub", "\uf212");
        MAP.put("fa-legal", "\uf0e3");
        MAP.put("fa-lemon-o", "\uf094");
        MAP.put("fa-level-down", "\uf149");
        MAP.put("fa-level-up", "\uf148");
        MAP.put("fa-life-bouy", "\uf1cd");
        MAP.put("fa-life-buoy", "\uf1cd");
        MAP.put("fa-life-ring", "\uf1cd");
        MAP.put("fa-life-saver", "\uf1cd");
        MAP.put("fa-lightbulb-o", "\uf0eb");
        MAP.put("fa-line-chart", "\uf201");
        MAP.put("fa-link", "\uf0c1");
        MAP.put("fa-linkedin", "\uf0e1");
        MAP.put("fa-linkedin-square", "\uf08c");
        MAP.put("fa-linux", "\uf17c");
        MAP.put("fa-list", "\uf03a");
        MAP.put("fa-list-alt", "\uf022");
        MAP.put("fa-list-ol", "\uf0cb");
        MAP.put("fa-list-ul", "\uf0ca");
        MAP.put("fa-location-arrow", "\uf124");
        MAP.put("fa-lock", "\uf023");
        MAP.put("fa-long-arrow-down", "\uf175");
        MAP.put("fa-long-arrow-left", "\uf177");
        MAP.put("fa-long-arrow-right", "\uf178");
        MAP.put("fa-long-arrow-up", "\uf176");
        MAP.put("fa-magic", "\uf0d0");
        MAP.put("fa-magnet", "\uf076");
        MAP.put("fa-mail-forward", "\uf064");
        MAP.put("fa-mail-reply", "\uf112");
        MAP.put("fa-mail-reply-all", "\uf122");
        MAP.put("fa-male", "\uf183");
        MAP.put("fa-map-marker", "\uf041");
        MAP.put("fa-mars", "\uf222");
        MAP.put("fa-mars-double", "\uf227");
        MAP.put("fa-mars-stroke", "\uf229");
        MAP.put("fa-mars-stroke-h", "\uf22b");
        MAP.put("fa-mars-stroke-v", "\uf22a");
        MAP.put("fa-maxcdn", "\uf136");
        MAP.put("fa-meanpath", "\uf20c");
        MAP.put("fa-medium", "\uf23a");
        MAP.put("fa-medkit", "\uf0fa");
        MAP.put("fa-meh-o", "\uf11a");
        MAP.put("fa-mercury", "\uf223");
        MAP.put("fa-microphone", "\uf130");
        MAP.put("fa-microphone-slash", "\uf131");
        MAP.put("fa-minus", "\uf068");
        MAP.put("fa-minus-circle", "\uf056");
        MAP.put("fa-minus-square", "\uf146");
        MAP.put("fa-minus-square-o", "\uf147");
        MAP.put("fa-mobile", "\uf10b");
        MAP.put("fa-mobile-phone", "\uf10b");
        MAP.put("fa-money", "\uf0d6");
        MAP.put("fa-moon-o", "\uf186");
        MAP.put("fa-mortar-board", "\uf19d");
        MAP.put("fa-motorcycle", "\uf21c");
        MAP.put("fa-music", "\uf001");
        MAP.put("fa-navicon", "\uf0c9");
        MAP.put("fa-neuter", "\uf22c");
        MAP.put("fa-newspaper-o", "\uf1ea");
        MAP.put("fa-openid", "\uf19b");
        MAP.put("fa-outdent", "\uf03b");
        MAP.put("fa-pagelines", "\uf18c");
        MAP.put("fa-paint-brush", "\uf1fc");
        MAP.put("fa-paper-plane", "\uf1d8");
        MAP.put("fa-paper-plane-o", "\uf1d9");
        MAP.put("fa-paperclip", "\uf0c6");
        MAP.put("fa-paragraph", "\uf1dd");
        MAP.put("fa-paste", "\uf0ea");
        MAP.put("fa-pause", "\uf04c");
        MAP.put("fa-paw", "\uf1b0");
        MAP.put("fa-paypal", "\uf1ed");
        MAP.put("fa-pencil", "\uf040");
        MAP.put("fa-pencil-square", "\uf14b");
        MAP.put("fa-pencil-square-o", "\uf044");
        MAP.put("fa-phone", "\uf095");
        MAP.put("fa-phone-square", "\uf098");
        MAP.put("fa-photo", "\uf03e");
        MAP.put("fa-picture-o", "\uf03e");
        MAP.put("fa-pie-chart", "\uf200");
        MAP.put("fa-pied-piper", "\uf1a7");
        MAP.put("fa-pied-piper-alt", "\uf1a8");
        MAP.put("fa-pinterest", "\uf0d2");
        MAP.put("fa-pinterest-p", "\uf231");
        MAP.put("fa-pinterest-square", "\uf0d3");
        MAP.put("fa-plane", "\uf072");
        MAP.put("fa-play", "\uf04b");
        MAP.put("fa-play-circle", "\uf144");
        MAP.put("fa-play-circle-o", "\uf01d");
        MAP.put("fa-plug", "\uf1e6");
        MAP.put("fa-plus", "\uf067");
        MAP.put("fa-plus-circle", "\uf055");
        MAP.put("fa-plus-square", "\uf0fe");
        MAP.put("fa-plus-square-o", "\uf196");
        MAP.put("fa-power-off", "\uf011");
        MAP.put("fa-print", "\uf02f");
        MAP.put("fa-puzzle-piece", "\uf12e");
        MAP.put("fa-qq", "\uf1d6");
        MAP.put("fa-qrcode", "\uf029");
        MAP.put("fa-question", "\uf128");
        MAP.put("fa-question-circle", "\uf059");
        MAP.put("fa-quote-left", "\uf10d");
        MAP.put("fa-quote-right", "\uf10e");
        MAP.put("fa-ra", "\uf1d0");
        MAP.put("fa-random", "\uf074");
        MAP.put("fa-rebel", "\uf1d0");
        MAP.put("fa-recycle", "\uf1b8");
        MAP.put("fa-reddit", "\uf1a1");
        MAP.put("fa-reddit-square", "\uf1a2");
        MAP.put("fa-refresh", "\uf021");
        MAP.put("fa-remove", "\uf00d");
        MAP.put("fa-renren", "\uf18b");
        MAP.put("fa-reorder", "\uf0c9");
        MAP.put("fa-repeat", "\uf01e");
        MAP.put("fa-reply", "\uf112");
        MAP.put("fa-reply-all", "\uf122");
        MAP.put("fa-retweet", "\uf079");
        MAP.put("fa-rmb", "\uf157");
        MAP.put("fa-road", "\uf018");
        MAP.put("fa-rocket", "\uf135");
        MAP.put("fa-rotate-left", "\uf0e2");
        MAP.put("fa-rotate-right", "\uf01e");
        MAP.put("fa-rouble", "\uf158");
        MAP.put("fa-rss", "\uf09e");
        MAP.put("fa-rss-square", "\uf143");
        MAP.put("fa-rub", "\uf158");
        MAP.put("fa-ruble", "\uf158");
        MAP.put("fa-rupee", "\uf156");
        MAP.put("fa-save", "\uf0c7");
        MAP.put("fa-scissors", "\uf0c4");
        MAP.put("fa-search", "\uf002");
        MAP.put("fa-search-minus", "\uf010");
        MAP.put("fa-search-plus", "\uf00e");
        MAP.put("fa-sellsy", "\uf213");
        MAP.put("fa-send", "\uf1d8");
        MAP.put("fa-send-o", "\uf1d9");
        MAP.put("fa-server", "\uf233");
        MAP.put("fa-share", "\uf064");
        MAP.put("fa-share-alt", "\uf1e0");
        MAP.put("fa-share-alt-square", "\uf1e1");
        MAP.put("fa-share-square", "\uf14d");
        MAP.put("fa-share-square-o", "\uf045");
        MAP.put("fa-shekel", "\uf20b");
        MAP.put("fa-sheqel", "\uf20b");
        MAP.put("fa-shield", "\uf132");
        MAP.put("fa-ship", "\uf21a");
        MAP.put("fa-shirtsinbulk", "\uf214");
        MAP.put("fa-shopping-cart", "\uf07a");
        MAP.put("fa-sign-in", "\uf090");
        MAP.put("fa-sign-out", "\uf08b");
        MAP.put("fa-signal", "\uf012");
        MAP.put("fa-simplybuilt", "\uf215");
        MAP.put("fa-sitemap", "\uf0e8");
        MAP.put("fa-skyatlas", "\uf216");
        MAP.put("fa-skype", "\uf17e");
        MAP.put("fa-slack", "\uf198");
        MAP.put("fa-sliders", "\uf1de");
        MAP.put("fa-slideshare", "\uf1e7");
        MAP.put("fa-smile-o", "\uf118");
        MAP.put("fa-soccer-ball-o", "\uf1e3");
        MAP.put("fa-sort", "\uf0dc");
        MAP.put("fa-sort-alpha-asc", "\uf15d");
        MAP.put("fa-sort-alpha-desc", "\uf15e");
        MAP.put("fa-sort-amount-asc", "\uf160");
        MAP.put("fa-sort-amount-desc", "\uf161");
        MAP.put("fa-sort-asc", "\uf0de");
        MAP.put("fa-sort-desc", "\uf0dd");
        MAP.put("fa-sort-down", "\uf0dd");
        MAP.put("fa-sort-numeric-asc", "\uf162");
        MAP.put("fa-sort-numeric-desc", "\uf163");
        MAP.put("fa-sort-up", "\uf0de");
        MAP.put("fa-soundcloud", "\uf1be");
        MAP.put("fa-space-shuttle", "\uf197");
        MAP.put("fa-spinner", "\uf110");
        MAP.put("fa-spoon", "\uf1b1");
        MAP.put("fa-spotify", "\uf1bc");
        MAP.put("fa-square", "\uf0c8");
        MAP.put("fa-square-o", "\uf096");
        MAP.put("fa-stack-exchange", "\uf18d");
        MAP.put("fa-stack-overflow", "\uf16c");
        MAP.put("fa-star", "\uf005");
        MAP.put("fa-star-half", "\uf089");
        MAP.put("fa-star-half-empty", "\uf123");
        MAP.put("fa-star-half-full", "\uf123");
        MAP.put("fa-star-half-o", "\uf123");
        MAP.put("fa-star-o", "\uf006");
        MAP.put("fa-steam", "\uf1b6");
        MAP.put("fa-steam-square", "\uf1b7");
        MAP.put("fa-step-backward", "\uf048");
        MAP.put("fa-step-forward", "\uf051");
        MAP.put("fa-stethoscope", "\uf0f1");
        MAP.put("fa-stop", "\uf04d");
        MAP.put("fa-street-view", "\uf21d");
        MAP.put("fa-strikethrough", "\uf0cc");
        MAP.put("fa-stumbleupon", "\uf1a4");
        MAP.put("fa-stumbleupon-circle", "\uf1a3");
        MAP.put("fa-subscript", "\uf12c");
        MAP.put("fa-subway", "\uf239");
        MAP.put("fa-suitcase", "\uf0f2");
        MAP.put("fa-sun-o", "\uf185");
        MAP.put("fa-superscript", "\uf12b");
        MAP.put("fa-support", "\uf1cd");
        MAP.put("fa-table", "\uf0ce");
        MAP.put("fa-tablet", "\uf10a");
        MAP.put("fa-tachometer", "\uf0e4");
        MAP.put("fa-tag", "\uf02b");
        MAP.put("fa-tags", "\uf02c");
        MAP.put("fa-tasks", "\uf0ae");
        MAP.put("fa-taxi", "\uf1ba");
        MAP.put("fa-tencent-weibo", "\uf1d5");
        MAP.put("fa-terminal", "\uf120");
        MAP.put("fa-text-height", "\uf034");
        MAP.put("fa-text-width", "\uf035");
        MAP.put("fa-th", "\uf00a");
        MAP.put("fa-th-large", "\uf009");
        MAP.put("fa-th-list", "\uf00b");
        MAP.put("fa-thumb-tack", "\uf08d");
        MAP.put("fa-thumbs-down", "\uf165");
        MAP.put("fa-thumbs-o-down", "\uf088");
        MAP.put("fa-thumbs-o-up", "\uf087");
        MAP.put("fa-thumbs-up", "\uf164");
        MAP.put("fa-ticket", "\uf145");
        MAP.put("fa-times", "\uf00d");
        MAP.put("fa-times-circle", "\uf057");
        MAP.put("fa-times-circle-o", "\uf05c");
        MAP.put("fa-tint", "\uf043");
        MAP.put("fa-toggle-down", "\uf150");
        MAP.put("fa-toggle-left", "\uf191");
        MAP.put("fa-toggle-off", "\uf204");
        MAP.put("fa-toggle-on", "\uf205");
        MAP.put("fa-toggle-right", "\uf152");
        MAP.put("fa-toggle-up", "\uf151");
        MAP.put("fa-train", "\uf238");
        MAP.put("fa-transgender", "\uf224");
        MAP.put("fa-transgender-alt", "\uf225");
        MAP.put("fa-trash", "\uf1f8");
        MAP.put("fa-trash-o", "\uf014");
        MAP.put("fa-tree", "\uf1bb");
        MAP.put("fa-trello", "\uf181");
        MAP.put("fa-trophy", "\uf091");
        MAP.put("fa-truck", "\uf0d1");
        MAP.put("fa-try", "\uf195");
        MAP.put("fa-tty", "\uf1e4");
        MAP.put("fa-tumblr", "\uf173");
        MAP.put("fa-tumblr-square", "\uf174");
        MAP.put("fa-turkish-lira", "\uf195");
        MAP.put("fa-twitch", "\uf1e8");
        MAP.put("fa-twitter", "\uf099");
        MAP.put("fa-twitter-square", "\uf081");
        MAP.put("fa-umbrella", "\uf0e9");
        MAP.put("fa-underline", "\uf0cd");
        MAP.put("fa-undo", "\uf0e2");
        MAP.put("fa-university", "\uf19c");
        MAP.put("fa-unlink", "\uf127");
        MAP.put("fa-unlock", "\uf09c");
        MAP.put("fa-unlock-alt", "\uf13e");
        MAP.put("fa-unsorted", "\uf0dc");
        MAP.put("fa-upload", "\uf093");
        MAP.put("fa-usd", "\uf155");
        MAP.put("fa-user", "\uf007");
        MAP.put("fa-user-md", "\uf0f0");
        MAP.put("fa-user-plus", "\uf234");
        MAP.put("fa-user-secret", "\uf21b");
        MAP.put("fa-user-times", "\uf235");
        MAP.put("fa-users", "\uf0c0");
        MAP.put("fa-venus", "\uf221");
        MAP.put("fa-venus-double", "\uf226");
        MAP.put("fa-venus-mars", "\uf228");
        MAP.put("fa-viacoin", "\uf237");
        MAP.put("fa-video-camera", "\uf03d");
        MAP.put("fa-vimeo-square", "\uf194");
        MAP.put("fa-vine", "\uf1ca");
        MAP.put("fa-vk", "\uf189");
        MAP.put("fa-volume-down", "\uf027");
        MAP.put("fa-volume-off", "\uf026");
        MAP.put("fa-volume-up", "\uf028");
        MAP.put("fa-warning", "\uf071");
        MAP.put("fa-wechat", "\uf1d7");
        MAP.put("fa-weibo", "\uf18a");
        MAP.put("fa-weixin", "\uf1d7");
        MAP.put("fa-whatsapp", "\uf232");
        MAP.put("fa-wheelchair", "\uf193");
        MAP.put("fa-wifi", "\uf1eb");
        MAP.put("fa-windows", "\uf17a");
        MAP.put("fa-won", "\uf159");
        MAP.put("fa-wordpress", "\uf19a");
        MAP.put("fa-wrench", "\uf0ad");
        MAP.put("fa-xing", "\uf168");
        MAP.put("fa-xing-square", "\uf169");
        MAP.put("fa-yahoo", "\uf19e");
        MAP.put("fa-yelp", "\uf1e9");
        MAP.put("fa-yen", "\uf157");
        MAP.put("fa-youtube", "\uf167");
        MAP.put("fa-youtube-play", "\uf16a");
        MAP.put("fa-youtube-square", "\uf166");
    }

    /**
     * Looks up the unicode character for a FontAwesome Icon Code
     *
     * @param iconCode a FontAwesome Icon Code
     * @return the unicode character or a question mark if the FA code wasn't found
     */
    public static CharSequence getUnicode(CharSequence iconCode) {
        CharSequence unicode = MAP.get(iconCode);
        return (unicode == null) ? MAP.get(UNKNOWN_CODE) : unicode;
    }

    /**
     * Retrieves a static instance of the FontAwesome typeface
     *
     * @param context the current context
     * @return a static instance of the FontAwesome typeface
     */
    public static Typeface getFont(Context context) {
        if (font == null) {
            try {
                font = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
            }
            catch (Exception e) {
                Log.e("BButton", "Could not get typeface because " + e.getMessage());
                font = Typeface.DEFAULT;
            }
        }
        return font;
    }

}
