$(document).ready(function () {
            var background = {
                type: 'linearGradient',
                x0: 0,
                y0: 0,
                x1: 0,
                y1: 1,
                colorStops: [{ offset: 0, color: '#d2e6c9' },
                             { offset: 1, color: 'white'}]
            };
            $('#jqChart').jqChart({
                title: { text: 'Axis Settings' },//图表标题
                border: { strokeStyle: '#6ba851' },//边线颜色
                background: background,/*背景渐变色的调整*/
                animation: { duration: 1 },//动画效果
                /*crosshairs: {
                      enabled: true, // specifies whether the crosshairs are visible
                      snapToDataPoints: true, // specifies whether the crosshairs span to data points
                      hLine: { visible: true, strokeStyle: 'red' }, // horizontal line options
                      vLine: { visible: true, strokeStyle: 'red' } // vertical line options
                 },//十字准线样式修改*/
                 /* paletteColors :{
                          type: 'default', // default, grayscale, customColors
                          customColors : undefined
                  },//t调色板*/
                  /*legend: {//标注的一些样式修改
                      title: { margin: 0 }, // legend title
                      border: { 
                                padding: 2, 
                                strokeStyle: 'grey', 
                                cornerRadius: 6 
                              }, // legend border
                      font: '12px sans-serif', // item text font
                      textFillStyle: 'black',  // item text color
                      textLineWidth: 0, // item text border line width
                      textStrokeStyle : undefined,  // item text border color
                      background: undefined, // legend background
                      margin: 4, // legend margings
                      visible : true // specifies if the legend is visible
                 },*/
                axes: [/*此处是对轴线的一些优化*/
                        {
                            location: 'left',
                            minimum: 10,
                            maximum: 700,
                            interval: 100
                        }
                      ],
                series: [
                            {
                                title:"班级排名",
                                type: 'line',
                                data: [
                                      ['1-1班',  1],
                                      ['1-2班',  20],
                                      ['1-3班',   60],
                                      ['1-4班',  500],
                                      ['1-5班',  300],
                                      ['1-6班',  200],
                                      ['2-1班',  268],
                                      ['2-2班',  423],
                                      ['2-3班',  321],
                                      ['2-4班',  456],
                                      ['2-5班',  385],
                                      ['2-6班',  578],
                                      ['3-1班',  512],
                                      ['3-2班',  456],
                                      ['3-3班',  478],
                                      ['3-4班',  356],
                                      ['3-5班',  478],
                                      ['3-6班',  189]
                                ]
                            },
                             {
                                title:"排名",
                                type: 'line',
                                data: [
                                      ['1-1班',  200],
                                      ['1-2班',  20],
                                      ['1-3班',  160],
                                      ['1-4班',  200],
                                      ['1-5班',  330],
                                      ['1-6班',  20],
                                      ['2-1班',  68],
                                      ['2-2班',  463],
                                      ['2-3班',  321],
                                      ['2-4班',  486],
                                      ['2-5班',  300],
                                      ['2-6班',  508],
                                      ['3-1班',  312],
                                      ['3-2班',  616],
                                      ['3-3班',  178],
                                      ['3-4班',  556],
                                      ['3-5班',  178],
                                      ['3-6班',  489]
                                ]
                            }
                        ]
            });
        });