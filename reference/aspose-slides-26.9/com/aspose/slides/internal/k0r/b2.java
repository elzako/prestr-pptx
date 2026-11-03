package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class b2 extends v8 {
   private int n5;
   private int l6;

   public b2(int var1, int var2, int var3) {
      super(var1, 6 + (var2 & 65535) * (((var3 & 65535) != 65520 ? var3 : 4) & 65535));
      this.n5 = var2;
      this.l6 = var3;
      com.aspose.slides.internal.n8e.y2.n5(this.l6(), 0, var2 & 65535);
      int var4 = 4;

      while ((var4 & 65535) < (var2 & 65535)) {
         var4 = (var4 & 65535) * 2 & 65535;
         if ((var4 & 65535) == 0) {
            var4 = 65535;
            break;
         }
      }

      com.aspose.slides.internal.n8e.y2.n5(this.l6(), 2, var4 & 65535);
      com.aspose.slides.internal.n8e.y2.n5(this.l6(), 4, var3 & 65535);
   }

   public final int u3() {
      return this.n5;
   }

   public final int a6() {
      return this.l6;
   }

   public final long l6(int var1) {
      if (var1 >= 0 && var1 < (this.u3() & 65535)) {
         if (((this.a6() & 65535) < 1 || (this.a6() & 65535) > 8) && this.a6() != 65520) {
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5("Size of element is {0}, but should be between 1 and 8 or 0xFFF0.", new Object[]{this.l6})
            );
         }

         int var2 = this.u9();
         byte[] var3 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
         System.arraycopy(this.l6(), 6 + var1 * (var2 & 65535), var3, 0, var2 & 65535);
         return com.aspose.slides.internal.v6g.k5.h0(com.aspose.slides.internal.n8e.y2.u3(var3), 11);
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public final void n5(int var1, long var2) {
      if (var1 >= 0 && var1 < (this.u3() & 65535)) {
         if (((this.a6() & 65535) < 1 || (this.a6() & 65535) > 8) && this.a6() != 65520) {
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5("Size of element is {0}, but should be between 1 and 8 or 0xFFF0.", new Object[]{this.l6})
            );
         }

         int var4 = this.u9();
         byte[] var5 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
         com.aspose.slides.internal.n8e.y2.l6(var5, 0, var2);
         System.arraycopy(var5, 0, this.l6(), 6 + var1 * (var4 & 65535), var4 & 65535);
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public final byte[] k5(int var1) {
      int var2 = this.u9();
      byte[] var3 = new byte[var2 & 65535];
      System.arraycopy(this.l6(), 6 + var1 * (var2 & 65535), var3, 0, var2 & 65535);
      return var3;
   }

   b2(int var1, int var2) {
      super(var1, var2 == 0 ? var2 : var2 + 6);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if (this.k5() != 0) {
         var1.n5(this.l6(), 0, 6);
         this.n5 = com.aspose.slides.internal.n8e.y2.l6(this.l6(), 0) & 65535;
         this.l6 = com.aspose.slides.internal.n8e.y2.l6(this.l6(), 4) & 65535;
         this.n5(6 + (this.n5 & 65535) * (this.u9() & 65535));
         var1.n5(this.l6(), 6, (this.n5 & 65535) * (this.u9() & 65535));
      }
   }

   private int u9() {
      return (this.a6() & 65535) != 65520 ? this.a6() : 4;
   }
}
