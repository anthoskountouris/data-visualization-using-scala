import plotly._
import plotly.element._
import plotly.layout._

object TimeSeriesPlot extends App {
  val dates = Seq(
    "2013-10-01", "2013-10-15", "2013-11-01", "2013-11-15", "2013-12-01",
    "2013-12-15", "2014-01-01", "2014-01-15", "2014-02-01", "2014-02-15"
  )

  val values = Seq(
    1, 2, 3, 5, 6,
    5, 4, 6, 8, 10
  )

  val trace = Scatter(dates, values)
    .withMode(ScatterMode(ScatterMode.Lines))
    .withName("Sample Data")
    .withMarker(Marker().withSize(6))

  val layout = Layout()
    .withTitle("Time Series Data Over 5 Months")
    .withXaxis(
      Axis()
        .withTitle("Date")
        .withType(AxisType.Date)
        .withTickformat("%b %d, %Y") // "Oct 15, 2013"
    )
    .withYaxis(
      Axis().withTitle("Value")
    )

  Plotly.plot(
    path = "plots/time-series-plot.html",
    traces = Seq(trace),
    layout = layout
  )
}
