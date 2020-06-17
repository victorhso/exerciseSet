public class Course {

    private int cod;

    public Course(int mat) {
        this.cod = mat;
    }

    public int getMat() {
        return cod;
    }

    public void setMat(int mat) {
        this.cod = mat;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cod;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (cod != other.cod)
            return false;
        return true;
    }
}