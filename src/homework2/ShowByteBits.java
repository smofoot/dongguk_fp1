import java.util.Scanner;
public class ShowByteBits {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-128~127의 정수를 입력해 주세요.");
        byte bv = sc.nextByte();
        System.out.printf("%d%d%d%d%d%d", (bv & 0x40)>>6
                , (bv & 0x20)>>5, (bv & 0x10)>>4, (bv & 0x08)>>3, (bv & 0x04)>>2, (bv & 0x02)>>1);

    }
}
