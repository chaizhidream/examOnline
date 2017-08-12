(function ($) {
    /**
      * jqChart Italian Translation
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
            "Dom", "Lun", "Mar", "Mer", "Gio", "Ven", "Sab",
            "Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"
        ],
        monthNames: [
            "Gen", "Feb", "Mar", "Apr", "Mag", "Gui", "Lug", "Ago", "Set", "Ott", "Nov", "Dic",
            "Genneio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Movembre", "Dicembre"
        ],
        amPm: ["am", "pm", "AM", "PM"],
        s: function (b) { return b < 11 || b > 13 ? ["st", "nd", "rd", "th"][Math.min((b - 1) % 10, 3)] : "th" },
        masks: {
            shortDate: "m/d/yyyy",
            shortTime: "h:MM TT",
            longTime: "h:MM:ss TT"
        }
    };
})(jQuery);