package com.aspose.slides.internal.n8e;

class w5 {
   private final byte[] n5;
   private final int l6;
   private static final String[] k5 = new String[]{
      "video/mpeg",
      "mpg",
      "video/avi",
      "avi",
      "video/x-ms-wmv",
      "wmv",
      "video/unknown",
      "3gp",
      "video/unknown",
      "3g2",
      "video/mp4",
      "mp4",
      "video/unknown",
      "mkv"
   };
   private static final int[][] u3 = new int[][]{
      {0, 0, 1, 4016},
      {82, 73, 70, 70, 65280, 65280, 65280, 65280, 65, 86, 73, 32, 76, 73, 83, 84},
      {48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108},
      {0, 0, 0, 20, 102, 116, 121, 112, 51, 103, 112},
      {0, 0, 0, 32, 102, 116, 121, 112, 51, 103, 112},
      {0, 0, 0, 65280, 102, 116, 121, 112},
      {26, 69, 223, 163, 147, 66, 130, 136, 109, 97, 116, 114, 111, 115, 107, 97}
   };
   private static int a6 = 0;

   public w5(byte[] var1) {
      this.n5 = var1;
      this.l6 = this.u3();
   }

   public final boolean n5() {
      return this.l6 != -1;
   }

   public final String l6() {
      return this.n5() ? k5[this.l6 * 2] : null;
   }

   public final String k5() {
      return this.n5() ? k5[this.l6 * 2 + 1] : null;
   }

   private int u3() {
      if (this.n5.length < a6) {
         return -1;
      }

      for (int var1 = 0; var1 < u3.length; var1++) {
         int[] var2 = u3[var1];
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

   static {
      for (int[] var3 : u3) {
         if (var3.length > a6) {
            a6 = var3.length;
         }
      }
   }
}
