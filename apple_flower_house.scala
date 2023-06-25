import scala.collection.mutable.Map

object CreativeWritingAndArt {

  // create a map to store all the classes
  val classes = Map[String, List[String]]()

  // define the classes for Creativity Writing
  val writingClasses: List[String] = List("Creative Writing",
                                         "Poetry Writing",
                                         "Journaling",
                                         "Blogging",
                                         "Script Writing",
                                         "Creative Non-Fiction Writing",
                                         "Technical Writing")

  // add the writing classes to the map
  classes += ("Writing" -> writingClasses)

  // define the classes for Art Therapy
  val artClasses: List[String] = List("Intro to Art Therapy",
                                     "Color Theory and Art Therapy",
                                     "Drawing for Art Therapy",
                                     "Painting for Art Therapy",
                                     "Ceramics in Art Therapy",
                                     "Sculpture in Art Therapy",
                                     "Printmaking in Art Therapy")

  // add the art classes to the map
  classes += ("Art" -> artClasses)

  // define the classes for Creative Writing and Art Therapy
  val comboClasses: List[String] = List("Creative Writing and Art Therapy",
                                       "Poetry Writing and Art Therapy",
                                       "Journaling and Art Therapy",
                                       "Blogging and Art Therapy",
                                       "Script Writing and Art Therapy",
                                       "Creative Non-Fiction Writing and Art Therapy",
                                       "Technical Writing and Art Therapy")

  // add the combined classes to the map
  classes += ("Writing & Art" -> comboClasses)

  // function to return the classes available
  def getClasses(): Map[String, List[String]] = {
    classes
  }
}