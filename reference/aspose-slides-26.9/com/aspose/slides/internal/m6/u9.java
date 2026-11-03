package com.aspose.slides.internal.m6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.e7.y4;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.h0;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.internal.v2.t9;
import com.aspose.slides.internal.v2.x8;

public class u9 extends k5 {
   private x8 n5;
   private y4 l6;
   private int[] k5;
   private final List<Long> u3;

   public u9(x8 var1, com.aspose.slides.internal.v2.u3 var2, y4 var3) {
      super(var1.u3());
      this.n5 = var1;
      this.l6 = var3;
      this.n5(var2);
      this.k5 = new int[3];
      this.u3 = new List<>();

      try {
         this.n5(var1);
      } catch (IOException var5) {
         if (this.n5() != null) {
            this.n5().dispose();
         }
      }
   }

   private void n5(x8 var1) {
      com.aspose.slides.internal.v2.n5 var2 = var1.c8(c8.p6r);
      if (var2 == null) {
         throw new IOException("/W array is missing in Xref stream");
      }

      for (int var3 = 0; var3 < 3; var3++) {
         this.k5[var3] = var2.n5(var3, 0);
      }

      com.aspose.slides.internal.v2.n5 var10 = var1.c8(c8.c6);
      if (var10 == null) {
         var10 = new com.aspose.slides.internal.v2.n5();
         var10.n5(h0.n5());
         var10.n5(h0.n5(var1.n5(c8.x7i, 0)));
      }

      IGenericEnumerator var4 = var10.iterator();

      while (var4.hasNext()) {
         s7 var5 = (s7)var4.next();
         if (!com.aspose.slides.internal.v6g.k5.l6(var5, t2.class)) {
            throw new IOException("Xref stream must have integer in /Index array");
         }

         long var6 = ((t2)var5).k5();
         if (!var4.hasNext()) {
            break;
         }

         var5 = (s7)var4.next();
         if (!com.aspose.slides.internal.v6g.k5.l6(var5, t2.class)) {
            throw new IOException("Xref stream must have integer in /Index array");
         }

         int var8 = ((t2)var5).k5();

         for (int var9 = 0; var9 < var8; var9++) {
            this.u3.addItem(var6 + var9);
         }
      }
   }

   @Override
   public com.aspose.slides.internal.v2.u3 u9() {
      List$Enumerator var1 = this.u3.iterator();
      byte[] var2 = new byte[this.k5[0] + this.k5[1] + this.k5[2]];

      while (!this.n5().l6() && var1.hasNext()) {
         this.n5().n5(var2);
         long var3 = (Long)var1.next();
         int var5 = this.k5[0] == 0 ? 1 : (int)this.n5(var2, 0, this.k5[0]);
         if (var5 != 0) {
            long var6 = this.n5(var2, this.k5[0], this.k5[1]);
            int var8 = var5 == 1 ? (int)this.n5(var2, this.k5[0] + this.k5[1], this.k5[2]) : 0;
            t9 var9 = new t9(var3, var8);
            if (var5 == 1) {
               this.l6.n5(var9, var6);
            } else {
               this.l6.n5(var9, -var6);
            }
         }
      }

      if (this.n5() != null) {
         this.n5().dispose();
      }

      return this.a6();
   }

   private long n5(byte[] var1, int var2, int var3) {
      long var4 = 0L;

      for (int var6 = 0; var6 < var3; var6++) {
         var4 += (var1[var6 + var2] & 255 & 0xFF) << (var3 - var6 - 1) * 8;
      }

      return var4;
   }
}
