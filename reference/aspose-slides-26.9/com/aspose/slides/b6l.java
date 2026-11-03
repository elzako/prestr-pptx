package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class b6l {
   public static IMathElement n5(com.aspose.slides.internal.k4y.s0m var0, t5w var1) {
      if (var0 != null && var0.l6() != null && var0.l6().size() != 0) {
         o3q var2 = new o3q(var0.l6().size());
         List$Enumerator var3 = var0.l6().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
               c1s.n5(var4, var2, var1, null);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (var2.getCount() == 0) {
            return null;
         } else {
            return var2.getCount() == 1 ? var2.get_Item(0) : new MathBlock(var2);
         }
      } else {
         return null;
      }
   }

   public static IMathElement n5(com.aspose.slides.internal.k4y.s0m var0, com.aspose.slides.ms.System.o5<Byte>[] var1, t5w var2) {
      if (var0.n5() != null && var0.n5().n5() != null) {
         var1[0] = new com.aspose.slides.ms.System.o5<>(var0.n5().n5().n5());
      } else {
         var1[0] = new com.aspose.slides.ms.System.o5();
      }

      return n5(var0, var2);
   }

   public static com.aspose.slides.internal.k4y.s0m n5(IMathElement var0, g6c var1) {
      return n5(m0g.l6(var0), var1);
   }

   public static com.aspose.slides.internal.k4y.s0m n5(m0g var0, g6c var1) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.k4y.s0m var2 = new com.aspose.slides.internal.k4y.s0m();
      n5(var2, var0, var1);
      return var2;
   }

   public static com.aspose.slides.internal.k4y.s0m n5(com.aspose.slides.internal.k4y.s0m var0, IMathElement var1, g6c var2) {
      return n5(var0, m0g.l6(var1), var2);
   }

   public static com.aspose.slides.internal.k4y.s0m n5(com.aspose.slides.internal.k4y.s0m var0, m0g var1, g6c var2) {
      if (var1.l6() != null) {
         if (((MathElementBase)var1.l6()).Y_()) {
            IGenericEnumerable var3 = com.aspose.slides.internal.v6g.k5.n5(var1.l6(), IGenericEnumerable.class);
            IGenericEnumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  IMathElement var5 = (IMathElement)var4.next();
                  var0.n5(c1s.n5(var5, var2));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         } else {
            var0.n5(c1s.n5(var1.l6(), var2));
         }

         byte var9 = var1.n5();
         if (var9 == 0) {
            var0.n5((com.aspose.slides.internal.k4y.y5n)null);
         } else {
            com.aspose.slides.internal.k4y.y5n var10 = new com.aspose.slides.internal.k4y.y5n();
            com.aspose.slides.internal.k4y.o0q var11 = new com.aspose.slides.internal.k4y.o0q();
            var11.n5(var9);
            var10.n5(var11);
            var0.n5(var10);
         }
      }

      return var0;
   }
}
