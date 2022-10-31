package stackqueue;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        // this takes care of it when full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous item to new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this point the array is not full so then insert item
        return super.push(item);

    }
}
