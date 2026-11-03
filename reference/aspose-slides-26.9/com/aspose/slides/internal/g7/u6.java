package com.aspose.slides.internal.g7;

class u6 {
   private byte[] u3;
   private byte a6;
   public long n5;
   public long l6;
   public byte k5;

   public final byte[] n5() {
      return this.u3;
   }

   public final void n5(byte[] var1) {
      this.u3 = var1;
   }

   public final byte l6() {
      return this.a6;
   }

   public final void n5(byte var1) {
      this.a6 = var1;
   }

   public final byte n5(int var1) {
      byte var2 = 0;
      int var3 = 0;
      switch (this.a6) {
         case 0:
            var2 = this.u3[var1];
            break;
         case 3:
            if (com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1 - com.aspose.slides.internal.v6g.k5.u9(this.n5, 10), 11), 10)
               < com.aspose.slides.internal.v6g.k5.a6(this.l6, 10)) {
               var2 = this.k5;
            } else {
               int var4 = this.u3.length;
               byte var5 = 0;
               long var6 = 0L;
               long var8 = 0L;
               var3 += 2;

               while (var1 >= com.aspose.slides.internal.v6g.k5.a6(var6, 10)) {
                  var5 = this.u3[var3];
                  var8 = com.aspose.slides.internal.v6g.k5.a6(
                     com.aspose.slides.internal.v6g.k5.u3(
                           com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.internal.v6g.k5.u3(this.u3[++var3], 6) << 8, 9), 8
                        )
                        | com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.k5(this.u3[var3 + 1], 6), 8),
                     9
                  );
                  var3 += 2;
                  if (var1 < com.aspose.slides.internal.v6g.k5.a6(var8, 10)) {
                     var2 = var5;
                     this.n5 = var6;
                     this.l6 = com.aspose.slides.internal.v6g.k5.a6(
                        com.aspose.slides.internal.v6g.k5.a6(var8, 10) - com.aspose.slides.internal.v6g.k5.a6(var6, 10), 10
                     );
                     this.k5 = var5;
                     break;
                  }

                  var6 = var8;
                  if (var3 >= var4) {
                     break;
                  }
               }
            }
      }

      return var2;
   }
}
