package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class t4 extends z3 {
   private final Object n5 = new Object();
   private String[] l6;
   private boolean k5;
   private k5 u3;
   private m1 a6;
   private static final t4 u9 = new t4();

   private t4() {
      try {
         this.l6();
      } catch (RuntimeException var2) {
      }
   }

   public final void n5(String[] var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("fontsFolders");
      }

      synchronized (this.n5) {
         this.l6 = var1;
         this.k5 = var2;
         this.a6 = null;
         this.u3 = null;
      }
   }

   public final String[] n5() {
      return com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).deepClone(), String[].class);
   }

   public final void l6() {
      this.n5(com.aspose.slides.internal.z5z.u3.n5().l6(), true);
   }

   @Override
   public k5 n5(String var1, int var2) {
      return this.k5().n5(var1, var2);
   }

   @Override
   public u3 n5(String var1) {
      return this.k5().n5(var1);
   }

   public m1 k5() {
      if (this.a6 == null) {
         synchronized (this.n5) {
            if (this.a6 == null) {
               this.a6 = this.a6();
            }
         }
      }

      return this.a6;
   }

   private m1 a6() {
      String[] var2;
      boolean var3;
      synchronized (this.n5) {
         var2 = this.n5();
         var3 = this.k5;
      }

      IDictionary var17 = com.aspose.slides.internal.z5z.c8.n5();

      for (String var7 : var2) {
         if (com.aspose.slides.internal.z5z.u9.n5(var7)) {
            n5(var7, var3, var17);
            if (com.aspose.slides.internal.z5z.x8.n5() == 0) {
               for (String var11 : com.aspose.slides.internal.z5z.u3.n5().l6()) {
                  if (d1.a6(var11, var7)) {
                     com.aspose.slides.internal.z5z.u3.n5().n5(var17);
                     break;
                  }
               }
            }
         }
      }

      List var18 = new List();
      IEnumerator var19 = var17.getKeys().iterator();

      try {
         while (var19.hasNext()) {
            String var20 = (String)var19.next();
            var18.addItem(new q0(var20));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            ((IDisposable)var19).dispose();
         }
      }

      return new m1((k7[])var18.toArray(new k7[0]));
   }

   private static void n5(String var0, boolean var1, IDictionary var2) {
      try {
         String[] var3 = com.aspose.slides.internal.z0k.u3.a6(var0);

         for (String var7 : var3) {
            var2.set_Item(var7, var7);
         }

         if (var1) {
            String[] var10 = com.aspose.slides.internal.z0k.u3.u3(var0);

            for (String var8 : var10) {
               n5(var8, true, var2);
            }
         }
      } catch (RuntimeException var9) {
      }
   }

   public static t4 u3() {
      return u9;
   }
}
