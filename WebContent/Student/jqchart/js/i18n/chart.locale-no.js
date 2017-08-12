(function ($) {
    /**
      * jqChart Norwegian Translation
      * http://www.jqchart.com/
      * 
      * In order to use a particular language pack, you need to include the javascript language
      * pack to the head of your page, after the jQuery library reference (since language
      * packs depend on jQuery) and after referencing the jqChart javascript file.
      * 
      * <script src="../js/jquery.min.js" type="text/javascript"></script>
      * <script src="../js/jquery.jqChart.min.js" type="text/javascript"></script>
      * <script src="../js/i18n/chart.locale-xx.js" type="text/javascript"></script>
      **/
    $.jqChartDateFormat = {
        dayNames: [
            "sø.", "ma.", "ti.", "on.", "to.", "fr.", "lø.",
            "Søndag", "Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag"
        ],
        monthNames: [
            "jan.", "feb.", "mars", "april", "mai", "juni", "juli", "aug.", "sep.", "okt.", "nov.", "des.",
            "januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember"
        ],
        amPm: ["", "", "", ""],
        s: function (b) { return "." },
        masks: {
            shortDate: "d.m.yyyy",
            shortTime: "HH:MM",
            longTime: "HH:MM:ss"
        }
    };
})(jQuery);
