package com.aspose.slides.internal.r6i;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.r5t.j5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.e5;

public class u3 implements IDisposable {
   private double l6 = 100.0;
   private boolean k5 = true;
   private j5 u3;
   private final Object a6 = new Object();
   private l6 u9;
   public final com.aspose.slides.internal.v6g.n5<l6> n5 = new a6(this);

   public u3() {
      this(com.aspose.slides.internal.v6g.k5.t2(100, 9));
   }

   public u3(double var1) {
      if (var1 > 2.147483647E9) {
         throw new ArgumentException(d1.n5(new String[]{"Invalid value: ", d2.u9(var1)}), "interval");
      }

      this.k5 = true;
      this.n5(var1);
   }

   public void n5(boolean var1) {
      this.k5 = var1;
   }

   public boolean n5() {
      synchronized (this.a6) {
         return this.u3 != null;
      }
   }

   public void l6(boolean var1) {
      synchronized (this.a6) {
         boolean var3 = this.u3 != null;
         if (var3 != var1) {
            if (var1) {
               this.u3 = new j5(
                  new h0(this), this, com.aspose.slides.internal.v6g.k5.u3(this.l6, 14), this.k5 ? com.aspose.slides.internal.v6g.k5.u3(this.l6, 14) : 0
               );
            } else {
               this.u3.dispose();
               this.u3 = null;
            }
         }
      }
   }

   public void n5(double var1) {
      if (var1 <= 0.0) {
         throw new ArgumentException(d1.n5(new String[]{"Invalid value: ", d2.u9(var1)}));
      }

      synchronized (this.a6) {
         this.l6 = var1;
         if (this.u3 != null) {
            this.u3.n5(com.aspose.slides.internal.v6g.k5.u3(this.l6, 14), this.k5 ? com.aspose.slides.internal.v6g.k5.u3(this.l6, 14) : 0);
         }
      }
   }

   public void l6() {
      this.l6(false);
   }

   public void k5() {
      this.l6(true);
   }

   protected void k5(boolean var1) {
      if (var1) {
         this.l6();
      }
   }

   @Override
   public void dispose() {
      this.k5(true);
      e5.n5(this);
   }

   @Override
   protected void finalize() throws Throwable {
      this.k5(false);
      super.finalize();
   }

   static void n5(Object var0) {
      u3 var1 = (u3)var0;
      if (var1.n5()) {
         l6 var2 = var1.u9;
         if (!var1.k5) {
            var1.l6(false);
         }

         if (var2 != null) {
            n5 var3 = new n5(com.aspose.slides.ms.System.j5.s7().m3());

            try {
               var2.invoke(var1, var3);
            } catch (RuntimeException var5) {
            }
         }
      }
   }

   // $VF: synthetic method
   static l6 n5(u3 var0, l6 var1) {
      return var0.u9 = var1;
   }
}
