(function ($) {
    /**
      * jqChart Dutch Translation
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
            "Zo", "Ma", "Di", "Wo", "Do", "Vr", "Za",
            "Zondag", "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag"
        ],
        monthNames: [
            "Jan", "Feb", "Maa", "Apr", "Mei", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
            "Januari", "Februari", "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "October", "November", "December"
        ],
        amPm: ["am", "pm", "AM", "PM"],
        s: function (b) {
            return b < 11 || b > 13 ? ["st", "nd", "rd", "th"][Math.min((b - 1) % 10, 3)] : "th"
        },
        masks: {
            shortDate: "m/d/yyyy",
            shortTime: "H:MM",
            longTime: "H:MM:ss"
        }
    };
})(jQuery);