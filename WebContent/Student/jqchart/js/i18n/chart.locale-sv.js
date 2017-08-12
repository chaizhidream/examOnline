(function ($) {
    /**
      * jqChart Swedish Translation
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
            "Sön", "Mån", "Tis", "Ons", "Tor", "Fre", "Lör",
            "Söndag", "Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag"
        ],
        monthNames: [
            "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec",
            "Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December"
        ],
        amPm: ["fm", "em", "FM", "EM"],
        s: function (j) { return j < 11 || j > 13 ? ['st', 'nd', 'rd', 'th'][Math.min((j - 1) % 10, 3)] : 'th' },
        masks: {
            shortDate: "m/d/yyyy",
            shortTime: "h:MM TT",
            longTime: "h:MM:ss TT"
        }
    };
})(jQuery);
