import plotly.{Bar, Plotly}
import plotly.element.{Color, Marker, Orientation}
import plotly.layout.{Axis, Layout}

object GroupedBarChart extends App {
  val trace1 = Bar(
    x = Seq("Giraffes", "Zebras", "Monkeys"),
    y = Seq(20, 14, 23),
  )
    .withName("London Zoo")
    .withMarker(Marker().withColor(Color.StringColor("green")))
//    .withOrientation(Orientation.Horizontal)

  val trace2 = Bar(
    x = Seq("Giraffes", "Zebras", "Monkeys"),
    y = Seq(30, 10, 20),
  )
    .withName("New York Zoo")
    .withMarker(Marker().withColor(Color.StringColor("orange"))
    )
//    .withOrientation(Orientation.Horizontal)

  val plot = Seq(trace1, trace2)

  val layout = Layout()
    .withTitle("Number of Animals in the Zoo")
    .withXaxis(Axis().withTitle("Animal"))
    .withYaxis(Axis().withTitle("Count"))
    .withWidth(500)
    .withHeight(400)

  Plotly.plot(
    path = "plots/grouped-bar-chart.html",
    traces = plot,
    layout = layout
  )
}
