package com.aspose.slides.ms.System.Xml;

public class c8 {
   private byte[] n5;
   private int l6;
   private int k5;
   private int u3;

   public c8(int var1) {
      this.l6 = var1;
      this.k5 = 0;
      this.n5 = new byte[var1];
      this.u3 = var1;
   }

   public final void n5(byte var1) {
      if (this.u3 == this.k5) {
         byte[] var2 = new byte[this.u3 + this.l6];
         if (this.k5 > 0) {
            com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, this.k5);
         }

         this.n5 = var2;
         this.u3 = this.u3 + this.l6;
      }

      this.n5[this.k5++] = var1;
   }

   public final byte n5() {
      return this.k5 > 0 ? this.n5[--this.k5] : 0;
   }
}
