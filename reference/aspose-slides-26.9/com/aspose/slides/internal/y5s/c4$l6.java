package com.aspose.slides.internal.y5s;

class c4$l6 extends c4$n5 {
   private final short[] l6 = new short[16777216];
   private final byte[] k5 = new byte[16777216];

   public c4$l6(com.aspose.slides.internal.j3b.u3 var1) {
      super(var1);
   }

   @Override
   public int n5(int var1) {
      int var2 = var1 & 16777215;
      short var3;
      if (com.aspose.slides.internal.v6g.k5.u3(this.k5[var2], 6) > 0) {
         var3 = this.l6[var2];
      } else {
         var3 = com.aspose.slides.internal.v6g.k5.l6(this.n5.n5(var1), 9);
         this.k5[var2] = 1;
         this.l6[var2] = var3;
      }

      return var3;
   }
}
