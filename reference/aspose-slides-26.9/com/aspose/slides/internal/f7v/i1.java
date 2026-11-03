package com.aspose.slides.internal.f7v;

public class i1 extends p3 {
   private String t2;
   private byte[] s7;
   private int x8;

   public i1(com.aspose.slides.internal.c5e.l6 var1) {
      super("iCCP", var1);
   }

   @Override
   public void n5(a6 var1) {
      int var2 = com.aspose.slides.internal.f7v.n5.k5(var1.k5);
      this.t2 = com.aspose.slides.internal.c5e.h0.n5.l6(var1.k5, 0, var2);
      this.x8 = var1.k5[var2 + 1] & 255;
      if (this.x8 != 0) {
         throw new com.aspose.slides.internal.c5e.e2("bad compression for ChunkTypeICCP");
      }

      int var3 = var1.k5.length - (var2 + 2);
      this.s7 = new byte[var3];
      System.arraycopy(var1.k5, var2 + 2, this.s7, 0, var3);
   }

   public String l6() {
      return this.t2;
   }

   public byte[] k5() {
      return this.s7;
   }

   public int u3() {
      return this.x8;
   }
}
