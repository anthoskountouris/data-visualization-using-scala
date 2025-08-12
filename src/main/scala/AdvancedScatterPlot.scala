import plotly._
import plotly.element._
import plotly.layout._

object AdvancedScatterPlot extends App {
  val ageGroups = Seq(
    "5–9 years",
    "10–14 years",
    "15–19 years",
    "20–24 years",
    "25–29 years",
    "30–34 years",
    "35–39 years",
    "40–44 years",
    "45–49 years",
    "50–54 years"
  )

  val screenTime = Seq(
    2.5, 3.8, 6.5, 7.0, 6.2, 5.5, 5.0, 4.7, 4.3, 3.8
  )

  val physicalActivity = Seq(
    2.0, 1.5, 1.2, 1.0, 1.1, 1.3, 1.5, 1.6, 1.4, 1.2
  )

  val trace1 = Scatter(
    screenTime,
    ageGroups
  )
    .withMode(ScatterMode(ScatterMode.Markers))
    .withName("Avg Daily Screen Time (hrs)")
    .withMarker(
      Marker()
        .withColor(Color.RGBA(54, 162, 235, 0.9)) // blue
        .withLine(Line().withColor(Color.RGBA(54, 162, 235, 1.0)).withWidth(1.0))
        .withSymbol(Symbol.Circle())
        .withSize(16)
    )

  val trace2 = Scatter(
    physicalActivity,
    ageGroups
  )
    .withMode(ScatterMode(ScatterMode.Markers))
    .withName("Avg Daily Physical Activity (hrs)")
    .withMarker(
      Marker()
        .withColor(Color.RGBA(75, 192, 192, 0.9))
        .withLine(Line().withColor(Color.RGBA(75, 192, 192, 1.0)).withWidth(1.0))
        .withSymbol(Symbol.Circle())
        .withSize(16)
    )

  val layout = Layout()
    .withTitle("Screen Time vs Physical Activity by Age Group")
    .withXaxis(
      Axis()
        .withShowgrid(false)
        .withShowline(true)
        .withLinecolor(Color.RGB(102, 102, 102))
        .withTitlefont(Font().withColor(Color.RGB(204, 204, 204)))
        .withTickfont(Font().withColor(Color.RGB(102, 102, 102)))
        .withDtick(1.0)
        .withTickcolor(Color.RGB(150, 102, 102))
    )
    .withMargin(
      Margin()
        .withL(140)
        .withR(40)
        .withB(50)
        .withT(80)
    )
    .withLegend(
      Legend()
        .withFont(Font().withSize(10))
        .withYanchor(Anchor.Middle)
        .withXanchor(Anchor.Right)
    )
    .withWidth(1000)
    .withHeight(700)
    .withPaper_bgcolor(Color.RGB(254, 247, 234))
    .withPlot_bgcolor(Color.RGB(254, 247, 234))
    .withHovermode(HoverMode.Closest)

  val plot = Seq(trace1, trace2)

  plotly.Plotly.plot(
    path = "plots/advanced-scatter-plot.html",
    traces = plot,
    layout = layout,
  )
}

