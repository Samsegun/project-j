package ConsoleMethods;

public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getBucketCount(1.4,2.1,1.5,-4));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        if(extraBuckets < 0) return  -1;

        return (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        return (int) Math.ceil((width * height) / areaPerBucket);
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        if(area <= 0 || areaPerBucket <= 0) return -1;

        return (int) Math.ceil(area / areaPerBucket);
    }
}
