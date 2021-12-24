# Section 13: JavaFX

Section 13: JavaFX

# What I Learned
* JavaFX Successor to Swing
* JavaFX for making desktop app
* JavaFX is not part of Java, need to download SDK
* [JavaFX](https://gluonhq.com/products/javafx/) 
* JavaFX was thinking MVC pattern in mind
* Stage is top level container extends Window class
	* Most of application has one top level window
* Scenes makes easy to re-use container
* Stages is top level UI. The JavaFX Stage class is the top level JavaFX container
	* Scene is scene inside stage. 
* `layout` defines positioning and resizing behaviour
	* Every control computes their preferred size based on its content
* [AnchorPane] (https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/AnchorPane.html)
* [GridPane] (https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html)
* [VBox]
(https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/VBox.html)
* [GridPane]
(https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/HBox.html)
* `columnSpan` how many column this takes space 
* BorderPane one of most used layout
* <img src="BorderPane.PNG" alt="alt text" width="300"/>
* [FlowPane] (https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html)
* [StackPane]
(https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/StackPane.html)
* [TilePane]
(https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/TilePane.html)
* [Graphics Repository]
(https://www.oracle.com/java/technologies/java-look-and-feel-graphics-repository.html)
* [Button]
(https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html)
* Button interfaces provides default implementations how button show work
	* example interface skinnable can be overridden to make our own behaviour for this interface
* Wrapping text inside element not cutting off
* <img src="wrappingText.PNG" alt="alt text" width="300"/>
* Procedural programming  console programs, where start and end
* Event-driven programming where UI responses to events
* Button is pressed Event is raised in UI thread
	* Any part of program is interested handling that event?  -> Event handler
* `onAction="#onButtonClicked"/>` associate event handler
* JavaFX annotation used to associate component with code `@FXML`