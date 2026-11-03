package com.aspose.slides.internal.n1g;

public final class l6 extends k5 {
   @Override
   public int n5(byte[] var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      if (this.n5 >= 1 && this.n5 <= 8) {
         this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         if (this.l6 < 1) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMFClipboard32Metaheader.");
         }

         this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         if (this.k5 < 1) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMFClipboard32Metaheader.");
         }

         this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         return 16;
      } else {
         throw new com.aspose.slides.internal.p7x.l6("Error reading WMFClipboard32Metaheader.");
      }
   }
}
