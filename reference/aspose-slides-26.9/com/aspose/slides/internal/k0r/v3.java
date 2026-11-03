package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;

public class v3 {
   private z5 n5;
   private int l6 = 0;
   private int k5 = 0;
   private int u3 = 16;
   private int a6 = 16;
   private long u9 = 0L;
   private long h0 = 0L;

   public static v3 n5(z5 var0, boolean var1) {
      if (var0 == null) {
         return null;
      }

      z5 var2 = var0;
      if (var1) {
         var2 = new z5(var0);
      }

      switch (var2.y4()) {
         case 447:
            return new v3(var2);
         default:
            throw new NotImplementedException(com.aspose.slides.ms.System.d1.n5(new String[]{"No wrapper for ", com.aspose.slides.ms.System.s3.n5(u5.class, var2.y4())}));
      }
   }

   v3(z5 var1) {
      this.n5 = var1;
      this.n5();
   }

   public final void n5(long var1, byte var3) {
      long var4 = var1 & this.u9 & 4294967295L;
      if ((var4 & 4294967295L) != 0L) {
         long var6 = (var4 & 4294967295L) << (this.a6 & 31) & 4294967295L;
         long var8 = ((this.n5.j5() | var4 | var6) ^ var4 ^ var6) & 4294967295L;
         if (var3 != -1) {
            var8 = (var8 | var6) & 4294967295L;
            if (var3 == 1) {
               var8 = (var8 | var4) & 4294967295L;
            }
         }

         this.n5.n5(var8);
      }
   }

   public final byte n5(long var1) {
      long var3 = this.n5.j5() & (var1 & this.u9 & 4294967295L) << (this.a6 & 31) & 4294967295L;
      if ((var3 & 4294967295L) == 0L) {
         return -1;
      }

      long var5 = (var3 & 4294967295L) >> this.a6 & 4294967295L;
      return (byte)((this.n5.j5() & var5 & 4294967295L) != 0L ? 1 : 0);
   }

   public final void n5(z5 var1) {
      if (var1 != null) {
         if (var1.y4() != this.n5.y4()) {
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "PropertyWrapper: wrong type of source property. Can't override ",
                  com.aspose.slides.ms.System.s3.n5(u5.class, this.n5.y4()),
                  " by ",
                  com.aspose.slides.ms.System.s3.n5(u5.class, var1.y4())
               })
            );
         }

         long var2 = var1.j5() & this.h0 & 4294967295L;
         var2 = (var2 | (var2 & 4294967295L) >> this.a6) & 4294967295L;
         long var4 = ((this.n5.j5() | var2) ^ var2) & 4294967295L;
         var4 = (var4 | var1.j5() & var2) & 4294967295L;
         this.n5.n5(var4);
      }
   }

   private void n5() {
      switch (this.n5.y4()) {
         case 447:
            this.l6 = 7;
            this.k5 = 0;
            this.u3 = 16;
         default:
            long var1 = 1L << (this.k5 & 31) & 4294967295L;
            long var3 = 1L << (this.u3 & 31) & 4294967295L;
            this.u9 = 0L;
            this.h0 = 0L;

            for (int var5 = 0; var5 < this.l6; var5++) {
               this.u9 = (this.u9 | var1) & 4294967295L;
               this.h0 = (this.h0 | var3) & 4294967295L;
               var1 = (var1 & 4294967295L) << 1 & 4294967295L;
               var3 = (var3 & 4294967295L) << 1 & 4294967295L;
            }

            if ((this.u9 & this.h0 & 4294967295L) != 0L) {
               throw new ArgumentOutOfRangeException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "PropertyWrapper: the flag fields are overlapped for ", com.aspose.slides.ms.System.s3.n5(u5.class, this.n5.y4())
                  })
               );
            } else {
               this.a6 = this.u3 - this.k5;
            }
      }
   }
}
