package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.a3p.t9;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.r1x.d5;
import com.aspose.slides.internal.w2a.z3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.l4;
import com.aspose.slides.ms.System.s3;

public abstract class a6 implements Comparable {
   private int n5;

   protected a6(int var1) {
      this.n5 = var1;
   }

   public abstract long n5();

   public final int l6() {
      return this.n5;
   }

   public final int k5() {
      return this.n5 & 65535;
   }

   public abstract int u3();

   public final long a6() {
      return d5.n5(this.u9());
   }

   public abstract long u9();

   public abstract Object h0();

   public abstract void n5(Object var1);

   public final boolean c8() {
      return (this.n5() & 4294967295L) > 0L;
   }

   public static a6 n5(com.aspose.slides.internal.v6s.u3 var0, long var1) {
      if (var0 == null) {
         throw new ArgumentNullException("dataStream");
      }

      int[] var3 = var0.s7(var1, 2L);
      var1 += 4L;
      int var4 = var3[0];
      int var5 = var3[1];
      long var6 = var0.n5(var1);
      var1 += 4L;

      try {
         a6 var8 = com.aspose.slides.internal.n9a.l6.n5(var5, var4);
         if (var8 == null) {
            long var9 = var0.n5(var1);
            var8 = new t9(var0, var5, var4, var6, var9);
         }

         var8.n5 = var4;
         if (!com.aspose.slides.internal.v6g.k5.l6(var8, t9.class)) {
            var8.n5(var0, var1, var6 & 4294967295L);
         }

         return var8;
      } catch (RuntimeException var11) {
         throw var11;
      }
   }

   @Override
   public final int compareTo(Object obj) {
      if (!com.aspose.slides.internal.v6g.k5.l6(obj, a6.class)) {
         throw new com.aspose.slides.internal.h6t.u3("Expected TiffDataType type.");
      }

      a6 var2 = (a6)obj;
      return (this.n5 & 65535) - (var2.n5 & 65535);
   }

   public a6 t2() {
      a6 var1 = this.s7();
      this.n5(var1);
      return var1;
   }

   public final void n5(com.aspose.slides.internal.v6s.a6 var1, long var2) {
      if (var1 == null) {
         throw new ArgumentNullException("dataStream");
      }

      try {
         var1.l6(this.n5);
         var1.l6(this.u3() & 65535);
         long var4 = this.n5();
         var1.l6(var4);
         this.l6(var1, var2);
      } catch (RuntimeException var7) {
         throw new com.aspose.slides.internal.z3b.u9(
            d1.n5("Unable to Write values for ", s3.n5(com.aspose.slides.internal.w2a.h0.class, this.u3()), " Message : ", var7.getMessage())
         );
      }
   }

   public abstract long n5(com.aspose.slides.internal.v6s.a6 var1);

   @Override
   public String toString() {
      String var1 = null;
      Object var2 = this.h0();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.ms.System.u3.class)) {
         a5 var3 = new a5();
         var3.n5('{');
         com.aspose.slides.ms.System.u3 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.ms.System.u3.class);

         for (int var5 = 0; var5 < var4.a6(); var5++) {
            if (var5 < var4.a6() - 1) {
               var3.n5("{0}, ", var4.k5(var5));
            } else {
               var3.n5(var4.k5(var5));
               var3.n5('}');
            }
         }

         var1 = var3.toString();
      } else if (this.h0() != null) {
         var1 = this.h0().toString();
      }

      return d1.n5(
         "Tag: ",
         s3.n5(z3.class, this.k5()),
         " Type: ",
         s3.n5(com.aspose.slides.internal.w2a.h0.class, this.u3()),
         " Count: ",
         l4.l6(this.n5()),
         " Value: ",
         var1
      );
   }

   protected abstract void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4);

   protected abstract void l6(com.aspose.slides.internal.v6s.a6 var1, long var2);

   protected void n5(a6 var1) {
      var1.n5 = this.n5;
   }

   protected abstract a6 s7();
}
