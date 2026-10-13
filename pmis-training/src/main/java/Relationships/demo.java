package Relationships;

class Battery {
    int capacity;

    Battery(int capacity) {
        this.capacity = capacity;
    }

    void drain() {
        System.out.println("Battery draining... remaining capacity: " + capacity + "mAh");
    }
}

class Camera {
    int pix;

    Camera(int pix) {
        this.pix = pix;
    }

    void takePhoto() {
        System.out.println("click... Captured a photo with " + pix + " sensor");
    }
}

class Phone {
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera) {
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapPicture() {
        System.out.println("[" + brand + "]" + " is active.");
        camera.takePhoto();
        battery.drain();
    }
}

public class demo {

    public static void main(String[] args) {
        Battery b = new Battery(5000);
        Camera c = new Camera(50);

        Phone myPhone = new Phone("Samsung", b, c);
        myPhone.snapPicture();
    }

}