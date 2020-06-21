public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;

        double areaToPaint = width * height;
        double numberOfBucketsRequired = areaToPaint / areaPerBucket;
        double numberOfBucketsToBuy = numberOfBucketsRequired - extraBuckets;
        return (int) (Math.ceil(numberOfBucketsToBuy));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height<=0 || areaPerBucket<=0) return -1;
        double areaToPaint = width * height;
        double numberOfBucketsToBuy = areaToPaint / areaPerBucket;
        return (int) (Math.ceil(numberOfBucketsToBuy));
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket<=0) return -1;
        double numberOfBucketsToBuy = area /areaPerBucket;
        return (int) (Math.ceil(numberOfBucketsToBuy));
    }

    }
