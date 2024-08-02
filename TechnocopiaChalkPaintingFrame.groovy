import com.neuronrobotics.bowlerstudio.util.GeometrySimplification

// import logo STL
File logoSTL = ScriptingEngine.fileFromGit(
	"https://github.com/JansenSmith/TechnocopiaChalkPaintingFrame.git",
	"Technocopia_chalk_painting_simplified_manifold.stl");

// Load the .CSG from the disk and cache it in memory
CSG logo  = Vitamins.get(logoSTL);
logo = logo.toZMin()
//logo = logo.hull()


//List<Polygon> polys = Slice.slice(logo,new Transform(),0)
//Polygon shp = polys.get(0)

//CSG cutout = Extrude.polygons(shp, 1.2)
//cutout = cutout.setColor(javafx.scene.paint.Color.RED)

return logo
