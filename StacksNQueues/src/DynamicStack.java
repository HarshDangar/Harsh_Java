public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // It will call CustomStack().
    }

    public DynamicStack(int size) {
        super(); // It will call CustomStack(int size).
    }

    @Override
    public boolean push(int item) {
        if (isFull()){
            // Make new array of size double of length of data array.
            int[] temp = new int[data.length * 2];

            //Copy all the element of data in temp.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp; // It will point data to temp.

        }

        // At this we know data is not full that's why insert normally

        return super.push(item);
    }
}
