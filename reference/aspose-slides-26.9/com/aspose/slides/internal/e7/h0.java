package com.aspose.slides.internal.e7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.v2.e2;

public class h0 implements e2 {
   private final com.aspose.slides.internal.v2.k5 n5;
   private t2 l6;
   private h0 k5;

   public h0() {
      this.n5 = new com.aspose.slides.internal.v2.k5();
      this.n5.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.z6z);
      this.n5.l6(com.aspose.slides.internal.v2.c8.q9, new com.aspose.slides.internal.v2.n5());
      this.n5.l6(com.aspose.slides.internal.v2.c8.s4, com.aspose.slides.internal.v2.h0.n5());
   }

   public h0(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
   }

   public final h0 n5() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5
            .n5(com.aspose.slides.internal.v2.c8.i0e, com.aspose.slides.internal.v2.c8.f6);
         if (var1 != null) {
            this.k5 = new h0(var1);
         }
      }

      return this.k5;
   }

   public final t2 l6() {
      if (this.l6 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.o8m);
         if (var1 != null) {
            this.l6 = new t2(var1);
         }

         if (this.l6 == null && this.n5() != null) {
            this.l6 = this.n5().l6();
         }
      }

      return this.l6;
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }

   public final com.aspose.slides.internal.v2.k5 k5() {
      return this.n5;
   }

   public final void n5(IGenericCollection<u9> var1) {
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      Dictionary var2 = new Dictionary();
      this.n5(var1, this.n5, var2);
   }

   private void n5(IGenericCollection<u9> var1, com.aspose.slides.internal.v2.k5 var2, Dictionary<com.aspose.slides.internal.v2.s7, Boolean> var3) {
      if (var2 != null) {
         com.aspose.slides.internal.v2.n5 var4 = (com.aspose.slides.internal.v2.n5)var2.u9(com.aspose.slides.internal.v2.c8.q9);
         if (var4 == null) {
            throw new InvalidDataException("Kids object is not found in a COS dictionary of a page. A PDF file structure is not correct.");
         }

         for (int var5 = 0; var5 < var4.n5(); var5++) {
            com.aspose.slides.internal.v2.s7 var6 = var4.k5(var5);
            if (!var3.containsKey(var6)) {
               com.aspose.slides.internal.v2.s7 var7 = var4.l6(var5);
               if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.v2.k5.class)) {
                  com.aspose.slides.internal.v2.k5 var8 = (com.aspose.slides.internal.v2.k5)var7;
                  com.aspose.slides.internal.v2.s7 var9 = var8.u9(com.aspose.slides.internal.v2.c8.g2x);
                  if (com.aspose.slides.internal.v2.c8.f1s.equals(var9)) {
                     u9 var10 = new u9(var8);
                     var1.addItem(var10);
                  } else {
                     this.n5(var1, var8, var3);
                  }
               }

               var3.addItem(var4.k5(var5), false);
            }
         }
      }
   }
}
