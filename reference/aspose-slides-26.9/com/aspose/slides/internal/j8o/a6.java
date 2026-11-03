package com.aspose.slides.internal.j8o;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.v0;
import com.aspose.slides.internal.b7s.z1;
import com.aspose.slides.ms.System.IDisposable;

public class a6 {
   private final long[][] n5 = new long[4][];
   private final com.aspose.slides.internal.b7s.u3[] l6 = new com.aspose.slides.internal.b7s.u3[4];
   private z1 k5;
   private v0 u3;

   public a6(z1 var1, v0 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("encoderState");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rawDataWriter");
      }

      this.k5 = var1;
      this.u3 = var2;
   }

   public final void n5() {
      p3 var1 = this.k5.l6();

      for (int var2 = 0; var2 < var1.l6.length; var2++) {
         int var3 = this.k5.a6().l6()[var1.l6[var2]].l6() & 255;
         if (this.n5[var3] == null) {
            this.n5[var3] = new long[257];
         }
      }
   }

   public final void n5(short[] var1) {
      p3 var2 = this.k5.l6();

      for (int var3 = 0; var3 < this.k5.n5(); var3++) {
         int var4 = var2.k5()[var3];
         n3 var5 = this.k5.a6().l6()[var4];
         n5(var1[var3], this.n5[var5.l6() & 0xFF]);
      }
   }

   public final void n5(short var1) {
      n3 var2 = this.k5.a6().l6()[0];
      n5(var1, this.n5[var2.l6() & 0xFF]);
   }

   public final com.aspose.slides.internal.b7s.u3[] l6() {
      List var1 = new List();
      boolean[] var2 = new boolean[4];
      p3 var3 = this.k5.l6();

      for (int var4 = 0; var4 < var3.l6.length; var4++) {
         int var5 = var3.l6[var4];
         n3 var6 = this.k5.a6().l6()[var5];
         byte var7 = var6.l6();
         if (!var2[var7 & 0xFF]) {
            com.aspose.slides.internal.b7s.u3 var8 = com.aspose.slides.internal.j8o.k5.n5(this.n5[var7 & 0xFF]);
            var8.l6((byte)0);
            var8.n5(var7);
            var1.addItem(var8);
            var2[var7 & 0xFF] = true;
         }
      }

      return (com.aspose.slides.internal.b7s.u3[])var1.toArray(new com.aspose.slides.internal.b7s.u3[0]);
   }

   public final void k5() {
      for (int var1 = 0; var1 < this.k5.n5(); var1++) {
         int var2 = this.k5.l6().k5()[var1];
         n3 var3 = this.k5.a6().l6()[var2];
         Dictionary$ValueCollection$Enumerator var4 = this.k5.k5().getValues().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.b7s.u3 var5 = (com.aspose.slides.internal.b7s.u3)var4.next();
               if (var5 != null && var5.n5() == var3.l6()) {
                  this.l6[var3.l6() & 0xFF] = var5;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   public final void u3() {
      this.u3.l6();
   }

   public final void l6(short[] var1) {
      p3 var2 = this.k5.l6();

      for (int var3 = 0; var3 < var1.length; var3++) {
         int var4 = var2.k5()[var3];
         n3 var5 = this.k5.a6().l6()[var4];
         this.n5(var1[var3], this.l6[var5.l6() & 0xFF]);
      }
   }

   public final void l6(short var1) {
      n3 var2 = this.k5.a6().l6()[0];
      this.n5(var1, this.l6[var2.l6() & 0xFF]);
   }

   private static void n5(short var0, long[] var1) {
      int var2 = var0;
      if (var2 < 0) {
         var2 = -var2;
      }

      int var3 = 0;

      while (var2 != 0) {
         var3++;
         var2 >>= 1;
      }

      var1[var3]++;
   }

   private void n5(short var1, com.aspose.slides.internal.b7s.u3 var2) {
      int var3 = var1;
      int var4 = var3;
      if (var3 < 0) {
         var3 = -var3;
         var4--;
      }

      int var5 = 0;

      while (var3 != 0) {
         var5++;
         var3 >>= 1;
      }

      this.u3.n5(var2.l6()[var5], var2.k5()[var5]);
      if (var5 != 0) {
         this.u3.n5(var4, var5);
      }
   }
}
