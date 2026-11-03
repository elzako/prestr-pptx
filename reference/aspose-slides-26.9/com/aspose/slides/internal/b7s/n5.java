package com.aspose.slides.internal.b7s;

public class n5 {
   private int n5;
   private int l6;
   private byte k5;
   private int u3;

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final byte n5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   public final void k5(int var1) {
      this.u3 = var1;
   }

   public static n5 n5(h2 var0) {
      n5 var1 = new n5();
      int var2 = 0;
      int[] var3 = new int[]{0};
      var0.n5(var3);
      var2 = var3[0];
      byte[] var4 = new byte[var2 - 2];
      var0.n5(var4, 0, var4.length);
      if ((var4[0] & 255) == 65 && (var4[1] & 255) == 100 && (var4[2] & 255) == 111 && (var4[3] & 255) == 98 && (var4[4] & 255) == 101) {
         var1.k5(((var4[5] & 255) << 8) + (var4[6] & 255));
         var1.n5(((var4[7] & 255) << 8) + (var4[8] & 255));
         var1.l6(((var4[9] & 255) << 8) + (var4[10] & 255));
         var1.n5(var4[11]);
         return var1;
      } else {
         return null;
      }
   }

   public static void n5(com.aspose.slides.internal.z0k.t4 var0, n5 var1) {
      var0.writeByte((byte)-1);
      var0.writeByte((byte)-18);
      var0.writeByte((byte)0);
      var0.writeByte((byte)14);
      byte[] var2 = new byte[]{
         65,
         100,
         111,
         98,
         101,
         (byte)(var1.u3 >> 8),
         (byte)(var1.u3 & 0xFF),
         (byte)(var1.n5 >> 8),
         (byte)(var1.n5 & 0xFF),
         (byte)(var1.l6 >> 8),
         (byte)(var1.l6 & 8),
         var1.k5
      };
      var0.write(var2, 0, var2.length);
   }
}
