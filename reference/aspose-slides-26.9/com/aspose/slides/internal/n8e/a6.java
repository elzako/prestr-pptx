package com.aspose.slides.internal.n8e;

public class a6 {
   private final byte[] n5;
   private final String l6;
   private final String k5;
   private final boolean u3;
   private static final String[] a6 = new String[]{
      "audio/wav", "wav", "audio/x-ms-wma", "wma", "audio/unknown", "mp3", "audio/unknown", "mp3", "audio/unknown", "m4a"
   };
   private static final int[][] u9 = new int[][]{
      {82, 73, 70, 70, 65280, 65280, 65280, 65280, 87, 65, 86, 69, 102, 109, 116, 32},
      {48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108},
      {73, 68, 51},
      {255, 8176},
      {0, 0, 0, 65280, 102, 116, 121, 112, 77, 52, 65, 32}
   };
   private static int h0 = 0;

   public a6(byte[] var1) {
      this.n5 = var1;
      int var2;
      if (this.n5 != null && this.n5.length > h0 && (var2 = this.u3()) >= 0) {
         this.u3 = true;
         this.l6 = a6[var2 * 2];
         this.k5 = a6[var2 * 2 + 1];
      } else {
         this.u3 = false;
         this.l6 = null;
         this.k5 = null;
      }
   }

   private int u3() {
      for (int var1 = 0; var1 < u9.length; var1++) {
         int[] var2 = u9[var1];
         boolean var3 = false;

         for (int var4 = 0; var4 < var2.length; var4++) {
            int var5 = var2[var4];
            byte var6 = (byte)(~((var5 & 65535) >> 8));
            if ((var6 & 255 & var5 & 65535) != (var6 & 255 & this.n5[var4] & 255)) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            return var1;
         }
      }

      return -1;
   }

   public final String n5() {
      return this.l6;
   }

   public final String l6() {
      return this.k5;
   }

   public final boolean k5() {
      return this.u3;
   }

   static {
      for (int[] var3 : u9) {
         if (var3.length > h0) {
            h0 = var3.length;
         }
      }
   }
}
