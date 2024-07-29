// import logo STL
File logoSTL = ScriptingEngine.fileFromGit(
	"https://github.com/JansenSmith/TechnocopiaChalkPaintingFrame.git",
	"Technocopia_chalk_painting_simplified.stl");
// Load the .CSG from the disk and cache it in memory
CSG logo  = Vitamins.get(logoSTL);
logo = logo.toZMin()
//logo = logo.hull()