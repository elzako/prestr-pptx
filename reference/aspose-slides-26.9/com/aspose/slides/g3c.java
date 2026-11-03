package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class g3c {
   private v8v n5;
   private g3c l6;
   private d2z k5;
   private com.aspose.slides.internal.k4y.b3 u3;

   public final g3c e2() {
      return this.l6;
   }

   public final d2z t9() {
      if (this.k5 == null) {
         this.k5 = new d2z();
      }

      return this.k5;
   }

   public final v8v z1() {
      return this.n5;
   }

   public String J_() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   public static g3c n5(v8v var0, com.aspose.slides.internal.k4y.b3 var1, g3c var2) {
      g3c var3 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.y5g.class)) {
         var3 = new w4a(var0, (com.aspose.slides.internal.k4y.y5g)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5z.class)) {
         var3 = new e5g(var0, (com.aspose.slides.internal.k4y.c5z)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.p5i.class)) {
         var3 = d5.n5((com.aspose.slides.internal.k4y.p5i)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.d4w.class)) {
         var3 = new y1z((com.aspose.slides.internal.k4y.d4w)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.r6v.class)) {
         var3 = new f2f((com.aspose.slides.internal.k4y.r6v)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.n8z.class)) {
         var3 = new m3l((com.aspose.slides.internal.k4y.n8z)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.i9l.class)) {
         var3 = new f1h(var0, (com.aspose.slides.internal.k4y.i9l)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.s3p.class)) {
         var3 = new b4f((com.aspose.slides.internal.k4y.s3p)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.k5r.class)) {
         var3 = new r9i((com.aspose.slides.internal.k4y.k5r)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c2m.class)) {
         var3 = new j2l((com.aspose.slides.internal.k4y.c2m)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.d0d.class)) {
         var3 = new l3d((com.aspose.slides.internal.k4y.d0d)var1);
      }

      if (var3 != null) {
         var3.n5 = var0;
         var3.l6 = var2;
         var3.u3 = var1;
         if (var2 != null) {
            var2.t9().n5(var3);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.y5g.class)) {
            List$Enumerator var4 = ((com.aspose.slides.internal.k4y.y5g)var1).a6().iterator();

            try {
               while (var4.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
                  n5(var0, var5.l6(), var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5z.class)) {
            List$Enumerator var14 = ((com.aspose.slides.internal.k4y.c5z)var1).t2().iterator();

            try {
               while (var14.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var17 = (com.aspose.slides.internal.k4y.g7)var14.next();
                  n5(var0, var17.l6(), var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                  var14.dispose();
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.k5r.class)) {
            for (com.aspose.slides.internal.k4y.c2m var7 : ((com.aspose.slides.internal.k4y.k5r)var1).n5()) {
               n5(var0, var7, var3);
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.n8z.class)) {
            for (com.aspose.slides.internal.k4y.d0d var21 : ((com.aspose.slides.internal.k4y.n8z)var1).n5()) {
               n5(var0, var21, var3);
            }
         }
      }

      return var3;
   }

   public final g3c n5(g3c var1) {
      g3c var2 = n5(this.z1(), this.u3, var1);
      if (var2 == null) {
         throw new PptxReadException("LayoutTreeNode cannot be null.");
      }

      var2.l6 = var1;
      return var2;
   }

   public void n5(k6a var1, l6s var2) {
   }

   public final void t4() {
      this.L_();
      IGenericEnumerator var1 = this.t9().iterator();

      try {
         while (var1.hasNext()) {
            g3c var2 = (g3c)var1.next();
            var2.t4();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0} ({1})",new Object[]{ com.aspose.slides.ms.System.j8.n5(this).s7(), this.J_()});
   }

   public final <T extends g3c> T n5(Class<T> var1, l6s var2, k6a var3) {
      d2z var4 = this.n5(var2, var3);
      IGenericEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            g3c var6 = (g3c)var5.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var6, var1)) {
               return (T)var6;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      IGenericEnumerator var17 = var4.iterator();

      try {
         while (var17.hasNext()) {
            g3c var7 = (g3c)var17.next();
            if (var7.K_()) {
               g3c var8 = var7.n5(var1, var2, var3);
               if (var8 != null) {
                  return (T)var8;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
            var17.dispose();
         }
      }

      return null;
   }

   public final <T extends g3c> T n5(Class<T> var1) {
      g3c var2 = this.e2();

      while (var2 != null && !com.aspose.slides.internal.v6g.k5.l6(var2, var1)) {
         var2 = var2.e2();
      }

      return (T)(var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, var1) ? var2 : null);
   }

   public final g3c n5(g3c var1, String var2) {
      IGenericEnumerator var3 = var1.t9().iterator();

      try {
         while (var3.hasNext()) {
            g3c var4 = (g3c)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.J_(), var2)) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var15 = var1.t9().iterator();

      try {
         while (var15.hasNext()) {
            g3c var5 = (g3c)var15.next();
            g3c var6 = this.n5(var5, var2);
            if (var6 != null) {
               return var6;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }

      return null;
   }

   public d2z n5(l6s var1, k6a var2) {
      return this.t9();
   }

   protected boolean K_() {
      return false;
   }

   protected void L_() {
   }

   protected final com.aspose.slides.internal.k4y.b3 q0() {
      return this.u3;
   }
}
