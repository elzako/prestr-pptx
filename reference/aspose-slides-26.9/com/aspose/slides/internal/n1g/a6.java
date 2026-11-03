package com.aspose.slides.internal.n1g;

public final class a6 {
   short n5 = 1;
   short l6 = 768;
   int k5;
   short u3;
   int a6;
   short u9;
   byte[] h0;

   public int n5(byte[] var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      int var3 = var2;
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      if (this.n5 >= 1 && this.n5 <= 2) {
         short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         if (var4 < 9) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMFHeader.");
         }

         this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         this.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         this.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         var2 += 2;
         int var5 = var4 * 2;
         if (var2 - var3 < var5) {
            this.h0 = new byte[var5 - var2 + var3];
            System.arraycopy(var1, var2, this.h0, 0, this.h0.length);
         }

         return var5;
      } else {
         throw new com.aspose.slides.internal.p7x.l6("Error reading WMFHeader.");
      }
   }

   public short n5() {
      return (short)(9 + (this.h0 != null ? this.h0.length / 2 : 0));
   }

   public short l6() {
      return this.l6;
   }

   public int k5() {
      return this.k5;
   }

   public int u3() {
      return this.k5() + this.n5();
   }

   public short a6() {
      return this.n5;
   }

   public short u9() {
      return this.u3;
   }

   public int h0() {
      return this.a6;
   }

   public short c8() {
      return this.u9;
   }
}
