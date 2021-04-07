import java.util.Arrays;


public class Main {

     static int[] middle(){
        int[] arr = { 10, 20, 30, 40, 50 };

        arr = Arrays.copyOf(arr, arr.length + 1); // make the array longer by adding another number into the middle of it
        arr[arr.length - 3] = 35;
        arr[arr.length - 2] = 40;
        arr[arr.length - 1] = 50;

        return arr;

    }

    static int[] grow(){
        int[] arr = { 10, 20, 30, 40, 50 };

        arr = Arrays.copyOf(arr, arr.length + 1); // make the array longer
        arr[arr.length - 1] = 60;

        return arr;

    }

    static int[] shrink(){
        int[] arr = { 10, 20, 30, 40, 50 };

        arr = Arrays.copyOf(arr, arr.length - 1); // make the array shorter
        arr[arr.length - 1] = 40;

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr)); // starting array
        System.out.println(Arrays.toString(middle())); // adding something into the middle of the  array
        System.out.println(Arrays.toString(grow())); // making the original array longer by one
        System.out.println(Arrays.toString(shrink())); // removing the last item of the last array




    }


}