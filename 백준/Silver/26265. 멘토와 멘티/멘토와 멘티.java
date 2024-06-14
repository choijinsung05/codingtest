import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        ArrayList<Group> arrayList = new ArrayList<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String mento = st.nextToken();
            String menti = st.nextToken();
            arrayList.add(new Group(mento, menti));
        }
        Collections.sort(arrayList);

        for (Group group : arrayList) {
            System.out.println(group.mento + " " + group.menti);
        }
    }

    static class Group implements Comparable<Group> {
        String mento;
        String menti;

        public Group(String mento, String menti) {
            this.mento = mento;
            this.menti = menti;
        }

        @Override
        public int compareTo(Group o) {
            int mentoCompare = this.mento.compareTo(o.mento);
            if (mentoCompare < 0) {
                return -1;
            } else if (mentoCompare > 0) {
                return 1;
            } else {
                int mentiCompare = this.menti.compareTo(o.menti);
                if (mentiCompare < 0) {
                    return 1;
                } else if (mentiCompare > 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
