package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;

public abstract class m6 implements w0 {
   protected c5 n5;
   protected h1 l6;
   protected o1 k5;
   protected z2 u3 = new z2();
   protected k8 a6;
   protected c1 u9;
   protected g1 h0;
   private v1 c8;
   private static final Dictionary<String, String> t2 = new Dictionary<>();

   public m6() {
      this(new c1());
   }

   public m6(c1 var1) {
      this.n5 = new c5();
      this.l6 = new h1();
      this.k5 = new o1();
      this.a6 = new k8();
      this.u9 = var1;
      this.h0 = w5.n5().l6().n5();
   }

   @Override
   public final o1 j9() {
      return this.k5;
   }

   @Override
   public final z2 z6() {
      return this.u3;
   }

   @Override
   public final g1 e9() {
      return this.h0;
   }

   @Override
   public final c1 o5() {
      return this.u9;
   }

   public final v1 n5() {
      return this.c8;
   }

   public final void n5(v1 var1) {
      this.c8 = var1;
   }

   @Override
   public final void l6(m1 var1) {
      try {
         j2 var2 = this.n5(var1);

         while (var2.u9()) {
            this.n5(var2);
         }
      } catch (RuntimeException var3) {
         throw new g6("Could not run font program", var3);
      }
   }

   protected abstract j2 n5(m1 var1);

   protected abstract void n5(j2 var1);

   protected final void n5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.j8.n5(this).q0(), var1});
      if (!t2.containsKey(var2)) {
         synchronized (t2) {
            if (!t2.containsKey(var2)) {
               t2.addItem(var2, var1);
               this.h0.n5(com.aspose.slides.ms.System.d1.n5("PostScript error. Operator \"{0}\" is not supported.", new Object[]{var1}));
            }
         }
      }
   }
}
