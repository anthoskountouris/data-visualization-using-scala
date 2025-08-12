import plotly._
import plotly.element.Color.{RGBA, StringColor}
import plotly.element.Dash.{DashDot, Dot, Solid}
import plotly.element.LineShape.Spline
import plotly.element.{Color, Line, Marker}
import plotly.layout.Layout

object ScatterPlot extends App {
  val x1 = Seq(1, 2, 3, 4)
  val y1 = Seq(10, 15, 13, 17)

  val trace1 = Scatter(
    x = x1,
    y = y1,
  )
//    .withLine(Line().withDash(Solid).withShape(Spline).withColor(Color.StringColor("pink")))
//    .withMarker(Marker().withColor(Color.StringColor("black")).withSize(25))
//    .withName("Line 1")

  val x2 = Seq(1, 2, 3, 4)
  val y2 = Seq(13, 12, 15, 15)

  val trace2 = Scatter(
    x = x2,
    y = y2
  )

  val plot = Seq(trace1, trace2)

  plotly.Plotly.plot(
    path = "plots/scatter-plot.html",
    traces = plot,
    layout = Layout().withTitle("Basic Scatter Plot"),
  )
}








