package com.aspose.slides.internal.i0e;

import com.aspose.slides.internal.j7.s7;
import com.aspose.slides.internal.j7.u9;
import com.aspose.slides.internal.k4d.a6;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class l6 implements n5, IDisposable {
   private boolean n5 = false;
   private z1 l6;
   private com.aspose.slides.internal.j7.n5 k5;
   private e5 u3;
   private boolean a6 = true;
   private Object u9 = new Object();

   public l6() {
      synchronized (this.u9) {
         this.k5 = new com.aspose.slides.internal.j7.n5(1, 1);
         this.l6 = com.aspose.slides.internal.k4d.a6.n5(this.k5.c8());
         this.l6.u3(3);
         this.a6 = true;
         this.u3 = new e5(e5.t2());
         this.u3.k5(this.u3.k5() | 2048);
      }
   }

   public l6(e5 var1) {
      this();
      synchronized (this.u9) {
         this.u3 = var1;
      }
   }

   public l6(z1 var1, e5 var2) {
      synchronized (this.u9) {
         this.l6 = var1;
         this.u3 = var2;
         this.a6 = false;
      }
   }

   protected void n5(boolean var1) {
      if (!this.n5) {
         synchronized (this.u9) {
            if (this.a6) {
               if (this.k5 != null) {
                  this.k5.dispose();
                  this.k5 = null;
               }

               if (this.l6 != null) {
                  this.l6.dispose();
                  this.l6 = null;
               }
            }
         }

         this.n5 = true;
      }
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   public final f2 n5(String var1, n3 var2) {
      synchronized (this.u9) {
         String[] var4 = new String[]{var1};
         boolean var5 = n5(var2, var4);
         var1 = var4[0];
         return var5 ? this.l6.n5(var1, var2, w1.n5.u3(), this.u3) : this.l6.n5(var1, var2, w1.n5.u3(), this.u3);
      }
   }

   @Override
   public final f2 n5(String var1, com.aspose.slides.internal.p1s.l6 var2) {
      s7 var3 = new s7();

      try {
         return this.n5(var1, com.aspose.slides.internal.j7.u9.n5(var2, var3));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final e5 n5() {
      synchronized (this.u9) {
         return this.u3;
      }
   }

   private static boolean n5(n3 var0, String[] var1) {
      if (d1.c8(var0.h0(), "Tai") != -1) {
         var1[0] = d1.n5(var1[0], "ᦵ", "ᦵ◌");
         var1[0] = d1.n5(var1[0], "ᦶ", "ᦶ◌");
         var1[0] = d1.n5(var1[0], "ᦷ", "ᦷ◌");
         var1[0] = d1.n5(var1[0], "ᦺ", "ᦺ◌");
         return true;
      } else {
         return false;
      }
   }
}
