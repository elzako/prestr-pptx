package com.aspose.slides.internal.f7v;

public class z7 extends e9 {
   private boolean x8 = false;
   private int n3;
   private String y4 = "";
   private String e2 = "";

   public z7(com.aspose.slides.internal.c5e.l6 var1) {
      super("iTXt", var1);
   }

   @Override
   public void n5(a6 var1) {
      int var2 = 0;
      int[] var3 = new int[3];

      for (int var4 = 0; var4 < var1.k5.length; var4++) {
         if (var1.k5[var4] == 0) {
            var3[var2] = var4;
            if (++var2 == 1) {
               var4 += 2;
            }

            if (var2 == 3) {
               break;
            }
         }
      }

      if (var2 != 3) {
         throw new com.aspose.slides.internal.c5e.e2("Bad formed PngChunkITXT chunk");
      }

      this.t2 = com.aspose.slides.internal.f7v.n5.n5(var1.k5, 0, var3[0]);
      int var6 = var3[0] + 1;
      this.x8 = var1.k5[var6] != 0;
      this.n3 = var1.k5[++var6];
      if (this.x8 && this.n3 != 0) {
         throw new com.aspose.slides.internal.c5e.e2("Bad formed PngChunkITXT chunk - bad compression method ");
      }

      this.y4 = com.aspose.slides.internal.c5e.h0.n5.l6(var1.k5, var6, var3[1] - var6);
      this.e2 = com.aspose.slides.internal.c5e.h0.l6.l6(var1.k5, var3[1] + 1, var3[2] - var3[1] - 1);
      var6 = var3[2] + 1;
      if (this.x8) {
         byte[] var5 = com.aspose.slides.internal.f7v.n5.n5(var1.k5, var6, var1.k5.length - var6, false);
         this.s7 = com.aspose.slides.internal.f7v.n5.l6(var5);
      } else {
         this.s7 = com.aspose.slides.internal.f7v.n5.l6(var1.k5, var6, var1.k5.length - var6);
      }
   }

   public boolean l6() {
      return this.x8;
   }

   public int k5() {
      return this.n3;
   }

   public String u3() {
      return this.y4;
   }

   public String a6() {
      return this.e2;
   }
}
