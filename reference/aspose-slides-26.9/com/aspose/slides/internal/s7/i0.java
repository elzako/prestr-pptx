package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;

public class i0 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "object-position";
   }

   @Override
   public int l6() {
      return 184;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      com.aspose.slides.internal.k5.h0 var1 = new com.aspose.slides.internal.k5.h0();
      var1.l6(l6$n5.k7);
      var1.l6(l6$n5.k7);
      return var1;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      do {
         var3.l6(super.n5(var1, var2));
         var1 = var1.k5();
      } while (var1 != null);

      return var3;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(
      com.aspose.slides.internal.k5.k7 var1,
      com.aspose.slides.internal.h0.h0 var2,
      String var3,
      com.aspose.slides.internal.y4.z1 var4,
      com.aspose.slides.internal.k5.u9 var5,
      int var6
   ) {
      List var7 = new List((com.aspose.slides.internal.k5.h0)var5);
      if (var7.size() == 1) {
         var7.addItem(l6$n5.i1);
      }

      if (this.n5((com.aspose.slides.internal.k5.u9)var7.get_Item(0)) && this.n5((com.aspose.slides.internal.k5.u9)var7.get_Item(1))) {
         if (var7.get_Item(0) == l6$n5.p8 || var7.get_Item(0) == l6$n5.b3 || var7.get_Item(1) == l6$n5.p3 || var7.get_Item(1) == l6$n5.x9) {
            var7.set_Item(0, this.l6((com.aspose.slides.internal.k5.u9)var7.get_Item(0)));
            var7.set_Item(1, this.k5((com.aspose.slides.internal.k5.u9)var7.get_Item(1)));
         } else if (var7.get_Item(0) != l6$n5.p3 && var7.get_Item(0) != l6$n5.x9 && var7.get_Item(1) != l6$n5.p8 && var7.get_Item(1) != l6$n5.b3) {
            var7.set_Item(0, this.l6((com.aspose.slides.internal.k5.u9)var7.get_Item(0)));
            var7.set_Item(1, this.k5((com.aspose.slides.internal.k5.u9)var7.get_Item(1)));
         } else {
            com.aspose.slides.internal.k5.u9 var8 = this.l6((com.aspose.slides.internal.k5.u9)var7.get_Item(1));
            com.aspose.slides.internal.k5.u9 var9 = this.k5((com.aspose.slides.internal.k5.u9)var7.get_Item(0));
            var7.set_Item(0, var8);
            var7.set_Item(1, var9);
         }
      } else {
         var7.set_Item(0, this.l6((com.aspose.slides.internal.k5.u9)var7.get_Item(0)));
         var7.set_Item(1, this.k5((com.aspose.slides.internal.k5.u9)var7.get_Item(1)));
      }

      return new com.aspose.slides.internal.k5.h0(var7);
   }

   private com.aspose.slides.internal.k5.u9 l6(com.aspose.slides.internal.k5.u9 var1) {
      if (this.n5(var1)) {
         if (var1 == l6$n5.p8) {
            return l6$n5.m1;
         } else if (var1 == l6$n5.i1) {
            return l6$n5.k7;
         } else if (var1 == l6$n5.b3) {
            return l6$n5.m3;
         } else {
            throw com.aspose.slides.internal.z8.u9.l6(var1.u9());
         }
      } else {
         return var1;
      }
   }

   private com.aspose.slides.internal.k5.u9 k5(com.aspose.slides.internal.k5.u9 var1) {
      if (this.n5(var1)) {
         if (var1 == l6$n5.p3) {
            return l6$n5.m1;
         } else if (var1 == l6$n5.i1) {
            return l6$n5.k7;
         } else if (var1 == l6$n5.x9) {
            return l6$n5.m3;
         } else {
            throw com.aspose.slides.internal.z8.u9.l6(var1.u9());
         }
      } else {
         return var1;
      }
   }

   static {
      n5.n5("left", l6$n5.p8);
      n5.n5("center", l6$n5.i1);
      n5.n5("right", l6$n5.b3);
      n5.n5("top", l6$n5.p3);
      n5.n5("bottom", l6$n5.x9);
   }
}
