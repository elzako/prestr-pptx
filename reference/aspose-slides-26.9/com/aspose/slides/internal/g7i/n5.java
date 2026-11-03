package com.aspose.slides.internal.g7i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.d3l.u9;
import com.aspose.slides.internal.w2i.t2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class n5 {
   private boolean n5;
   private int l6;
   private boolean k5;
   private boolean u3;
   private final List<com.aspose.slides.internal.q0y.n5> a6 = new List<>();
   private float[] u9;
   private float[] h0;
   private float[] c8;
   private float[] t2 = new float[3];
   private l6 s7 = new l6();
   private long x8;
   private long n3;
   private long y4;
   private long e2;

   public n5() {
      this(true, 1061109567, false, false, 1061109567L, 1061109567L);
   }

   public n5(boolean var1, long var2, long var4) {
      this(var1, 1061109567, false, false, var2, var4);
   }

   public n5(boolean var1, boolean var2, boolean var3) {
      this(var1, 1061109567, var2, var3, 1061109567L, 1061109567L);
   }

   private n5(boolean var1, int var2, boolean var3, boolean var4, long var5, long var7) {
      this.n5 = var1;
      this.u9 = new float[3];
      this.h0 = new float[3];
      this.c8 = new float[3];
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.x8 = var5;
      this.y4 = var7;
      this.n3 = var7;
      this.e2 = var5;
   }

   public n5(t4 var1, t4 var2) {
      this(true, 1061109567, false, false, 1061109567L, 1061109567L);
      this.n5(var1);
      this.n5(var2);
   }

   public final void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      t2 var2 = new t2();
      var2.n5(var1);
      this.n5(var2);
   }

   public void n5(double[] var1, double[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("srcPixel");
      }

      if (var2 == null) {
         throw new ArgumentNullException("dstPixel");
      }

      if (this.a6.size() == 0) {
         System.arraycopy(var1, 0, var2, 0, var1.length);
      } else {
         if (var1.length != this.h0.length) {
            throw new u9();
         }

         if (var2.length != this.c8.length) {
            throw new u9();
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            this.h0[var3] = (float)var1[var3];
         }

         this.n5(this.h0, this.c8);

         for (int var4 = 0; var4 < var2.length; var4++) {
            var2[var4] = this.c8[var4];
         }
      }
   }

   final void n5(t2 var1) {
      this.n5(var1, 1061109567, this.k5, this.u3);
   }

   public final void n5(t2 var1, int var2, boolean var3, boolean var4) {
      if (var1 == null) {
         throw new ArgumentNullException("profile");
      }

      long var5 = var1.l6().u3;
      if (var5 != 1935896178L && var5 != 1835955314L && var5 != 1886549106L) {
         throw new NotSupportedException(d1.n5("Type of profile {0} is not supported", new Object[]{com.aspose.slides.internal.g7i.k5.u3(var5)}));
      }

      long var7;
      long var9;
      if (this.n5) {
         var7 = var1.l6().a6;
         var9 = var1.l6().u9;
      } else {
         var7 = var1.l6().u9;
         var9 = var1.l6().a6;
         if (var1.l6().u3 == 1633842036L) {
            this.n5 = true;
            var2 = 0;
         }
      }

      if (var2 == 1061109567) {
         var2 = this.n5 ? var1.l6().e2 : this.l6;
         if (var2 == 1061109567) {
            var2 = 0;
         }
      }

      if (this.a6.size() == 0) {
         if (this.x8 == 1061109567L) {
            this.e2 = var7;
            this.x8 = var7;
         } else if (!com.aspose.slides.internal.g7i.k5.n5(this.x8, var7)) {
            throw new com.aspose.slides.internal.d3l.n5();
         }
      } else if (!com.aspose.slides.internal.g7i.k5.n5(this.e2, var7)) {
         throw new com.aspose.slides.internal.d3l.n5();
      }

      if (this.a6.size() == 0 && this.h0.length != (com.aspose.slides.internal.g7i.k5.k5(var7) & 255)) {
         this.h0 = new float[com.aspose.slides.internal.g7i.k5.k5(var7)];
      }

      if (this.c8.length != (com.aspose.slides.internal.g7i.k5.k5(var9) & 255)) {
         this.c8 = new float[com.aspose.slides.internal.g7i.k5.k5(var9)];
      }

      if (this.u9.length < q1.n5(this.h0.length, this.c8.length)) {
         this.u9 = new float[q1.n5(this.h0.length, this.c8.length)];
      }

      com.aspose.slides.internal.q0y.n5 var11 = com.aspose.slides.internal.q0y.n5.n5(var1, this.n5, var2, var3, var4);
      var11.n5();
      this.a6.addItem(var11);
      this.n5 = !this.n5;
      this.l6 = var2;
      this.e2 = var9;
      if (this.y4 == 1061109567L) {
         this.n3 = this.e2;
      }
   }

   public void n5(float[] var1, float[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("srcPixel");
      }

      if (var2 == null) {
         throw new ArgumentNullException("dstPixel");
      }

      if (this.a6.size() == 0) {
         System.arraycopy(var1, 0, var2, 0, var1.length);
      } else {
         if (var1.length != this.h0.length) {
            throw new u9();
         }

         if (var2.length != this.c8.length) {
            throw new u9();
         }

         System.arraycopy(var1, 0, this.u9, 0, var1.length);
         this.s7.n5(this.x8, this.a6.get_Item(0).c8());
         List$Enumerator var3 = this.a6.iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.q0y.n5 var4 = (com.aspose.slides.internal.q0y.n5)var3.next();
               this.s7.n5(this.u9, var4);
               var4.n5(this.u9);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.s7.n5(this.u9, this.n3);
         System.arraycopy(this.u9, 0, var2, 0, var2.length);
      }
   }
}
