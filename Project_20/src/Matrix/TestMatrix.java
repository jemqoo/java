package Matrix;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix<Integer> tmp = new Matrix<Integer>();
        tmp.setMatrix(new Integer[][]{{1,2,3}, {4,5,6}});
        tmp.addRow(new Integer[]{7,8,9});
        System.out.println(tmp);
        tmp.transparentMatrix();
        System.out.println(tmp);
        tmp.addColumn(new Integer[]{50,20,21});
        System.out.println(tmp);
        tmp.deleteColumn(3);
        System.out.println(tmp);
    }
}
