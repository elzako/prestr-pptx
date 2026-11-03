package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XPathException;

public abstract class j9 extends e9 {
   public j9() {
   }

   protected j9(j9 var1) {
      super(var1);
   }

   @Override
   public boolean l6() {
      return this.h0() != null;
   }

   @Override
   public int a6() {
      if (this.k5 == -1) {
         j9 var1 = (j9)this.n5();
         var1.t2();
         this.k5 = 0;

         while (var1.l6()) {
            this.k5++;
         }
      }

      return this.k5;
   }

   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
   }

   public abstract Object n5(com.aspose.slides.internal.x6s.h0 var1);

   public abstract com.aspose.slides.internal.x6s.a6 h0();

   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      throw XPathException.create("'{0}' is an invalid XSLT pattern.");
   }

   public double s7() {
      return 0.5;
   }

   public abstract int u9();

   public int c8() {
      return 16;
   }

   public static j9 n5(j9 var0) {
      return var0 != null ? (j9)var0.n5() : null;
   }

   protected static com.aspose.slides.internal.x6s.h0 l6(com.aspose.slides.internal.x6s.h0 var0) {
      return var0 != null ? var0.n5() : null;
   }

   protected static com.aspose.slides.internal.x6s.a6 k5(com.aspose.slides.internal.x6s.a6 var0) {
      return var0 != null ? var0.n5() : null;
   }

   public final boolean n5(List<com.aspose.slides.internal.x6s.a6> var1, com.aspose.slides.internal.x6s.a6 var2) {
      int var3 = 0;
      int var4 = var1.size();
      if (var4 != 0) {
         switch (n5((com.aspose.slides.internal.x6s.a6)var1.get_Item(var4 - 1), var2)) {
            case 0:
               var1.addItem(var2.n5());
               return true;
            case 2:
               return false;
            default:
               var4--;
         }
      }

      while (var3 < var4) {
         int var5 = n5(var3, var4);
         switch (n5((com.aspose.slides.internal.x6s.a6)var1.get_Item(var5), var2)) {
            case 0:
               var3 = var5 + 1;
               break;
            case 2:
               return false;
            default:
               var4 = var5;
         }
      }

      var1.insertItem(var3, var2.n5());
      return true;
   }

   private static int n5(int var0, int var1) {
      return (int)(((var0 & 4294967295L) + (var1 & 4294967295L) & 4294967295L) >> 1);
   }

   public static int n5(com.aspose.slides.internal.x6s.a6 var0, com.aspose.slides.internal.x6s.a6 var1) {
      int var2 = var0.u3(var1);
      if (var2 == 3) {
         com.aspose.slides.internal.x6s.a6 var3 = var0.n5();
         var3.z3();
         String var4 = var3.t2();
         if (!var3.n5(var1)) {
            var3 = var1.n5();
         }

         var3.z3();
         String var5 = var3.t2();
         int var6 = com.aspose.slides.ms.System.d1.h0(var4, var5);
         var2 = var6 < 0 ? 0 : (var6 > 0 ? 1 : 3);
      }

      return var2;
   }

   protected final int n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.x6s.h0.class)) {
         return 3;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, String.class)) {
         return 1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
         return 0;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1, Boolean.class) ? 2 : 4;
      }
   }
}
