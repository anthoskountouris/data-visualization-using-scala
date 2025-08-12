import plotly.{Bar, Plotly}
import plotly.element.{Color, Marker}
import plotly.layout.{Axis, Layout}

object BarChart extends App {
  val trace = Bar(
    x = Seq("Giraffes", "Zebras", "Monkeys"),
    y = Seq(20, 14, 23)
  )
    .withMarker(
      Marker()
        .withColor(
          Seq(
            Color.StringColor("orange"),
            Color.StringColor("green"),
            Color.StringColor("brown")
          )
        )
    )
    .withName("Animal Counts")

  val layout = Layout()
    .withTitle("Number of Animals in the Zoo")
    .withXaxis(Axis().withTitle("Animal"))
    .withYaxis(Axis().withTitle("Count"))
    .withWidth(500)
    .withHeight(400)

  Plotly.plot(
    path = "plots/animal-bar-chart.html",
    traces = Seq(trace),
    layout = layout
  )
}
