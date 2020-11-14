public class Main {
    public static void main(String[] args) {
        for (int i = 9; i >=0; i--) {
            System.out.println(numberLine(i));
        }
    }

    public  static StringBuilder numberLine(int currnum) {
        int startNum= currnum;
        StringBuilder sb = new StringBuilder();
        for (int iS = 9; iS>=0; iS--) {
             if(startNum<iS){
                sb.append(startNum);

            }else{
                 sb.append(iS);
             }
        }
        return sb;
    }
}

