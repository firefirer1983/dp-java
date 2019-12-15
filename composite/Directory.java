package composite;
import java.util.List;
import java.util.ArrayList;


class Directory extends FileComponent {

    List<FileComponent> children = new ArrayList<FileComponent>();

    public Directory(String name) {
        super(name);
    }

    public void addFile(FileComponent file) {
        children.add(file);
    }

    public void killVirus() {
        System.out.println("Directory " + this.name + " is cleaned!");
        for(FileComponent file: children) {
            file.killVirus();
        }
    }
}