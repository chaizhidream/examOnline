(function ($) {
    /**
      * jqChart Polish Translation 
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
            "Nie", "Pon", "Wt", "Śr", "Cz", "Pi", "So",
            "Niedziela", "Poniedzia\u0142ek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota"
        ],
        monthNames: [
            "Sty", "Lu", "Mar", "Kwie", "Maj", "Cze", "Lip", "Sie", "Wrz", "Paź", "Lis", "Gru",
            "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"
        ],
        amPm: ["am", "pm", "AM", "PM"],
        s: function (j) { return j < 11 || j > 13 ? ['', '', '', ''][Math.min((j - 1) % 10, 3)] : '' },
        masks: {
            shortDate: "m/d/yyyy",
            shortTime: "h:MM TT",
            longTime: "h:MM:ss TT"
        }
    };
})(jQuery);