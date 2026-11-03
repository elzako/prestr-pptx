package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class n5u {
   private static n5u n5;
   private static final Object l6 = new Object();
   private List<h3r> k5 = new List<>();
   private List<com.aspose.slides.internal.g7.b6> u3 = new List<>();

   public static n5u n5() {
      n5u var0 = n5;
      if (null == var0) {
         synchronized (l6) {
            var0 = n5;
            if (null == var0) {
               n5 = var0 = new n5u();
            }
         }
      }

      return var0;
   }

   private n5u() {
   }

   public final void n5(String var1) {
      if (!com.aspose.slides.internal.z0k.u3.k5(var1)) {
         com.aspose.slides.internal.n8e.v4.n5(new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"Source directory must exist: ", var1})));
      } else {
         this.n5(new com.aspose.slides.internal.g7.t5(var1));
      }
   }

   public final void n5(com.aspose.slides.internal.g7.c9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      }

      this.k5.addItem(new h3r(var1));
   }

   public final void n5(com.aspose.slides.internal.g7.b6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      this.u3.addItem(var1);
   }

   public final void l6() {
      this.k5.clear();
      this.u3.clear();
   }

   public final boolean k5() {
      return this.k5.size() > 0;
   }

   public final boolean u3() {
      return this.u3.size() > 0;
   }

   final com.aspose.slides.internal.g7.b6 n5(String var1, boolean var2, boolean var3) {
      if (this.k5.size() == 0) {
         com.aspose.slides.internal.z0k.a6 var4 = com.aspose.slides.internal.z0k.u3.h0(com.aspose.slides.ms.System.p8.n5(37));
         String var5 = com.aspose.slides.internal.z0k.z1.l6(var4.u9(), "Fonts");
         this.n5(var5);
      }

      String var24 = com.aspose.slides.ms.System.d1.n5(
         "{0}{1}{2}",new Object[]{ var1, var2 ? " Bold" : com.aspose.slides.ms.System.d1.n5, var3 ? " Italic" : com.aspose.slides.ms.System.d1.n5
      });
      com.aspose.slides.internal.g7.b6 var25 = null;
      List$Enumerator var6 = this.k5.iterator();

      try {
         while (var6.hasNext()) {
            h3r var7 = (h3r)var6.next();
            var25 = var7.n5(var24);
            if (var25 != null) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (var25 == null) {
         List$Enumerator var26 = this.u3.iterator();

         try {
            while (var26.hasNext()) {
               com.aspose.slides.internal.g7.b6 var8 = (com.aspose.slides.internal.g7.b6)var26.next();
               if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var8.u9()), com.aspose.slides.ms.System.d1.u9(var24))) {
                  return var8;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
               var26.dispose();
            }
         }
      }

      if (var25 == null) {
         List$Enumerator var27 = this.k5.iterator();

         try {
            while (var27.hasNext()) {
               h3r var28 = (h3r)var27.next();
               var25 = var28.n5("Arial");
               if (var25 != null) {
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
               var27.dispose();
            }
         }
      }

      return var25;
   }
}
