class cyclinder {
    private int radius;
    private int height;

    void setrad(int r) { // Setter for radius
        radius = r;
    }

    void sethei(int h) { // Setter for height
        height = h;
    }
    public cyclinder(int radius,int height){                                                 // Q.3 Constructor    
        this.radius=radius;
        this.height=height;

    }

    double getarea() {                                           //Q.2 finding area of cyc
        return 2 * 3.14 * (radius * height);
    }

    double getvol() {                                            //Q.2 finding vol of cyc 
        return 3.14 * (radius * radius * height); 
    }

    int getrad() {
        return radius;
    }

    int gethei() {
        return height;
    }
}

class psonaccesandmod {
    public static void main(String[] args) {
        // Q.1 Make a class cyclinder and access its height and radius using getters and setters
        // Q.2 Use ques 1 to calculate area and volume of cyclinder
        //Q.3 Use ques 1 and insert a constructor
        cyclinder c = new cyclinder(3,9);
        // c.setrad(4);
        // c.sethei(6);
        System.out.println(c.getrad());
        System.out.println(c.gethei());
        System.out.println(c.getarea());
        System.out.println(c.getvol());
    }

}
