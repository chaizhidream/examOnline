(function ($) {
    /**
      * jqChart Danish Translation
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
            "Søn", "Man", "Tirs", "Ons", "Tors", "Fre", "Lør",
            "Søndag", "Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag"
        ],
        monthNames: [
            "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec",
            "Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December"
        ],
        amPm: ["", "", "", ""],
        s: function (j) { return '.' },
        masks: {
            shortDate: "d/m/yyyy",
            shortTime: "H:MM",
            longTime: "H:MM:ss"
        }
    };
})(jQuery);
