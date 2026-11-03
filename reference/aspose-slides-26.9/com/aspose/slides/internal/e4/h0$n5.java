package com.aspose.slides.internal.e4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class h0$n5 extends com.aspose.slides.internal.l7.h0$n5 {
   private int n5 = 1;
   private int l6 = -1;
   private List<Integer> k5;

   public static h0$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new h0$n5(var0, var1);
   }

   private h0$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   private void l6(com.aspose.slides.internal.m9.h0 var1) {
      this.l6(false);
      if (this.k5 == null) {
         this.k5 = new List<>();
      }

      if (var1 != null) {
         if (this.l6 < 0) {
            throw new InvalidOperationException("numglyphs not set on LocaTable Builder.");
         }

         h0 var2 = new h0(this.y4(), var1, this.n5, this.l6, null);
         com.aspose.slides.internal.q9.l6 var3 = var2.u9();

         while (var3.n5()) {
            this.k5.addItem(com.aspose.slides.internal.v6g.k5.u3(var3.l6(), int.class));
         }
      }
   }

   private void l6(boolean var1) {
      if (this.k5 != null) {
         this.k5.clear();
      }

      if (var1) {
         this.k5 = null;
      }

      this.n5(false);
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new h0(this.y4(), var1, this.n5, this.l6, null);
   }

   @Override
   protected void n3() {
      this.l6(this.k5());
   }

   @Override
   public int x8() {
      if (this.k5 == null) {
         return 0;
      } else {
         return this.n5 == 1 ? this.k5.size() * 4 : this.k5.size() * 2;
      }
   }

   @Override
   public boolean s7() {
      return this.k5 != null;
   }

   @Override
   public int n5(com.aspose.slides.internal.m9.c8 var1) {
      int var2 = 0;
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            int var4 = com.aspose.slides.internal.v6g.k5.u3(var3.next(), int.class);
            if (this.n5 == 1) {
               var2 += var1.n5(var2, (long)var4);
            } else {
               var2 += var1.u3(var2, var4 / 2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.l6 = this.k5.size() - 1;
      return var2;
   }
}
