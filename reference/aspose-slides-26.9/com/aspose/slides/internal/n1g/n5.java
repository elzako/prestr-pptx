package com.aspose.slides.internal.n1g;

public final class n5 extends k5 {
   @Override
   public int n5(byte[] var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      if (this.n5 >= 1 && this.n5 <= 8) {
         this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         if (this.l6 < 1) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMFClipboard16Metaheader.");
         }

         this.k5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         if (this.k5 < 1) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMFClipboard16Metaheader.");
         }

         this.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         return 8;
      } else {
         throw new com.aspose.slides.internal.p7x.l6("Error reading WMFClipboard16Metaheader.");
      }
   }
}
