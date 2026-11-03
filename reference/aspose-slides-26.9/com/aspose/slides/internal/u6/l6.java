package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l6 implements t2 {
   private z1 n5;
   private com.aspose.slides.internal.j9.k5 l6;
   private List<c8> k5;
   private boolean u3;
   private List<c8> a6;
   private List<c8> u9;
   private l6$n5 h0;
   private l6$n5 c8;
   private l6$n5 t2;
   private List<u3> s7;
   private List<u3> x8;
   private List<c8> n3 = null;

   public l6(z1 var1) {
      this.c8 = new l6$l6(this);
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.j9.k5.n5(var1.w2());
      this.u3 = true;
      int var2 = 0;

      do {
         m3 var3 = var1.u9(var2);
         var3.x8.k5(var1.x8, true, false, true);
         var3.x8.l6 = var3.x8.k5;
         var3.n3.k5(var1.n3, true, false, true);
         var3.n3.l6 = var3.n3.k5;
         var2 += var3.z7();
      } while (var2 < var1.v4());
   }

   @Override
   public final void n5(List<c8> var1, k7 var2) {
      this.h0.n5(var1, var2);
   }

   @Override
   public final void n5(y2 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, c4.class)) {
         this.h0 = new l6$u3(this);
      } else {
         if (this.s7 == null || this.n5.v0()) {
            this.s7 = new List<>(this.n5.v4());
            com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(this.n5.z7());

            while (var2.l6()) {
               u3 var3 = ((m3)var2.k5()).x8;
               this.s7.addItem(var3);
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, r4.class)) {
            this.t2 = new l6$k5(this);
            this.h0 = this.t2;
         } else {
            if (this.x8 == null || this.n5.f0()) {
               this.x8 = new List<>(this.n5.v4());
               com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3<>(this.n5.z7());

               while (var4.l6()) {
                  u3 var5 = ((m3)var4.k5()).n3;
                  this.x8.addItem(var5);
               }
            }

            this.h0 = this.c8;
         }
      }

      this.h0.n5(var1);
   }

   @Override
   public final void n5() {
      this.h0.n5();
   }

   @Override
   public final void l6() {
      if (this.h0 != null) {
         this.h0.l6();
      }

      this.h0 = null;
      if (this.n3 != null) {
         List$Enumerator var1 = this.n3.iterator();

         try {
            while (var1.hasNext()) {
               c8 var2 = (c8)var1.next();
               var2.k5.l6 = var2.k5.n5;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }

      if (this.u9 != null) {
         List$Enumerator var11 = this.u9.iterator();

         try {
            while (var11.hasNext()) {
               c8 var12 = (c8)var11.next();
               var12.k5.l6 = var12.k5.n5;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
               var11.dispose();
            }
         }
      }
   }

   // $VF: synthetic method
   static z1 n5(l6 var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static boolean n5(l6 var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List l6(l6 var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static List k5(l6 var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.j9.k5 u3(l6 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static List a6(l6 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static List n5(l6 var0, List var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List l6(l6 var0, List var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static List k5(l6 var0, List var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static List u9(l6 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static List u3(l6 var0, List var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List h0(l6 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static List a6(l6 var0, List var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List u9(l6 var0, List var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean c8(l6 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static l6$n5 t2(l6 var0) {
      return var0.t2;
   }
}
